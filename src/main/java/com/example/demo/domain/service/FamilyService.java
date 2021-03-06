package com.example.demo.domain.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.domain.dto.ChildDto;
import com.example.demo.domain.dto.FamilyDto;
import com.example.demo.domain.dto.ParentDto;
import com.example.demo.domain.entity.Child;
import com.example.demo.domain.entity.Parent;
import com.example.demo.domain.repository.ChildRepository;
import com.example.demo.domain.repository.ParentRepository;
import com.example.demo.exception.BusinessException;
import com.example.demo.exception.DataNotFoundException;

@Transactional
@Service
public class FamilyService {

	@Autowired
	private ParentRepository parentRepository;

	@Autowired
	private ChildRepository childRepository;

	@Autowired
	private MessageSource messageSource;

	public List<FamilyDto> getFamilyData() throws BusinessException {

		List<Parent> parents = parentRepository.findAll();
		if (parents == null || parents.size() == 0) {
			throw new DataNotFoundException();
		}
		List<Child> childrens = childRepository.findAll();

		List<FamilyDto> familys = new ArrayList<>();

		List<Integer> allFamilyIds = new ArrayList<>();
		for(Parent parent : parents) {

			if(!isContains(parent.getFamilyId(),allFamilyIds)) {
				allFamilyIds.add(parent.getFamilyId());

			}
		}

		for (Integer familyId : allFamilyIds) {
			FamilyDto dto = new FamilyDto();
			dto.setFamilyId(familyId);
			familys.add(dto);
		}

		for(Parent parent : parents) {

			for (FamilyDto family : familys) {

				if (Integer.compare(parent.getFamilyId(), family.getFamilyId()) == 0) {

					ParentDto parentDto = new ParentDto();
					BeanUtils.copyProperties(parent, parentDto);
					if (parent.isHusband()) {
						family.setHusband(parentDto);
					} else {
						family.setWife(parentDto);
					}
				}
			}
		}

		for(Child child : childrens) {

			for (FamilyDto family : familys) {

				if (Integer.compare(child.getFamilyId(), family.getFamilyId()) == 0) {

					ChildDto childDto = new ChildDto();
					BeanUtils.copyProperties(child, childDto);
					if (family.getChildren() != null && family.getChildren().size() > 0) {
						family.getChildren().add(childDto);
					} else {
						List<ChildDto> children = new ArrayList<>();
						children.add(childDto);
						family.setChildren(children);
					}
				}
			}
		}

		return familys;
	}

	private boolean isContains(Integer id, List<Integer> ids) {

		if (id == null || ids == null || ids.size() == 0)  {
			return false;
		}
		return ids.contains(id);
	}

	private boolean isContains(Integer id, Integer...ids) {

		if (id == null || ids == null || ids.length == 0) {
			return false;
		}

		return Arrays.stream(ids).filter(i -> i== id
				).count() > 0;

	}

	private boolean isContains(String target, String ...values) {

		for (String value : values) {
			if(isEqualString(target, value)) {
				return true;
			}
		}
		return false;


	}

	private boolean isEqualString(String value1, String value2) {

		if( value1 == null || value1.length() == 0 || value2 ==  null || value2.length() == 0 ) {
			return false;
		} else {
			return value1.equals(value2);
		}
	}

	private boolean isSameFamily(Integer familyId1, Integer familyId2) {

		return Integer.compare(familyId1, familyId2) == 0;
	}
}

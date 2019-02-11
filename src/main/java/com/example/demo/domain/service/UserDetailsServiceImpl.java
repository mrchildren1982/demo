package com.example.demo.domain.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.domain.dao.LoginUser;
import com.example.demo.domain.dto.MLoginUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		MLoginUser user = null;
		try {

		} catch (Exception e )
		{
			e.printStackTrace();
			throw new UsernameNotFoundException("It can not be acuired User");
		}

		//ユーザ情報を取得できなかった場合
		if (user == null) {
			throw new UsernameNotFoundException("User not found for username: " + username);
		}

		//ユーザ情報が取得できたらSpring Securityで認証できる形で戻す
		return new LoginUser(user);
	}

}

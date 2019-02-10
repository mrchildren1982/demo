package com.example.demo.domain.entity;

import org.seasar.doma.jdbc.entity.EntityListener;
import org.seasar.doma.jdbc.entity.PostDeleteContext;
import org.seasar.doma.jdbc.entity.PostInsertContext;
import org.seasar.doma.jdbc.entity.PostUpdateContext;
import org.seasar.doma.jdbc.entity.PreDeleteContext;
import org.seasar.doma.jdbc.entity.PreInsertContext;
import org.seasar.doma.jdbc.entity.PreUpdateContext;

/**
 * 
 */
public class EquipmentListener implements EntityListener<Equipment> {

    @Override
    public void preInsert(Equipment entity, PreInsertContext<Equipment> context) {
    }

    @Override
    public void preUpdate(Equipment entity, PreUpdateContext<Equipment> context) {
    }

    @Override
    public void preDelete(Equipment entity, PreDeleteContext<Equipment> context) {
    }

    @Override
    public void postInsert(Equipment entity, PostInsertContext<Equipment> context) {
    }

    @Override
    public void postUpdate(Equipment entity, PostUpdateContext<Equipment> context) {
    }

    @Override
    public void postDelete(Equipment entity, PostDeleteContext<Equipment> context) {
    }
}
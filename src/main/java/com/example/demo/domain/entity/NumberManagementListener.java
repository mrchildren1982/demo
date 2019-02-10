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
public class NumberManagementListener implements EntityListener<NumberManagement> {

    @Override
    public void preInsert(NumberManagement entity, PreInsertContext<NumberManagement> context) {
    }

    @Override
    public void preUpdate(NumberManagement entity, PreUpdateContext<NumberManagement> context) {
    }

    @Override
    public void preDelete(NumberManagement entity, PreDeleteContext<NumberManagement> context) {
    }

    @Override
    public void postInsert(NumberManagement entity, PostInsertContext<NumberManagement> context) {
    }

    @Override
    public void postUpdate(NumberManagement entity, PostUpdateContext<NumberManagement> context) {
    }

    @Override
    public void postDelete(NumberManagement entity, PostDeleteContext<NumberManagement> context) {
    }
}
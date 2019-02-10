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
public class SalesListener implements EntityListener<Sales> {

    @Override
    public void preInsert(Sales entity, PreInsertContext<Sales> context) {
    }

    @Override
    public void preUpdate(Sales entity, PreUpdateContext<Sales> context) {
    }

    @Override
    public void preDelete(Sales entity, PreDeleteContext<Sales> context) {
    }

    @Override
    public void postInsert(Sales entity, PostInsertContext<Sales> context) {
    }

    @Override
    public void postUpdate(Sales entity, PostUpdateContext<Sales> context) {
    }

    @Override
    public void postDelete(Sales entity, PostDeleteContext<Sales> context) {
    }
}
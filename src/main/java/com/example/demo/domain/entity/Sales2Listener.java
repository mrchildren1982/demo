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
public class Sales2Listener implements EntityListener<Sales2> {

    @Override
    public void preInsert(Sales2 entity, PreInsertContext<Sales2> context) {
    }

    @Override
    public void preUpdate(Sales2 entity, PreUpdateContext<Sales2> context) {
    }

    @Override
    public void preDelete(Sales2 entity, PreDeleteContext<Sales2> context) {
    }

    @Override
    public void postInsert(Sales2 entity, PostInsertContext<Sales2> context) {
    }

    @Override
    public void postUpdate(Sales2 entity, PostUpdateContext<Sales2> context) {
    }

    @Override
    public void postDelete(Sales2 entity, PostDeleteContext<Sales2> context) {
    }
}
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
public class CustomersListener implements EntityListener<Customers> {

    @Override
    public void preInsert(Customers entity, PreInsertContext<Customers> context) {
    }

    @Override
    public void preUpdate(Customers entity, PreUpdateContext<Customers> context) {
    }

    @Override
    public void preDelete(Customers entity, PreDeleteContext<Customers> context) {
    }

    @Override
    public void postInsert(Customers entity, PostInsertContext<Customers> context) {
    }

    @Override
    public void postUpdate(Customers entity, PostUpdateContext<Customers> context) {
    }

    @Override
    public void postDelete(Customers entity, PostDeleteContext<Customers> context) {
    }
}
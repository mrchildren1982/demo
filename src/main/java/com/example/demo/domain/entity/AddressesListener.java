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
public class AddressesListener implements EntityListener<Addresses> {

    @Override
    public void preInsert(Addresses entity, PreInsertContext<Addresses> context) {
    }

    @Override
    public void preUpdate(Addresses entity, PreUpdateContext<Addresses> context) {
    }

    @Override
    public void preDelete(Addresses entity, PreDeleteContext<Addresses> context) {
    }

    @Override
    public void postInsert(Addresses entity, PostInsertContext<Addresses> context) {
    }

    @Override
    public void postUpdate(Addresses entity, PostUpdateContext<Addresses> context) {
    }

    @Override
    public void postDelete(Addresses entity, PostDeleteContext<Addresses> context) {
    }
}
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
public class Address2Listener implements EntityListener<Address2> {

    @Override
    public void preInsert(Address2 entity, PreInsertContext<Address2> context) {
    }

    @Override
    public void preUpdate(Address2 entity, PreUpdateContext<Address2> context) {
    }

    @Override
    public void preDelete(Address2 entity, PreDeleteContext<Address2> context) {
    }

    @Override
    public void postInsert(Address2 entity, PostInsertContext<Address2> context) {
    }

    @Override
    public void postUpdate(Address2 entity, PostUpdateContext<Address2> context) {
    }

    @Override
    public void postDelete(Address2 entity, PostDeleteContext<Address2> context) {
    }
}
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
public class PostalcodeListener implements EntityListener<Postalcode> {

    @Override
    public void preInsert(Postalcode entity, PreInsertContext<Postalcode> context) {
    }

    @Override
    public void preUpdate(Postalcode entity, PreUpdateContext<Postalcode> context) {
    }

    @Override
    public void preDelete(Postalcode entity, PreDeleteContext<Postalcode> context) {
    }

    @Override
    public void postInsert(Postalcode entity, PostInsertContext<Postalcode> context) {
    }

    @Override
    public void postUpdate(Postalcode entity, PostUpdateContext<Postalcode> context) {
    }

    @Override
    public void postDelete(Postalcode entity, PostDeleteContext<Postalcode> context) {
    }
}
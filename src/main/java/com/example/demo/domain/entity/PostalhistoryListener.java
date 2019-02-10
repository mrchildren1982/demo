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
public class PostalhistoryListener implements EntityListener<Postalhistory> {

    @Override
    public void preInsert(Postalhistory entity, PreInsertContext<Postalhistory> context) {
    }

    @Override
    public void preUpdate(Postalhistory entity, PreUpdateContext<Postalhistory> context) {
    }

    @Override
    public void preDelete(Postalhistory entity, PreDeleteContext<Postalhistory> context) {
    }

    @Override
    public void postInsert(Postalhistory entity, PostInsertContext<Postalhistory> context) {
    }

    @Override
    public void postUpdate(Postalhistory entity, PostUpdateContext<Postalhistory> context) {
    }

    @Override
    public void postDelete(Postalhistory entity, PostDeleteContext<Postalhistory> context) {
    }
}
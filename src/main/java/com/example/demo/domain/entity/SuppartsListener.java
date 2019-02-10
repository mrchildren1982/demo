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
public class SuppartsListener implements EntityListener<Supparts> {

    @Override
    public void preInsert(Supparts entity, PreInsertContext<Supparts> context) {
    }

    @Override
    public void preUpdate(Supparts entity, PreUpdateContext<Supparts> context) {
    }

    @Override
    public void preDelete(Supparts entity, PreDeleteContext<Supparts> context) {
    }

    @Override
    public void postInsert(Supparts entity, PostInsertContext<Supparts> context) {
    }

    @Override
    public void postUpdate(Supparts entity, PostUpdateContext<Supparts> context) {
    }

    @Override
    public void postDelete(Supparts entity, PostDeleteContext<Supparts> context) {
    }
}
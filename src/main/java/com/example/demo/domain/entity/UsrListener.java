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
public class UsrListener implements EntityListener<Usr> {

    @Override
    public void preInsert(Usr entity, PreInsertContext<Usr> context) {
    }

    @Override
    public void preUpdate(Usr entity, PreUpdateContext<Usr> context) {
    }

    @Override
    public void preDelete(Usr entity, PreDeleteContext<Usr> context) {
    }

    @Override
    public void postInsert(Usr entity, PostInsertContext<Usr> context) {
    }

    @Override
    public void postUpdate(Usr entity, PostUpdateContext<Usr> context) {
    }

    @Override
    public void postDelete(Usr entity, PostDeleteContext<Usr> context) {
    }
}
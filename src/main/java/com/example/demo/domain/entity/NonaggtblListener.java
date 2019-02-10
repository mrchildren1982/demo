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
public class NonaggtblListener implements EntityListener<Nonaggtbl> {

    @Override
    public void preInsert(Nonaggtbl entity, PreInsertContext<Nonaggtbl> context) {
    }

    @Override
    public void preUpdate(Nonaggtbl entity, PreUpdateContext<Nonaggtbl> context) {
    }

    @Override
    public void preDelete(Nonaggtbl entity, PreDeleteContext<Nonaggtbl> context) {
    }

    @Override
    public void postInsert(Nonaggtbl entity, PostInsertContext<Nonaggtbl> context) {
    }

    @Override
    public void postUpdate(Nonaggtbl entity, PostUpdateContext<Nonaggtbl> context) {
    }

    @Override
    public void postDelete(Nonaggtbl entity, PostDeleteContext<Nonaggtbl> context) {
    }
}
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
public class SampletblListener implements EntityListener<Sampletbl> {

    @Override
    public void preInsert(Sampletbl entity, PreInsertContext<Sampletbl> context) {
    }

    @Override
    public void preUpdate(Sampletbl entity, PreUpdateContext<Sampletbl> context) {
    }

    @Override
    public void preDelete(Sampletbl entity, PreDeleteContext<Sampletbl> context) {
    }

    @Override
    public void postInsert(Sampletbl entity, PostInsertContext<Sampletbl> context) {
    }

    @Override
    public void postUpdate(Sampletbl entity, PostUpdateContext<Sampletbl> context) {
    }

    @Override
    public void postDelete(Sampletbl entity, PostDeleteContext<Sampletbl> context) {
    }
}
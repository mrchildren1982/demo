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
public class PoptblListener implements EntityListener<Poptbl> {

    @Override
    public void preInsert(Poptbl entity, PreInsertContext<Poptbl> context) {
    }

    @Override
    public void preUpdate(Poptbl entity, PreUpdateContext<Poptbl> context) {
    }

    @Override
    public void preDelete(Poptbl entity, PreDeleteContext<Poptbl> context) {
    }

    @Override
    public void postInsert(Poptbl entity, PostInsertContext<Poptbl> context) {
    }

    @Override
    public void postUpdate(Poptbl entity, PostUpdateContext<Poptbl> context) {
    }

    @Override
    public void postDelete(Poptbl entity, PostDeleteContext<Poptbl> context) {
    }
}
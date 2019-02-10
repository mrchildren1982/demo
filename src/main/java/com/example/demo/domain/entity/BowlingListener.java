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
public class BowlingListener implements EntityListener<Bowling> {

    @Override
    public void preInsert(Bowling entity, PreInsertContext<Bowling> context) {
    }

    @Override
    public void preUpdate(Bowling entity, PreUpdateContext<Bowling> context) {
    }

    @Override
    public void preDelete(Bowling entity, PreDeleteContext<Bowling> context) {
    }

    @Override
    public void postInsert(Bowling entity, PostInsertContext<Bowling> context) {
    }

    @Override
    public void postUpdate(Bowling entity, PostUpdateContext<Bowling> context) {
    }

    @Override
    public void postDelete(Bowling entity, PostDeleteContext<Bowling> context) {
    }
}
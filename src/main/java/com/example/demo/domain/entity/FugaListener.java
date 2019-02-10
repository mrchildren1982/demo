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
public class FugaListener implements EntityListener<Fuga> {

    @Override
    public void preInsert(Fuga entity, PreInsertContext<Fuga> context) {
    }

    @Override
    public void preUpdate(Fuga entity, PreUpdateContext<Fuga> context) {
    }

    @Override
    public void preDelete(Fuga entity, PreDeleteContext<Fuga> context) {
    }

    @Override
    public void postInsert(Fuga entity, PostInsertContext<Fuga> context) {
    }

    @Override
    public void postUpdate(Fuga entity, PostUpdateContext<Fuga> context) {
    }

    @Override
    public void postDelete(Fuga entity, PostDeleteContext<Fuga> context) {
    }
}
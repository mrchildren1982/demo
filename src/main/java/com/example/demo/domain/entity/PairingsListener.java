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
public class PairingsListener implements EntityListener<Pairings> {

    @Override
    public void preInsert(Pairings entity, PreInsertContext<Pairings> context) {
    }

    @Override
    public void preUpdate(Pairings entity, PreUpdateContext<Pairings> context) {
    }

    @Override
    public void preDelete(Pairings entity, PreDeleteContext<Pairings> context) {
    }

    @Override
    public void postInsert(Pairings entity, PostInsertContext<Pairings> context) {
    }

    @Override
    public void postUpdate(Pairings entity, PostUpdateContext<Pairings> context) {
    }

    @Override
    public void postDelete(Pairings entity, PostDeleteContext<Pairings> context) {
    }
}
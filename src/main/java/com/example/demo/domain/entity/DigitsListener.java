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
public class DigitsListener implements EntityListener<Digits> {

    @Override
    public void preInsert(Digits entity, PreInsertContext<Digits> context) {
    }

    @Override
    public void preUpdate(Digits entity, PreUpdateContext<Digits> context) {
    }

    @Override
    public void preDelete(Digits entity, PreDeleteContext<Digits> context) {
    }

    @Override
    public void postInsert(Digits entity, PostInsertContext<Digits> context) {
    }

    @Override
    public void postUpdate(Digits entity, PostUpdateContext<Digits> context) {
    }

    @Override
    public void postDelete(Digits entity, PostDeleteContext<Digits> context) {
    }
}
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
public class NumListener implements EntityListener<Num> {

    @Override
    public void preInsert(Num entity, PreInsertContext<Num> context) {
    }

    @Override
    public void preUpdate(Num entity, PreUpdateContext<Num> context) {
    }

    @Override
    public void preDelete(Num entity, PreDeleteContext<Num> context) {
    }

    @Override
    public void postInsert(Num entity, PostInsertContext<Num> context) {
    }

    @Override
    public void postUpdate(Num entity, PostUpdateContext<Num> context) {
    }

    @Override
    public void postDelete(Num entity, PostDeleteContext<Num> context) {
    }
}
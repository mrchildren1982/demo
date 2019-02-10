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
public class Hoge1Listener implements EntityListener<Hoge1> {

    @Override
    public void preInsert(Hoge1 entity, PreInsertContext<Hoge1> context) {
    }

    @Override
    public void preUpdate(Hoge1 entity, PreUpdateContext<Hoge1> context) {
    }

    @Override
    public void preDelete(Hoge1 entity, PreDeleteContext<Hoge1> context) {
    }

    @Override
    public void postInsert(Hoge1 entity, PostInsertContext<Hoge1> context) {
    }

    @Override
    public void postUpdate(Hoge1 entity, PostUpdateContext<Hoge1> context) {
    }

    @Override
    public void postDelete(Hoge1 entity, PostDeleteContext<Hoge1> context) {
    }
}
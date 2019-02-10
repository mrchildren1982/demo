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
public class Fuga1Listener implements EntityListener<Fuga1> {

    @Override
    public void preInsert(Fuga1 entity, PreInsertContext<Fuga1> context) {
    }

    @Override
    public void preUpdate(Fuga1 entity, PreUpdateContext<Fuga1> context) {
    }

    @Override
    public void preDelete(Fuga1 entity, PreDeleteContext<Fuga1> context) {
    }

    @Override
    public void postInsert(Fuga1 entity, PostInsertContext<Fuga1> context) {
    }

    @Override
    public void postUpdate(Fuga1 entity, PostUpdateContext<Fuga1> context) {
    }

    @Override
    public void postDelete(Fuga1 entity, PostDeleteContext<Fuga1> context) {
    }
}
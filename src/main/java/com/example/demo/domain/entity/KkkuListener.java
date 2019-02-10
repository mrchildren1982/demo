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
public class KkkuListener implements EntityListener<Kkku> {

    @Override
    public void preInsert(Kkku entity, PreInsertContext<Kkku> context) {
    }

    @Override
    public void preUpdate(Kkku entity, PreUpdateContext<Kkku> context) {
    }

    @Override
    public void preDelete(Kkku entity, PreDeleteContext<Kkku> context) {
    }

    @Override
    public void postInsert(Kkku entity, PostInsertContext<Kkku> context) {
    }

    @Override
    public void postUpdate(Kkku entity, PostUpdateContext<Kkku> context) {
    }

    @Override
    public void postDelete(Kkku entity, PostDeleteContext<Kkku> context) {
    }
}
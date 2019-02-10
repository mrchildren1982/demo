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
public class ShainListener implements EntityListener<Shain> {

    @Override
    public void preInsert(Shain entity, PreInsertContext<Shain> context) {
    }

    @Override
    public void preUpdate(Shain entity, PreUpdateContext<Shain> context) {
    }

    @Override
    public void preDelete(Shain entity, PreDeleteContext<Shain> context) {
    }

    @Override
    public void postInsert(Shain entity, PostInsertContext<Shain> context) {
    }

    @Override
    public void postUpdate(Shain entity, PostUpdateContext<Shain> context) {
    }

    @Override
    public void postDelete(Shain entity, PostDeleteContext<Shain> context) {
    }
}
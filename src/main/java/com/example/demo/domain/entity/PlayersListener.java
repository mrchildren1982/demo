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
public class PlayersListener implements EntityListener<Players> {

    @Override
    public void preInsert(Players entity, PreInsertContext<Players> context) {
    }

    @Override
    public void preUpdate(Players entity, PreUpdateContext<Players> context) {
    }

    @Override
    public void preDelete(Players entity, PreDeleteContext<Players> context) {
    }

    @Override
    public void postInsert(Players entity, PostInsertContext<Players> context) {
    }

    @Override
    public void postUpdate(Players entity, PostUpdateContext<Players> context) {
    }

    @Override
    public void postDelete(Players entity, PostDeleteContext<Players> context) {
    }
}
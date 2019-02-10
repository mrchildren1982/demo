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
public class ItemsListener implements EntityListener<Items> {

    @Override
    public void preInsert(Items entity, PreInsertContext<Items> context) {
    }

    @Override
    public void preUpdate(Items entity, PreUpdateContext<Items> context) {
    }

    @Override
    public void preDelete(Items entity, PreDeleteContext<Items> context) {
    }

    @Override
    public void postInsert(Items entity, PostInsertContext<Items> context) {
    }

    @Override
    public void postUpdate(Items entity, PostUpdateContext<Items> context) {
    }

    @Override
    public void postDelete(Items entity, PostDeleteContext<Items> context) {
    }
}
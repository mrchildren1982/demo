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
public class ShopsListener implements EntityListener<Shops> {

    @Override
    public void preInsert(Shops entity, PreInsertContext<Shops> context) {
    }

    @Override
    public void preUpdate(Shops entity, PreUpdateContext<Shops> context) {
    }

    @Override
    public void preDelete(Shops entity, PreDeleteContext<Shops> context) {
    }

    @Override
    public void postInsert(Shops entity, PostInsertContext<Shops> context) {
    }

    @Override
    public void postUpdate(Shops entity, PostUpdateContext<Shops> context) {
    }

    @Override
    public void postDelete(Shops entity, PostDeleteContext<Shops> context) {
    }
}
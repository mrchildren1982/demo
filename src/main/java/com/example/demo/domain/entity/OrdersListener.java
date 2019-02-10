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
public class OrdersListener implements EntityListener<Orders> {

    @Override
    public void preInsert(Orders entity, PreInsertContext<Orders> context) {
    }

    @Override
    public void preUpdate(Orders entity, PreUpdateContext<Orders> context) {
    }

    @Override
    public void preDelete(Orders entity, PreDeleteContext<Orders> context) {
    }

    @Override
    public void postInsert(Orders entity, PostInsertContext<Orders> context) {
    }

    @Override
    public void postUpdate(Orders entity, PostUpdateContext<Orders> context) {
    }

    @Override
    public void postDelete(Orders entity, PostDeleteContext<Orders> context) {
    }
}
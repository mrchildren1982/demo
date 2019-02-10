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
public class ReceiptsListener implements EntityListener<Receipts> {

    @Override
    public void preInsert(Receipts entity, PreInsertContext<Receipts> context) {
    }

    @Override
    public void preUpdate(Receipts entity, PreUpdateContext<Receipts> context) {
    }

    @Override
    public void preDelete(Receipts entity, PreDeleteContext<Receipts> context) {
    }

    @Override
    public void postInsert(Receipts entity, PostInsertContext<Receipts> context) {
    }

    @Override
    public void postUpdate(Receipts entity, PostUpdateContext<Receipts> context) {
    }

    @Override
    public void postDelete(Receipts entity, PostDeleteContext<Receipts> context) {
    }
}
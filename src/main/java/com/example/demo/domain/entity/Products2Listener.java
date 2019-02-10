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
public class Products2Listener implements EntityListener<Products2> {

    @Override
    public void preInsert(Products2 entity, PreInsertContext<Products2> context) {
    }

    @Override
    public void preUpdate(Products2 entity, PreUpdateContext<Products2> context) {
    }

    @Override
    public void preDelete(Products2 entity, PreDeleteContext<Products2> context) {
    }

    @Override
    public void postInsert(Products2 entity, PostInsertContext<Products2> context) {
    }

    @Override
    public void postUpdate(Products2 entity, PostUpdateContext<Products2> context) {
    }

    @Override
    public void postDelete(Products2 entity, PostDeleteContext<Products2> context) {
    }
}
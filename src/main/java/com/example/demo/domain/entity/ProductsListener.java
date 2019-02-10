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
public class ProductsListener implements EntityListener<Products> {

    @Override
    public void preInsert(Products entity, PreInsertContext<Products> context) {
    }

    @Override
    public void preUpdate(Products entity, PreUpdateContext<Products> context) {
    }

    @Override
    public void preDelete(Products entity, PreDeleteContext<Products> context) {
    }

    @Override
    public void postInsert(Products entity, PostInsertContext<Products> context) {
    }

    @Override
    public void postUpdate(Products entity, PostUpdateContext<Products> context) {
    }

    @Override
    public void postDelete(Products entity, PostDeleteContext<Products> context) {
    }
}
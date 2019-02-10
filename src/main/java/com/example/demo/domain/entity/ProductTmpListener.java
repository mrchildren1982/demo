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
public class ProductTmpListener implements EntityListener<ProductTmp> {

    @Override
    public void preInsert(ProductTmp entity, PreInsertContext<ProductTmp> context) {
    }

    @Override
    public void preUpdate(ProductTmp entity, PreUpdateContext<ProductTmp> context) {
    }

    @Override
    public void preDelete(ProductTmp entity, PreDeleteContext<ProductTmp> context) {
    }

    @Override
    public void postInsert(ProductTmp entity, PostInsertContext<ProductTmp> context) {
    }

    @Override
    public void postUpdate(ProductTmp entity, PostUpdateContext<ProductTmp> context) {
    }

    @Override
    public void postDelete(ProductTmp entity, PostDeleteContext<ProductTmp> context) {
    }
}
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
public class PricebyageListener implements EntityListener<Pricebyage> {

    @Override
    public void preInsert(Pricebyage entity, PreInsertContext<Pricebyage> context) {
    }

    @Override
    public void preUpdate(Pricebyage entity, PreUpdateContext<Pricebyage> context) {
    }

    @Override
    public void preDelete(Pricebyage entity, PreDeleteContext<Pricebyage> context) {
    }

    @Override
    public void postInsert(Pricebyage entity, PostInsertContext<Pricebyage> context) {
    }

    @Override
    public void postUpdate(Pricebyage entity, PostUpdateContext<Pricebyage> context) {
    }

    @Override
    public void postDelete(Pricebyage entity, PostDeleteContext<Pricebyage> context) {
    }
}
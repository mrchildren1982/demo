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
public class CountriesListener implements EntityListener<Countries> {

    @Override
    public void preInsert(Countries entity, PreInsertContext<Countries> context) {
    }

    @Override
    public void preUpdate(Countries entity, PreUpdateContext<Countries> context) {
    }

    @Override
    public void preDelete(Countries entity, PreDeleteContext<Countries> context) {
    }

    @Override
    public void postInsert(Countries entity, PostInsertContext<Countries> context) {
    }

    @Override
    public void postUpdate(Countries entity, PostUpdateContext<Countries> context) {
    }

    @Override
    public void postDelete(Countries entity, PostDeleteContext<Countries> context) {
    }
}
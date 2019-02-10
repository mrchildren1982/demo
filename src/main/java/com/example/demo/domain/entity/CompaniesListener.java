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
public class CompaniesListener implements EntityListener<Companies> {

    @Override
    public void preInsert(Companies entity, PreInsertContext<Companies> context) {
    }

    @Override
    public void preUpdate(Companies entity, PreUpdateContext<Companies> context) {
    }

    @Override
    public void preDelete(Companies entity, PreDeleteContext<Companies> context) {
    }

    @Override
    public void postInsert(Companies entity, PostInsertContext<Companies> context) {
    }

    @Override
    public void postUpdate(Companies entity, PostUpdateContext<Companies> context) {
    }

    @Override
    public void postDelete(Companies entity, PostDeleteContext<Companies> context) {
    }
}
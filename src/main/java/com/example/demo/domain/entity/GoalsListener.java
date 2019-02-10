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
public class GoalsListener implements EntityListener<Goals> {

    @Override
    public void preInsert(Goals entity, PreInsertContext<Goals> context) {
    }

    @Override
    public void preUpdate(Goals entity, PreUpdateContext<Goals> context) {
    }

    @Override
    public void preDelete(Goals entity, PreDeleteContext<Goals> context) {
    }

    @Override
    public void postInsert(Goals entity, PostInsertContext<Goals> context) {
    }

    @Override
    public void postUpdate(Goals entity, PostUpdateContext<Goals> context) {
    }

    @Override
    public void postDelete(Goals entity, PostDeleteContext<Goals> context) {
    }
}
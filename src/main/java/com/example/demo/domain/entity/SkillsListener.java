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
public class SkillsListener implements EntityListener<Skills> {

    @Override
    public void preInsert(Skills entity, PreInsertContext<Skills> context) {
    }

    @Override
    public void preUpdate(Skills entity, PreUpdateContext<Skills> context) {
    }

    @Override
    public void preDelete(Skills entity, PreDeleteContext<Skills> context) {
    }

    @Override
    public void postInsert(Skills entity, PostInsertContext<Skills> context) {
    }

    @Override
    public void postUpdate(Skills entity, PostUpdateContext<Skills> context) {
    }

    @Override
    public void postDelete(Skills entity, PostDeleteContext<Skills> context) {
    }
}
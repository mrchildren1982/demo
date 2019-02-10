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
public class ShuhzaiListener implements EntityListener<Shuhzai> {

    @Override
    public void preInsert(Shuhzai entity, PreInsertContext<Shuhzai> context) {
    }

    @Override
    public void preUpdate(Shuhzai entity, PreUpdateContext<Shuhzai> context) {
    }

    @Override
    public void preDelete(Shuhzai entity, PreDeleteContext<Shuhzai> context) {
    }

    @Override
    public void postInsert(Shuhzai entity, PostInsertContext<Shuhzai> context) {
    }

    @Override
    public void postUpdate(Shuhzai entity, PostUpdateContext<Shuhzai> context) {
    }

    @Override
    public void postDelete(Shuhzai entity, PostDeleteContext<Shuhzai> context) {
    }
}
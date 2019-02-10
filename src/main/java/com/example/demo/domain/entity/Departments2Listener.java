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
public class Departments2Listener implements EntityListener<Departments2> {

    @Override
    public void preInsert(Departments2 entity, PreInsertContext<Departments2> context) {
    }

    @Override
    public void preUpdate(Departments2 entity, PreUpdateContext<Departments2> context) {
    }

    @Override
    public void preDelete(Departments2 entity, PreDeleteContext<Departments2> context) {
    }

    @Override
    public void postInsert(Departments2 entity, PostInsertContext<Departments2> context) {
    }

    @Override
    public void postUpdate(Departments2 entity, PostUpdateContext<Departments2> context) {
    }

    @Override
    public void postDelete(Departments2 entity, PostDeleteContext<Departments2> context) {
    }
}
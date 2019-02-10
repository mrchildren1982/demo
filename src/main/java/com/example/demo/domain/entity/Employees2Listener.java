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
public class Employees2Listener implements EntityListener<Employees2> {

    @Override
    public void preInsert(Employees2 entity, PreInsertContext<Employees2> context) {
    }

    @Override
    public void preUpdate(Employees2 entity, PreUpdateContext<Employees2> context) {
    }

    @Override
    public void preDelete(Employees2 entity, PreDeleteContext<Employees2> context) {
    }

    @Override
    public void postInsert(Employees2 entity, PostInsertContext<Employees2> context) {
    }

    @Override
    public void postUpdate(Employees2 entity, PostUpdateContext<Employees2> context) {
    }

    @Override
    public void postDelete(Employees2 entity, PostDeleteContext<Employees2> context) {
    }
}
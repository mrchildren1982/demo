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
public class DepartmentsListener implements EntityListener<Departments> {

    @Override
    public void preInsert(Departments entity, PreInsertContext<Departments> context) {
    }

    @Override
    public void preUpdate(Departments entity, PreUpdateContext<Departments> context) {
    }

    @Override
    public void preDelete(Departments entity, PreDeleteContext<Departments> context) {
    }

    @Override
    public void postInsert(Departments entity, PostInsertContext<Departments> context) {
    }

    @Override
    public void postUpdate(Departments entity, PostUpdateContext<Departments> context) {
    }

    @Override
    public void postDelete(Departments entity, PostDeleteContext<Departments> context) {
    }
}
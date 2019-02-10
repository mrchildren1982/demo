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
public class StudentsListener implements EntityListener<Students> {

    @Override
    public void preInsert(Students entity, PreInsertContext<Students> context) {
    }

    @Override
    public void preUpdate(Students entity, PreUpdateContext<Students> context) {
    }

    @Override
    public void preDelete(Students entity, PreDeleteContext<Students> context) {
    }

    @Override
    public void postInsert(Students entity, PostInsertContext<Students> context) {
    }

    @Override
    public void postUpdate(Students entity, PostUpdateContext<Students> context) {
    }

    @Override
    public void postDelete(Students entity, PostDeleteContext<Students> context) {
    }
}
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
public class ClassBListener implements EntityListener<ClassB> {

    @Override
    public void preInsert(ClassB entity, PreInsertContext<ClassB> context) {
    }

    @Override
    public void preUpdate(ClassB entity, PreUpdateContext<ClassB> context) {
    }

    @Override
    public void preDelete(ClassB entity, PreDeleteContext<ClassB> context) {
    }

    @Override
    public void postInsert(ClassB entity, PostInsertContext<ClassB> context) {
    }

    @Override
    public void postUpdate(ClassB entity, PostUpdateContext<ClassB> context) {
    }

    @Override
    public void postDelete(ClassB entity, PostDeleteContext<ClassB> context) {
    }
}
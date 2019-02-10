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
public class ClassAListener implements EntityListener<ClassA> {

    @Override
    public void preInsert(ClassA entity, PreInsertContext<ClassA> context) {
    }

    @Override
    public void preUpdate(ClassA entity, PreUpdateContext<ClassA> context) {
    }

    @Override
    public void preDelete(ClassA entity, PreDeleteContext<ClassA> context) {
    }

    @Override
    public void postInsert(ClassA entity, PostInsertContext<ClassA> context) {
    }

    @Override
    public void postUpdate(ClassA entity, PostUpdateContext<ClassA> context) {
    }

    @Override
    public void postDelete(ClassA entity, PostDeleteContext<ClassA> context) {
    }
}
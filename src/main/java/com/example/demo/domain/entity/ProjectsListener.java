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
public class ProjectsListener implements EntityListener<Projects> {

    @Override
    public void preInsert(Projects entity, PreInsertContext<Projects> context) {
    }

    @Override
    public void preUpdate(Projects entity, PreUpdateContext<Projects> context) {
    }

    @Override
    public void preDelete(Projects entity, PreDeleteContext<Projects> context) {
    }

    @Override
    public void postInsert(Projects entity, PostInsertContext<Projects> context) {
    }

    @Override
    public void postUpdate(Projects entity, PostUpdateContext<Projects> context) {
    }

    @Override
    public void postDelete(Projects entity, PostDeleteContext<Projects> context) {
    }
}
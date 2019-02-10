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
public class BlogListener implements EntityListener<Blog> {

    @Override
    public void preInsert(Blog entity, PreInsertContext<Blog> context) {
    }

    @Override
    public void preUpdate(Blog entity, PreUpdateContext<Blog> context) {
    }

    @Override
    public void preDelete(Blog entity, PreDeleteContext<Blog> context) {
    }

    @Override
    public void postInsert(Blog entity, PostInsertContext<Blog> context) {
    }

    @Override
    public void postUpdate(Blog entity, PostUpdateContext<Blog> context) {
    }

    @Override
    public void postDelete(Blog entity, PostDeleteContext<Blog> context) {
    }
}
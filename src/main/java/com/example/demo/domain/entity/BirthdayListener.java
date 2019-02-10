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
public class BirthdayListener implements EntityListener<Birthday> {

    @Override
    public void preInsert(Birthday entity, PreInsertContext<Birthday> context) {
    }

    @Override
    public void preUpdate(Birthday entity, PreUpdateContext<Birthday> context) {
    }

    @Override
    public void preDelete(Birthday entity, PreDeleteContext<Birthday> context) {
    }

    @Override
    public void postInsert(Birthday entity, PostInsertContext<Birthday> context) {
    }

    @Override
    public void postUpdate(Birthday entity, PostUpdateContext<Birthday> context) {
    }

    @Override
    public void postDelete(Birthday entity, PostDeleteContext<Birthday> context) {
    }
}
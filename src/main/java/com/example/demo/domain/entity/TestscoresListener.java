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
public class TestscoresListener implements EntityListener<Testscores> {

    @Override
    public void preInsert(Testscores entity, PreInsertContext<Testscores> context) {
    }

    @Override
    public void preUpdate(Testscores entity, PreUpdateContext<Testscores> context) {
    }

    @Override
    public void preDelete(Testscores entity, PreDeleteContext<Testscores> context) {
    }

    @Override
    public void postInsert(Testscores entity, PostInsertContext<Testscores> context) {
    }

    @Override
    public void postUpdate(Testscores entity, PostUpdateContext<Testscores> context) {
    }

    @Override
    public void postDelete(Testscores entity, PostDeleteContext<Testscores> context) {
    }
}
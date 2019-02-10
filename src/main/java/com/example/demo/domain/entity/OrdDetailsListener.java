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
public class OrdDetailsListener implements EntityListener<OrdDetails> {

    @Override
    public void preInsert(OrdDetails entity, PreInsertContext<OrdDetails> context) {
    }

    @Override
    public void preUpdate(OrdDetails entity, PreUpdateContext<OrdDetails> context) {
    }

    @Override
    public void preDelete(OrdDetails entity, PreDeleteContext<OrdDetails> context) {
    }

    @Override
    public void postInsert(OrdDetails entity, PostInsertContext<OrdDetails> context) {
    }

    @Override
    public void postUpdate(OrdDetails entity, PostUpdateContext<OrdDetails> context) {
    }

    @Override
    public void postDelete(OrdDetails entity, PostDeleteContext<OrdDetails> context) {
    }
}
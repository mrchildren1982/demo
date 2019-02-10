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
public class TCmBankListener implements EntityListener<TCmBank> {

    @Override
    public void preInsert(TCmBank entity, PreInsertContext<TCmBank> context) {
    }

    @Override
    public void preUpdate(TCmBank entity, PreUpdateContext<TCmBank> context) {
    }

    @Override
    public void preDelete(TCmBank entity, PreDeleteContext<TCmBank> context) {
    }

    @Override
    public void postInsert(TCmBank entity, PostInsertContext<TCmBank> context) {
    }

    @Override
    public void postUpdate(TCmBank entity, PostUpdateContext<TCmBank> context) {
    }

    @Override
    public void postDelete(TCmBank entity, PostDeleteContext<TCmBank> context) {
    }
}
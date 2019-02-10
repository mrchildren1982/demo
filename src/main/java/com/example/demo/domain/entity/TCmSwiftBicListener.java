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
public class TCmSwiftBicListener implements EntityListener<TCmSwiftBic> {

    @Override
    public void preInsert(TCmSwiftBic entity, PreInsertContext<TCmSwiftBic> context) {
    }

    @Override
    public void preUpdate(TCmSwiftBic entity, PreUpdateContext<TCmSwiftBic> context) {
    }

    @Override
    public void preDelete(TCmSwiftBic entity, PreDeleteContext<TCmSwiftBic> context) {
    }

    @Override
    public void postInsert(TCmSwiftBic entity, PostInsertContext<TCmSwiftBic> context) {
    }

    @Override
    public void postUpdate(TCmSwiftBic entity, PostUpdateContext<TCmSwiftBic> context) {
    }

    @Override
    public void postDelete(TCmSwiftBic entity, PostDeleteContext<TCmSwiftBic> context) {
    }
}
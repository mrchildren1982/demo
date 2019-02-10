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
public class MtsMemberListener implements EntityListener<MtsMember> {

    @Override
    public void preInsert(MtsMember entity, PreInsertContext<MtsMember> context) {
    }

    @Override
    public void preUpdate(MtsMember entity, PreUpdateContext<MtsMember> context) {
    }

    @Override
    public void preDelete(MtsMember entity, PreDeleteContext<MtsMember> context) {
    }

    @Override
    public void postInsert(MtsMember entity, PostInsertContext<MtsMember> context) {
    }

    @Override
    public void postUpdate(MtsMember entity, PostUpdateContext<MtsMember> context) {
    }

    @Override
    public void postDelete(MtsMember entity, PostDeleteContext<MtsMember> context) {
    }
}
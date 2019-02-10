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
public class ForesightMemberListener implements EntityListener<ForesightMember> {

    @Override
    public void preInsert(ForesightMember entity, PreInsertContext<ForesightMember> context) {
    }

    @Override
    public void preUpdate(ForesightMember entity, PreUpdateContext<ForesightMember> context) {
    }

    @Override
    public void preDelete(ForesightMember entity, PreDeleteContext<ForesightMember> context) {
    }

    @Override
    public void postInsert(ForesightMember entity, PostInsertContext<ForesightMember> context) {
    }

    @Override
    public void postUpdate(ForesightMember entity, PostUpdateContext<ForesightMember> context) {
    }

    @Override
    public void postDelete(ForesightMember entity, PostDeleteContext<ForesightMember> context) {
    }
}
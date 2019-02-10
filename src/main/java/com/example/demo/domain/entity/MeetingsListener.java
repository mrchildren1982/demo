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
public class MeetingsListener implements EntityListener<Meetings> {

    @Override
    public void preInsert(Meetings entity, PreInsertContext<Meetings> context) {
    }

    @Override
    public void preUpdate(Meetings entity, PreUpdateContext<Meetings> context) {
    }

    @Override
    public void preDelete(Meetings entity, PreDeleteContext<Meetings> context) {
    }

    @Override
    public void postInsert(Meetings entity, PostInsertContext<Meetings> context) {
    }

    @Override
    public void postUpdate(Meetings entity, PostUpdateContext<Meetings> context) {
    }

    @Override
    public void postDelete(Meetings entity, PostDeleteContext<Meetings> context) {
    }
}
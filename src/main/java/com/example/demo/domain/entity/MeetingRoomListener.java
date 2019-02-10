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
public class MeetingRoomListener implements EntityListener<MeetingRoom> {

    @Override
    public void preInsert(MeetingRoom entity, PreInsertContext<MeetingRoom> context) {
    }

    @Override
    public void preUpdate(MeetingRoom entity, PreUpdateContext<MeetingRoom> context) {
    }

    @Override
    public void preDelete(MeetingRoom entity, PreDeleteContext<MeetingRoom> context) {
    }

    @Override
    public void postInsert(MeetingRoom entity, PostInsertContext<MeetingRoom> context) {
    }

    @Override
    public void postUpdate(MeetingRoom entity, PostUpdateContext<MeetingRoom> context) {
    }

    @Override
    public void postDelete(MeetingRoom entity, PostDeleteContext<MeetingRoom> context) {
    }
}
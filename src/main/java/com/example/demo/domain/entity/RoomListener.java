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
public class RoomListener implements EntityListener<Room> {

    @Override
    public void preInsert(Room entity, PreInsertContext<Room> context) {
    }

    @Override
    public void preUpdate(Room entity, PreUpdateContext<Room> context) {
    }

    @Override
    public void preDelete(Room entity, PreDeleteContext<Room> context) {
    }

    @Override
    public void postInsert(Room entity, PostInsertContext<Room> context) {
    }

    @Override
    public void postUpdate(Room entity, PostUpdateContext<Room> context) {
    }

    @Override
    public void postDelete(Room entity, PostDeleteContext<Room> context) {
    }
}
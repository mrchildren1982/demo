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
public class ReservableRoomListener implements EntityListener<ReservableRoom> {

    @Override
    public void preInsert(ReservableRoom entity, PreInsertContext<ReservableRoom> context) {
    }

    @Override
    public void preUpdate(ReservableRoom entity, PreUpdateContext<ReservableRoom> context) {
    }

    @Override
    public void preDelete(ReservableRoom entity, PreDeleteContext<ReservableRoom> context) {
    }

    @Override
    public void postInsert(ReservableRoom entity, PostInsertContext<ReservableRoom> context) {
    }

    @Override
    public void postUpdate(ReservableRoom entity, PostUpdateContext<ReservableRoom> context) {
    }

    @Override
    public void postDelete(ReservableRoom entity, PostDeleteContext<ReservableRoom> context) {
    }
}
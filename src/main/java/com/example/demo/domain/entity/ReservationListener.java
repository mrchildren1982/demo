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
public class ReservationListener implements EntityListener<Reservation> {

    @Override
    public void preInsert(Reservation entity, PreInsertContext<Reservation> context) {
    }

    @Override
    public void preUpdate(Reservation entity, PreUpdateContext<Reservation> context) {
    }

    @Override
    public void preDelete(Reservation entity, PreDeleteContext<Reservation> context) {
    }

    @Override
    public void postInsert(Reservation entity, PostInsertContext<Reservation> context) {
    }

    @Override
    public void postUpdate(Reservation entity, PostUpdateContext<Reservation> context) {
    }

    @Override
    public void postDelete(Reservation entity, PostDeleteContext<Reservation> context) {
    }
}
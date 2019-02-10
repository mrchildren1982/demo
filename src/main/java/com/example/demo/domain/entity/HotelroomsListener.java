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
public class HotelroomsListener implements EntityListener<Hotelrooms> {

    @Override
    public void preInsert(Hotelrooms entity, PreInsertContext<Hotelrooms> context) {
    }

    @Override
    public void preUpdate(Hotelrooms entity, PreUpdateContext<Hotelrooms> context) {
    }

    @Override
    public void preDelete(Hotelrooms entity, PreDeleteContext<Hotelrooms> context) {
    }

    @Override
    public void postInsert(Hotelrooms entity, PostInsertContext<Hotelrooms> context) {
    }

    @Override
    public void postUpdate(Hotelrooms entity, PostUpdateContext<Hotelrooms> context) {
    }

    @Override
    public void postDelete(Hotelrooms entity, PostDeleteContext<Hotelrooms> context) {
    }
}
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
public class HogeTempListener implements EntityListener<HogeTemp> {

    @Override
    public void preInsert(HogeTemp entity, PreInsertContext<HogeTemp> context) {
    }

    @Override
    public void preUpdate(HogeTemp entity, PreUpdateContext<HogeTemp> context) {
    }

    @Override
    public void preDelete(HogeTemp entity, PreDeleteContext<HogeTemp> context) {
    }

    @Override
    public void postInsert(HogeTemp entity, PostInsertContext<HogeTemp> context) {
    }

    @Override
    public void postUpdate(HogeTemp entity, PostUpdateContext<HogeTemp> context) {
    }

    @Override
    public void postDelete(HogeTemp entity, PostDeleteContext<HogeTemp> context) {
    }
}
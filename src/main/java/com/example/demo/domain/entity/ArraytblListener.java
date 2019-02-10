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
public class ArraytblListener implements EntityListener<Arraytbl> {

    @Override
    public void preInsert(Arraytbl entity, PreInsertContext<Arraytbl> context) {
    }

    @Override
    public void preUpdate(Arraytbl entity, PreUpdateContext<Arraytbl> context) {
    }

    @Override
    public void preDelete(Arraytbl entity, PreDeleteContext<Arraytbl> context) {
    }

    @Override
    public void postInsert(Arraytbl entity, PostInsertContext<Arraytbl> context) {
    }

    @Override
    public void postUpdate(Arraytbl entity, PostUpdateContext<Arraytbl> context) {
    }

    @Override
    public void postDelete(Arraytbl entity, PostDeleteContext<Arraytbl> context) {
    }
}
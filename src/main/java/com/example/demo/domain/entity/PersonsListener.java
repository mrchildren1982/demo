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
public class PersonsListener implements EntityListener<Persons> {

    @Override
    public void preInsert(Persons entity, PreInsertContext<Persons> context) {
    }

    @Override
    public void preUpdate(Persons entity, PreUpdateContext<Persons> context) {
    }

    @Override
    public void preDelete(Persons entity, PreDeleteContext<Persons> context) {
    }

    @Override
    public void postInsert(Persons entity, PostInsertContext<Persons> context) {
    }

    @Override
    public void postUpdate(Persons entity, PostUpdateContext<Persons> context) {
    }

    @Override
    public void postDelete(Persons entity, PostDeleteContext<Persons> context) {
    }
}
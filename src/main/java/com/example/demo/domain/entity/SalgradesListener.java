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
public class SalgradesListener implements EntityListener<Salgrades> {

    @Override
    public void preInsert(Salgrades entity, PreInsertContext<Salgrades> context) {
    }

    @Override
    public void preUpdate(Salgrades entity, PreUpdateContext<Salgrades> context) {
    }

    @Override
    public void preDelete(Salgrades entity, PreDeleteContext<Salgrades> context) {
    }

    @Override
    public void postInsert(Salgrades entity, PostInsertContext<Salgrades> context) {
    }

    @Override
    public void postUpdate(Salgrades entity, PostUpdateContext<Salgrades> context) {
    }

    @Override
    public void postDelete(Salgrades entity, PostDeleteContext<Salgrades> context) {
    }
}
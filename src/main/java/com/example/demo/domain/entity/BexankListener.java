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
public class BexankListener implements EntityListener<Bexank> {

    @Override
    public void preInsert(Bexank entity, PreInsertContext<Bexank> context) {
    }

    @Override
    public void preUpdate(Bexank entity, PreUpdateContext<Bexank> context) {
    }

    @Override
    public void preDelete(Bexank entity, PreDeleteContext<Bexank> context) {
    }

    @Override
    public void postInsert(Bexank entity, PostInsertContext<Bexank> context) {
    }

    @Override
    public void postUpdate(Bexank entity, PostUpdateContext<Bexank> context) {
    }

    @Override
    public void postDelete(Bexank entity, PostDeleteContext<Bexank> context) {
    }
}
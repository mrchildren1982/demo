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
public class SeqtblListener implements EntityListener<Seqtbl> {

    @Override
    public void preInsert(Seqtbl entity, PreInsertContext<Seqtbl> context) {
    }

    @Override
    public void preUpdate(Seqtbl entity, PreUpdateContext<Seqtbl> context) {
    }

    @Override
    public void preDelete(Seqtbl entity, PreDeleteContext<Seqtbl> context) {
    }

    @Override
    public void postInsert(Seqtbl entity, PostInsertContext<Seqtbl> context) {
    }

    @Override
    public void postUpdate(Seqtbl entity, PostUpdateContext<Seqtbl> context) {
    }

    @Override
    public void postDelete(Seqtbl entity, PostDeleteContext<Seqtbl> context) {
    }
}
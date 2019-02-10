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
public class TblBListener implements EntityListener<TblB> {

    @Override
    public void preInsert(TblB entity, PreInsertContext<TblB> context) {
    }

    @Override
    public void preUpdate(TblB entity, PreUpdateContext<TblB> context) {
    }

    @Override
    public void preDelete(TblB entity, PreDeleteContext<TblB> context) {
    }

    @Override
    public void postInsert(TblB entity, PostInsertContext<TblB> context) {
    }

    @Override
    public void postUpdate(TblB entity, PostUpdateContext<TblB> context) {
    }

    @Override
    public void postDelete(TblB entity, PostDeleteContext<TblB> context) {
    }
}
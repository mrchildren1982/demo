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
public class TblAListener implements EntityListener<TblA> {

    @Override
    public void preInsert(TblA entity, PreInsertContext<TblA> context) {
    }

    @Override
    public void preUpdate(TblA entity, PreUpdateContext<TblA> context) {
    }

    @Override
    public void preDelete(TblA entity, PreDeleteContext<TblA> context) {
    }

    @Override
    public void postInsert(TblA entity, PostInsertContext<TblA> context) {
    }

    @Override
    public void postUpdate(TblA entity, PostUpdateContext<TblA> context) {
    }

    @Override
    public void postDelete(TblA entity, PostDeleteContext<TblA> context) {
    }
}
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
public class CoursemasterListener implements EntityListener<Coursemaster> {

    @Override
    public void preInsert(Coursemaster entity, PreInsertContext<Coursemaster> context) {
    }

    @Override
    public void preUpdate(Coursemaster entity, PreUpdateContext<Coursemaster> context) {
    }

    @Override
    public void preDelete(Coursemaster entity, PreDeleteContext<Coursemaster> context) {
    }

    @Override
    public void postInsert(Coursemaster entity, PostInsertContext<Coursemaster> context) {
    }

    @Override
    public void postUpdate(Coursemaster entity, PostUpdateContext<Coursemaster> context) {
    }

    @Override
    public void postDelete(Coursemaster entity, PostDeleteContext<Coursemaster> context) {
    }
}
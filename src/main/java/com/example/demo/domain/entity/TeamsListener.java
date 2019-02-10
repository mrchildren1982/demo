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
public class TeamsListener implements EntityListener<Teams> {

    @Override
    public void preInsert(Teams entity, PreInsertContext<Teams> context) {
    }

    @Override
    public void preUpdate(Teams entity, PreUpdateContext<Teams> context) {
    }

    @Override
    public void preDelete(Teams entity, PreDeleteContext<Teams> context) {
    }

    @Override
    public void postInsert(Teams entity, PostInsertContext<Teams> context) {
    }

    @Override
    public void postUpdate(Teams entity, PostUpdateContext<Teams> context) {
    }

    @Override
    public void postDelete(Teams entity, PostDeleteContext<Teams> context) {
    }
}
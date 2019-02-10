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
public class PopulationListener implements EntityListener<Population> {

    @Override
    public void preInsert(Population entity, PreInsertContext<Population> context) {
    }

    @Override
    public void preUpdate(Population entity, PreUpdateContext<Population> context) {
    }

    @Override
    public void preDelete(Population entity, PreDeleteContext<Population> context) {
    }

    @Override
    public void postInsert(Population entity, PostInsertContext<Population> context) {
    }

    @Override
    public void postUpdate(Population entity, PostUpdateContext<Population> context) {
    }

    @Override
    public void postDelete(Population entity, PostDeleteContext<Population> context) {
    }
}
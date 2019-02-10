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
public class TeamListener implements EntityListener<Team> {

    @Override
    public void preInsert(Team entity, PreInsertContext<Team> context) {
    }

    @Override
    public void preUpdate(Team entity, PreUpdateContext<Team> context) {
    }

    @Override
    public void preDelete(Team entity, PreDeleteContext<Team> context) {
    }

    @Override
    public void postInsert(Team entity, PostInsertContext<Team> context) {
    }

    @Override
    public void postUpdate(Team entity, PostUpdateContext<Team> context) {
    }

    @Override
    public void postDelete(Team entity, PostDeleteContext<Team> context) {
    }
}
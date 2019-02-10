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
public class OpencoursesListener implements EntityListener<Opencourses> {

    @Override
    public void preInsert(Opencourses entity, PreInsertContext<Opencourses> context) {
    }

    @Override
    public void preUpdate(Opencourses entity, PreUpdateContext<Opencourses> context) {
    }

    @Override
    public void preDelete(Opencourses entity, PreDeleteContext<Opencourses> context) {
    }

    @Override
    public void postInsert(Opencourses entity, PostInsertContext<Opencourses> context) {
    }

    @Override
    public void postUpdate(Opencourses entity, PostUpdateContext<Opencourses> context) {
    }

    @Override
    public void postDelete(Opencourses entity, PostDeleteContext<Opencourses> context) {
    }
}
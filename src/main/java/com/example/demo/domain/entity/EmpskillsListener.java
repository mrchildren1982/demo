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
public class EmpskillsListener implements EntityListener<Empskills> {

    @Override
    public void preInsert(Empskills entity, PreInsertContext<Empskills> context) {
    }

    @Override
    public void preUpdate(Empskills entity, PreUpdateContext<Empskills> context) {
    }

    @Override
    public void preDelete(Empskills entity, PreDeleteContext<Empskills> context) {
    }

    @Override
    public void postInsert(Empskills entity, PostInsertContext<Empskills> context) {
    }

    @Override
    public void postUpdate(Empskills entity, PostUpdateContext<Empskills> context) {
    }

    @Override
    public void postDelete(Empskills entity, PostDeleteContext<Empskills> context) {
    }
}
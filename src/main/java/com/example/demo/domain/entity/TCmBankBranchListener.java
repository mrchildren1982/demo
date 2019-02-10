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
public class TCmBankBranchListener implements EntityListener<TCmBankBranch> {

    @Override
    public void preInsert(TCmBankBranch entity, PreInsertContext<TCmBankBranch> context) {
    }

    @Override
    public void preUpdate(TCmBankBranch entity, PreUpdateContext<TCmBankBranch> context) {
    }

    @Override
    public void preDelete(TCmBankBranch entity, PreDeleteContext<TCmBankBranch> context) {
    }

    @Override
    public void postInsert(TCmBankBranch entity, PostInsertContext<TCmBankBranch> context) {
    }

    @Override
    public void postUpdate(TCmBankBranch entity, PostUpdateContext<TCmBankBranch> context) {
    }

    @Override
    public void postDelete(TCmBankBranch entity, PostDeleteContext<TCmBankBranch> context) {
    }
}
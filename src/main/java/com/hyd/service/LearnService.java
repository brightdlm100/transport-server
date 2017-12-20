package com.hyd.service;

import java.util.List;

import com.hyd.domain.po.LearnResource;
import com.hyd.model.LeanQueryLeanListReq;
import com.hyd.util.Page;


/**
 * Created by tengj on 2017/4/7.
 */

public interface LearnService {
    List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page);	
}

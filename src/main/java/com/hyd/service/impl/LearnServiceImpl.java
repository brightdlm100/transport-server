package com.hyd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hyd.dao.po.mapper.LearnResourceMapper;
import com.hyd.domain.po.LearnResource;
import com.hyd.model.LeanQueryLeanListReq;
import com.hyd.service.LearnService;
import com.hyd.util.Page;



/**
 * Created by tengj on 2017/4/7.
 **/
@Service
public class LearnServiceImpl   implements LearnService {

    @Autowired
    private LearnResourceMapper  learnResourceMapper;

  

    public List<LearnResource> queryLearnResouceList(Page<LeanQueryLeanListReq> page) {
        PageHelper.startPage(page.getPage(), page.getRows());
        return learnResourceMapper.queryLearnResouceList(page.getCondition());
    }


}

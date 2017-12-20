package com.hyd.dao.po.mapper;



import java.util.List;
import java.util.Map;

import com.hyd.domain.po.LearnResource;

public interface LearnResourceMapper  {
    List<LearnResource> queryLearnResouceList(Map<String,Object> map);

}
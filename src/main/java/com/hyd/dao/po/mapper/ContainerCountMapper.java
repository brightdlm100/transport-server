package com.hyd.dao.po.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hyd.domain.po.ContainerCount;
import com.hyd.domain.po.ContainerCountExample;

public interface ContainerCountMapper {
    int countByExample(ContainerCountExample example);

    int deleteByExample(ContainerCountExample example);

    int deleteByPrimaryKey(String countid);

    int insert(ContainerCount record);

    int insertSelective(ContainerCount record);

    List<ContainerCount> selectByExample(ContainerCountExample example);

    ContainerCount selectByPrimaryKey(String countid);

    int updateByExampleSelective(@Param("record") ContainerCount record, @Param("example") ContainerCountExample example);

    int updateByExample(@Param("record") ContainerCount record, @Param("example") ContainerCountExample example);

    int updateByPrimaryKeySelective(ContainerCount record);

    int updateByPrimaryKey(ContainerCount record);
}
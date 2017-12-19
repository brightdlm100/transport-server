package com.hyd.dao.po.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hyd.domain.po.Container;
import com.hyd.domain.po.ContainerExample;

public interface ContainerMapper {
    int countByExample(ContainerExample example);

    int deleteByExample(ContainerExample example);

    int deleteByPrimaryKey(String containerid);

    int insert(Container record);

    int insertSelective(Container record);

    List<Container> selectByExample(ContainerExample example);

    Container selectByPrimaryKey(String containerid);

    int updateByExampleSelective(@Param("record") Container record, @Param("example") ContainerExample example);

    int updateByExample(@Param("record") Container record, @Param("example") ContainerExample example);

    int updateByPrimaryKeySelective(Container record);

    int updateByPrimaryKey(Container record);
}
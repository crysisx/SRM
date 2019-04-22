package com.sxt.teach.mapper;

import com.sxt.teach.pojo.ClassBean;
import com.sxt.teach.pojo.ClassBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassBeanMapper {
    long countByExample(ClassBeanExample example);

    int deleteByExample(ClassBeanExample example);

    int deleteByPrimaryKey(Integer classId);

    int insert(ClassBean record);

    int insertSelective(ClassBean record);

    List<ClassBean> selectByExample(ClassBeanExample example);

    ClassBean selectByPrimaryKey(Integer classId);

    int updateByExampleSelective(@Param("record") ClassBean record, @Param("example") ClassBeanExample example);

    int updateByExample(@Param("record") ClassBean record, @Param("example") ClassBeanExample example);

    int updateByPrimaryKeySelective(ClassBean record);

    int updateByPrimaryKey(ClassBean record);
}
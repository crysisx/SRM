package com.sxt.blogs.mapper;

import com.sxt.blogs.pojo.BlogsType;
import com.sxt.blogs.pojo.BlogsTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsTypeMapper {
    long countByExample(BlogsTypeExample example);

    int deleteByExample(BlogsTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(BlogsType record);

    int insertSelective(BlogsType record);

    List<BlogsType> selectByExample(BlogsTypeExample example);

    BlogsType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") BlogsType record, @Param("example") BlogsTypeExample example);

    int updateByExample(@Param("record") BlogsType record, @Param("example") BlogsTypeExample example);

    int updateByPrimaryKeySelective(BlogsType record);

    int updateByPrimaryKey(BlogsType record);
}
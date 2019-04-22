package com.sxt.blogs.mapper;

import com.sxt.blogs.pojo.Blogs;
import com.sxt.blogs.pojo.BlogsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogsMapper {
    long countByExample(BlogsExample example);

    int deleteByExample(BlogsExample example);

    int insert(Blogs record);

    int insertSelective(Blogs record);

    List<Blogs> selectByExample(BlogsExample example);
    
    List<Blogs> selectByView(BlogsExample example);

    int updateByExampleSelective(@Param("record") Blogs record, @Param("example") BlogsExample example);

    int updateByExample(@Param("record") Blogs record, @Param("example") BlogsExample example);
}
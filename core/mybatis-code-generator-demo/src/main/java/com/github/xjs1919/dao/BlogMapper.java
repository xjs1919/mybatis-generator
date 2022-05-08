package com.github.xjs1919.dao;

import com.github.xjs1919.domain.Blog;
import java.util.List;

public interface BlogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Blog row);

    int insertSelective(Blog row);

    Blog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Blog row);

    int updateByPrimaryKey(Blog row);

    int batchUpdate(List<Blog> list);

    int batchUpdateSelective(List<Blog> list);

    int batchInsert(List<Blog> list);
}
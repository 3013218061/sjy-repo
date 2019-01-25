package com.example.springsjy.dao;

import com.example.springsjy.Home;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface HomeMapper {
    int insert(@Param("home") Home home);

    int insertSelective(@Param("home") Home home);

    int insertList(@Param("homes") List<Home> homes);

    int updateByPrimaryKeySelective(@Param("home") Home home);
}

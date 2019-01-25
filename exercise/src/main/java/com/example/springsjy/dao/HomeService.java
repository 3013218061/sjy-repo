package com.example.springsjy.dao;

import java.util.List;
import com.example.springsjy.Home;
public interface HomeService{

    int insert(Home home);

    int insertSelective(Home home);

    int insertList(List<Home> homes);

    int updateByPrimaryKeySelective(Home home);
}

package com.example.springsjy.dao;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.springsjy.Home;
import com.example.springsjy.dao.HomeMapper;
import com.example.springsjy.dao.HomeService;

@Service
public class HomeServiceImpl implements HomeService{

    @Resource
    private HomeMapper homeMapper;

    @Override
    public int insert(Home home){
        return homeMapper.insert(home);
    }

    @Override
    public int insertSelective(Home home){
        return homeMapper.insertSelective(home);
    }

    @Override
    public int insertList(List<Home> homes){
        return homeMapper.insertList(homes);
    }

    @Override
    public int updateByPrimaryKeySelective(Home home){
        return homeMapper.updateByPrimaryKeySelective(home);
    }
}

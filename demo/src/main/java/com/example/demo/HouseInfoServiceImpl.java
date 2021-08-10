package com.example.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.demo.mapper.HouseInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author frank
 * @version 1.1.0
 * @Description TODO
 * @createTime 2021-08-09 14:41:00
 */
@Service
public class HouseInfoServiceImpl implements HouseInfoService{
    @Autowired
    HouseInfoMapper houseInfoMapper;

    @Override
    public List<HouseInfo> queryAll() {
        return houseInfoMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public HouseInfo insert(HouseInfo houseInfo) {
        houseInfoMapper.insert(houseInfo);
        return houseInfo;
    }

    @Override
    public void deleteById(Integer id) {
        houseInfoMapper.deleteById(id);
    }
}

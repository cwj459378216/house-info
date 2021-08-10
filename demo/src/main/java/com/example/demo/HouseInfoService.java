package com.example.demo;

import java.util.List;

/**
 * @author frank
 * @version 1.1.0
 * @Description TODO
 * @createTime 2021-08-09 14:37:00
 */
public interface HouseInfoService {
    List<HouseInfo> queryAll();

    HouseInfo insert(HouseInfo houseInfo);

    void deleteById(Integer id);
}

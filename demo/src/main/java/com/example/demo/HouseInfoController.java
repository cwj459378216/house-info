package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author frank
 * @version 1.1.0
 * @Description TODO
 * @createTime 2021-08-09 14:37:00
 */
@RestController
@RequestMapping("/houser")
public class HouseInfoController {
    @Autowired
    private HouseInfoService houseInfoService;

    @GetMapping("/query-info")
    public List<HouseInfo> queryAll() {
        return houseInfoService.queryAll();
    }

    @PostMapping("/insert")
    public HouseInfo insert(@RequestBody HouseInfo houseInfo) {
        return houseInfoService.insert(houseInfo);
    }

    @DeleteMapping()
    public void deleteById(@RequestParam Integer id) {
        houseInfoService.deleteById(id);
    }
}

package com.example.demo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import javax.persistence.Id;
/**
 * @author frank
 * @version 1.1.0
 * @Description TODO
 * @createTime 2021-08-09 14:44:00
 */
@Data
public class HouseInfo {
    @Id
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String infoJson;
}

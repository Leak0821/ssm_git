package com.it.ssm.dao;

import com.it.ssm.domain.Items;

import java.util.List;

/**
 * @description
 * @author: J
 * @date: 2020/2/7
 */
public interface ItemsDao {

    //查询所有
    List<Items> findAll();
    //保存
    int save(Items items);
}

package com.it.ssm.service;

import com.it.ssm.domain.Items;

import java.util.List;

/**
 * @description
 * @author: J
 * @date: 2020/2/7
 */
public interface ItemService {

    // 查询所有
    List<Items> findAll();
    // 保存
    int save(Items items);
}

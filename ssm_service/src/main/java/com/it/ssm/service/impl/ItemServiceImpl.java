package com.it.ssm.service.impl;

import com.it.ssm.dao.ItemsDao;
import com.it.ssm.domain.Items;
import com.it.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description
 * @author: J
 * @date: 2020/2/7
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemsDao itemsDao;

    public List<Items> findAll() {
        List<Items> list = itemsDao.findAll();
        return list;
    }

    public int save(Items items) {
        int rows = itemsDao.save(items);
        System.out.println(rows);
        return rows;
    }
}

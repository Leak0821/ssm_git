package com.it.ssm.controller;

import com.it.ssm.domain.Items;
import com.it.ssm.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @description
 * @author: J
 * @date: 2020/2/8
 */
@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    ItemService itemService;

    //查询所有
    @RequestMapping("/list")
    public String findAll(Model model){
        List<Items> list = itemService.findAll();
        model.addAttribute("items",list);
        return "items";
    }

    //保存
    @RequestMapping("/save")
    public String save(Items items){
        int rows = itemService.save(items);
        if (rows > 0){
            System.out.println("保存成功");
        }
        return "redirect:/items/list";
    }
}

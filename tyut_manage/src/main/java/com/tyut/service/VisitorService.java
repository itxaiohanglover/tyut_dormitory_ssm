package com.tyut.service;

import com.tyut.po.PageInfo;
import com.tyut.po.Visitor;
import org.springframework.ui.Model;


import java.util.List;

/**
 * @program: dormitorySystem
 * @description: 访客
 **/
public interface VisitorService {
    //分页查询
    public PageInfo<Visitor> findPageInfo(String v_name, Integer v_phone , Integer pageIndex, Integer pageSize);
    public int addVisitor(Visitor visitor);   //添加访客信息
    public List<Visitor> getAll();
}

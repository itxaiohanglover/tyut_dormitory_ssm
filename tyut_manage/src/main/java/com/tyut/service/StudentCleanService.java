package com.tyut.service;

import com.tyut.po.PageInfo;
import com.tyut.po.StudentClean;

import java.util.List;


/**
 * @program: dormitorySystem
 * @description: 学生卫生服务接口
 **/
public interface StudentCleanService {
    //分页查询
    public PageInfo<StudentClean> findPageInfo(Integer s_studentid, String s_name, Integer s_dormitoryid, Integer pageIndex, Integer pageSize);

    public int addStudentClean(StudentClean studentclean);    //添加宿舍信息
    public int deleteStudentClean(Integer g_id);   //删除宿舍信息
    public int updateStudentClean(StudentClean studentclean); //修改宿舍信息
    public StudentClean findStudentCleanById(Integer g_id);
    public List<StudentClean> getAll();
}

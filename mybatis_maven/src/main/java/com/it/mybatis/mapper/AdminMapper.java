package com.it.mybatis.mapper;

import com.it.mybatis.pojo.Admin;
import com.it.mybatis.vo.AdimCustomer;
import com.it.mybatis.vo.AdminVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdminMapper {
    /*
    查询所有数据
   */
    public List<Admin> findAll();

    /*
动态查询sql
*/
    public List<AdimCustomer> findByAuto(AdminVo adminVo);

    /*根据用户名模糊查询*/
    public List<Admin> findByUserName(String username);

    /*添加数据*/
    public void insertAdmin(Admin admin);

    /*修改数据*/
    public void updateAdmin(Admin admin);

    /*删除用户*/
    public void deleteAdminById(int id);
}

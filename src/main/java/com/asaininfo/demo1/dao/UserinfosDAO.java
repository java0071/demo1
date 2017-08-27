package com.asaininfo.demo1.dao;

import com.asaininfo.demo1.entity.Userinfos;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by 程然 on 2017/8/22.
 */
public interface UserinfosDAO {
    @Select("select * from userinfos")
    public List<Userinfos> findAll();
}

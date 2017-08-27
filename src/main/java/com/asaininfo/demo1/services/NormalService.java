package com.asaininfo.demo1.services;

import com.asaininfo.demo1.dao.UserinfosDAO;
import com.asaininfo.demo1.entity.Userinfos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by 程然 on 2017/8/23.
 */
@Service
@Transactional
public class NormalService {
    @Autowired
    private UserinfosDAO udao;
    public List<Userinfos> findAll(){
        return udao.findAll();
    }
}

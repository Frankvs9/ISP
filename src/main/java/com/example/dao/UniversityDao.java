package com.example.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.Map;

@Component
public class UniversityDao {

    JdbcTemplate jdbcTemplate;

    @Autowired
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Map<String,Object>> getAllUniversities(){
        List<Map<String, Object>> list = jdbcTemplate.
                queryForList("select * from universities_info");
        return list;
    }

}

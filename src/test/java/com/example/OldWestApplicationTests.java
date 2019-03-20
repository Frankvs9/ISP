package com.example;

import com.example.dao.UniversityDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OldWestApplicationTests {

    @Autowired
    UniversityDao universityDao;


    @Test
    public void contextLoads() throws SQLException {
        System.out.println(universityDao.getAllUniversities());
    }

}

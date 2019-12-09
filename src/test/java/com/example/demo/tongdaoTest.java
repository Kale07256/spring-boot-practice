package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class tongdaoTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void querydata() {
        String sql = "select * from lc_carrier_balance";
        List list = jdbcTemplate.queryForList(sql);
        Iterator tongdaomap = list.iterator();
        while (tongdaomap.hasNext()) {
            Map tongdaodata = (Map) tongdaomap.next();
            String carrierbalanceid = tongdaodata.get("carrbalaid").toString();
            System.out.println(carrierbalanceid);

        }

    }
}

package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    JdbcTemplate tongdaojdbctem;

    @Test
    public void contextLoads() {
        List rtndata = new ArrayList();
        Map rtnmap = new HashMap();
        String tdsql = "select * from  lc_carrier_balance where 1=1 limit 0,2 ";
        List rows = tongdaojdbctem.queryForList(tdsql);
        Iterator iterable = rows.iterator();
        while (iterable.hasNext()) {

            Map val = (Map) iterable.next();
            rtndata.clear();
            String carrbalaid = val.get("carrbalaid").toString();
            String carrbalaname = val.get("carrbalaname").toString();
            String carrbalamoney = val.get("carrbalamoney").toString();
            String inserttime = val.get("inserttime").toString();
            rtndata.add(carrbalaid);
            rtndata.add(carrbalaname);
            rtndata.add(carrbalamoney);
            rtndata.add(inserttime);
            rtnmap.put(carrbalaid,rtndata);
        }

        System.out.println(rtnmap);

    }

}

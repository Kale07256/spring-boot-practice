package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
public class Tongdaocontroller {

    @Autowired
    private JdbcTemplate tongdaojdbctem;

    @RequestMapping("/tongdao")
    public ModelAndView word() {
        ModelAndView modelAndView = new ModelAndView();

//        modelAndView.addObject("type", "something");
        modelAndView.setViewName("tongdao.html");
        return modelAndView;
    }

    @RequestMapping("/tongdaodata")
    public Map tddata() {
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
        return rtnmap;

    }

}

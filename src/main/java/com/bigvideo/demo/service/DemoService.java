package com.bigvideo.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by xiao on 2016/5/25.
 */

@Service
public class DemoService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 获取数据库系统日期
     * @return
     */
    public String getDbSysTime() {
        String sql = "SELECT TO_CHAR(SYSDATE, 'yyyy-mm-dd') dateStr FROM dual";
        String date = jdbcTemplate.queryForObject(sql, String.class);
        if (date == null || date.equals("")) {
            return "query date from oracleDB faild";
        }
        return date;
    }
}

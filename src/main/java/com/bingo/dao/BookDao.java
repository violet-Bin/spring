package com.bingo.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author: jiangjiabin
 * @Description:
 * @Date: Create in 23:25 2019/2/8
 */
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao [lable=" + lable + "]";
    }
}

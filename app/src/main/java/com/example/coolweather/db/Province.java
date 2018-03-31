package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dell on 2018/3/31.
 */

public class Province extends DataSupport {
    private int id;

    private String provinceName;

    private int proviinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProviinceCode() {
        return proviinceCode;
    }

    public void setProviinceCode(int proviinceCode) {
        this.proviinceCode = proviinceCode;
    }
}

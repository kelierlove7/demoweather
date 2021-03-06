package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/29.
 */
/*cityName记录市的名字cityCode记录市的代号provinceId记录当前市所属省的id
* */
public class City extends DataSupport{
    private  int id;
    private  String cityName;
    private  int cityCode;
    private  int provinceId;
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName(){
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode(){
        return cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public  int getProvinceId(){
        return provinceId;
    }
    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}

package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2018/1/29.
 */
/*countyName记录县名，weatherId记录对应天气id，cityId记录县所属市的id
* */
public class County extends DataSupport {
    private int id;
    private  String countyName;
    private  String weatherId;
    private  int cityId;
    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName(){
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId(){
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}

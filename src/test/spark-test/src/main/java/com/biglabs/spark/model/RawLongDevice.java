package com.biglabs.spark.model;

import java.io.Serializable;
import java.util.Date;

public class RawLongDevice implements Serializable {
    private String deviceid;
    private String datapointname;
    private Date day; // cassandra connector does not support LocalDateTime
    private Date time;
    private long value;

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getDatapointname() {
        return datapointname;
    }

    public void setDatapointname(String datapointname) {
        this.datapointname = datapointname;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
}

package model;

import java.util.Date;

public class Follow {
    private Integer fanId;

    private Integer starId;

    private Date time;

    private Boolean ifDelete;

    public Integer getFanId() {
        return fanId;
    }

    public void setFanId(Integer fanId) {
        this.fanId = fanId;
    }

    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Boolean getIfDelete() {
        return ifDelete;
    }

    public void setIfDelete(Boolean ifDelete) {
        this.ifDelete = ifDelete;
    }
}
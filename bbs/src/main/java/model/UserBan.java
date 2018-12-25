package model;

import java.util.Date;

public class UserBan {
    private Integer id;

    private Integer banUserId;

    private Integer handUserId;

    private Date endTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBanUserId() {
        return banUserId;
    }

    public void setBanUserId(Integer banUserId) {
        this.banUserId = banUserId;
    }

    public Integer getHandUserId() {
        return handUserId;
    }

    public void setHandUserId(Integer handUserId) {
        this.handUserId = handUserId;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}
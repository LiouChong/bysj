package model;

import java.util.Date;

public class Plater {
    private Integer id;

    private Integer userId;

    private Integer plateId;

    private Date startTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPlateId() {
        return plateId;
    }

    public void setPlateId(Integer plateId) {
        this.plateId = plateId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Plater() {
    }

    public Plater(Integer userId, Integer plateId, Date startTime) {
        this.userId = userId;
        this.plateId = plateId;
        this.startTime = startTime;
    }
}
package model;

import java.util.Date;

public class Applyplate {
    private Integer id;

    private Integer userId;

    private Integer plateId;

    private String content;

    private Date applyTime;

    private Date handTime;

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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public Date getHandTime() {
        return handTime;
    }

    public void setHandTime(Date handTime) {
        this.handTime = handTime;
    }
}
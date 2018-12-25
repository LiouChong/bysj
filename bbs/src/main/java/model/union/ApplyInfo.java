package model.union;

import java.util.Date;

/**
 * 申请博主信息，联合申请表和用户表
 */
public class ApplyInfo {
    private int applyId;
    private Date applyTime;
    private String nickName;
    private String plateName;
    private String userId;
    private String plateId;

    public String getPlateId() {
        return plateId;
    }

    public void setPlateId(String plateId) {
        this.plateId = plateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getApplyId() {
        return applyId;
    }

    public void setApplyId(int applyId) {
        this.applyId = applyId;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"applyId\":")
                .append(applyId);
        sb.append(",\"applyTime\":\"")
                .append(applyTime).append('\"');
        sb.append(",\"nickName\":\"")
                .append(nickName).append('\"');
        sb.append(",\"plateName\":\"")
                .append(plateName).append('\"');
        sb.append(",\"userId\":\"")
                .append(userId).append('\"');
        sb.append(",\"plateId\":\"")
                .append(plateId).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

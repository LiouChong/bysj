package model.union;

import model.Post;

/**
 * 查看文章列表（只显示板块名、作者名、权限等级）
 */
public class PostAndPlate extends Post {
    private String  plateName;
    private String nickname;
    public String  level;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
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
        sb.append(super.toString() + "\"plateName\":\"")
                .append(plateName).append('\"');
        sb.append(",\"nickname\":\"")
                .append(nickname).append('\"');
        sb.append(",\"level\":\"")
                .append(level).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

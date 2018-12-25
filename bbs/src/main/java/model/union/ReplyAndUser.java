package model.union;

import model.Reply;
import org.springframework.stereotype.Repository;

@Repository
public class ReplyAndUser extends Reply {
    private String picture;
    private String nickname;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append(super.toString() + "\"picture\":\"")
                .append(picture).append('\"');
        sb.append(",\"nickname\":\"")
                .append(nickname).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

package model.union;

import model.User;

public class UserAndPlate extends User {
    private String PlateName;

    public String getPlateName() {
        return PlateName;
    }

    public void setPlateName(String plateName) {
        PlateName = plateName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append(super.toString() + "\"PlateName\":\"")
                .append(PlateName).append('\"');
        sb.append('}');
        return sb.toString();
    }
}

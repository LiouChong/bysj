package model;

public class Plate {
    private Integer id;

    private String plateName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlateName() {
        return plateName;
    }

    public void setPlateName(String plateName) {
        this.plateName = plateName == null ? null : plateName.trim();
    }
}
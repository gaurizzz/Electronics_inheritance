package model;

public class Grinder extends Electronics {
    String type;

    public Grinder(boolean warranty, String type) {
        super(warranty);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

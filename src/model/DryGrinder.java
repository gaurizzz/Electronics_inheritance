package model;

public class DryGrinder extends Grinder {
    String name;

    public DryGrinder(boolean warranty, String type, String name) {
        super(warranty, type);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

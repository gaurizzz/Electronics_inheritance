package model;

public class Electronics {
    boolean warranty;
    public void getDevice(){
        System.out.println("Device : Electronics");
    }

    public Electronics(boolean warranty) {
        this.warranty = warranty;
    }

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty) {
        this.warranty = warranty;
    }
}

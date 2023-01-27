import model.DryGrinder;

public class Main {
    public static void main(String[] args) {

        DryGrinder d1 = new DryGrinder(true, "Grinder", "grinde");
        System.out.println(d1.isWarranty());
        System.out.println(d1.getType());
        System.out.println(d1.getName());

    }
}

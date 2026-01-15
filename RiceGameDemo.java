public class RiceGameDemo {

    public static void main(String[] args) {

        RicePlant r1 = new RicePlant(1, "Jasmine Rice", GrowthStage.SEED);
        RicePlant r2 = new RicePlant(2, "Sticky Rice", GrowthStage.VEGETATIVE);
        RicePlant r3 = new RicePlant(3, "Jasmine Rice", GrowthStage.HEADING);
        RicePlant r4 = new RicePlant(4, "Basmati Rice", GrowthStage.SPROUT); 

        System.out.println("--- Initial Plant Information ---");
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();
        r4.displayInfo();

        System.out.println("Total rice plants: " + RicePlant.getTotalPlants());
        System.out.println("========================");

        System.out.println("\n--- Simulating Growth ---");
        System.out.println("Growing plant 1...");
        r1.grow(); 
        r1.displayInfo();

        System.out.println("Growing plant 4...");
        r4.grow(); 
        r4.grow(); 
        r4.grow();
        r4.grow(); 
        r4.displayInfo();

        System.out.println("--- Final Plant Information ---");
        r1.displayInfo();
        r2.displayInfo();
        r3.displayInfo();
        r4.displayInfo();

        System.out.println("Total rice plants after growth simulation: " + RicePlant.getTotalPlants());
    }
}
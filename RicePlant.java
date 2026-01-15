public class RicePlant {
    private int id;
    private String riceVariety;
    private GrowthStage stage;
    
    private static int totalPlants = 0;
    
    public RicePlant(int id, String riceVariety, GrowthStage stage) {
        
    
        this.id = id;
        this.riceVariety = riceVariety;
        this.stage = stage;
        totalPlants++;
    }
    public static int getTotalPlants() {
        return totalPlants;
    }
    public void displayInfo() {
        System.out.println("Plant ID " + id);
        System.out.println("Rice Variety " + riceVariety);
        System.out.println("Growth Stage " + stage);
        System.out.println("------------------------");
    }
    public void grow(){
        switch (stage) {
            case SEED:
            stage = GrowthStage.SPROUT;
            break;
            case SPROUT:
            stage = GrowthStage.VEGETATIVE;
            break;
            case VEGETATIVE:
            stage = GrowthStage.HEADING;
            break;
            case HEADING:
            stage = GrowthStage.HARVEST;
            break;
            case HARVEST:

            System.out.println("Plant " + this.id + "is already ready for harvest");
            break;
        }
    }
}

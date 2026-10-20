// Ärver namn, längd och vätsketyp från Plants.

public class CarnivorousPlants extends Plants {
    public CarnivorousPlants(String name, double length) {
        super(name, length, LiquidInfo.CARNIVOROUS_PLANTS);
    }

    @Override
    public double calculateLiquid() {
        return 0.1 + (0.2 * length);
    }
}

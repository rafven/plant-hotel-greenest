// Ärver namn, längd och vätsketyp från Plants.

public class Cactus extends Plants {
    public Cactus(String name, double length) {
        super(name, length, LiquidInfo.CACTUS);
    }

    @Override
    public double calculateLiquid() {
        return 0.02;
    }
}
// Ärver namn, längd och vätsketyp från Plants.

public class Palms extends Plants {
    public Palms(String name, double length) {
        super(name, length, LiquidInfo.PALMS);
    }

    @Override
    public double calculateLiquid() {
        return 0.5 * length;
    }
}
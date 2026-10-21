// Underklasserna implementerar beräkningen av vätskebehovet.
public abstract class Plants implements Calculation {
    String name;
    // Längden på växter anges i meter.
    Double length;
    LiquidInfo liquidType;

    public Plants(String name, Double length, LiquidInfo liquidType) {
        this.name = name;
        this.length = length;
        this.liquidType = liquidType;
    }

    public LiquidInfo getLiquidType() {
        return liquidType;
    }

    public String getName() {
        return name;
    }
}
public enum LiquidInfo {
    CACTUS("mineral water", 0.02, 0.0),

    PALMS("tap water", 0.0, 0.5),

    CARNIVOROUS_PLANTS("protein drink", 0.1, 0.2);

    private final String liquidType;
    private final double baseLiters;
    private final double litersPerMeter;

    LiquidInfo(String liquidType, double baseLiters, double litersPerMeter) {
        this.liquidType = liquidType;
        this.baseLiters = baseLiters;
        this.litersPerMeter = litersPerMeter;
    }

    public double getBaseLiters() {
        return baseLiters;
    }

    public double getLitersPerMeter() {
        return litersPerMeter;
    }

    public String getLiquidType() {
        return liquidType;
    }
}



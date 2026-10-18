public enum LiquidInfo {
    CACTUS("Mineralwater", 0.02),

    PALMS("Tapwater", 0.02),

    CARNIVOROUS_PLANTS("Proteinwater", 0.02);

    private String liquidType;
    private double initialAmount;

    LiquidInfo(String liquidType, double initialAmount) {
        this.liquidType = liquidType;
        this.initialAmount = initialAmount;
    }

    public String getLiquidType() {
        return liquidType;
    }

    public double getInitialAmount() {
        return initialAmount;
    }
}

public enum LiquidInfo {
    CACTUS("mineral water"),

    PALMS("tap water"),

    CARNIVOROUS_PLANTS("protein drink");

    private String liquidType;

    LiquidInfo(String liquidType) {
        this.liquidType = liquidType;
    }

    public String getLiquidType() {
        return liquidType;
    }
}



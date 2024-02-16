package Car;

public enum Transmission {
    SINGLE_SPEED, MANUAL, AUTOMATIC, SEMI_AUTOMATIC;

    public String toString(){
        return switch (this) {
            case SINGLE_SPEED -> "односкоростная";
            case MANUAL -> "механическая";
            case AUTOMATIC -> "автоматическая";
            case SEMI_AUTOMATIC -> "полуавтоматическая";
        };
    }
}

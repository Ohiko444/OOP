package Car;

public enum CarType {
    CITY_CAR, SPORTS_CAR, SUV;

    public String toString(){
        return switch (this) {
            case CITY_CAR -> "городская машина";
            case SPORTS_CAR -> "спортивная машина";
            case SUV -> "внедорожник";
        };
    }
}

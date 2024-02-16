package one;

public enum BodyTypeBike {

    NAKED, SPORT, TOURIST, CRUISE;

    public String toString(){
        switch (this){
            case NAKED: return "Нейкед";
            case SPORT: return "Спортивный";
            case TOURIST: return "Туристический";
            case CRUISE: return "Круизер";
        }
        return null;
    }

}

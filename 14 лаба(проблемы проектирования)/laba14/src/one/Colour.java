package one;

public enum Colour {
    BLACK, RED, YELLOW, BLUE, WHITE;

    public String toString(){
        switch (this){
            case BLACK:
                return "чёрный";
            case RED:
                return "красный";
            case YELLOW:
                return "жёлтый";
            case BLUE:
                return "синий";
            case WHITE:
                return "белый";
        }
        return null;
    }
}

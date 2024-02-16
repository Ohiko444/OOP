public enum BodyType {
    SEDAN, HATCHBACK, WAGON, COUPE, MINIVAN;

    public String toString(){
        switch (this){
            case SEDAN: return "Седан";
            case HATCHBACK: return "Хэтчбек";
            case WAGON: return "Универсал";
            case COUPE: return "Купе";
            case MINIVAN: return "Минивэн";
        }
        return null;
    }
}

public enum Transmission {
    AT, MT;

    public String toString(){
        switch (this){
            case AT: return "АКПП";
            case MT: return "МКП";
        }
        return null;
    }
}

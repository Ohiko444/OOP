public enum EngineType {
    ICE_GASOLINE, ICE_DIESEL, ICE_GAS, ELECTRIC, HYBRID;

    public String toString(){
        switch (this){
            case ICE_GASOLINE: return "ДВС-бензин";
            case ICE_DIESEL: return "ДВС-дизель";
            case ICE_GAS: return "ДВС-газ";
            case ELECTRIC: return "электро";
            case HYBRID: return "гибрид";
        }
        return null;
    }
}

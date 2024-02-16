package Car;

public class GPSNavigator {

    private String route;

    public GPSNavigator() {
        this.route = "221b, Бейкер-стрит, Лондон - Скотленд-Ярд, Бродвей 8-10, Лондон";
    }

    public GPSNavigator(String manualRoute) {
        this.route = manualRoute;
    }

    public String getRoute() {
        return route;
    }

}

class Route {
    String startLocation;
    String endLocation;
    int distance;

    public Route(String startLocation, String endLocation, int distance) {
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.distance = distance;
    }

    public boolean isLongRoute() {
        return distance > 20;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
}
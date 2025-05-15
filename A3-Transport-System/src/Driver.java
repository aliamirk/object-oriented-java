class Driver {
    String name;
    String license;

    public Driver(String name, String license) {
        this.name = name;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
}
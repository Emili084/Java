class Wilder {
    // Attributes
    private String firstname;
    private boolean aware;

    // Constructor
    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    // Getters
    public String getFirstname() {
        return this.firstname;
    }

    public boolean isAware() {
        return this.aware;
    }

    // Setters
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    // Methods
    public String whoAmI() {
        if (this.aware) {
            return "Je m'appelle " + this.firstname + " et je suis aware";
        } else {
            return "Je m'appelle " + this.firstname + " et je ne suis pas aware";
        }
    }

}
package edu.misena.senaviewer.model;

public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;

    // Constructor
    public Serie(String title, String genre, String creator, int duration, int year) {
        super(title, genre, creator, duration);
        setYear(year);
    }

    // Getters and Setters
    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Serie{" +
                super.toString() +
                ", timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                '}';
    }
}

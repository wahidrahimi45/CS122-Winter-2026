package org.example.emp;

public class Plant {
    private String type;
    private boolean isWithering;
    private int daysSinceLastWatered;

    public Plant() {
        this.type = "Aloe Plant";
        this.isWithering = false;
        this.daysSinceLastWatered = 1;
    }

    public Plant(String type, boolean isWithering, int daysSinceLastWatered)
    {
        this.type = type;
    }

    //other methods…

}

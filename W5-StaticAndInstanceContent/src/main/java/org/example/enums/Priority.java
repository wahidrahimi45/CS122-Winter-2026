package org.example.enums;

public enum Priority {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    // Variable
    private int value;

    //Constructor
    Priority(int value)
    {
        this.value = value;
    }
    //Method
    public int getValue()
    {
        return this.value;
    }
    public void setValue(int value)
    {
        this.value = value;
    }

}

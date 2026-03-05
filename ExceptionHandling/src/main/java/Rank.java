public enum Rank {
    TWO(2),
    THREE(3),
    JACK(10),
    KING(10),
    ACE(10);

    public int value;
    Rank(int value)
    {
        this.value = value;
    }
    public int getValue()
    {
        return this.value;
    }

}

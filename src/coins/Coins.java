package coins;

public enum Coins{
    ONE(1),
    TWO(2),
    FIVE(5),
    TEN(20),
    TWENTY(20),
    FIFTY(50),
    HUNDERED(100);

    private final int value;
    Coins(int value)
    {
        this.value=value;
    }

    public int getValue()
    {
        return this.value;
    }
}
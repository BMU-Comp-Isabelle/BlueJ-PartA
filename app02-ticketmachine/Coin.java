
/**
 * Enumeration class Coin to represent four coins that can
 * be inserted into the Ticket Machine to buy Tickets
 * @author Isabelle Thorpe
 * @version 10/02/2021
 */

public enum Coin
{
    P10 (10),
    P20 (20),
    P100 (100),
    P200 (200);

    private final int value;

    private Coin(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }
}


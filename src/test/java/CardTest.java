import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.DIAMONDS, ValueType.ACE);
    }

    @Test
    public void canGetSuit() {
        assertEquals (SuitType.DIAMONDS, card.getSuit());
    }

    @Test
    public void canGeValue() {
        assertEquals (ValueType.ACE, card.getValue());
    }

    @Test
    public void aceHasValueOne() {
        assertEquals (1, card.getValueFromEnum());
    }

    @Test
    public void canGetAllSuits() {
        SuitType[] expected = {SuitType.HEARTS, SuitType.DIAMONDS, SuitType.SPADES, SuitType.CLUBS};
        SuitType[] suits = SuitType.values ();
        assertEquals (4, suits.length);
        assertArrayEquals(expected, suits);

    }
}

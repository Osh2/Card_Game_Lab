import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(SuitType.CLUBS, RankType.ACE);
    }

    @Test
    public void cardExisits() {
        assertNotNull(card);
    }

    @Test
    public void cardHasSuit(){
        assertEquals(SuitType.CLUBS, card.getSuitType());
    }

    @Test
    public void cardHasRank(){
        assertEquals(RankType.ACE, card.getRankType());
    }


}

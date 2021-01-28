import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DeckTest {

    Deck deck;
    Card card;

    @Before
    public void before(){
        deck = new Deck();
        card = new Card(SuitType.HEARTS, RankType.ACE);
    }

    @Test
    public void deckExists(){
        assertNotNull(deck);
    }

    @Test
    public void cardsListStartsEmpty(){
        assertEquals(0, deck.getCardCount());
    }

    @Test
    public void canAddCardToDeck(){
        deck.addCard(card);
        assertEquals(1, deck.getCardCount());
    }

    @Test
    public void cantAddSameCardTwice(){
        deck.addCard(card);
        deck.addCard(card);
        assertEquals(1, deck.getCardCount());
    }

    @Test
    public void deckShouldBeFull() {
        deck.populateDeck();
        assertEquals(52, deck.getCardCount());
        for (Card card : deck.cards) {
            System.out.println(card.rank);
        }
    }

    @Test
    public void cardsTotalShouldDecreaseOnDeal(){
        deck.populateDeck();
        deck.dealCard();
        assertEquals(51, deck.getCardCount());
        deck.dealCard();
        assertEquals(50, deck.getCardCount());
        deck.dealCard();
        assertEquals(49, deck.getCardCount());
        deck.dealCard();
        assertEquals(48, deck.getCardCount());
    }




}

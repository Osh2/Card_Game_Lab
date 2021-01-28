import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    public ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
    }

    public int getCardCount(){
        return cards.size();
    }

    public void addCard(Card card) {
        if (!cards.contains(card)) {
            cards.add(card);
        }
    }

    public RankType showDeck(int i){
        Card card = this.cards.get(i);
        return( card.getRankType());
    }

    public void populateDeck(){
        Card card;
        for( SuitType suit : SuitType.values()){
            for(RankType rank : RankType.values()){
                addCard(new Card(suit, rank));
            }
        }
        Collections.shuffle(cards);
    }

    public Card dealCard(){
       Card dealtCard = cards.remove(0);
       return dealtCard;
    }

}

public class Card {

    public SuitType suit;
    public RankType rank;

    public Card(SuitType suit, RankType rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuitType() {
        return this.suit;
    }

    public RankType getRankType() {
        return this.rank;
    }


}

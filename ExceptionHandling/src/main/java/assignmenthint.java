public class assignmenthint {
    public static void main(String[] args) {
        PlayingCart[] deck = new PlayingCart[52];

        /*
        for each suit in suits...
    {
       for each rank in ranks...
       {
           //create a new PlayingCard...
       }
    }
         */

        int index = 0;

        for(Suit suit : Suit.values())
        {
            for(Rank rank : Rank.values())
            {
                deck[index] = new PlayingCart(suit, rank);
                index++;
            }
        }

        for (PlayingCart playingCart : deck)
        {
            System.out.println(playingCart);
        }
    }
}

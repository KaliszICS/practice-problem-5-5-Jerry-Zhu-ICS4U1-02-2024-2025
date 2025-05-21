import java.util.HashMap;;

public class Card implements Comparable<Card>{
    private String name;
    private String suit;

    public Card(String name, String suit){
        this.name = name;
        this.suit = suit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString(){
        return this.name + " of " + this.suit;
    }

    @Override 
    public int compareTo(Card c){
    String[] names = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
    HashMap<String, Integer> values = new HashMap<String, Integer>();

    for(int i = 0; i < names.length; i++){
        values.put(names[i], i);
    }
    for(int i = 0; i < suits.length; i++){
        values.put(suits[i], i);
    }

    if(values.get(this.suit) == values.get(c.getSuit())){
        return values.get(this.name) - values.get(c.getName()); 
    }
    else{
        return values.get(this.suit) - values.get(c.getSuit());
    }
}
}
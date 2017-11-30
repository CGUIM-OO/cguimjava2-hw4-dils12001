import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList oneRoundCard;

	public Player(String name, int chips) {
		this.name = name;
		this.chips = chips;
	}

	public String getName() {
		return name;
	}

	public int makeBet() {
		bet = 10000;
		if (chips < 1)
			return 0;
		else
			return bet;
	}

	public void setOneRoundCard(ArrayList cards) {
		oneRoundCard = new ArrayList<Card>();
		oneRoundCard = cards;
	}

	public boolean hitMe() {
		int sum = 0;
		for (int i = 0; i < oneRoundCard.size(); i++) {
			sum += ((Card) oneRoundCard.get(i)).getRank();
		}
		if (sum < 21)
			return true;
		else
			return false;
	}

	public int getTotalValue() {
		int sum = 0;
		for (int i = 0; i < oneRoundCard.size(); i++) {
			sum += ((Card) oneRoundCard.get(i)).getRank();
		}
		return sum;
	}

	public int getCurrentChips() {
		return chips;
	}

	public void increaseChips(int diff) {
		chips += diff;
	}

	public void sayHello() {
		System.out.println("Hello, I am " + name + ".");
		System.out.println("I have " + chips + " chips.");
	}

}
package wargame;

public class Card {

	private String name;
	private int strenght;

	public Card(String name, int strenght) {
		this.name = name;
		this.strenght = strenght;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrenght() {
		return strenght;
	}

	public void setStrenght(int strenght) {
		this.strenght = strenght;
	}

}

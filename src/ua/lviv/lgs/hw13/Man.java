package ua.lviv.lgs.hw13;

public class Man {
	private int weight;
	private int growth;
	public Man(int weight, int growth) {
		super();
		this.weight = weight;
		this.growth = growth;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getGrowth() {
		return growth;
	}
	public void setGrowth(int growth) {
		this.growth = growth;
	}
	@Override
	public String toString() {
		return "Man [weight=" + weight + ", growth=" + growth + "]";
	}
	
	
}

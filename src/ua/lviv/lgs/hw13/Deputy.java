package ua.lviv.lgs.hw13;

import java.util.Scanner;

public class Deputy extends Man {
	private String surname;
	private String name;
	private int ag;
	private boolean habarnyk;
	private int sizeHabar;
	public Deputy(int weight, int growth, String surname, String name, int ag, boolean habarnyk) {
		super(weight, growth);
		this.surname = surname;
		this.name = name;
		this.ag = ag;
		this.habarnyk = habarnyk;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAg() {
		return ag;
	}
	public void setAg(int ag) {
		this.ag = ag;
	}
	public boolean isHabarnyk() {
		return habarnyk;
	}
	public void setHabarnyk(boolean habarnyk) {
		this.habarnyk = habarnyk;
	}
	public int getSizeHabar() {
		return sizeHabar;
	}
	public void setSizeHabar(int sizeHabar) {
		this.sizeHabar = sizeHabar;
	}
	@Override
	public String toString() {
		return "Deputy [surname=" + surname + ", name=" + name + ", ag=" + ag + ", habarnyk=" + habarnyk
				+ ", sizeHabar=" + sizeHabar + "]";
	}
	
	public void addHabar(){
		if(habarnyk == false){
			System.out.println("Цей депутат не бере хабарів");
		} else{
			Scanner scan = new Scanner(System.in);
			System.out.println("Введіть суму хабаря!!!");
			int habar = scan.nextInt();
			if(habar > 5000){
				System.out.println("Поліція ув'язнить депутата!!!");
			}else{
				sizeHabar =+ habar;
			}
			scan.close();
		}
		
	}
}

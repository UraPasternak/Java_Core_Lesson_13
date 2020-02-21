package ua.lviv.lgs.hw13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Fraksia {
	private List<Deputy> frak = new ArrayList<Deputy>();

	public void addDeputy() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть вагу депутата:");
		int weight = scan.nextInt();
		System.out.println("Введіть ріст депутата:");
		int growth = scan.nextInt();
		System.out.println("Введіть прізвище депутата:");
		String surname = scan.next();
		System.out.println("Введіть ім'я депутата:");
		String name = scan.next();
		System.out.println("Введіть вік депутата:");
		int ag = scan.nextInt();
		System.out.println("Депутат хабарник? (true/false):");
		boolean habarnyk = scan.nextBoolean();
		Deputy deputy = new Deputy(weight, growth, surname, name, ag, habarnyk);
		frak.add(deputy);
		System.out.println("Депутата внесено до фракції!!!");

	}

	public void addDeputy(Deputy a) {
		frak.add(a);
	}

	public void dellDeputy() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Для видалення депутата введіть індекс:");
		int i = scan.nextInt();
		frak.remove(i);
		System.out.println("Депутата видалено з фракції");

	}

	public void listDeputyHabarnyky() {
		Iterator<Deputy> it1 = frak.iterator();
		while (it1.hasNext()) {
			Deputy next = it1.next();
			if (next.isHabarnyk()) {
				System.out.println(next);
			} else {
				System.out.println("Фракція не має хабарників!");
			}
		}
	}

	public void maxHabarDeputy() {
		Iterator<Deputy> it2 = frak.iterator();
		int max = 0;
		while (it2.hasNext()) {
			Deputy next2 = it2.next();
			if (next2.getSizeHabar() > max) {
				max = next2.getSizeHabar();
			}
		}
		Iterator<Deputy> it3 = frak.iterator();
		while (it3.hasNext()) {
			Deputy next3 = it3.next();
			if (next3.getSizeHabar() == max) {
				System.out.println("Найбільший хабарник фракції: " + next3);
			}
		}
	}

	public void listDeputy() {
		Iterator<Deputy> it4 = frak.iterator();
		System.out.println("Всі депутати фракції:");
		while (it4.hasNext()) {
			Deputy next4 = it4.next();
			System.out.println(next4);
		}
	}

	public void dellAllDeputy() {
		frak.clear();
		System.out.println("Всі депутати вигнані з фракції");
	}

	@Override
	public String toString() {
		return "Fraksia [frak=" + frak + "]";
	}

}

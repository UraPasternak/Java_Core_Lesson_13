package ua.lviv.lgs.hw13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VerhovnaRada {
	private VerhovnaRada() {
	}

	private static final VerhovnaRada instance = new VerhovnaRada();

	public static VerhovnaRada getInstance() {
		return instance;
	}

	private List<Fraksia> rada = new ArrayList<Fraksia>();

	public void addFrakciu() {
		Fraksia fraksia = new Fraksia();
		rada.add(fraksia);
		System.out.println("Фракція створена");
	}

	public void dellFrakciu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Для видалення фракції введіть індекс:");
		int i = scan.nextInt();
		rada.remove(i);
		System.out.println("Фракцію видалено з Ради");

	}

	public void listFrakcii() {
		Iterator<Fraksia> it5 = rada.iterator();
		System.out.println("Всі фракції:");
		while (it5.hasNext()) {
			Fraksia next5 = it5.next();
			System.out.println(next5);
		}
	}

	public Fraksia getFrakciu(int i) {
		return rada.get(i);
	}

	public void addDeputyvFrakciu(int i) {
		rada.get(i).addDeputy();
	}

	public void dellDeputyzFrakciu() {
		System.out.println("Для видалення депутата введіть індекс фракції:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Fraksia fraksia = getFrakciu(i);
		fraksia.dellDeputy();
	}

	public void listDeputyHabarnykyvFrakcii() {
		System.out.println("Введіть індекс якої фракції показати хабарників:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Fraksia fraksia = getFrakciu(i);
		fraksia.listDeputyHabarnyky();
	}

	public void maxlistDeputyHabarnykyvFrakcii() {
		System.out.println("Введіть індекс якої фракції показати найбільшого хабарника:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Fraksia fraksia = getFrakciu(i);
		fraksia.maxHabarDeputy();
	}

	public void listDeputyvFrakcii() {
		System.out.println("Введіть індекс якої фракції показати депутатів:");
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Fraksia fraksia = getFrakciu(i);
		fraksia.listDeputy();
	}

}

package ua.lviv.lgs.hw13;

import java.util.Scanner;

public class MainMenu {

	public static void main(String[] args) {

		System.out.println("Введіть 1 щоб додати фракцію");
		System.out.println("Введіть 2 щоб видалити конкретну фракцію");
		System.out.println("Введіть 3 щоб вивести усі  фракції");
		System.out.println("Введіть 4 щоб очистити конкретну фракцію");
		System.out.println("Введіть 5 щоб вивести конкретну фракцію");
		System.out.println("Введіть 6 щоб додати депутата в фракцію");
		System.out.println("Введіть 7 щоб видалити депутата з фракції");
		System.out.println("Введіть 8 щоб вивести список хабарників");
		System.out.println("Введіть 9 щоб вивести найбільшого хабарника");

		Scanner scan = new Scanner(System.in);
		while (true) {
			String str = scan.next();
			switch (str) {
			case "1":
				VerhovnaRada.getInstance().addFrakciu();
				break;
			case "2":
				VerhovnaRada.getInstance().dellFrakciu();
				break;
			case "3":
				VerhovnaRada.getInstance().listFrakcii();
				break;
			case "4":
				Scanner scan1 = new Scanner(System.in);
				System.out.println("Введіть індекс фракції, яку бажаєте очистити:");
				int i = scan1.nextInt();
				VerhovnaRada.getInstance().getFrakciu(i).dellAllDeputy();
				System.out.println("Фракцію очищено");
				break;

			case "5":
				Scanner scan2 = new Scanner(System.in);
				System.out.println("Введіть індекс фракції, яку бажаєте вивести");
				int i1 = scan2.nextInt();
				System.out.println(VerhovnaRada.getInstance().getFrakciu(i1).toString());
				break;

			case "6":
				Scanner scan3 = new Scanner(System.in);
				System.out.println("Введіть індекс фракції, в яку бажаєте додати депутата:");
				int i2 = scan3.nextInt();
				VerhovnaRada.getInstance().addDeputyvFrakciu(i2);
				break;

			case "7":
				VerhovnaRada.getInstance().dellDeputyzFrakciu();
				System.out.println("Депутата видалено!");
				break;

			case "8":
				VerhovnaRada.getInstance().listDeputyHabarnykyvFrakcii();
				break;

			case "9":
				VerhovnaRada.getInstance().maxlistDeputyHabarnykyvFrakcii();
				break;
			}
		}

	}

}

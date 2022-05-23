import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Random;

public class Alternativas_P_I {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int cont = 0;

		boolean correto = false;

		// Peimeira quest�o (1)

		do {
			System.out.println("1) QUEST�O_1");
			System.out.println("______________________________\n");// 30

			System.out.println("a)Blablabla\n");

			System.out.println("b)Blablaa\n");

			System.out.println("c)Blablaba\n");

			System.out.println("d)Blablabl\n");

			System.out.println("------------------------------\n");// 30

			System.out.println("Escolha a alternativa digitando entra A e D:\n ");

			System.out.println("------------------------------\n");

			String quest = input.next();

			switch (quest) {

			case "a":
			case "A":

				System.out.println("\n------------------------------\n");
				System.out.println("Parab�ns voc� acerou! At� a pr�xima semana!\n");
				correto = true;
				cont = cont + 1;
				break;
			// System.out.println("______________________________\n");// 30

			case "b":
			case "B":

			case "c":
			case "C":

			case "d":
			case "D":

				System.out.println("\n------------------------------\n");// 30
				System.out.println("Voc� errou! Tente novamente!");
				System.out.println("______________________________\n");// 30
				cont = cont + 1;
				break;
			default:
				System.out.println("______________________________\n");// 30
				System.out.println("Escolha inv�lida!\n");
				System.out.println("______________________________\n");// 30
				cont = cont + 1;
			}
		} while (!correto && cont < 3);

		if (correto) {
			System.out.println("Voc� acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Voc� errou nas 3 chances!");
		}

		/* Pr�xima hist�ria e em seguida a pr�xima quest�o (2) */
		do {
			System.out.println("2) QUEST�O_2");
			System.out.println("______________________________\n");// 30

			System.out.println("a)blaBLAbla1\n");

			System.out.println("b)Blablaa\n");

			System.out.println("c)Blablaba\n");

			System.out.println("d)Blablabl\n");

			System.out.println("------------------------------\n");// 30

			System.out.println("Escolha a alternativa digitando entra A e D:\n ");

			System.out.println("------------------------------\n");

			String quest = input.next();

			switch (quest) {

			case "a":
			case "A":

				System.out.println("\n------------------------------\n");
				System.out.println("Parab�ns voc� acerou! At� a pr�xima semana!\n");
				correto = true;
				cont = cont + 1;
				break;
			// System.out.println("______________________________\n");// 30

			case "b":
			case "B":

			case "c":
			case "C":

			case "d":
			case "D":

				System.out.println("\n------------------------------\n");// 30
				System.out.println("Voc� errou! Tente novamente!");
				System.out.println("______________________________\n");// 30
				cont = cont + 1;
				break;
			default:
				System.out.println("______________________________\n");// 30
				System.out.println("Resposta inv�lida!\n");

				cont = cont + 1;
				break;
			}
		} while (!correto && cont < 3);

		if (correto) {
			System.out.println("Voc� acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Voc� errou nas 3 chances!");
		}

		/* Pr�xima hist�ria e em seguida a pr�xima quest�o (3) BOSS(1) */

		boolean acertou = false;

		List quest = new ArrayList();

		quest.add("BLA\n");// Quest�o correta
		quest.add("BLABLABLA\n");
		quest.add("BLABLBLAaa\n");
		quest.add("BLABLABL\n");

		do {

			Collections.shuffle(quest);

			System.out.println("3) Quest�o_3 BOSS(1)");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest.get(0));

			System.out.println("b) " + quest.get(1));

			System.out.println("c) " + quest.get(2));

			System.out.println("d) " + quest.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest.get(0).equals("BLA")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;
			case "b":
			case "B":
				if (quest.get(1).equals("BLA")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;
			case "c":
			case "C":
				if (quest.get(2).equals("BLA")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;
			case "d":
			case "D":
				if (quest.get(3).equals("BLA")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;
			default:
				System.out.println("Resposta inv�lida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou);

	}

}

//Adicionar boss com Randon futuramente !!!

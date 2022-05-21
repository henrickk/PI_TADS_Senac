import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Alternativas_P_I {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int cont = 0;

		boolean acertou = false;

		// Peimeira questão (1)

		do {
			System.out.println("QUESTÃO_1");
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

				System.out.println("------------------------------\n");
				System.out.println("Parabéns você acerou! Até a próxima semana!\n");
				acertou = true;
				cont = cont + 1;
				System.out.println("______________________________\n");// 30
				break;

			case "b":
			case "B":

			case "c":
			case "C":

			case "d":
			case "D":

			case "e":
			case "E":

				System.out.println("\n------------------------------\n");// 30
				System.out.println("Você errou! Tente novamente!");
				System.out.println("\n______________________________\n");// 30

				break;
			default:
				System.out.println("Escolha inválida!");
			}
		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		/* Próxima história e em seguida a próxima questão (2) */

		do {
			System.out.println("QUESTÃO_2");
			System.out.println("______________________________\n");// 30

			System.out.println("a)Blabla\n");

			System.out.println("b)Blablaa\n");

			System.out.println("c)Bblaba\n");

			System.out.println("d)lablabl\n");

			System.out.println("------------------------------\n");// 30

			System.out.println("Escolha a alternativa digitando entra A e D:\n ");

			System.out.println("------------------------------\n");

			String quest = input.next();

			switch (quest) {

			case "a":
			case "A":

				System.out.println("------------------------------\n");
				System.out.println("Parabéns você acerou! Até a próxima semana!\n");
				acertou = true;
				cont = cont + 1;
				System.out.println("______________________________\n");// 30
				break;

			case "b":
			case "B":

			case "c":
			case "C":

			case "d":
			case "D":

			case "e":
			case "E":

				System.out.println("\n------------------------------\n");// 30
				System.out.println("Você errou! Tente novamente!");
				System.out.println("\n______________________________\n");// 30

				break;
			default:
				System.out.println("Escolha inválida!");
			}
		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		/* Próxima história e em seguida a próxima questão (3) BOSS(1) */

		List quest = new ArrayList();

		quest.add("BLABLA");// Questão correta
		quest.add("BLABLABLA");
		quest.add("BLABLBLA");
		quest.add("BLABLABL");

		do {
			Collections.shuffle(quest);

			System.out.println("Questão_3 BOSS(1)");
			System.out.println("a) " + quest.get(0));
			System.out.println("b) " + quest.get(1));
			System.out.println("c) " + quest.get(2));
			System.out.println("d) " + quest.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();

			switch (resposta) {
			case "a":
			case "A":
				if (quest.get(0).equals("blablalbalbla")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
				}
				break;
			case "b":
			case "B":
				if (quest.get(1).equals("blabalalbalalb")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
				}
				break;
			case "c":
			case "C":
				if (quest.get(2).equals("aaaaaaaaa")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
				}
				break;
			case "d":
			case "D":
				if (quest.get(3).equals("blalbalb")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
				}
				break;
			default:
				System.out.println("Escolha inválida!");
			}

		} while (!acertou);

	}

}

//Adicionar boss com Randon futuramente !!!

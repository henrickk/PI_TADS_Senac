package Boosiness;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Alternativas {

	// Boss 1 (com 5 questões)
	static void boss1() {

		Scanner input = new Scanner(System.in);

		int cont = 1;

		boolean acertou = false;

		List quest = new ArrayList();

		quest.add("Depende do tamanho do porta-malas\n");// Questão correta
		quest.add("Uma grande bolinha de tênis\n");
		quest.add("Eu não sei\n");
		quest.add("Talvez... 50 mil bolinhas...\n");

		// Quetão 1

		do {

			Collections.shuffle(quest);

			System.out.println("\n1) Hohoh! Quantas bolinhas de tênis caberiam dentro de uma limousine?");
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
				if (quest.get(0).equals("Depende do tamanho do porta-malas\n" + cont)) {
					System.out.println("Resposta correta! \nTentativa: " + cont + "/3");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest.get(1).equals("Depende do tamanho do porta-malas\n")) {
					System.out.println("Resposta correta!\nTentativa" + cont + "/3\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest.get(2).equals("Depende do tamanho do porta-malas\n")) {
					System.out.println("Resposta correta!\nTentativa: " + cont + "/3\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest.get(3).equals("Depende do tamanho do porta-malas\n")) {
					System.out.println("Resposta correta!\nTetativa: " + cont + "/3\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!\nTentativa: " + cont + "/3\n");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		// Quetão 2

		List quest2 = new ArrayList();

		quest2.add("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n");// Questão correta
		quest2.add("Por qual motivo eu faria isso se sou alérgico á abelhas?\n");
		quest2.add("Tentaria assustar as abelhas e ficaria com todo o mel.\n");
		quest2.add("Não quero correr o risco de ser picado!\n");

		do {

			Collections.shuffle(quest2);

			System.out.println("2) Hohoh! O que você faria para roubar uma grande colmeia de abelhas para obter mel?");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest2.get(0));

			System.out.println("b) " + quest2.get(1));

			System.out.println("c) " + quest2.get(2));

			System.out.println("d) " + quest2.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest2.get(0)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest2.get(1)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest2.get(2)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest2.get(3)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		// Quetão 3

		List quest3 = new ArrayList();

		quest3.add("...\n");// Questão correta
		quest3.add("...1\n");
		quest3.add("...2\n");
		quest3.add("...3\n");

		do {

			Collections.shuffle(quest3);

			System.out.println("3) ...");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest3.get(0));

			System.out.println("b) " + quest3.get(1));

			System.out.println("c) " + quest3.get(2));

			System.out.println("d) " + quest3.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest3.get(0).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest3.get(1).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest3.get(2).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest3.get(3).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		// Quetão 4

		List quest4 = new ArrayList();

		quest4.add("...\n");// Questão correta
		quest4.add("...1\n");
		quest4.add("...2\n");
		quest4.add("...3\n");

		do {

			Collections.shuffle(quest4);

			System.out.println("4) ...");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest4.get(0));

			System.out.println("b) " + quest4.get(1));

			System.out.println("c) " + quest4.get(2));

			System.out.println("d) " + quest4.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest4.get(0).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest4.get(1).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest4.get(2).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest4.get(3).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		// Quetão 5

		List quest5 = new ArrayList();

		quest5.add("...\n");// Questão correta
		quest5.add("...1\n");
		quest5.add("...2\n");
		quest5.add("...3\n");

		do {

			Collections.shuffle(quest5);

			System.out.println("4) ...");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest5.get(0));

			System.out.println("b) " + quest5.get(1));

			System.out.println("c) " + quest5.get(2));

			System.out.println("d) " + quest5.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest5.get(0).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest5.get(1).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest5.get(2).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest5.get(3).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		boss1();
	}

	// Boss 2 (com mais 5 questões)
	static void boss2() {

		Scanner input = new Scanner(System.in);

		int cont = 1;

		boolean acertou = false;

		List quest6 = new ArrayList();

		quest6.add("Depende do tamanho do porta-malas\n");// Questão correta
		quest6.add("Uma grande bolinha de tênis\n");
		quest6.add("Eu não sei\n");
		quest6.add("Talvez... 50 mil bolinhas...\n");

		// Quetão 6

		do {

			Collections.shuffle(quest6);

			System.out.println("\n1) Hohoh! Quantas bolinhas de tênis caberiam dentro de uma limousine?");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest6.get(0));

			System.out.println("b) " + quest6.get(1));

			System.out.println("c) " + quest6.get(2));

			System.out.println("d) " + quest6.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest6.get(0).equals("Depende do tamanho do porta-malas\n" + cont)) {
					System.out.println("Resposta correta! \nTentativa: " + cont + "/3");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest6.get(1).equals("Depende do tamanho do porta-malas\n")) {
					System.out.println("Resposta correta!\nTentativa" + cont + "/3\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest6.get(2).equals("Depende do tamanho do porta-malas\n")) {
					System.out.println("Resposta correta!\nTentativa: " + cont + "/3\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest6.get(3).equals("Depende do tamanho do porta-malas\n")) {
					System.out.println("Resposta correta!\nTetativa: " + cont + "/3\n");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!\nTentativa: " + cont + "/3\n");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!\nTentativa: " + cont + "/3\n");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		// Quetão 7

		List quest7 = new ArrayList();

		quest7.add("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n");// Questão correta
		quest7.add("Por qual motivo eu faria isso se sou alérgico á abelhas?\n");
		quest7.add("Tentaria assustar as abelhas e ficaria com todo o mel.\n");
		quest7.add("Não quero correr o risco de ser picado!\n");

		do {

			Collections.shuffle(quest7);

			System.out.println("2) Hohoh! O que você faria para roubar uma grande colmeia de abelhas para obter mel?");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest7.get(0));

			System.out.println("b) " + quest7.get(1));

			System.out.println("c) " + quest7.get(2));

			System.out.println("d) " + quest7.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest7.get(0)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest7.get(1)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest7.get(2)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest7.get(3)
						.equals("Me vestiria como uma abelha e diria que transportaria o mel para a rainha.\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		// Quetão 8

		List quest8 = new ArrayList();

		quest8.add("...\n");// Questão correta
		quest8.add("...1\n");
		quest8.add("...2\n");
		quest8.add("...3\n");

		do {

			Collections.shuffle(quest8);

			System.out.println("3) ...");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest8.get(0));

			System.out.println("b) " + quest8.get(1));

			System.out.println("c) " + quest8.get(2));

			System.out.println("d) " + quest8.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest8.get(0).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest8.get(1).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest8.get(2).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest8.get(3).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		// Quetão 9

		List quest9 = new ArrayList();

		quest9.add("...\n");// Questão correta
		quest9.add("...1\n");
		quest9.add("...2\n");
		quest9.add("...3\n");

		do {

			Collections.shuffle(quest9);

			System.out.println("4) ...");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest9.get(0));

			System.out.println("b) " + quest9.get(1));

			System.out.println("c) " + quest9.get(2));

			System.out.println("d) " + quest9.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest9.get(0).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest9.get(1).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest9.get(2).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest9.get(3).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);

		if (acertou) {
			System.out.println("Você acertou na " + cont + " tentativa!");
			System.out.println("\n______________________________\n");// 30
		} else {
			System.out.println("Você errou nas 3 chances!");
		}

		// Quetão 10

		List quest10 = new ArrayList();

		quest10.add("...\n");// Questão correta
		quest10.add("...1\n");
		quest10.add("...2\n");
		quest10.add("...3\n");

		do {

			Collections.shuffle(quest10);

			System.out.println("4) ...");
			System.out.println("______________________________\n");// 30

			System.out.println("a) " + quest10.get(0));

			System.out.println("b) " + quest10.get(1));

			System.out.println("c) " + quest10.get(2));

			System.out.println("d) " + quest10.get(3));

			System.out.println("------------------------------\n");
			System.out.println("Escolha a alternativa digitando entra A e D:\n ");
			System.out.println("------------------------------\n");

			String resposta = input.next();
			System.out.println("\n------------------------------\n");// 30

			switch (resposta) {
			case "a":
			case "A":
				if (quest10.get(0).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "b":
			case "B":
				if (quest10.get(1).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "c":
			case "C":
				if (quest10.get(2).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			case "d":
			case "D":
				if (quest10.get(3).equals("...\n")) {
					System.out.println("Resposta correta!");
					acertou = true;
				} else {
					System.out.println("Resposta incorreta!");
					System.out.println("______________________________\n");// 30
				}
				break;

			default:
				System.out.println("Resposta inválida!");
				System.out.println("______________________________\n");// 30
			}

		} while (!acertou && cont < 3);
		{

			boss2();

		}

	}
}

//TODO Adicionar boss com Randon futuramente !!!

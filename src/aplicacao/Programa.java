package aplicacao;

import entidade.Condicoes;
import java.util.Scanner;
import java.util.Random;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rep;
		int vez = 1;
		do {
			System.out.println("============================");
			System.out.println("     ESCOLHA  UMA  OPÇÃO    ");
			System.out.println("============================");
			System.out.println(" PEDRA ---------- DIGITE [1]");
			System.out.println(" PAPEL ---------- DIGITE [2]");
			System.out.println(" TESOURA -------- DIGITE [3]");
			System.out.println("============================");

			System.out.print("Digite Aqui -> ");
			int op = sc.nextInt();
			System.out.println("----------------------------");
			Condicoes con = new Condicoes();
			vez += 1;
			con.jogada(op, vez);
			Random ran = new Random();
			op = ran.nextInt(3) + 1;
			vez += 1;
			con.jogada(op, vez);
			con.ganhador();
			System.out.println("============================");
			System.out.print("Jogar Novamente, SIM ou NÃO? ");
			rep = sc.next();
			System.out.println();
		} while (rep.equals("sim"));
		System.out.println("Fim do Jogo");
		sc.close();

	}
}

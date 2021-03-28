package entidade;

public class Condicoes {

	private final int PEDRA = 1;
	private final int PAPEL = 2;
	private final int TESOURA = 3;
	private int jog, maq, esc;
	private String PPT1, PPT2, PPT3;

	public Condicoes() {
	}

	public int getPEDRA() {
		return PEDRA;
	}

	public int getPAPEL() {
		return PAPEL;
	}

	public int getTESOURA() {
		return TESOURA;
	}

	public int getJog() {
		return this.jog;
	}

	public void setJog(int jog) {
		this.jog = jog;
	}

	public int getMaq() {
		return this.maq;
	}

	public void setMaq(int maq) {
		this.maq = maq;
	}

	public int getEsc() {
		return esc;
	}

	public void setEsc(int esc) {
		this.esc = esc;
	}

	public String getPPT1() {
		return PPT1;
	}

	public void setPPT1(String PPT1) {
		this.PPT1 = PPT1;
	}

	public String getPPT2() {
		return PPT2;
	}

	public void setPPT2(String PPT2) {
		this.PPT2 = PPT2;
	}

	public String getPPT3() {
		return PPT3;
	}

	public void setPPT3(String PPT3) {
		this.PPT3 = PPT3;
	}

	public void jogada(int op, int vez) {
		switch (op) {
		case 1:
			this.setEsc(this.getPEDRA());
			this.setPPT3("PEDRA");
			break;

		case 2:
			this.setEsc(this.getPAPEL());
			this.setPPT3("PAPEL");
			break;

		case 3:
			this.setEsc(this.getTESOURA());
			this.setPPT3("TESOURA");
			break;
		}
		if (vez % 2 == 0) {
			this.setJog(this.getEsc());
			this.setPPT1(this.getPPT3());
		} else {
			this.setMaq(this.getEsc());
			this.setPPT2(this.getPPT3());
		}
	}

	public void ganhador() {
		if (this.getJog() == this.getPEDRA() && this.getMaq() == this.getTESOURA()) {
			System.out.println("    Você Ganhou o Jogo!    ");
		} else if (this.getJog() == this.getPAPEL() && this.getMaq() == this.getPEDRA()) {
			System.out.println("    Você Ganhou o Jogo!    ");
		} else if (this.getJog() == this.getTESOURA() && this.getMaq() == this.getPAPEL()) {
			System.out.println("    Você Ganhou o Jogo!    ");
		} else if (this.getJog() == this.getMaq()) {
			System.out.println("          EMPATE!     ");
		} else {
			System.out.println("     A Máquina Ganhou!     ");
		}
		System.out.println("----------------------------");
		System.out.println("Você Escolheu -----> " + this.getPPT1());
		System.out.println("Máquina Escolheu --> " + this.getPPT2());
	}
}

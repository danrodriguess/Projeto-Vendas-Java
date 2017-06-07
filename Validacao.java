package venda;

public class Validacao {

	private boolean isDadoInformadoNulo;

	public boolean isDadoInformadoNulo(String n) {

		// if (n.trim().equals(""))
		if ("".equals(n.trim()))
			return this.isDadoInformadoNulo = true;
		else
			return this.isDadoInformadoNulo = false;
	}

}

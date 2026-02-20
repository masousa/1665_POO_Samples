package samples.ada.oo1;

import samples.ada.oo.Conta;
import samples.ada.oo.Pessoa;

public class NossoSegundoEstudo {
	public static void main(String[] args) {
		Conta minhaConta = new Conta(123, new Pessoa("Matheus"));
		minhaConta.depositar(600);
		minhaConta.sacar(500);
		System.out.println(minhaConta.getSaldo());
	}

}

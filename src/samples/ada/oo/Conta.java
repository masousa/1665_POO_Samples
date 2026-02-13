package samples.ada.oo;

public class Conta {
	int numero;
	double saldo;
	Pessoa pessoa;
	public Conta(int numero, double saldoParam, Pessoa pessoa){
		this.numero = numero;
		this.saldo = saldoParam;
		this.pessoa = pessoa;
	}
	public Conta(int numero, Pessoa pessoa){
		this.numero = numero;
		this.saldo = 0.0;
		this.pessoa = pessoa;
	}

	double sacar(double valor){return 0;}
	double depositar(double valor){return 0;}
	double realizarEmprestimo(double valor){return 0;}
}

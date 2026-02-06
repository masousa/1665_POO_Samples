import java.time.LocalDate;

public class CalculoSalario {
	public static void main(String[] args) {
		/**
		 *Um algoritmo que teria o objetivo de calcular o
		 * valor diário de um salário. Seguindo uma lógica simples,
		 * teríamos que dividir o valor do salário mínimo (ex: sabemos ser
		 * equivalente a R$ 360,00) e dividir esse total de dias do mês atual
		 *
		 */

		LocalDate localDate = LocalDate.now();
		LocalDate primeiroDia = localDate.withDayOfMonth(1);
		LocalDate ultimoDia = localDate.withDayOfMonth(localDate.lengthOfMonth());
	}
}

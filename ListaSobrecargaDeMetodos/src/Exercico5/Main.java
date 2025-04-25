package Exercico5;

public class Main {

	public static void main(String[] args) {
		ReservaHotel reserva1 = new ReservaHotel(" marcos", "suite luxo ", 3 , true);
		ReservaHotel reserva2 = new ReservaHotel(" rebeca", "quarto bom ", 5 );
		ReservaHotel reserva3 = new ReservaHotel(" luiz", "quarto so pra dormir " );
		
		double valorDiaria = 200.0;
		double taxaAdicional = 50.0;
		System.out.println("reserva 1:");
		System.out.println(reserva1.detalhesReserva());
		System.out.println("vlor total: R$" + reserva1.calcularValorTotal(valorDiaria, taxaAdicional));
		
		System.out.println("resrva 2:");
		System.out.println(reserva2.detalhesReserva());
		System.out.println("valor total:R$"+reserva2.calcularValorTotal(valorDiaria));
        
	    System.out.println("reserva 3:");
	    System.out.println(reserva3.detalhesReserva());
	    System.out.println("valor total: R$" +reserva3.calcularValorTotal(valorDiaria));
	}

}

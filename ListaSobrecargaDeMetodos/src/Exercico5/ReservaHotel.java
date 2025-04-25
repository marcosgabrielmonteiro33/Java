package Exercico5;

public class ReservaHotel {
	private String hospede;
	private String quarto;
	private int dias;
	private boolean cafeDaManha;
	
	public ReservaHotel(String hospede, String quarto, int dias, boolean cafeDaManha) {
	this.hospede = hospede;
	this.quarto = quarto;
	this.dias = dias;
	this.cafeDaManha = cafeDaManha;
	
	}
	public ReservaHotel (String hospede, String quarto, int dias) {
	this(hospede, quarto, dias, false);
	}
	public ReservaHotel(String hospede, String quarto) {
		this(hospede, quarto, 1, false);		
    }
	public double calcularValorTotal(double valorDiaria) {
		double total= valorDiaria * dias;
		if(cafeDaManha) {
			total += total * 0.20;
		}
		return total;
	}
	public double calcularValorTotal(double valorDiaria, double taxaAdicional) {
		double total = calcularValorTotal(valorDiaria);
		total += taxaAdicional;
		return total;
	}
	public String detalhesReserva() {
		return "Hospede: " + hospede +
				"quartos : " + quarto+
				"dias : " + dias + 
				"cafe da manha : " + (cafeDaManha ? "sim" : "nao");
				
	}
}


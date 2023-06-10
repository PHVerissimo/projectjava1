package principio.responsabilidade;

public class ContaBancaria {

	private String descricao;

	private double saldo = 8000;
    
	public void soma100Reais() {
		saldo+= 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double valor) {
		saldo -= valor;
	}
	
	public void depositoDinheiro(double deposito) {
		saldo += deposito;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "ContaBancaria [descricao=" + descricao + ", saldo=" + saldo + "]";
	}
	
   
	
}

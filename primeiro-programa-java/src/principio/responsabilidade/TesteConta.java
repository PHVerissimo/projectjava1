package principio.responsabilidade;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ContaBancaria contaBancaria = new ContaBancaria();
     contaBancaria.setDescricao("Conta Principal");
     System.out.println(contaBancaria.toString());
     contaBancaria.diminui100Reais();
     System.out.println(contaBancaria.toString());
     
     contaBancaria.depositoDinheiro(4000);
     System.out.println(contaBancaria.toString());
	}

}

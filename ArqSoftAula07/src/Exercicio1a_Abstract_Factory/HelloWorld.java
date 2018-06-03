package Exercicio1a_Abstract_Factory;

public class HelloWorld {
	
	private FabricaAbstrata fabrica;

	public HelloWorld() {
		
		double rand = Math.random();

		if (rand <= 0.3)
			fabrica = new FabricaTela();
		else fabrica = new FabricaArquivo();
	}

	public void enviarHelloWorld() {
		Impressao impressao = fabrica.criarImpressao();
		System.out.println("Utilizando " + impressao.getClass().getSimpleName());
		impressao.imprimir("Hello, World!");
	}
}
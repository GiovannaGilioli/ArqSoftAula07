package Exercicio2b_FactoryMethod;

public class ProvedorInformacao extends Texto{
	
	public ProvedorInformacao(){	
	}
	public ProvedorInformacao(String texto){
		this.texto = texto;
	}
	public String getTexto() {
		return texto;
	}
}

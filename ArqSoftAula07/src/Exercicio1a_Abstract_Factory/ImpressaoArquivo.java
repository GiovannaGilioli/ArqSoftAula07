package Exercicio1a_Abstract_Factory;

import java.io.File;
import java.io.PrintWriter;

public class ImpressaoArquivo implements Impressao {
	
	private File arquivo;

	public ImpressaoArquivo(String nomeArquivo) {
		this.arquivo = new File(nomeArquivo);
	}

	public void imprimir(String string) {
		
		try {
			arquivo.createNewFile();
			PrintWriter writer = new PrintWriter(arquivo);
			writer.print(string);
			writer.close();

			System.out.println("Verifique arquivo: " + arquivo.getCanonicalPath());
		}

		catch (Exception e) {
			System.out.println("N�o foi possivel criar o arquivo output.txt");
		}
	}
}

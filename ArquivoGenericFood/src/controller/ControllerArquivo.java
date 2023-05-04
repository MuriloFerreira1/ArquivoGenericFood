package controller;

import java.io.*;

public class ControllerArquivo {
	
	public static void leArquivo(String path, String nome) throws IOException {
		File arquivo=new File(path,nome);
		if (arquivo.exists() && arquivo.isFile()) {
			FileInputStream fluxo = new FileInputStream(arquivo);
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha!=null) {
				String[] elementos=linha.split(",");
				if (elementos[2].equals("Fruits")) {
					System.out.println(elementos[0]+" \t"+elementos[1]+"\t"+elementos[3]);
				}
				linha= buffer.readLine();
			}
			buffer.close();
			leitor.close();
			fluxo.close();
		}else {throw new IOException("Arquivo Inexistente");}
	}
}

package view;

import java.io.IOException;

import controller.ControllerArquivo;

public class principal {

	public static void main(String[] args) {
		String path = "C:\\TEMP";
		String nome = "generic_food.csv";
		try {
			ControllerArquivo.leArquivo(path, nome);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

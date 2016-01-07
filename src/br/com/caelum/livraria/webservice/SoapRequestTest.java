package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class SoapRequestTest {
	public static void main(String[] args) throws RemoteException {
		LivrariaService livrariaServiceClient = new LivrariaServiceProxy();
	
		Livro[] livrosTitle = livrariaServiceClient.getLivrosbyTitle("Cats World");
		
		for (Livro livro : livrosTitle) {
			System.out.println("Livro: " + livro.getTitulo());
			System.out.println("Escrito por: " + livro.getAutor().getNome());	
		}
	}
}

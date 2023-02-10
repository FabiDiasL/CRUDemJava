package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();
		Contato contato = new Contato();
		
		/*contato.setNome("Bianca Aragão");
		contato.setIdade(35);
		contato.setDataCadastro(new Date());
		
		contatoDao.save(contato);*/
		
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());			
		}
	}	 
}
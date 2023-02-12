package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {

		ContatoDAO contatoDao = new ContatoDAO();
		Contato contato = new Contato();
		
		contato.setNome("Mariana Dias");
		contato.setIdade(3);
		contato.setDataCadastro(new Date());

		contatoDao.save(contato);

		Contato contato2 = new Contato();
		contato2.setNome("Maria Elena");
		contato2.setIdade(81);
		contato2.setDataCadastro(new Date());
		contato2.setId(1);

		contatoDao.update(contato2);

		contatoDao.deleteByID(3);

		for (Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
			System.out.println("Idade: " + c.getIdade() + " anos");
		}
	}
}
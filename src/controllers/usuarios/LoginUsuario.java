package controllers.usuarios;

import java.util.ArrayList;

import database.usuario.DBUsuario;

public class LoginUsuario {

	public LoginUsuario() {

	}

	// Instância de DBUsuario
	DBUsuario bodyUsuario = new DBUsuario();
	// Lista recebe todos os usuarios cadastrados no sistema
	ArrayList<Usuario> listaDeUsuarios = bodyUsuario.returnUsuario();

	/**
	 * Método percorre o array de usuários cadastrados e verifica se os dados
	 * informados pelo usuario existes no banco de dados do sistema
	 * 
	 * @param inEmail
	 * @param inSenha
	 * @return Boolean
	 */
	public boolean authentication(String inEmail, String inSenha) {

		boolean verification = false;
		for (Usuario element : listaDeUsuarios) {
			if (element.getEmail().equals(inEmail) && element.getSenha().equals(inSenha)) {
				verification = true;

			}
		}
		System.out.println(verification);
		return verification;
	}
}
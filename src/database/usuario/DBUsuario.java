package database.usuario;

import java.util.ArrayList;

import controllers.usuarios.Administrador;
import controllers.usuarios.Usuario;

public class DBUsuario {

    // ArrayList armazena todos os Usuario cadastrados
    private ArrayList<Usuario> usuarioList = new ArrayList<Usuario>();

    // Usuário administrador pré cadastrado
    Usuario usuarioA = new Administrador("Administrador", "admin", "00000000000", "Raccon", "admin@mail.com", "admin");
    // Dados de pré cadastro
    Usuario usuario = new Usuario("Rafithy", "Haspy", "11111111111", "Cruz das Almas", "rafy@mail.com", "batata");
    Usuario usuario1 = new Usuario("Tony", "Stark", "22222222222", "Los Angeles", "starkin@mail.com", "imironman");
    Usuario usuario2 = new Usuario("Wanda", "Vision", "33333333333", "Texas", "vision@mail.com", "scarlet");
    Usuario usuario3 = new Usuario("Aura", "Fiora", "44444444444", "Nazarick", "aura@mail.com", "supremo");

    // Construtor sem argumento
    public DBUsuario() {
        adicionarUsuario(usuario);
        adicionarUsuario(usuario1);
        adicionarUsuario(usuario2);
        adicionarUsuario(usuario3);

    }

    // Construtor de um argumento
    public DBUsuario(Usuario user) {
        adicionarUsuario(user);
    }

    // Recebe um objeto do tipo Usuario e adiciona à lista de usuarios
    public void adicionarUsuario(Usuario usuario) {
        usuarioList.add(usuario);
    }

    // Retorna todos os usuarios cadastrados no array de usuarios
    public ArrayList<Usuario> returnUsuario() {
        return usuarioList;
    }
}

package controllers.usuarios;

public class Usuario {
    private String nome, sobrenome, cpf, cidade, email, senha;

    // Construtor de 6 argumentos
    public Usuario(String nome, String sobrenome, String cpf, String cidade, String email, String senha) {
        setNome(nome);
        setSobrenome(sobrenome);
        setCpf(cpf);
        setCidade(cidade);
        setEmail(email);
        setSenha(senha);
    }

    // Construtor sem argumentos para instaciar objetos
    public Usuario() {
    };

    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
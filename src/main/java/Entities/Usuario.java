package Entities;

public class Usuario {
    
    private int id;
    private String usuario;
    private String senha;
    private String nome;
    private String fone;
    private String cargo;
    
    //CONSTRUTORES
    public Usuario(String usuario) {
        this.usuario = usuario;
    }
    
    public Usuario(String usuario, String senha) {
        usuario = this.usuario;
        senha = this.senha;
    }

    public Usuario(String usuario, String nome, String fone) {
        this.usuario = usuario;
        this.nome = nome;
        this.fone = fone;
    }

    public Usuario(String usuario, String senha, String nome, String fone, String tipo) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        this.fone = fone;
        this.cargo = tipo;
    }
    
    //GETTERS E SETTERS
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }      
}

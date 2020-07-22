package br.com.itau.gerenciador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario {
	
	@Column(name="id")   	//indica o nome da coluna - não precisa ser o mesmo nome da variável
	@Id        				// esse atributo ID indica que essa será a chave primária no banco de dados
	@GeneratedValue(strategy=GenerationType.IDENTITY)  // indicar que o id é auto incremental
	private int id;
	
	@Column(name="nome", length=40)
	private String nome;
	
	@Column(name="email", length=70)
	private String email;
	
	@Column(name="senha", length=20)
	private String senha;
	
	@Column(name="foto", length=100)
	private String foto;
	
	
	public String getAll() {
		return 
				"ID: " + id + "\n" +
				"Nome: " + nome + "\n" +
				"Email: " + email + "\n" +
				"Senha: " + senha + "\n" +
				"Foto: " + foto;
	
	}
	
	
	public void setAll(int id, String nome, String email, String senha, String foto) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}	
	
	
	public Usuario() {
		super();
	}
	public Usuario(int id, String nome, String email, String senha, String foto) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
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
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	

}

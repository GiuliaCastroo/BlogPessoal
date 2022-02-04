package org.generation.blogPessoal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Entity
@Table(name = "tb_usuario") // Definindo o nome da nossa tabela no banco de dados
public class Usuario { // criadno a nossa classe primária

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Gerando um valor // gerando um valor do tipo identidade???
	private long id;

	@NotNull
	private String nome;

	@Schema(example = "email@email.com.br")
	@NotNull
	@Email(message = "O atributo Usuário deve ser um email válido!")
	private String usuarioString;
	// Ant- não pode ser nulo e tem um tamanho especifico@S

	@NotNull(message = "O  usuario é obrigatório.")
	@Size(min = 2, max = 100, message = "O mínimo é 2 e o maxímo é 100 caracteres!!") // Add coméntarios para o cliente
	private String usuario;

	@NotNull(message = "A senha é obrigatória.")
	@Size(min = 5, max = 255, message = "A sua senha deve conter no mínimo 5 e no máximo 255 caracteres!!")
	private String senha;

	public Usuario(long id, String nome, String usuario, String senha) {
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}

	public Usuario() {
	}

	// Get and set//

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

}

package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	private Date data;
	private String titulo;
	private String texto;
	private Integer likes;
	private List <Comentarios> comentarios = new ArrayList<>();
	
	public Post() {
		
	}
	public Post(String titulo,String texto,Integer likes) {
		this.titulo = titulo;
		this.texto = texto;
		this.likes = likes;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Integer getLikes() {
		return likes;
	}
	public void setLikes(Integer likes) {
		this.likes = likes;
	}
	
	public void addComentario( Comentarios comentario) {
		this.comentarios.add(comentario);
	}
	
	public void getComentarios() {
		for(Comentarios x:this.comentarios) {
			System.out.println(x.getComentario());
		}
	}
}

package application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.Comentarios;
import entities.Post;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Post> posts = new ArrayList<>();
		Post post1 = new Post("Viagem para o Japão","Eu irei visitar o Japão nos próximos dias!",12);
		Date dataAtual = new Date(System.currentTimeMillis());
		post1.setData(dataAtual);
		Comentarios comentario1 = new Comentarios("Tenha uma boa viagem!");
		Comentarios comentario2 = new Comentarios("Massa velho que dia?");
		post1.addComentario(comentario1);
		post1.addComentario(comentario2);
		posts.add(post1);
		Post post2 = new Post("Boa noite","Vejo vocês amanhã!",5);
		post2.setData(dataAtual);
		Comentarios comentario3 = new Comentarios("Boa noite!");
		Comentarios comentario4 = new Comentarios("Falou doido!");
		post2.addComentario(comentario3);
		post2.addComentario(comentario4);
		posts.add(post2);
		for(Post x:posts) {
			System.out.println(x.getTitulo());
			System.out.println(x.getLikes()+" Likes - "+x.getData());
			System.out.println("Comentários:");
			x.getComentarios();
			System.out.println("");
		}
	}

}

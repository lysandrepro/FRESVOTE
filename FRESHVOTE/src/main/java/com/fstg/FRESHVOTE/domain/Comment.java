package com.fstg.FRESHVOTE.domain;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {
  private String texte;
  
  
  @EmbeddedId
  private CommentId pk;


public String getTexte() {
	return texte;
}


public void setTexte(String texte) {
	this.texte = texte;
}


public CommentId getPk() {
	return pk;
}


public void setPk(CommentId pk) {
	this.pk = pk;
}
  
  
}
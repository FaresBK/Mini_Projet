package com.mini_projet.convertisseur;

public class client {
    private int id;
    private String nom;
	private String prenom;
	private String Email;
	private String passwored;
	
	public client(){
		super();
	}
	public client(int id,String nom,String pernom,String Email,String passwored ){
		super();
		this.id=id;
		this.nom=nom;
		this.prenom=pernom;
		this.Email=Email;
		this.passwored=passwored;
		
	}

	public int getid(){
		return id;
		}
	public void setid(int id){
		this.id=id;
	}
	public String getnom(){
		return nom;
		}
	public void setnom(String nom ){
		this.nom=nom;
	}
	public String getprenom(){
		return prenom;
		}
	public void setprenom(String prenom){
		this.prenom=prenom;
	}
	public String getEmail(){
		return Email;
		}
	public void setEmail(String Email){
		this.Email=Email;
	}
	public String getpasswored(){
		return passwored;
		}
	public void setpasswored(String passwored){
		this.passwored=passwored;
	}
	
	
}

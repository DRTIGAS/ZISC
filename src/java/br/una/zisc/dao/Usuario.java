package br.una.zisc.dao;
// Generated 01/11/2016 20:08:24 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int idusuario;
     private String nome;
     private String email;
     private Set enderecos = new HashSet(0);
     private Set segurancas = new HashSet(0);
     private Set alertas = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int idusuario, String nome, String email) {
        this.idusuario = idusuario;
        this.nome = nome;
        this.email = email;
    }
    public Usuario(int idusuario, String nome, String email, Set enderecos, Set segurancas, Set alertas) {
       this.idusuario = idusuario;
       this.nome = nome;
       this.email = email;
       this.enderecos = enderecos;
       this.segurancas = segurancas;
       this.alertas = alertas;
    }
     public Usuario(String nome, String email) {
       this.nome = nome;
       this.email = email;       
    }
   
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set getEnderecos() {
        return this.enderecos;
    }
    
    public void setEnderecos(Set enderecos) {
        this.enderecos = enderecos;
    }
    public Set getSegurancas() {
        return this.segurancas;
    }
    
    public void setSegurancas(Set segurancas) {
        this.segurancas = segurancas;
    }
    public Set getAlertas() {
        return this.alertas;
    }
    
    public void setAlertas(Set alertas) {
        this.alertas = alertas;
    }




}



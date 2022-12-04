/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.system_van;

/**
 *
 * @author aluno.cyber
 */
public class Cliente {
    
    // nome, endereço, telefone, email, CPF e RG de todos os passageiros já transportados
    String nome;
    String endereco;
    int tel;
    String email;
    int CPF;
    int RG;
    int id;
    public Cliente(){
    }
    
    
    public Cliente(String nome, String endereco, int tel, String email, int CPF, int RG, int id){
        this.CPF = CPF;
        this.RG = RG;
        this.email = email;
        this.endereco = endereco;
        this.nome = nome;
        this.tel = tel; 
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public int getTel() {
        return tel;
    }
    public void setTel(int tel) {
        this.tel = tel;
    }

    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    
    public int getRG() {
        return RG;
    }
    public void setRG(int RG) {
        this.RG = RG;
    }
    
    
}

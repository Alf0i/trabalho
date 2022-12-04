/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.system_van;

/**
 *
 * @author Rodrigo
 */
public class Van {
    
    //quilometragem, ocorrências de manutenção, número de bancos
    int Km;
    String manutencao;
    int bancos;
    int id;
    
    public Van(){
    }

    public Van(int km, String manutencao,int bancos, int id){
            this.Km = km;
            this.manutencao = manutencao;
            this.bancos = bancos;
            this.id = id;
    }

    
    public int getKm() {
        return Km;
    }
    public void setKm(int Km) {
        this.Km = Km;
    }

    
    public String getManutencao() {
        return manutencao;
    }
    public void setManutencao(String manutencao) {
        this.manutencao = manutencao;
    }

    
    public int getBancos() {
        return bancos;
    }
    public void setBancos(int bancos) {
        this.bancos = bancos;
    }

    
 
}

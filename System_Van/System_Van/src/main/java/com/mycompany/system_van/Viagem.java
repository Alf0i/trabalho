/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.system_van;

/**
 *
 * @author aluno.cyber
 */
public class Viagem extends Colaboradores{
// saber quem é o motorista que será responsável pela viagem, bem como o gerente | cidade de partida e a cidade de destino
    String partida;
    String destino;
    int id;
    
    
     public Viagem(){
    }
    
    public Viagem(String motorista, String gerente, String partida, String destino, int id){
        this.gerente = gerente;
        this.motorista = motorista;
        this.destino = destino;
        this.partida = partida;
        this.id = id;
    }

    
    public String getPartida() {
        return partida;
    }
    public void setPartida(String partida) {
        this.partida = partida;
    }

    
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    public String getGerente() {
        return gerente;
    }
    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    
    public String getMotorista() {
        return motorista;
    }
    public void setMotorista(String motorista) {
        this.motorista = motorista;
    } 
}

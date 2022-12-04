/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.system_van;

/**
 *
 * @author aluno.cyber
 * @param <T>
 */
public class BancoGenerico<T> {
    T objeto;

    public BancoGenerico(T objeto) {
            this.objeto = objeto;
    }

    public T getObjeto() {
            return objeto;
    }

    public void setObjeto(T objeto) {
            this.objeto = objeto;
    }
}

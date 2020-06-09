/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.es.classes;

import java.util.ArrayList;

/**
 *
 * @author yurir
 */
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        Pessoa pessoa1 = new Pessoa("yuri", "9181991512");
        
        agenda.inserir(pessoa1);
        agenda.exibirAgenda();
    }
}

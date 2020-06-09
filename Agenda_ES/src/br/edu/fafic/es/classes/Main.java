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
=======
/**
 *
 * @author danso
>>>>>>> 3197c6ec08a85086f5f09d0bcc5c93be5c489f1b
 */
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        
        Pessoa pessoa1 = new Pessoa("yuri", "9181991512");
        Pessoa pessoa2 = new Pessoa("Danilo", "83 99373-6817");
        
        agenda.inserir(pessoa1);
        agenda.inserir(pessoa2);
        
        agenda.exibirAgenda();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.es.classes;

/**
 *
 * @author danso
 */
public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Pessoa pessoa2 = new Pessoa("Danilo", "83 99373-6817");
        agenda.inserir(pessoa2);
        
        agenda.exibirAgenda();
    }
}

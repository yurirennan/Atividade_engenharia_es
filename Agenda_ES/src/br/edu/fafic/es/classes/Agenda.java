/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.fafic.es.classes;

import java.util.ArrayList;

import java.util.List;


import java.util.Scanner;

/**
 *
 * @author yurir
 */
public class Agenda {
    ArrayList<Pessoa> agenda=new ArrayList();
    Scanner ler = new Scanner(System.in);
    
    
    public void deletarContato(){
        System.out.println("-----------------------------");
        System.out.println("------------Agenda-----------");    
        for(int i=0;i<agenda.size();i++){
            Pessoa pessoa = agenda.get(i);
            System.out.println(" Nome: "+pessoa.getNome()+"-------------"
                            +" Telefone: "+pessoa.getTelefone());
        }
        
        System.out.println("Qual o contato a ser excluido: ");     
        agenda.remove(ler.nextInt());
    }
    public void exibirAgenda(){
        System.out.println("-----------------------------");
        System.out.println("------------Agenda-----------");    
        for(int i=0;i<agenda.size();i++){
            Pessoa pessoa = agenda.get(i);
            System.out.println(" Nome: "+pessoa.getNome()+"-------------"
                            +" Telefone: "+pessoa.getTelefone());
        }
    }
    
    public void inserir(Pessoa pessoa){
        agenda.add(pessoa);
    }
    
    public void alterar(int index, Pessoa pessoa){
        for(int i = 0; i < agenda.size(); i++){
            if(i == index){
                agenda.get(i).setNome(pessoa.nome);
                agenda.get(i).setTelefone(pessoa.telefone);
            }
        }
    }
    
    public void buscar(String nome){
        for(int i = 0; i < agenda.size(); i++){
            if(agenda.get(i).getNome().equalsIgnoreCase(nome)){
                System.out.println("Nome: " + agenda.get(i).getNome());
                System.out.println("Telefone" + agenda.get(i).getTelefone());
            }
        }
    }

}

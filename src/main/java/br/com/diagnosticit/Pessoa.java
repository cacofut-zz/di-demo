/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.diagnosticit;

/**
 *
 * @author cristianoca
 */
public abstract class Pessoa {
    
    private String nome;
    private double rendaAnual;

    public Pessoa() {
        this("Defaul", 0.0);
    }
      
    public Pessoa(String nome, double rendaAnual) {
        this.nome = nome;
        this.rendaAnual = rendaAnual;
    }
        
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
           
    public double calculaImposto(){
        return ( this.rendaAnual * getTaxa() ) - getDesconto();
    }

    @Override
    public String toString() {
        return String.format( "Nome: %s $ %f", nome, calculaImposto());
    }
    
    public abstract double getTaxa();
    
    public abstract double getDesconto();
    
}

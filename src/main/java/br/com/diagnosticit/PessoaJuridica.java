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
public class PessoaJuridica extends Pessoa{

    private final int MAX_FUNCIONARIOS = 10;    
    private int numeroFuncionarios;
    
    public PessoaJuridica() {
        super();        
    }
    
    public PessoaJuridica(String nome, double rendaAnual, int numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;      
    }

    @Override
    public double getTaxa() {
        return this.numeroFuncionarios > MAX_FUNCIONARIOS ? 0.14 : 0.16;
    }

    @Override
    public double getDesconto() {
        return 0;
    }
    
}

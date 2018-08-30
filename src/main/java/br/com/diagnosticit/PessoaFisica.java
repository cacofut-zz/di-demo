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
public class PessoaFisica extends Pessoa{
   
    private final double MAX_RENDA_ANUAL = 20000.00;
    private final double MAX_VALOR_SAUDE = 2000.00;    
    private Double gastoSaude;    
        
    public PessoaFisica() {
        super();        
    }
    
    public PessoaFisica(String nome, double rendaAnual, double gastoSaude) {
        super(nome, rendaAnual);
        this.gastoSaude = gastoSaude;                
    }
   
    @Override
    public double getTaxa() {
        return ( getRendaAnual() < MAX_RENDA_ANUAL ) ? 0.15 : 0.25;
    }

    @Override
    public double getDesconto() {
        return this.gastoSaude > 0 ? ( this.gastoSaude * 0.50 ) : 0.0;
    }
    
}

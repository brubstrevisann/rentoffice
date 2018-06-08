/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business.test;

import br.com.rentoffice.business.LocatarioBusiness;
import br.com.rentoffice.dominio.Endereco;
import br.com.rentoffice.dominio.Locatario;

/**
 *
 * @author internet
 */
public class LocatarioBusinessTest {
    
    public static void main(String[] args){
        LocatarioBusiness lb = new LocatarioBusiness();
        
        Locatario lo = new Locatario();
        lo.setNomeLT("Juninho ");
        
        //Bem Vindo ao Mundo de Juninho
        Endereco end1 = new Endereco();
        end1.setCep(1234591449);
        end1.setBairro("Cidade de Deus");
        end1.setCidade("Morumbi");
        end1.setEstado("Corinthias");
        end1.setComplemento("Casa sobre a agua");
        end1.setRua("Rua Juninho da Se");
        
        try{
            lb.salvarLocatario(lo);
        }catch(UnsupportedOperationException ex){
            System.out.println(ex.getMessage());
    }
  }
}
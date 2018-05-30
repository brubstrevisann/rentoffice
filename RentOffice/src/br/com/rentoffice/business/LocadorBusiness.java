/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rentoffice.business;

import br.com.rentoffice.dominio.Locador;
import java.util.List;
import br.com.rentoffice.business.interfaces.LocadorInterface;
import br.com.rentoffice.repositorio.Repositorio;

public class LocadorBusiness implements LocadorInterface{

    @Override
    public Locador salvarLocador(Locador fornecedor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Locador buscarLocadoresPorCNPJ(String CNPJ) {
            for(Locador locador: Repositorio.locadorDBFake){
            if(locador.getCNPJ() == CNPJ){
                return locador;
            }
        } 
        return null;
    }

    public List<Locador> buscarLocadoresPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Locador> buscarTodosLocadores() {
        return Repositorio.locadorDBFake;
    }

    @Override
    public List<Locador> buscarLocadorPorNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Locador> buscarTodosLocador() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     public boolean validarLocatario(Locador locador){
        boolean valido=true;
        
        if(locador!=null){
            if((locador.getRsocaill_LD()!=null &&
                    !locador.getRsocaill_LD().equals(""))&&
                    (locador.getCNPJ()!= null &&
                    !locador.getCNPJ().equals(""))&&
                    (locador.getEndereco()!=null)){
                      valido=true;
                
            }
        }
        
        return valido;
    }
}
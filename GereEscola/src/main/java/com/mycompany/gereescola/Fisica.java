package com.mycompany.gereescola;

import java.util.Calendar;

public class Fisica extends Pessoa {

    public Fisica ( String nome , Calendar data_nasc, String CPF , String endereco , String nacionalidade , String naturalidade , int idade) {
        super ( nome , data_nasc, CPF , endereco , nacionalidade , naturalidade, idade);        
    }
    
    @Override
    public boolean atualizarID ( String CPF ) throws ErroValidacaoCNPJ {
        if ( validaCPF ( CPF ) ) {
            this.identificador = CPF;
            return true;
        }
        else {
            System.out.println ( "ERRO: CPF invalido!" );
            return false;
        }
    }
    
    protected Boolean validaCPF ( String CPF ) {
        System.out.print(CPF);
        return CPF != null;
    }
}
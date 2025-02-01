package com.mycompany.gereescola;

import java.util.Calendar;
import static java.util.Calendar.DATE;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;

public class Pessoa implements iPessoa , Identificador {

    String nome = "", identificador = "", endereco = "", nacionalidade = "", naturalidade = "";
    int idade = 0;
    Calendar data_inicio_existencia;

    public Pessoa (String nome, Calendar data_inicio_existencia, String identificador, String endereco, String nacionalidade, String naturalidade, int idade) {
        this.nome = nome;
        this.data_inicio_existencia = data_inicio_existencia;
        this.identificador = identificador;
        this.endereco = endereco;
        this.nacionalidade = nacionalidade;
        this.naturalidade = naturalidade;
        this.idade = idade;
    }

    public void atualizarNome ( String nome ) {
        if ( !nome.isBlank() )
            this.nome = nome;
        else
            System.out.println ( "ERRO: nome em branco!" );
    }
    
    public String recuperarNome ( ) {
        return this.nome;
    }
    
    public boolean atualizarID ( String identificador ) throws ErroValidacaoCNPJ {
        this.identificador = identificador;
        return true;
    }
    
    public String recuperarID ( ) {
        return this.identificador;
    }
    
    public void formatarID ( int id ){
        this.identificador = String.valueOf (id);
    }
    
    public boolean validarID ( String id ) {
        if ( id.isBlank() || id.isEmpty() )
            return false;
        else
            return true;
    }
    
    protected String recuperarEndereco ( ) {
        return this.endereco;
    }
	
    public String recuperarNacionalidade ( ) {
        return this.nacionalidade;
    }
	
    public String recuperarNaturalidade ( ) {
        return this.naturalidade;
    }
    
    public void atualizarIdade ( Calendar data_inicio_existencia ) {
        this.idade = calcularIdade ( data_inicio_existencia );
    }
    public int recuperarIdade ( ) {
        return this.idade;
    }
    
    public int calcularIdade ( Calendar data_inicio_existencia ){
        int lapso;
        Calendar hoje = Calendar.getInstance();
        lapso = hoje.get(YEAR) - data_inicio_existencia.get(YEAR);
        if ( ( data_inicio_existencia.get(MONTH) > hoje.get(MONTH) ) ||	( data_inicio_existencia.get(MONTH) == hoje.get(MONTH) && data_inicio_existencia.get(DATE) > hoje.get(DATE) ) )
        lapso--;
        return lapso;
    }
}
package com.mycompany.gereescola;

import java.util.Calendar;

public class GereEscola {

//    private static Pessoa grupo [];
    private static Fisica p1 , p2;
    private static Pessoa p3;
    private static int I1 , I2 , I3;

    public static void main (String args[]) {
        I1 = 1;
        I2 = 2;
        I3 = 1;
        
        Calendar data_nasc = Calendar.getInstance();
        data_nasc.set(1980, 10, 23);

        p1 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , "RUA A, 6040", "Brasil" , "Rio de Janeiro", 48 );
        p2 = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , "RUA A, 6040", "Brasil" , "Rio de Janeiro", 48 );
        p3 = new Pessoa ( "Classe Pessoa" , null , null , null, "Brasil" , "Rio de Janeiro", 5);

//        compararEquals ( p1 , p2 , p3 );
//        compararEquals ( p2 , p3 , p1 );
//        compararEquals ( p3 , p1 , p2 );
        compararEquals ( I1, I2, I3 );

//        grupo = new Pessoa [3];
//        grupo [0] = new Fisica ( "Marco Antônio" , data_nasc , "365.586.875-45" , "RUA A, 6040", "Brasil" , "Rio de Janeiro", 48 );
//        grupo [1] = new Juridica ("Escola Novo Mundo Ltda" , data_nasc , null , null, "Brasil" , "Rio de Janeiro", 0);
//        grupo [2] = new Pessoa ( "Classe Pessoa" , null , null , null, "Brasil" , "Rio de Janeiro", 5);
//        
//        for ( int i = 0 ; i <= 2 ; i++ )
//            System.out.println( "grupo[" + i + "]: " + grupo[i].toString() );

//        if ( p1 instanceof Pessoa )
//            System.out.println("p1 é instância do tipo Pessoa.");
//	else
//            System.out.println("p1 não é instância do tipo Pessoa.");
//        
//	if ( p2 instanceof Pessoa )
//            System.out.println("p2 é instância do tipo Pessoa.");
//	else
//            System.out.println("p2 não é instância do tipo Pessoa.");
//        
//	if ( p3 instanceof Pessoa )
//            System.out.println("p3 é instância do tipo Pessoa.");
//	else
//            System.out.println("p3 não é instância do tipo Pessoa.");
//        
//	if ( p3 instanceof Fisica )
//            System.out.println("p3 é instância do tipo Física.");
//	else
//            System.out.println("p3 não é instância do tipo Física.");

    }

    private static void compararEquals ( Object o1 , Object o2 , Object o3 ){
        System.out.println("Uso de EQUALS para comparar " + o1.getClass().getName());

        if ( o1.equals( o2 ) )
            System.out.println("o1 == o2");
        else
            System.out.println("o1 != o2");
        if ( o1.equals(o3) )
            System.out.println("o1 == o3");
        else
            System.out.println("o1 != o3");
    }
}
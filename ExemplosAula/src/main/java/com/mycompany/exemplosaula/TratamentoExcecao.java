package com.mycompany.exemplosaula;

public class TratamentoExcecao {
//    EXCEÇÕES IMPLICITAS
//      Definidas nos subtipos Error e RunTimeException e suas derivadas podem ocorrer em qualquer parte do programa e
//      normalmente não são causadas diretamente pelo programador. Não precisam ser manualmente lançadas.
    
//    public static void main(String[], args) {
//        int quociente, dividendo=10, divisor=0;
//        try {
//            if (divisor == 0)
//                throw new ArithmeticException("O divisor é zero.");
//            quociente = dividendo / divisor;
//        } catch(Exception e) {
//            System.out.println("ERRO: Divisão por zero: "+e.getMessage());
//        }
//    }
    
//    EXCEÇÃO EXPLICITA
    public static int getElemento(int i, int [] vet) {
        try {
            if (i < 0 || i > 3)
            throw new IllegalAccessException  ();
        } catch ( Exception e ) {
            System.out.println("ERRO: indice fora dos limites do vetor.");
        }
        return vet[i];
    }
}

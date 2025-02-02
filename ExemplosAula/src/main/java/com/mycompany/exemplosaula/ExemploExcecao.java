package com.mycompany.exemplosaula;

public class ExemploExcecao {
//    public static void main(String[] args) {
//        System.out.println("Entre com uma senha: ");
//        String senha = "123abc";
//        
//        try {
//            validarSenha(senha);
//            System.out.print("Senha invalida");
//        } catch (SenhaInvalidaExcecao e) {
//            System.out.println("senha invalida: " + e.getMessage());
//        }
//    }
//
    public static void validarSenha(String senha) throws SenhaInvalidaExcecao {
        if (senha.length() < 5) {
            throw new SenhaInvalidaExcecao("A senha deve ter, pelo menos, 5 caracteres");
        }
        if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaExcecao("A senha deve conter, no mínimo, 1 digito");
        }
    }
}

class SenhaInvalidaExcecao extends Exception {
    public SenhaInvalidaExcecao(String message) {
        super(message);
    }
}
package br.com.alura.view;

import br.com.alura.validacao.ValidacaoCnpjException;
import br.com.alura.modelo.Empresa;
import br.com.alura.service.ValidarCNPJ;
import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.InvalidStateException;

public class TesteValidacaoCNPJ {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("P2S TECNOLOGIA","50.091.147/0004-02");
        CNPJValidator cnpjValidator = new CNPJValidator();
        try{
            cnpjValidator.assertValid(empresa.getCnpj());
            System.out.println("CNPJ Válido ");
        } catch (InvalidStateException e){
            System.out.println("CNPJ Inválido: " + e);
        }


    }
}

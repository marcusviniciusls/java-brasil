package br.com.alura.view;

import br.com.alura.modelo.Pessoa;
import br.com.caelum.stella.validation.InvalidStateException;
import br.com.caelum.stella.validation.TituloEleitoralValidator;

public class TesteValidacaoTituloEleitor {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Vitoria","111111111111",21,"852558760174");
        TituloEleitoralValidator tituloEleitoralValidator = new TituloEleitoralValidator();

        try{
            tituloEleitoralValidator.assertValid(pessoa.getNumeroEleitor());
            System.out.println("Título valido com sucesso");
        } catch (InvalidStateException e){
            System.out.println("Título inválido" + e);
        }

    }
}

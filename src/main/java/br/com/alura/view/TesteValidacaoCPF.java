package br.com.alura.view;

import br.com.alura.validacao.ValidacaoCpfException;
import br.com.alura.modelo.Pessoa;
import br.com.alura.service.ValidarCPF;

public class TesteValidacaoCPF {
    public static void main(String[] args) {
        try{
            Pessoa pessoa = new Pessoa("Marcus Vinicius Lima Silva","467.518.998-90",26);
            ValidarCPF validarCPF = new ValidarCPF();

            System.out.println("CPF VÁLIDO ? " + validarCPF.validaCpf(pessoa));

            int cpf = 456518998 / 100000000;

            System.out.println(cpf);
        } catch (ValidacaoCpfException e){
            e.printStackTrace();
            System.out.println("Erro ao validar CPF");
        }

    }
}

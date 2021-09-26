package br.com.alura.service;

import br.com.alura.validacao.ValidacaoCpfException;
import br.com.alura.modelo.Pessoa;

public class ValidarCPF {
    public boolean validaCpf(Pessoa pessoa) throws ValidacaoCpfException {
        // Limpeza CPF
        limparCaracteresDeixaApenasNumerosCpf(pessoa);

        // Verificar CPF Inválidos Sequenciais
        validarCpfSequencial(pessoa);

        // Verificando primeiro digito verificador
        verificaPrimeiroDigitorCpf(pessoa);

        // Verificando segundo digito verificador
        verificaSegundoDigitoCpf(pessoa);


        return true;
    }

    private void validarCpfSequencial(Pessoa pessoa) throws ValidacaoCpfException {
        if(pessoa.getCpf().equals("11111111111") || pessoa.getCpf().equals("22222222222") || pessoa.getCpf().equals("33333333333") || pessoa.getCpf().equals("44444444444") || pessoa.getCpf().equals("55555555555") ||
                pessoa.getCpf().equals("66666666666") ||pessoa.getCpf().equals("77777777777") || pessoa.getCpf().equals("88888888888") || pessoa.getCpf().equals("99999999999") || pessoa.getCpf().equals("00000000000")){
            throw new ValidacaoCpfException("Erro ao validar CPF: Números Sequenciais");
        }
    }

    private void verificaPrimeiroDigitorCpf(Pessoa pessoa) throws ValidacaoCpfException {
        int somatoria = 0, contadorPrimeiraEtapa = 10;

        for(int i = 0; i<9; i++){
            String valorParaSomar = pessoa.getCpf().substring(i,i+1);
            somatoria += contadorPrimeiraEtapa * Integer.parseInt(valorParaSomar);
            contadorPrimeiraEtapa--;
        }

        somatoria *= 10;

        String decimoDigitoVerificador = pessoa.getCpf().substring(9,10);
        int decimoDigitoVerificadorInteiro = Integer.parseInt(decimoDigitoVerificador);

        if(somatoria % 11 != decimoDigitoVerificadorInteiro){
            throw new ValidacaoCpfException("Erro na validação do CPF");
        }
    }

    private void verificaSegundoDigitoCpf(Pessoa pessoa) throws ValidacaoCpfException {
        int somatoria = 0;
        int contadorPrimeiraEtapa = 11;


        for(int i = 0; i<10; i++){
            String valorParaSomar = pessoa.getCpf().substring(i,i+1);
            somatoria += contadorPrimeiraEtapa * Integer.parseInt(valorParaSomar);
            contadorPrimeiraEtapa--;
        }

        somatoria *= 10;

        String decimoPrimeiroDigitoVerificador = pessoa.getCpf().substring(10,11);
        int decimoPrimeiroDigitoVerificadorInteiro = Integer.parseInt(decimoPrimeiroDigitoVerificador);

        if(somatoria % 11 != decimoPrimeiroDigitoVerificadorInteiro){
            throw new ValidacaoCpfException("Erro na validação do CPF: Segundo Digito validador");
        }
    }

    private void limparCaracteresDeixaApenasNumerosCpf(Pessoa pessoa) {
        pessoa.getCpf().trim();
        pessoa.setCpf(pessoa.getCpf().replaceAll("\\p{Punct}",""));
        pessoa.setCpf(pessoa.getCpf().replaceAll(" ",""));
        pessoa.setCpf(pessoa.getCpf().replaceAll("/",""));
        pessoa.setCpf(pessoa.getCpf().replaceAll("-",""));
    }
}

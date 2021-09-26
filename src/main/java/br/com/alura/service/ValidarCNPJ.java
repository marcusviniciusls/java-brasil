package br.com.alura.service;

import br.com.alura.validacao.ValidacaoCnpjException;
import br.com.alura.modelo.Empresa;

public class ValidarCNPJ {

    public boolean validarCnpj(Empresa empresa) throws ValidacaoCnpjException {
        // Limpeza CNPJ
        limparCaracteresDeixaApenasNumerosCpf(empresa);

        // Verificando primeiro digito verificador
        verificaPrimeiroDigitorCnpj(empresa);

        // Verificando segundo digito verificador
        //verificaSegundoDigitoCnpj(empresa);
        return true;
    }

    private void limparCaracteresDeixaApenasNumerosCpf(Empresa empresa) {
        empresa.getCnpj().trim();
        empresa.setCnpj(empresa.getCnpj().replaceAll("\\p{Punct}",""));
        empresa.setCnpj(empresa.getCnpj().replaceAll(" ",""));
        empresa.setCnpj(empresa.getCnpj().replaceAll("/",""));
        empresa.setCnpj(empresa.getCnpj().replaceAll("-",""));
    }

    private void verificaPrimeiroDigitorCnpj(Empresa empresa) throws ValidacaoCnpjException {
        int somatoria = 0, contadorPrimeiraEtapa = 5;

        for(int i = 0; i<4; i++){
            String valorParaSomar = empresa.getCnpj().substring(i,i+1);
            int somatoriaParcial = contadorPrimeiraEtapa * Integer.parseInt(valorParaSomar);
            somatoria += somatoriaParcial;
            contadorPrimeiraEtapa--;
        }

        contadorPrimeiraEtapa = 9;

        for(int i = 4; i<12; i++){
            String valorParaSomar = empresa.getCnpj().substring(i,i+1);
            int somatoriaParcial = contadorPrimeiraEtapa * Integer.parseInt(valorParaSomar);
            somatoria += somatoriaParcial;
            contadorPrimeiraEtapa--;
        }

        String primeiroDigitoVerificador = empresa.getCnpj().substring(12,13);
        int primeiroDigitoVerificadorInteiro = Integer.parseInt(primeiroDigitoVerificador);
        int restoDivisao = somatoria % 11;

        if(restoDivisao < 2){
            restoDivisao =0;
        } else {

        }
        if(primeiroDigitoVerificadorInteiro != restoDivisao){
            throw new ValidacaoCnpjException("CNPJ Inválido: Primeiro Digito Verificador Incorreto");
        }
    }
}

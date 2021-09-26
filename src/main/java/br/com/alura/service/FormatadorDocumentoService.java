package br.com.alura.service;

import br.com.alura.modelo.Empresa;
import br.com.alura.modelo.Pessoa;
import br.com.caelum.stella.format.CNPJFormatter;
import br.com.caelum.stella.format.CPFFormatter;
import br.com.caelum.stella.format.TituloEleitoralFormatter;

public class FormatadorDocumentoService {

    public void formatarCPF(Pessoa pessoa){
        CPFFormatter cpfFormatter = new CPFFormatter();
        pessoa.setCpf(cpfFormatter.unformat(pessoa.getCpf()));

        System.out.println("CPF sem traços e pontos: " + pessoa.getCpf());
    }

    public void formatarCNPJ(Empresa empresa){
        CNPJFormatter cnpjFormatter = new CNPJFormatter();
        empresa.setCnpj(cnpjFormatter.unformat(empresa.getCnpj()));

        System.out.println("CNPJ sem traços e pontos: " + empresa.getCnpj());
    }

    public void formatarTituloEleitor(Pessoa pessoa){
        TituloEleitoralFormatter tituloEleitoralFormatter = new TituloEleitoralFormatter();
        pessoa.setNumeroEleitor(tituloEleitoralFormatter.format(pessoa.getNumeroEleitor()));

        System.out.println("TItulo de Eleitor com traços " + pessoa.getNumeroEleitor());
    }


}

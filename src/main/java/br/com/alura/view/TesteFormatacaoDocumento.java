package br.com.alura.view;

import br.com.alura.modelo.Empresa;
import br.com.alura.modelo.Pessoa;
import br.com.alura.service.FormatadorDocumentoService;

public class TesteFormatacaoDocumento {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("P2S TECNOLOGIA","50.091.147/0001-02");
        Pessoa pessoa = new Pessoa("Ana Vitoria","467.518.998-90",21,"852558760174");

        FormatadorDocumentoService formatadorDocumentoService = new FormatadorDocumentoService();

        System.out.println("CPF com traços e com pontos " + pessoa.getCpf());
        formatadorDocumentoService.formatarCPF(pessoa);

        System.out.println("CNPJ com traços e com pontos " + empresa.getCnpj());
        formatadorDocumentoService.formatarCNPJ(empresa);

        System.out.println("TItulo de eleitor Sem traços e sem pontos " + pessoa.getNumeroEleitor());
        formatadorDocumentoService.formatarTituloEleitor(pessoa);
    }
}

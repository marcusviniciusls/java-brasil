package br.com.alura.view;

import br.com.alura.modelo.Pessoa;
import br.com.alura.service.FormatadorDocumentoService;
import br.com.alura.service.ValidarCPF;
import br.com.alura.validacao.ValidacaoCpfException;
import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import org.javamoney.moneta.Money;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

public class Desafio {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Vitoria","467.518.998-90",21,"852558760174");
        ValidarCPF validarCPF = new ValidarCPF();

        try{
            validarCPF.validaCpf(pessoa);
            CurrencyUnit currencyUnit = Monetary.getCurrency("BRL");
            MonetaryAmount valorTotal = Money.of(900,currencyUnit);

            NumericToWordsConverter numericToWordsConverter = new NumericToWordsConverter(new FormatoDeReal());
            System.out.println("O valor total: " + numericToWordsConverter.toWords(valorTotal.getNumber().doubleValue()));
        } catch (ValidacaoCpfException e) {
            e.printStackTrace();
        }

    }
}

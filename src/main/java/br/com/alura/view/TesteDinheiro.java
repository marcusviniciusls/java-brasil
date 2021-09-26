package br.com.alura.view;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;
import org.javamoney.moneta.Money;
import org.javamoney.moneta.function.MonetaryOperators;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

public class TesteDinheiro {
    public static void main(String[] args) {
        CurrencyUnit currencyUnit = Monetary.getCurrency("BRL");
        MonetaryAmount valordaParcela = Money.of(75,currencyUnit);

        System.out.println(valordaParcela);

        MonetaryAmount valorTotal = valordaParcela.multiply(12);
        System.out.println(valorTotal);

        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
        System.out.println(desconto);

        NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());
        System.out.println(converter.toWords(desconto.getNumber().doubleValue()));

    }
}

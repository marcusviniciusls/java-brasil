package br.com.alura.view;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.InteiroSemFormato;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

import java.math.BigDecimal;

public class TesteNumeroPorExtenso {
    public static void main(String[] args) {
        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
        BigDecimal valor = new BigDecimal("75.22");

        String numeroPorExtenso = conversor.toWords(valor.doubleValue());

        System.out.println(numeroPorExtenso);
    }
}

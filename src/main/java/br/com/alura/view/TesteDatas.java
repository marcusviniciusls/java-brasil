package br.com.alura.view;

import br.com.alura.modelo.Pessoa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.util.Locale;

public class TesteDatas {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ana Vitoria","467.518.998-90",21,"852558760174");
        System.out.println(pessoa.getDataCadastro());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(pessoa.getDataCadastro().format(dateTimeFormatter));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
        System.out.println(localDateTime.format(dateTimeFormatter1));

        DateTimeFormatter formatadorCurto = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(Locale.GERMANY);
        System.out.println(localDateTime.format(formatadorCurto));

        System.out.println(localDateTime.minusHours(5));

    }
}

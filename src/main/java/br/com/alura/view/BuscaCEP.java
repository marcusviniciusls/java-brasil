package br.com.alura.view;

import com.github.gilbertotorrezan.viacep.se.ViaCEPClient;
import com.github.gilbertotorrezan.viacep.shared.ViaCEPEndereco;

import java.io.IOException;

public class BuscaCEP {
    public static void main(String[] args) {
        ViaCEPClient cliente = new ViaCEPClient();
        try{
            ViaCEPEndereco viaCEPEndereco = cliente.getEndereco("03584130");
            System.out.println(viaCEPEndereco.getLogradouro());
            System.out.println(viaCEPEndereco.getComplemento());
            System.out.println(viaCEPEndereco.getBairro());
            System.out.println(viaCEPEndereco.getCep());
            System.out.println(viaCEPEndereco.getIbge());
            System.out.println(viaCEPEndereco.getUf());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

package br.com.elder;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       int totalMotos = 0;
       int totalBarcos = 0;
       int totalCarros = 0;

       Veiculo meuVeiculoGenerico = new Veiculo("GM");

       Moto minhaMoto1 = new Moto("Honda", 600);
//       Moto minhaMoto2 = new Moto("Yamaha", 650);

       Barco meuBarco1 = new Barco("SEA", 300);
       Barco meuBarco2 = new Barco("YYM", 400);

       Carro meuCarro1 = new Carro("GM", 4);
       Carro meuCarro2 = new Carro("VW", 2);

       Estacionamento estacionamento = new Estacionamento();

       estacionamento.getVeiculos().add(meuVeiculoGenerico);
       estacionamento.getVeiculos().add(minhaMoto1);
//       estacionamento.getVeiculos().add(minhaMoto2);
       estacionamento.getVeiculos().add(meuBarco1);
       estacionamento.getVeiculos().add(meuBarco2);
       estacionamento.getVeiculos().add(meuCarro1);
       estacionamento.getVeiculos().add(meuCarro2);

       JOptionPane.showMessageDialog(null, estacionamento.getVeiculos());

       //Utilizando o tipo da classe do objeto
       JOptionPane.showMessageDialog(null, "Motos no Estacionamento são = " + getContadorDeTipos(estacionamento, Moto.class));

       for (int i = 0 ; i < estacionamento.getVeiculos().size() ; i ++){
          if (estacionamento.getVeiculos().get(i) instanceof Moto){
             totalMotos++;
          } else if (estacionamento.getVeiculos().get(i) instanceof Barco){
             totalBarcos++;
          } else if (estacionamento.getVeiculos().get(i) instanceof Carro){
             totalCarros++;
          }
       }

       JOptionPane.showMessageDialog(null, "Motos no Estacionamento são = " + totalMotos);
       JOptionPane.showMessageDialog(null, "Barcos no Estacionamento são = " + totalBarcos);
       JOptionPane.showMessageDialog(null, "Carros no Estacionamento são = " + totalCarros);

    }

    public static int getContadorDeTipos(Estacionamento estacionamento, Class<? extends Veiculo> classe ){
      int contador = 0;
         for (Veiculo v : estacionamento.getVeiculos()){
            if (v.getClass().equals(classe)){
               contador++;
            }
         }
      return contador;
    }

}

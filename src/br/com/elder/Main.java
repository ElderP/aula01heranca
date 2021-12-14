package br.com.elder;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

   public static void main(String[] args) {

       int totalMotos = 0;
       int totalBarcos = 0;
       int totalCarros = 0;

       Moto minhaMoto1 = new Moto("Honda", 600);
       Moto minhaMoto2 = new Moto("Yamaha", 650);

       Barco meuBarco1 = new Barco("SEA", 300);
       Barco meuBarco2 = new Barco("YYM", 400);

       Carro meuCarro1 = new Carro("GM", 4);
       Carro meuCarro2 = new Carro("VW", 2);

       Estacionamento estacionamento = new Estacionamento();

       //For adicionando 10000 vezes 2 motos, 2 barcos , 2 carros
       for (int i = 0 ; i < 10000 ; i++  ){
           estacionamento.getVeiculos().add(minhaMoto1);
           estacionamento.getVeiculos().add(minhaMoto2);
           estacionamento.getVeiculos().add(meuBarco1);
           estacionamento.getVeiculos().add(meuBarco2);
           estacionamento.getVeiculos().add(meuCarro1);
           estacionamento.getVeiculos().add(meuCarro2);
       }

       //Para formatar número
       Locale localeBR = new Locale("pt", "BR");
       NumberFormat numberFormat = NumberFormat.getNumberInstance(localeBR);



        //Mostrando o total da lista
       JOptionPane.showMessageDialog(null, numberFormat.format(estacionamento.getVeiculos().size()) );

       //Utilizando o tipo da classe do objeto

       //Utilizando for para percorrer a lista 1 vez e computar os totais
       for (int i = 0 ; i < estacionamento.getVeiculos().size() ; i ++){
          if (estacionamento.getVeiculos().get(i) instanceof Moto){
             totalMotos++;
          } else if (estacionamento.getVeiculos().get(i) instanceof Barco){
             totalBarcos++;
          } else if (estacionamento.getVeiculos().get(i) instanceof Carro){
             totalCarros++;
          }
       }

       JOptionPane.showMessageDialog(null, "Motos no Estacionamento são = " + numberFormat.format( totalMotos ) + "\n"
                                                                    + " Barcos no Estacionamento são = " + numberFormat.format( totalBarcos ) + "\n"
                                                                    + " Carros no Estacionamento são = " + numberFormat.format( totalCarros ) );




       JOptionPane.showMessageDialog(null, "Motos no Estacionamento são = " + numberFormat.format( getContadorDeTipos(estacionamento, Moto.class) )+"\n"
               + " Barcos no Estacionamento são = " + numberFormat.format( getContadorDeTipos(estacionamento, Barco.class) )+"\n"
               + " Carros no Estacionamento são = " + numberFormat.format( getContadorDeTipos(estacionamento, Carro.class) ) );
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

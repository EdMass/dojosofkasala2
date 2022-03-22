package com.example.dojosofkasala2.punto2;

import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chat {

    public List<Texto> listaChat(Texto texto){
        List<Texto> lista = new ArrayList<>();
        lista.add(texto);
        return lista;
    }

    public List<MalasPalabras> malasPalabras(){
        List<MalasPalabras> lista = new ArrayList<>();
        lista.add(new MalasPalabras("hp"));
        lista.add(new MalasPalabras("malparido"));
        lista.add(new MalasPalabras("hijueputa"));
        lista.add(new MalasPalabras("sapo con muelas"));
        lista.add(new MalasPalabras("perro sin sangre"));
        lista.add(new MalasPalabras("careverga"));
        lista.add(new MalasPalabras("cachon"));
        lista.add(new MalasPalabras("soplamonda"));
        lista.add(new MalasPalabras("traga pitos"));
        lista.add(new MalasPalabras("culo flojo"));
        return lista;
    }

    public void cambiaMalasPalabras(Texto texto){
/*
        Flux<Texto> fx1 =Flux.fromIterable(listaChat(texto)
                .stream().flatMap());
        Flux<MalasPalabras> fx2 =Flux.fromIterable(malasPalabras());
        */

    }

   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String chat = input.nextLine();
        System.out.println(chat);


    }
}

package org.cursodesarrollo.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

         /*
         STREAM:
         El Stream nos puede ayudar a crear filtros, ordenar elementos y mucho mas sin necesidad de hacer varios for
         En un Stream en Java tiene mucho que ver con escribir código más limpio, funcional y fácil de leer cuando necesitas procesar datos.
         */
        //Creando un Stream desde cero
        System.out.println("=======Stream desde cero=======");

        Stream<String> compra = Stream.of("arroz","huevo","avena","maiz","tomate");
        compra.forEach(System.out::println);

        System.out.println("=======Pasandole un List========");
        //Pasando valores a un Stream:
        List<String> lista = new ArrayList<>();
        lista.add("pato");
        lista.add("pepe");
        lista.add("papa");
        lista.add("mano");
        lista.add("zapo");

        Stream nombres = lista.stream();
        nombres.forEach(System.out::println);


        System.out.println("=======Creandolo con builder========");
        //CREANDOLO CON BUILDER:
        Stream<String> nombres2 =Stream.<String>builder()
                .add("camilo")
                .add("mario")
                .add("manolo")
                .build();
        nombres2.forEach(System.out::println);



        //Apartir de un builder (cuando no tenemos los datos desde el principio)
        System.out.println("=====Apartir de un builder======");

        Stream.Builder<String> tienda = Stream.builder();
        tienda.add("zapatos");
        tienda.add("tenis");
        tienda.add("pantalones");
        tienda.add("camisa");

        tienda.build().forEach(System.out::println); //imprimimos




    }
}

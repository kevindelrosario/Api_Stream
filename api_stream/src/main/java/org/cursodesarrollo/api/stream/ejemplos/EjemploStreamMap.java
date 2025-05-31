package org.cursodesarrollo.api.stream.ejemplos;

import org.cursodesarrollo.api.stream.ejemplos.modelo.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EjemploStreamMap {
    public static void main(String[] args) {

/*
        System.out.println("=======Stream con MAP (indicando tipo)=======");
        //indicando el tipo de valor del stream se hace asi:
        //no lo ponemos tipo String porque retorna un void.

        Stream<String> compras = Stream
                .of("arroz","huevo","avena","maiz","tomate")
                .peek(System.out::println) //solo sirve para ver como esta antes de llegar al siguiente cambio
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        // compras.forEach(System.out::println); //se imprime por separado
        //si quiero mostrarlo en un collect, para que no sea un forEach (pero de la forma de arriba esta bien)
        System.out.println("======collect===");
        List<String> lista = compras.collect(Collectors.toList());
*/
        /**************SIN INDICAR TIPO********************/

/*
        System.out.println("=======Stream con MAP (SIN indicar tipo)=======");
         //sin indicar lo podemos mostrar de esta forma:
        Stream.of("arroz","huevo","avena","maiz","tomate")
                //no lo ponemos tipo String porque retorna un void.
                .map(compra -> {
                    return compra.toUpperCase();
                }).forEach(System.out::println); //se imprime en el mismo


*/
        System.out.println("======clase a stream=====");
        /***********************TRABAJANDO CON OBJETOS****************************/
        Stream<Usuario> nombres = Stream
                .of("Mario","pedro","camilo","Fernado","Maite")
                .map(nombre -> new Usuario(nombre,null))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });

        //si quiero mostrarlo en un collect, para que no sea un forEach (pero de la forma de arriba esta bien)

        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(u -> System.out.println(u.getNombre()));
    }
}

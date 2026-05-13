package com.example.aprendo.aprendo.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsPractica {
    
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Wilder", "Luis", "Carlos", "Pia");
        
        List<String> nombresProcesados = nombres.stream()
                .filter(nombre -> nombre.length() > 4)//Por esta condicion solo pasan los nombres WILDER, CARLOS
                .map(nombre -> nombre.toUpperCase())//Transformamos los nombres a mayuscula
                .collect(Collectors.toList());//se 
        
        System.out.println(nombresProcesados);//Imprime WILDER , CARLOS
        
        //1.Filtro Básico: Dada una lista de números enteros [2, 5, 8, 11, 14, 20], usa filter() y collect() para crear una nueva lista que contenga solo los números pares (condición: numero % 2 == 0).
        List<Integer> listaNum = Arrays.asList(2,5, 8, 11, 14, 20);
        List<Integer> numProc = listaNum.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(numProc.toString());
        
        //2.Transformación: Dada una lista de distritos en minúsculas ["lima", "comas", "breña"], usa map() para crear una nueva lista con los distritos en MAYÚSCULAS.
        List<String> dist = Arrays.asList("Ancon", "Puente Piedra", "Los olivos", "San Martin de Porres", "Carabayllo");
        List<String> distProcesados = dist.stream()
                .map(distrito -> distrito.toUpperCase())
                .collect(Collectors.toList());
        
        System.out.println(distProcesados);
        
        //3.Filtrar y Contar: Dada una lista de palabras ["Auto", "Avión", "Barco", "Ancla", "Tren"], usa filter() y la operación terminal count() para descubrir cuántas palabras empiezan con la letra "A". (Nota: count() devuelve un long, no una lista).
        List<String> pal = Arrays.asList("Auto", "Avion", "Barco", "Ancla", "Tren");
        
        Long cantidadPalabrasA = pal.stream()
                .filter(palabra -> palabra.startsWith("A"))
                .count();
        
        System.out.println(cantidadPalabrasA.toString());
        
        //4.Ordenar: Dada una lista de nombres de choferes desordenados, usa la operación intermedia sorted() y luego collect() para guardarlos en una nueva lista ordenada alfabéticamente.
        List<String> choferes = Arrays.asList("Yaranga medalino", "Solano Cisneros Amilcar", "Armas Moncada", "Tiquillahuanca Paico Timoteo");
        
        List<String> ordenChoferes = choferes.stream()
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println(ordenChoferes);
        
        //5.Limpiar Duplicados: Tienes una lista de códigos de error de un log donde algunos se repiten: [404, 500, 404, 403, 500, 200]. Usa la operación intermedia distinct() para generar una nueva lista sin números repetidos.
        List<Integer> codigosError = Arrays.asList(404, 500, 404, 403, 500, 200);
        
        List<Integer> codigosSinDuplicados = codigosError.stream()
                .distinct()
                .collect(Collectors.toList());
        
        System.out.println(codigosSinDuplicados.toString());
        
        //6
        List<Integer> aniosFabricacion = Arrays.asList(2015, 2019, 2022, 2011, 2024);
        
        boolean antiguedadMaxima2010 = aniosFabricacion.stream()
                .allMatch(anio -> anio > 2010);
        
        System.out.println("El año de fabricacion de todas nuestras unidades es mayor al 2010: " + antiguedadMaxima2010);
        
        //7
        List<Integer> cantidadRepuestos = Arrays.asList(15, 20, 5, 0, 12);
        
        boolean estockeados = cantidadRepuestos.stream()
                .anyMatch(cant -> cant == 0);
        
        System.out.println("Tenemos algun repuesto cuyo estock sea cero?: " + estockeados);
        
        //8
        List<String> placas = Arrays.asList("BAZ-911", "AEJ-934", "AEL-810", "F3Z-970");
        
        String placa = placas.stream()
                .filter(plac -> plac.startsWith("F"))
                .findFirst()
                .orElse("Ninguna placa que comience con B");
                
        System.out.println(placa);
        
        //9
        List<Double> pasajes = Arrays.asList(15.50, 6.80, 20.00, 15.50);
        
        Double pasaje = pasajes.stream()
                .reduce(0.0, Double::sum);
        
        System.out.println("El total de pasajes gastados a la semana es: S/" + pasaje + ".");
        
        //10
        
        
    }
    
}

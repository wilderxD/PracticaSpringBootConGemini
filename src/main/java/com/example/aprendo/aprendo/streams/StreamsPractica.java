package com.example.aprendo.aprendo.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
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
        List<Integer> kilometrajes = Arrays.asList(25000, 8000, 15000, 30000, 12000);
        
        List<Integer> kilometrajesOrdenados = kilometrajes.stream()
                .filter(km -> km > 10000)
                .sorted()
                .limit(2)
                .collect(Collectors.toList());
        
        System.out.println(kilometrajesOrdenados.toString());
        
        //11
        List<Integer> capacidades = Arrays.asList(4, 10, 2,15, 8);
        
        int capacidadMayor = capacidades.stream()
                .max(Integer::compareTo)
                .get();
        
        System.out.println(capacidadMayor);

        //12
        List<String> repuestos = Arrays.asList("Filtro", "Precalentador", "injectores");
        
        String repuestosS = repuestos.stream()
                .collect(Collectors.joining(" - "));
        
        System.out.println(repuestosS);
        
        //13
        List<Integer> guiasR = Arrays.asList(1, 2, 3, 4 ,5 ,6 ,7 ,8, 9, 10);
        
        List<Integer> guiasPaginado = guiasR.stream()
                .skip(3)
                .limit(3)
                .collect(Collectors.toList());
        
        System.out.println(guiasPaginado.toString());
        
        //14
        List<Integer> temperaturasMotor = Arrays.asList(85,90, 88, 92);
        
        boolean temperaturaMotor = temperaturasMotor.stream()
                .noneMatch(temp -> temp >= 100);
        
        System.out.println("la temperatura del motor estubo por debajo de los 100 grados: " + temperaturaMotor);
        
        //15
        List<String> vehiculos = Arrays.asList("Auto", "Bus", "Avion","Bicicleta");
        
        Map<Character, List<String>> vehiculosOrdenado = vehiculos.stream()
                .collect(Collectors.groupingBy(palabra -> palabra.charAt(0)));
        
        for(Map.Entry<Character, List<String>> v : vehiculosOrdenado.entrySet()){
            System.out.println(v.getValue().toString());
        }
                
        //16
        List<String> nombres1 = Arrays.asList("Juan", "", "Pedro", null, "Jose");
        
        List<String> nombresLimpio = nombres1.stream()
                .filter(nombre -> nombre != null)
                .filter(nombre -> !nombre.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        
        System.out.println(nombresLimpio);
        
        //17
        int[] notas = {15, 18, 12, 20};
        
        Double promNotas = Arrays.stream(notas)
                .average()
                .getAsDouble();
        
        System.out.println("El promedio de notas de este alumno es: " + promNotas);
        
        //18
        List<Double> precios = Arrays.asList(100.0, 200.0, 300.0);
        
        List<Double> preciosDsct = precios.stream()
                .peek(precio -> System.out.println("Procesando: " + precio))
                .map(precio -> precio *0.9)
                .collect(Collectors.toList());
        
        System.out.println(preciosDsct);
        
        //19
        List<String> palabras = Arrays.asList("Hola", "Mundo", "En java");
        
        Integer resultado = palabras.stream()
                .mapToInt(palabra -> palabra.length())
                .sum();
        
        System.out.println(resultado);
        
        //20
        Map<String, Integer> almacen = new HashMap<>();
        almacen.put("Llanta", 15);
        almacen.put("Bateria", 3);
        almacen.put("Freno", 8);
        almacen.put("Aceite", 1);
        
        List<String> almacenFiltrado = almacen.entrySet()
                .stream()
                .filter(cantidad -> cantidad.getValue() < 5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        
        System.out.println(almacenFiltrado.toString());
        
    }
    
}

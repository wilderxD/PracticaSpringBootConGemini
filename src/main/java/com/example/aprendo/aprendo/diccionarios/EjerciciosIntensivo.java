package com.example.aprendo.aprendo.diccionarios;

import java.util.HashMap;
import java.util.Map;

public class EjerciciosIntensivo {
    
    public static void main(String[] args) {
        //1.Crea un mapa que relacione la placa de un camión (Hino, Volkswagen, etc.) con el nombre de su chofer asignado. Agrega 3 e imprime el nombre de uno buscando por su placa.
        Map<String,  String> listaCamiones = new HashMap<>();
        
        listaCamiones.put("BAZ-911", "Terones Muñoz Jose");
        listaCamiones.put("BBA-815", "Solano Cisneros Amilcar");
        listaCamiones.put("AAH-815", "Gutierrez Javier");
        
        System.out.println(listaCamiones.get("BBA-815") );        
        
        //2.Desarrolla un glosario técnico de Java: la llave es el término (ej. "Encapsulamiento") y el valor es su definición. Usa containsKey antes de agregar un término nuevo para no sobrescribir.
        Map<String, String> glosario =  new HashMap<>();
        glosario.put("Polimorfismo", "Es la habilidad de las clases para comportarse diuferente segun se requiera.");
        glosario.put("Herencia", "Permite a una clase hija heredar comportamientos y hasta atributos de una clase padre");
        glosario.put("Encapsulamento", "Es la habilidad de la clase para poder darle seguridad a sus atributos y metodos.");
        
        if(glosario.containsKey("Herencia")){
            return;
        }else{
            glosario.put("Herencia", "hereda atributos y metodos de una calase a otra.");
        }
                
        //3.Simula el inventario de un personaje en Final Fantasy X. La llave es el nombre del ítem (String) y el valor es la cantidad (Integer). Resta 1 a la cantidad de "Poción" usando get y luego put con el nuevo valor.
        Map<String, Integer> inventarioFFX = new HashMap<>();
        inventarioFFX.put("Escalibur", 5);
        
        int nuevaCantidad = inventarioFFX.get("Escalibur") - 1;
        inventarioFFX.put("Escalibur", nuevaCantidad);        
        
        //4.Crea un mapa para relacionar códigos de barras (SKU) con modelos de colchones. Usa getOrDefault al buscar un SKU que no existe para que devuelva "Modelo no registrado".
        Map<String, String> listaColchones = new HashMap<>();
        listaColchones.put("15152", "Colchon Iridio 1.5plz");
        listaColchones.put("15153", "Colchon Iridio 2plz");
        listaColchones.put("15154", "Colchon Iridio Queen");
        
        System.out.println(listaColchones.getOrDefault("15155", "Modelo no registrado"));
        
        //5.tera sobre un mapa de traducciones (Inglés -> Español) e imprime solo aquellas palabras cuya traducción al español empiece con la letra "C".
        Map<String, String> tradu = new HashMap<>();
        tradu.put("Car", "CARRO");
        tradu.put("Units", "Cantidades");
        tradu.put("Dog", "Perro");
        
        for(String s : tradu.values()){
            s.
            if(s.matches("C")){
                System.out.println(s);
            }
        }
        
        
        
        //6.Registra las paradas de una ruta de entrega en Lima. La llave es el número de parada (1, 2, 3...) y el valor es el distrito. Imprime el mapa y verifica que el orden de ruta se mantenga intacto.
        
        //7.Mapea los pasos cronológicos para desarmar un combo promocional en un proceso de logística inversa. Iteralo para mostrar en pantalla el orden exacto de ejecución.
        
        //8.Registra el historial de comandos ingresados en una consola de Spring Boot. La llave es la marca de tiempo (String) y el valor es el comando ejecutado.
        
        //9.Guarda el registro de los últimos 5 mantenimientos de un vehículo. Inserta los datos en el orden en que ocurrieron y recórrelos con un for para imprimir el historial.
        
        //10.Haz un sistema simple de carrito de compras donde la llave es el producto y el valor es el precio. Al imprimir el "ticket", los productos deben salir exactamente en el orden en que el cliente los clickeó.
        
        //11.Crea un cronograma de mantenimiento preventivo. La llave será el kilometraje (Integer, ej. 10000, 20000) y el valor la acción (ej. "Cambio de aceite"). Observa cómo, sin importar en qué orden los insertes, al imprimir el mapa siempre salen ordenados por kilometraje.
        
        //12.Elabora un ranking de jugadores de Call of Duty Mobile. La llave es el nombre del jugador y el valor es su "K/D ratio". El mapa debe imprimirse ordenado alfabéticamente por el nombre del jugador.
        
        //13.Guarda una lista de cursos del séptimo ciclo de universidad. Usa el código del curso como llave. Utiliza el método firstKey() para encontrar cuál es el primer curso en orden alfanumérico.
        
        //14.Crea un tarifario de fletes. La llave es el precio (Double) y el valor es el destino. Extrae el destino más caro usando el método lastEntry().
        
        //15.Registra alumnos y sus notas finales. Usa TreeMap para que al mostrar el reporte, los apellidos de los alumnos salgan de la A a la Z.
        
        //16.Simula un caché de sesiones en una API REST en Spring Boot (Token -> Nombre de Usuario). Investiga y usa el método putIfAbsent() para asegurar que dos hilos no registren el mismo token a la vez.
        
        //17.Crea un mapa para manejar el stock en un almacén principal donde múltiples operarios despachan al mismo tiempo. Usa el método compute() para restar el inventario de forma segura.
        
        //18.Imagina un servidor que recibe las coordenadas GPS (Latitud/Longitud) de 50 camiones cada segundo. Declara el mapa correcto para actualizar estas posiciones en tiempo real sin que la memoria colapse.
        
        //19.Simula un contador de visitas a diferentes páginas web. La llave es la URL y el valor es la cantidad de visitas. Usa merge() para incrementar el contador de una página específica.
        
        //20.Configura un diccionario de propiedades globales del sistema que pueda ser leído por diferentes módulos del software al mismo tiempo, mientras un administrador actualiza los valores en caliente.
                
                
    }
    
}

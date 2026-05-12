package com.example.aprendo.aprendo.diccionarios;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

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
            
            if(s.startsWith("C")){
                System.out.println(s);
            }
        }
        //metodo seguro que devueve tando valor como clave
        for(Map.Entry<String, String> entrada : tradu.entrySet()){
            if(entrada.getValue().startsWith("C")){
                System.out.println(entrada.getKey() + ", " + entrada.getValue());
            }
        }
        
        //6.Registra las paradas de una ruta de entrega en Lima. La llave es el número de parada (1, 2, 3...) y el valor es el distrito. Imprime el mapa y verifica que el orden de ruta se mantenga intacto.
        Map<Integer, String> mapaRutas = new LinkedHashMap<>();
        mapaRutas.put(1, "Puente Piedra");
        mapaRutas.put(2, "Los Olivos");
        mapaRutas.put(3, "San Martin de Porres");
        
        System.out.println(mapaRutas.toString());
        
        //7.Mapea los pasos cronológicos para desarmar un combo promocional en un proceso de logística inversa. Iteralo para mostrar en pantalla el orden exacto de ejecución.
        Map<String, String> productos = new LinkedHashMap<>();
        productos.put("10:00", "colchon 2plz");
        productos.put("10:30", "Tarima 2plz");
        productos.put("10:32", "Almohada");
        productos.put("10:38", "cabecera");
        
        for(Map.Entry<String, String> p : productos.entrySet()){
            System.out.println(p.getKey() + ": " + p.getValue());
        }        
        
        //8.Registra el historial de comandos ingresados en una consola de Spring Boot. La llave es la marca de tiempo (String) y el valor es el comando ejecutado.
        Map<String, String> mapaConsola = new LinkedHashMap<>();
        mapaConsola.put("10:50", "java -version");
        mapaConsola.put("10:55", "java install");
        mapaConsola.put("10:59", "java npc");
        
        for(Map.Entry<String, String> c : mapaConsola.entrySet()){
            System.out.println(c.getKey() + " " + c.getValue());
        }        
        
        //9.Guarda el registro de los últimos 5 mantenimientos de un vehículo. Inserta los datos en el orden en que ocurrieron y recórrelos con un for para imprimir el historial.
        Map<Integer, String> historialMantenimientos = new LinkedHashMap<>();
        historialMantenimientos.put(1, "Mantenimiento general");
        historialMantenimientos.put(2, "Mantenimiento Ruedas");
        historialMantenimientos.put(3, "Mantenimiento de corona, tren de transmision");
        historialMantenimientos.put(4, "Mantenimiento de la bomba de Injeccion");
        historialMantenimientos.put(5, "Mantenimiento Mayor");
        
        for(Map.Entry<Integer, String> h : historialMantenimientos.entrySet()){
            System.out.println(h.getKey() + " " + h.getValue());
        }
        
        //10.Haz un sistema simple de carrito de compras donde la llave es el producto y el valor es el precio. Al imprimir el "ticket", los productos deben salir exactamente en el orden en que el cliente los clickeó.
        
        //11.Crea un cronograma de mantenimiento preventivo. La llave será el kilometraje (Integer, ej. 10000, 20000) y el valor la acción (ej. "Cambio de aceite"). Observa cómo, sin importar en qué orden los insertes, al imprimir el mapa siempre salen ordenados por kilometraje.
        Map<Integer, String> cronograma = new TreeMap<>();
        cronograma.put(15000, "Cambio de aceite");
        cronograma.put(1300, "Cambio de filtro de aire");
        cronograma.put(1100, "Cambio de luces de freno");
        
        for(Map.Entry<Integer,String> cr : cronograma.entrySet()){
            System.out.println(cr.getKey() + " - " + cr.getValue());
        }
                
        //12.Elabora un ranking de jugadores de Call of Duty Mobile. La llave es el nombre del jugador y el valor es su "K/D ratio". El mapa debe imprimirse ordenado alfabéticamente por el nombre del jugador.
        Map<String, Integer> ranking = new TreeMap<>();
        ranking.put("Mata Lobos", 15);
        ranking.put("Fullero", 11);
        ranking.put("Desnucador", 5);
        
        for(Map.Entry<String, Integer> ra : ranking.entrySet()){
            System.out.println(ra.getKey() + ", " + ra.getValue());
        }
        
        //13.Guarda una lista de cursos del séptimo ciclo de universidad. Usa el código del curso como llave. Utiliza el método firstKey() para encontrar cuál es el primer curso en orden alfanumérico.
        TreeMap<Integer, String> cursos = new TreeMap<>();
        cursos.put(15202, "Inovacion y tranfomacion digital");
        cursos.put(15123, "Desarrollo web Avanzado");
        cursos.put(10158, "Arquitectura empresarial");
        
        System.out.println("el primer curso ordenado es: " + cursos.firstKey());
        
        //14.Crea un tarifario de fletes. La llave es el precio (Double) y el valor es el destino. Extrae el destino más caro usando el método lastEntry().
        TreeMap<Integer, String> tarifario = new TreeMap<>();
        tarifario.put(2100, "Truhillo mall");
        tarifario.put(3500, "Trujillo camion carreta");
        tarifario.put(1800, "Michelin");
        
        System.out.println("El destino mas caro es: " + tarifario.lastEntry());
        
        //15.Registra alumnos y sus notas finales. Usa TreeMap para que al mostrar el reporte, los apellidos de los alumnos salgan de la A a la Z.
        TreeMap<String, Integer> notasa = new TreeMap<>();
        notasa.put("Zaavedra Gonzales, Efrain", 18);
        notasa.put("Paredes Peres, Emilio", 20);
        notasa.put("Alvares Fernandez, juan", 12);
        
        for(Map.Entry<String, Integer> not : notasa.entrySet()){
            System.out.println(not);
        }
        
        //16.Simula un caché de sesiones en una API REST en Spring Boot (Token -> Nombre de Usuario). Investiga y usa el método putIfAbsent() para asegurar que dos hilos no registren el mismo token a la vez.
        Map<String, String> sesiones = new ConcurrentHashMap<>();
        sesiones.putIfAbsent("TOKEN-999", "Wilder");
        sesiones.putIfAbsent("TOKEN-999", "Juan");
        
        System.out.println(sesiones.get("TOKEN-999"));
        
        //17.Crea un mapa para manejar el stock en un almacén principal donde múltiples operarios despachan al mismo tiempo. Usa el método compute() para restar el inventario de forma segura.
        Map<String, Integer> stock = new ConcurrentHashMap<>();
        stock.put("Colchon iridio 2plz", 10);
        
        stock.compute("Colchon iridio 2plz", (k, valorActual) -> valorActual - 1);
        System.out.println("Stock actual: " + stock.get("Colchon iridio 2plz"));
        
        //18.Imagina un servidor que recibe las coordenadas GPS (Latitud/Longitud) de 50 camiones cada segundo. Declara el mapa correcto para actualizar estas posiciones en tiempo real sin que la memoria colapse.
                
        //19.Simula un contador de visitas a diferentes páginas web. La llave es la URL y el valor es la cantidad de visitas. Usa merge() para incrementar el contador de una página específica.
        Map<String, Integer> visitar = new ConcurrentHashMap<>();
        visitar.merge("ruta/ofertas", 1, Integer::sum);
        visitar.merge("ruta/ofertas", 1, Integer::sum);
        
        System.out.println("Visitas: " + visitar.get("ruta/ofertas"));
        
        //20.Configura un diccionario de propiedades globales del sistema que pueda ser leído por diferentes módulos del software al mismo tiempo, mientras un administrador actualiza los valores en caliente.
        Map<String, String> config = new ConcurrentHashMap<>();
        config.put("ESTADO_SISTEMA", "ACTIVO");
        
        System.out.println(config.get("ESTADO_SISTEMA"));
        
        config.put("MODO_MANTENIMIENTO", "ON");
                
    }
    
}

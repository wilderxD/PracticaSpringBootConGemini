package com.example.aprendo.aprendo;

// Al extender hacemos que sea uncheked exception osea que salte por erro de logica o ejecucion.
public class RecursoNoEncontradoException extends RuntimeException{
    
    public RecursoNoEncontradoException(String mensaje){
        super(mensaje);//pasamos el mensaje a la clase padre de la que extiende
    }
}

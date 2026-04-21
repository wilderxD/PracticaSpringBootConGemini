package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class Persona {
    
    private String nombre;
    private String apellidos;
    private String email;
    private boolean esHombre;

    private Persona(String nombre, String apellidos, String email, boolean esHombre) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.esHombre = esHombre;
    }

       
    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEsHombre() {
        return esHombre;
    }
    
    public static class PersonaBuilder{
        
        private String nombre;
        private String apellidos;
        private String email;
        private boolean esHombre;
        
        public PersonaBuilder setNombre(String nombre){
            this.nombre = nombre;
            return this;
        }
        
        public PersonaBuilder setApellidos(String apellidos){
            this.apellidos = apellidos;
            return this;
        }
        
        public PersonaBuilder setEmail(String email){
            this.email = email;
            return this;
        }
        
        public PersonaBuilder hombre(){
            this.esHombre = true;
            return this;
        }
        
        public Persona build(){
            return new Persona(nombre, apellidos, email, esHombre);
        }
        
    }
}

package com.example.aprendo.aprendo.enum1;

public enum FormatoTexto {
    
    MAYUSCULAS{
        @Override
        public String aplicarFormato(String texto){
            return texto.toUpperCase();
        }
    },
    MINUSCULAS{
        @Override
        public String aplicarFormato(String texto){
            return texto.toLowerCase();
        }
    },
    INVERTIDO{
        @Override
        public String aplicarFormato(String texto){
            return new StringBuilder(texto).reverse().toString();
        }
    };
    
    public abstract String aplicarFormato(String texto);
    
}

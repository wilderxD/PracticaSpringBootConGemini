package com.example.aprendo.aprendo.enum1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum ValidadorCampo {
    
    REQUERIDO{
        @Override
        public boolean esValido(String texto){
            return texto != null ? true : false;
        }
    },
    EMAIL{
        @Override
        public boolean esValido(String texto){
            Pattern p = Pattern.compile("@");
            Matcher m = p.matcher(texto);
            
            if(m.find()){
                return true;
            }
            return false;
        }
    },
    SOLO_NUMEROS{
        @Override
        public boolean esValido(String texto){
            return texto.matches("[0-9]+");
        }
    };
    
    public abstract boolean esValido(String texto);
    
}

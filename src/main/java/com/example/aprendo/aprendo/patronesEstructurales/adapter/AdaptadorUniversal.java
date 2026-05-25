package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class AdaptadorUniversal implements ISistemaViejo, ISistemaNuevo{
    
    private MotorXML xml;
    private MotorJSON json;

    public AdaptadorUniversal(MotorXML xml, MotorJSON json) {
        this.xml = xml;
        this.json = json;
    }

    @Override
    public void procesarXML() {        
        json.procesarJSON();
    }

    @Override
    public void procesarJSON() {
        xml.procesarXML();
    }
    
}

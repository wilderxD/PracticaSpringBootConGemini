package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class XmlAJsonAdapter implements IAnalizadorJSON{

    private LectorXML xml;

    public XmlAJsonAdapter(LectorXML xml) {
        this.xml = xml;
    }
        
    @Override
    public String obtenerJSON() {
        return xml.devolverXML().replace("<usuario><nombre>Wilder</nombre></usuario>", "{usuario:{nombre : Wilder}}");
    }
    
    
}

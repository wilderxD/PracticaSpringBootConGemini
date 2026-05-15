package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class AdaptadorEuropeoAAmericano implements IEnchufeAmericano{
    
    private EnchufeEuropeo enchufeViejo;
    
    public AdaptadorEuropeoAAmericano(EnchufeEuropeo enchufeViejo){
        this.enchufeViejo = enchufeViejo;
    }

    @Override
    public void conectarPlano() {
        System.out.println("Adaptador: Recibiendo Conexion plana 110V.....");
        System.out.println("Adaptador: Tranformado a 220V y cambiando forma....");
        
        enchufeViejo.conectarRedondo(220);
    }
    
}

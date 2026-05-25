package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class ReproductorVLC {
    public void reproducirVideo(String formato, String archivo){
        if(formato.equals("mp4") || formato.equals("avi")){
            System.out.println("Repoduciendo archivo " + formato);
            return;
        }
        
        System.out.println("Foramto no soportado.!");
    }
}

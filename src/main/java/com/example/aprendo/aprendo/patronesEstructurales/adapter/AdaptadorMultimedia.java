package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class AdaptadorMultimedia implements IReproductorAudio{
    
    private ReproductorVLC vlc;

    public AdaptadorMultimedia(ReproductorVLC vlc) {
        this.vlc = vlc;
    }

    @Override
    public void reproducir(String tipoAudio, String nombreArchivo) {
        if(tipoAudio.equals("mp3")){
            System.out.println("Reproduciendo " + tipoAudio);
        }else{
            vlc.reproducirVideo(tipoAudio, nombreArchivo);
        }
    }    
}

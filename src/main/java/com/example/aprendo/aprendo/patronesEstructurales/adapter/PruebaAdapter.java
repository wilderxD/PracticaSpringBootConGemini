package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class PruebaAdapter {
    
    public static void main(String[] args) {
        
        EnchufeEuropeo viejo = new EnchufeEuropeo();
        IEnchufeAmericano miCargador = new AdaptadorEuropeoAAmericano(viejo);
        
        miCargador.conectarPlano();
        
        //1
        SistemaCobroLegacy viejo1 = new SistemaCobroLegacy();
        IPagoModerno miCambio = new PagoAdapter(viejo1);
        miCambio.pagar(50);
        
        //2
        MotorCombustion mCombustion = new MotorCombustion();
        IMotorElectrico motor = new MotorAdapter(mCombustion);
        motor.encender();
        motor.aumnetarVelocidad();
        
        //3
        LectorXML xml = new LectorXML();
        IAnalizadorJSON json = new XmlAJsonAdapter(xml);
        System.out.println(json.obtenerJSON());
        
        //4
        EnvioAntiguo eAntiguo = new EnvioAntiguo();
        IEnvioModerno eModerno = new EnvioAdapter(eAntiguo);
        eModerno.despacharPaquete("las moras130, Intependencia, 15232");
        
        //5
        ReproductorVLC vlc = new ReproductorVLC();
        IReproductorAudio rAudio = new AdaptadorMultimedia(vlc);
        rAudio.reproducir("mp4", "nuevo");
        
        //6
        BaseDeDatosAntigua bdAntigua = new BaseDeDatosAntigua();
        IRepositorioUsuarios usuarios = new UsuariosAdapter(bdAntigua);
        for(String u : usuarios.listarUsuarios()){
            System.out.println(u);
        }
        
        //7
        IImpresoraModerna moderna = new ImpresoraClassAdapter();
        moderna.imprimir();
        
        //9
        UsuarioDB usuarioDB = new UsuarioDB("Wilder", "Pato Gonzalo", 1993);
        IUsuarioWeb usuarioWeb = new UsuarioWebAdapter(usuarioDB);
        System.out.println(usuarioWeb.getNombreCompleto());
        System.out.println(usuarioWeb.getEdad());
        
        //10
        
        
    }
    
}

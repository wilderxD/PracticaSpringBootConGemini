package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class ComputadoraBuilder {
    
    //Instanciamos un item vacio por dentro
    private Computadora pc = new Computadora();
    
    //Creamos los metodos  para cada pieza.
    //LA REGLA DE ORO: Todo metodo debe devolever 'this' (La misma ensanbladora)
    
    public ComputadoraBuilder setCpu(String cpu){
        this.pc.setCpu(cpu);
        return this;
    }
    
    public ComputadoraBuilder setRam(int ram){
        this.pc.setRam(ram);
        return this;
    }
    
    public ComputadoraBuilder agregamosGrafica(String grafica){
        this.pc.setTarjetaGrafica(grafica);
        return this;
    }
    
    public ComputadoraBuilder conBluetooth(){
        this.pc.setTieneBluetooth(true);
        return this;
    }
    
    //El metodo final que entrega el producto terminado
    public Computadora build(){
        //Aqui podriamos validar. Ejemplo: si noy hay CPU lanzar error
        if(this.pc.getCpu() == null){
            throw new RuntimeException("!Una PC nesecita CPU");
        }
        return this.pc;
    }
    
}

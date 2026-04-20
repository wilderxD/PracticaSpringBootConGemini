package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;


public class PizzaBuilder {
    
    private Pizza pizza = new Pizza();
    
    public PizzaBuilder setTipoMaza(String tipoMaza){
        this.pizza.setTipoMaza(tipoMaza);
        return this;        
    }
    
    public PizzaBuilder setSalsa(String salsa){
        this.pizza.setSalsa(salsa);
        return this;
    }
    
    public PizzaBuilder conQueso(){
        this.pizza.setTieneQueso(true);
        return this;
    }
    
    public PizzaBuilder conPeperoni(){
        this.pizza.setTienePeperoni(true);
        return this;
    }
    
    public PizzaBuilder conRelleno(){
        this.pizza.setBordeRelleno(true);
        return this;
    }
    
    public Pizza build(){
        if(pizza.getTipoMaza() == null){
            throw new RuntimeException("La preparacion nesecita tener maza.!!");
        }
        
        return this.pizza;
    }
    
}

package com.example.aprendo.aprendo.patronesDeDiseño.creacionales.builder;

public class SqlBuilder {
    
    private StringBuilder query = new StringBuilder();
    
    public SqlBuilder select(String campos){
        this.query.append("SELECT ").append(campos).append(" ");
        return this;
    }
    
    public SqlBuilder from(String tabla){
        this.query.append("FROM ").append(tabla).append(" ");
        return this;
    } 
    
    public SqlBuilder where(String condicion){
        this.query.append("WHERE ").append(condicion);
        return this;
    }
    
    public Sql build(){
        return new Sql(this.query.toString());        
    }
}


package com.example.aprendo.aprendo.patronesEstructurales.adapter;

public class PagoAdapter implements IPagoModerno{

    private SistemaCobroLegacy cobroLegacy;
    
    public PagoAdapter(SistemaCobroLegacy cobroLegacy){
        this.cobroLegacy = cobroLegacy;
    }
    
    @Override
    public void pagar(double dolares) {
        System.out.println("Procesando el pago...");
        
        int nuevoPago = (int)(dolares * 100);
        
        cobroLegacy.realizarCobroAntiguo(nuevoPago);
    }
    
}

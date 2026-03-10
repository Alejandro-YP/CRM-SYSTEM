package src.crm.modelo;

import java.util.List;

public class GenerarReporte {
    private int numeroOportunidades;
    private double montoTotal;
    
    // Constructor
    public GenerarReporte() {
        this.numeroOportunidades = 0;
        this.montoTotal = 0.0;
    }
    
    // Getter y Setter
    public int getNumeroOportunidades() {
        return numeroOportunidades;
    }
    
    public void setNumeroOportunidades(int numeroOportunidades) {
        this.numeroOportunidades = numeroOportunidades;
    }
    
    public double getMontoTotal() {
        return montoTotal;
    }
    
    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }
    
    

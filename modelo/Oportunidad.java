package src.crm.modelo;

import java.time.LocalDateTime;

public class Oportunidad {
    private int id;
    private double montoEstimado;
    private LocalDateTime fechaCreacion;
    private String estado;
    private Cliente cliente;

    public Oportunidad(int id, double montoEstimado, LocalDateTime fechaCreacion, String estado) {
        this.id = id;
        this.montoEstimado = montoEstimado;
        this.fechaCreacion = fechaCreacion;
        this.estado = estado;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getMontoEstimado() {
        return montoEstimado;
    }

    public void setMontoEstimado(double montoEstimado) {
        this.montoEstimado = montoEstimado;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void cambiarEstado(){
        System.out.println("Cambiar estado de la oportunidad");
        if(estado.equals("Pendiente")){
            estado = "En Proceso";
        }else if (estado.equals("En Proceso")){
            estado = "Cerrado";
        }else {
            estado = "Pendiente";
        }
        System.out.println("Nuevo Estado: " + estado);
    }

    public void mostrarOportunidad() {
        System.out.println("=== Oportunidad ===");
        System.out.println("ID: " + id);
        System.out.println("Monto Estimado: $" + montoEstimado);
        System.out.println("Fecha de Creación: " + fechaCreacion);
        System.out.println("Estado: " + estado);
        if (cliente != null) {
            System.out.println("Cliente: " + cliente.getNombreEmpresa());
        }
        System.out.println("==================");
    }



    public Cliente getCliente() {
        return cliente;
    }



    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}

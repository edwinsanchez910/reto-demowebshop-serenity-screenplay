package com.example.retos.models;

public class DatosPago {

    private final String tipoTarjeta;
    private final String nombreTitular;
    private final String numeroTarjeta;
    private final String mesExpiracion;
    private final String anioExpiracion;
    private final String codigo;

    private DatosPago(String tipoTarjeta, String nombreTitular, String numeroTarjeta,
                      String mesExpiracion, String anioExpiracion, String codigo) {
        this.tipoTarjeta = tipoTarjeta;
        this.nombreTitular = nombreTitular;
        this.numeroTarjeta = numeroTarjeta;
        this.mesExpiracion = mesExpiracion;
        this.anioExpiracion = anioExpiracion;
        this.codigo = codigo;
    }

    public static DatosPago tarjetaVisa() {
        return new DatosPago("Visa", "Barbara Gordon", "4485564059489345", "04", "2039", "123");
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getMesExpiracion() {
        return mesExpiracion;
    }

    public String getAnioExpiracion() {
        return anioExpiracion;
    }

    public String getCodigo() {
        return codigo;
    }
}

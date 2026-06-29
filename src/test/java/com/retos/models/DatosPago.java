package com.retos.models;

import java.time.YearMonth;

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

    public void validate() {
        if (nombreTitular == null || nombreTitular.trim().isEmpty()) {
            throw new IllegalArgumentException("Nombre del titular no puede estar vacío");
        }
        if (numeroTarjeta == null || !numeroTarjeta.matches("\\d{12,19}") || !luhnValid(numeroTarjeta)) {
            throw new IllegalArgumentException("Número de tarjeta inválido");
        }
        int month;
        int year;
        try {
            month = Integer.parseInt(mesExpiracion);
            year = Integer.parseInt(anioExpiracion);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Fecha de expiración inválida");
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Mes de expiración inválido");
        }
        YearMonth expiry = YearMonth.of(year, month);
        if (expiry.isBefore(YearMonth.now())) {
            throw new IllegalArgumentException("La tarjeta está expirada");
        }
        if (codigo == null || !codigo.matches("\\d{3,4}")) {
            throw new IllegalArgumentException("Código de seguridad (CVV) inválido");
        }
    }

    private boolean luhnValid(String number) {
        int sum = 0;
        boolean alternate = false;
        for (int i = number.length() - 1; i >= 0; i--) {
            int n = Integer.parseInt(number.substring(i, i + 1));
            if (alternate) {
                n *= 2;
                if (n > 9) {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }
}

package logic;

import models.ExchangeResponse;
import java.util.Map;

public class Conversor {
    private final ExchangeResponse datos;

    public Conversor(ExchangeResponse datos) {
        this.datos = datos;
    }

    public double convertir(String monedaDestino, double monto) {
        Map<String, Double> tasas = datos.getConversion_rates();
        Double tasa = tasas.get(monedaDestino);

        if (tasa != null) {
            return monto * tasa;
        } else {
            System.out.println("Moneda no encontrada.");
            return 0;
        }
    }

    public double obtenerTasa(String codigoMoneda) {
        return datos.getConversion_rates().getOrDefault(codigoMoneda, 0.0);
    }
}

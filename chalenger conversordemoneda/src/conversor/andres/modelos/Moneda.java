package conversor.andres.modelos;

import java.util.Map;

public class Moneda {

    private String base_code;
    private Map<String, Double> conversion_rates;

    public String getBaseCode() {
        return base_code;
    }

    public Double getConversionRate(String targetCode) {
        return conversion_rates.get(targetCode);
    }



}

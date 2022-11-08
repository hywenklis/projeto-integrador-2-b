package utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Formatacao {
    public static String getDinheiroFormatado(Integer dinheiro) {
        BigDecimal centavos = BigDecimal.TEN.pow(2);
        BigDecimal valor = BigDecimal.valueOf(dinheiro).divide(centavos);
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return valorFormatado.format(valor);
    }
    
public static String getDataFormatada(LocalDate data) {
    	
    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM");

        String hojeFormatado = data.format(formatter1);
        
        return hojeFormatado;
       
    }
}

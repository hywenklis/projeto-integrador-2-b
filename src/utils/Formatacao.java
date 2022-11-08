package utils;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatacao {

    public static String formatarEmReais(BigDecimal valor) {
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return valorFormatado.format(valor);
    }

}

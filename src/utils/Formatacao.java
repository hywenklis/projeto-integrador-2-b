package utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Formatacao {

    public static String formatarEmReais(BigDecimal valor) {
        final String unidadeMonetaria = "R$";
        final DecimalFormat formato = new DecimalFormat(unidadeMonetaria + " #,###,##0.00");
        return formato.format(valor);
    }
}

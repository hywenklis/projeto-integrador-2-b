package utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Formatacao {

    public static String formatarEmReais(BigDecimal valor) {
        final String unidadeMonetaria = "R$";
        final DecimalFormat formato = new DecimalFormat(unidadeMonetaria +  " #,###,##0.00");
        return formato.format(valor);
    }

//public static String getDataFormatada(LocalDate data) {
//
//    	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM");
//
//        String hojeFormatado = data.format(formatter1);
//
//        return hojeFormatado;
//
//    }

}

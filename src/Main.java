import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // TODO
    }

    private static String getDinheiroFormatado(Integer dinheiro){
        BigDecimal centavos = BigDecimal.TEN.pow(2);
        BigDecimal valor = BigDecimal.valueOf(dinheiro).divide(centavos);
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return valorFormatado.format(valor);
    }
}

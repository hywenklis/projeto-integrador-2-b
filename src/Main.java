import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("AARAO JOSE DA SILVA");
        pessoa.setCpf("###.845.4##-##");

        ServidorAtivo servidorAtivo = new ServidorAtivo();
        servidorAtivo.setCpf(pessoa.getCpf());
        servidorAtivo.setNome(pessoa.getNome());
        servidorAtivo.setOrgao(Orgao.PO);
        servidorAtivo.setTotalLiquido(getDinheiroFormatado(758865));
        servidorAtivo.setHorasExtras(getDinheiroFormatado(50000));
        
        System.out.println(pessoa);
        System.out.println(servidorAtivo);
    }

    private static String getDinheiroFormatado(Integer dinheiro) {
        BigDecimal centavos = BigDecimal.TEN.pow(2);
        BigDecimal valor = BigDecimal.valueOf(dinheiro).divide(centavos);
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return valorFormatado.format(valor);
    }
}

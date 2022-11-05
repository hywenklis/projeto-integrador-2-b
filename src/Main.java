import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("AARAO JOSE DA SILVA");
        pessoa.setCpf("###.845.4##-##");

        ServidorAtivo servidorAtivo = new ServidorAtivo();
        servidorAtivo.setCpf(pessoa.getCpf());
        servidorAtivo.setNome(pessoa.getNome());
        servidorAtivo.setOrgaoSigla(Orgao.PO);
        servidorAtivo.setNomeOrgaoCompleto(Orgao.PO.getDescricao());
        servidorAtivo.setTotalLiquido(getDinheiroFormatado(758865));
        servidorAtivo.setHorasExtras(getDinheiroFormatado(50000));
        servidorAtivo.setVinculo("ESTATUTÁRIO");
        servidorAtivo.setCargo("AGENTE DE POLICIA");
        servidorAtivo.setFuncao("ASSESSOR DE COMUNICACAO");
        servidorAtivo.setPeriodo(LocalDate.now());
        servidorAtivo.setRemuneracao(getDinheiroFormatado(877652));
        servidorAtivo.setComissao(getDinheiroFormatado(172017));
        servidorAtivo.setBeneficios(getDinheiroFormatado(000));
        servidorAtivo.setEventuais(getDinheiroFormatado(000));
        servidorAtivo.setJudiciais(getDinheiroFormatado(000));
        servidorAtivo.setTetoRedutor(getDinheiroFormatado(000));
        servidorAtivo.setIRRF(getDinheiroFormatado(167933));
        servidorAtivo.setContribPrev(getDinheiroFormatado(122871));

        System.out.println(servidorAtivo);
    }

    private static String getDinheiroFormatado(Integer dinheiro) {
        BigDecimal centavos = BigDecimal.TEN.pow(2);
        BigDecimal valor = BigDecimal.valueOf(dinheiro).divide(centavos);
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return valorFormatado.format(valor);
    }
}

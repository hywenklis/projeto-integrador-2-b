import enums.Orgao;
import model.Detalhes;
import model.Orcamento;
import model.Periodo;
import model.ServidorAtivo;
import model.ServidorInativo;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // TODO
    	List<ServidorAtivo> servidoresAtivos = new ArrayList<>();
    	List<ServidorInativo> servidoresInativos = new ArrayList<>();
    	
    	ServidorAtivo servidorAtivo = new ServidorAtivo();
    	ServidorInativo servidorInativo = new ServidorInativo();
    	Detalhes detalhes = new Detalhes();
    	Periodo periodo1 = new Periodo();
    	Periodo periodo2 = new Periodo();
    	Periodo periodo3 = new Periodo();
    	Orcamento orcamento1 = new Orcamento();
    	Orcamento orcamento2 = new Orcamento();
    	Orcamento orcamento3 = new Orcamento();
    	
    	orcamento1.setRemuneracao(getDinheiroFormatado(877652));
    	orcamento1.setComissao(getDinheiroFormatado(172017));
    	orcamento1.setBeneficios(getDinheiroFormatado(000));
    	orcamento1.setEventuais(getDinheiroFormatado(000));
    	orcamento1.setHorasExtras(getDinheiroFormatado(000));
    	orcamento1.setJudiciais(getDinheiroFormatado(000));
    	orcamento1.setTetoRedutor(getDinheiroFormatado(000));
    	orcamento1.setIRRF(getDinheiroFormatado(167933));
    	orcamento1.setContribPrev(getDinheiroFormatado(122871));
    	orcamento1.setTotalLiquido(getDinheiroFormatado(758865));
    	
    	orcamento2.setRemuneracao(getDinheiroFormatado(877652));
    	orcamento2.setComissao(getDinheiroFormatado(172017));
    	orcamento2.setBeneficios(getDinheiroFormatado(000));
    	orcamento2.setEventuais(getDinheiroFormatado(000));
    	orcamento2.setHorasExtras(getDinheiroFormatado(000));
    	orcamento2.setJudiciais(getDinheiroFormatado(000));
    	orcamento2.setTetoRedutor(getDinheiroFormatado(000));
    	orcamento2.setIRRF(getDinheiroFormatado(167933));
    	orcamento2.setContribPrev(getDinheiroFormatado(122871));
    	orcamento2.setTotalLiquido(getDinheiroFormatado(758865));
    	
    	orcamento3.setRemuneracao(getDinheiroFormatado(877652));
    	orcamento3.setComissao(getDinheiroFormatado(172017));
    	orcamento3.setBeneficios(getDinheiroFormatado(000));
    	orcamento3.setEventuais(getDinheiroFormatado(000));
    	orcamento3.setHorasExtras(getDinheiroFormatado(000));
    	orcamento3.setJudiciais(getDinheiroFormatado(000));
    	orcamento3.setTetoRedutor(getDinheiroFormatado(000));
    	orcamento3.setIRRF(getDinheiroFormatado(167933));
    	orcamento3.setContribPrev(getDinheiroFormatado(122871));
    	orcamento3.setTotalLiquido(getDinheiroFormatado(758865));

    	periodo1.setOrcamento(orcamento1);
    	periodo1.setPeriodo(LocalDate.now());
    	
    	periodo2.setOrcamento(orcamento2);
    	periodo2.setPeriodo(LocalDate.now());
    	
    	periodo3.setOrcamento(orcamento3);
    	periodo3.setPeriodo(LocalDate.now());
    	
    	detalhes.setPeriodos(List.of(periodo1, periodo2, periodo3));
    	detalhes.setVinculo("ESTATUTÁRIO");
    	
    	servidorAtivo.setNome("AARAO JOSE DA SILVA");
    	servidorAtivo.setCpf("###.845.4##-##");
    	servidorAtivo.setCargo("AGENTE DE POLICIA");
    	servidorAtivo.setFuncao("ASSESSOR DE COMUNICACAO");
    	servidorAtivo.setOrgaoSigla(Orgao.PO);
    	servidorAtivo.setNomeOrgaoCompleto(Orgao.PO.getDescricao());
    	servidorAtivo.setDetalhes(detalhes);
    	servidoresAtivos.add(servidorAtivo);

		System.out.print("===========SERVIDORES ATIVOS===========");
    	servidoresAtivos.forEach(System.out::println);
    }

    private static String getDinheiroFormatado(Integer dinheiro){
        BigDecimal centavos = BigDecimal.TEN.pow(2);
        BigDecimal valor = BigDecimal.valueOf(dinheiro).divide(centavos);
        NumberFormat valorFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return valorFormatado.format(valor);
    }
}

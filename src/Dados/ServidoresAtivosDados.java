package Dados;

import enums.Orgao;
import model.Detalhes;
import model.Orcamento;
import model.Periodo;
import model.ServidorAtivo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigDecimal.valueOf;

public class ServidoresAtivosDados {
    public static void dadosServidoresAtivos() {
        List<ServidorAtivo> servidoresAtivos = new ArrayList<>();

        ServidorAtivo servidorAtivo = new ServidorAtivo();
        Detalhes detalhes = new Detalhes();
        Periodo periodo1 = new Periodo();
        Periodo periodo2 = new Periodo();
        Periodo periodo3 = new Periodo();
        Orcamento orcamento1 = new Orcamento();
        Orcamento orcamento2 = new Orcamento();
        Orcamento orcamento3 = new Orcamento();

        orcamento1.setRemuneracao(valueOf(8776.52));
        orcamento1.setComissao(valueOf(1720.17));
        orcamento1.setBeneficios(valueOf(0));
        orcamento1.setEventuais(valueOf(0));
        orcamento1.setHorasExtras(valueOf(0));
        orcamento1.setJudiciais(valueOf(0));
        orcamento1.setTetoRedutor(valueOf(0));
        orcamento1.setIRRF(valueOf(1679.33));
        orcamento1.setContribPrev(valueOf(1228.71));
        orcamento1.setTotalLiquido(valueOf(7588.65));

        orcamento2.setRemuneracao(valueOf(8776.52));
        orcamento2.setComissao(valueOf(1720.17));
        orcamento2.setBeneficios(valueOf(0));
        orcamento2.setEventuais(valueOf(0));
        orcamento2.setHorasExtras(valueOf(0));
        orcamento2.setJudiciais(valueOf(0));
        orcamento2.setTetoRedutor(valueOf(0));
        orcamento2.setIRRF(valueOf(1679.33));
        orcamento2.setContribPrev(valueOf(1228.71));
        orcamento2.setTotalLiquido(valueOf(7588.65));

        orcamento3.setRemuneracao(valueOf(8776.52));
        orcamento3.setComissao(valueOf(1720.17));
        orcamento3.setBeneficios(valueOf(0));
        orcamento3.setEventuais(valueOf(0));
        orcamento3.setHorasExtras(valueOf(0));
        orcamento3.setJudiciais(valueOf(0));
        orcamento3.setTetoRedutor(valueOf(0));
        orcamento3.setIRRF(valueOf(1679.33));
        orcamento3.setContribPrev(valueOf(1228.71));
        orcamento3.setTotalLiquido(valueOf(7588.65));

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

        System.out.println("=======================================");
        System.out.println("===========SERVIDORES ATIVOS===========");
        System.out.println("=======================================");
        servidoresAtivos.forEach(System.out::println);
    }
}

package Dados;

import model.Detalhes;
import model.Orcamento;
import model.Periodo;
import model.ServidorInativo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static utils.Formatacao.getDinheiroFormatado;

public class ServidoresInativosDados {
    public static void dadosServidorInativos() {
        List<ServidorInativo> servidoresInativos = new ArrayList<>();

        ServidorInativo servidorInativo = new ServidorInativo();
        Detalhes detalhes = new Detalhes();
        Periodo periodo1 = new Periodo();
        Orcamento orcamento1 = new Orcamento();

        orcamento1.setProventos(getDinheiroFormatado(456));
        orcamento1.setEventuais(getDinheiroFormatado(456));
        orcamento1.setJudiciais(getDinheiroFormatado(456));
        orcamento1.setTetoRedutor(getDinheiroFormatado(456));
        orcamento1.setIRRF(getDinheiroFormatado(456));
        orcamento1.setContribPrev(getDinheiroFormatado(456));
        orcamento1.setTotalLiquido(getDinheiroFormatado(456));

        periodo1.setOrcamento(orcamento1);
        periodo1.setPeriodo(LocalDate.now());

        detalhes.setPeriodos(List.of(periodo1));
        detalhes.setVinculo("APOSENTADO");

        servidorInativo.setNome("ABDENIO DE FRANCA JUCA");
        servidorInativo.setCpf("###.521.8##-##");
        servidorInativo.setDetalhes(detalhes);
        servidoresInativos.add(servidorInativo);

        System.out.println("=======================================");
        System.out.println("===========SERVIDORES INATIVOS=========");
        System.out.println("=======================================");
        servidoresInativos.forEach(System.out::println);
    }
}

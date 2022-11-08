import utils.Formatacao;

import java.math.BigDecimal;

import static Dados.ServidoresAtivosDados.dadosServidoresAtivos;
import static Dados.ServidoresInativosDados.dadosServidorInativos;

public class Main {
    public static void main(String[] args) {
//        dadosServidoresAtivos();
//        dadosServidorInativos();
        System.out.println(Formatacao.formatarEmReais(BigDecimal.ZERO));
        System.out.println( Formatacao.formatarEmReais(BigDecimal.valueOf(200.99)));
        System.out.println( Formatacao.formatarEmReais(BigDecimal.valueOf(100)));

    }
}

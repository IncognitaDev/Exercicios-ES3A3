import modelo.ContaComum;
import modelo.Movimento;
import modelo.repositorio.FabricaConexao;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {
        ContaComum cc1 = new ContaComum();
        cc1.setNumeroConta(1111);
        cc1.setAberturaConta(LocalDate.now());
        cc1.setFechamentoConta(null);
        cc1.setSenhaConta(1212);
        cc1.setSituacaoConta(1);
        cc1.setSaldoConta(0f);

        Movimento m1 = new Movimento();
        m1.setTipoMovimento(1);
        m1.setDataHoraMovimento(LocalDateTime.now());
        m1.setValorMovimento(1000.0);

        m1.setContaMovimento(cc1);

        System.out.println(cc1.getSaldoConta());
        m1.efetivarMovimento();
        System.out.println(cc1.getSaldoConta());

        Movimento m2 = new Movimento();
        m2.setTipoMovimento(2);
        m2.setDataHoraMovimento(LocalDateTime.now());
        m2.setValorMovimento(250.0);

        m2.setContaMovimento(cc1);

        System.out.println(cc1.getSaldoConta());
        m2.efetivarMovimento();
        System.out.println(cc1.getSaldoConta());

        FabricaConexao f1 = new FabricaConexao();
        f1.fecharConexao();
    }
}

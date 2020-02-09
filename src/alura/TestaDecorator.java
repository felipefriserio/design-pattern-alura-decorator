package alura;

import alura.imposto.ICMS;
import alura.imposto.ISS;
import alura.imposto.Imposto;

public class TestaDecorator {
    public static void main(String[] args) {
        Imposto iss = new ISS(new ICMS());
        Orcamento orcamento = new Orcamento(500);

        double valor = iss.calcula(orcamento);
        System.out.println(valor);
    }
}

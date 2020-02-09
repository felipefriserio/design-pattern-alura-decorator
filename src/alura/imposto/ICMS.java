package alura.imposto;

import alura.Item;
import alura.Orcamento;

public class ICMS extends Imposto{

        public ICMS() {}
        public ICMS(Imposto outroImposto) {
            super(outroImposto);
        }

        public double calcula(Orcamento orcamento){
            return orcamento.getValor() * 0.01 + calculoDoOutroImposto(orcamento);
        }
}
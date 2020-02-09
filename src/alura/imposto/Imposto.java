package alura.imposto;


import alura.Orcamento;

public abstract class Imposto {

    protected final Imposto outroImposto;

    public Imposto() {
        this.outroImposto = null;
    }

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected double calculoDoOutroImposto(Orcamento orcamento) {
        // tratando o caso do proximo imposto nao existir!
        if(outroImposto == null) return 0;
        return outroImposto.calcula(orcamento);
    }

    public abstract double calcula(Orcamento orcamento);
}
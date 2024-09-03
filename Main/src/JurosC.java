public class JurosC {
    private double capital;
    private double taxaFixa;
    private int periodo;
    private double montante;

    public JurosC(double capital, double taxaFixa, int periodo) {
        this.capital = capital;
        this.taxaFixa = taxaFixa;
        this.periodo = periodo;
    }

    public double resolveJuros() {
        montante = capital * Math.pow(1 + taxaFixa, periodo);
        return montante;
    }
}
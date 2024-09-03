public class DesvioP {
    private double x1;
    private double x2;
    private double x3;
    private double mediaAri;
    private double desvioP;

    public DesvioP(double x1, double x2, double x3){
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
    }

    public double desvia(){
        mediaAri = (x1 + x2 + x3) / 3;
        desvioP = Math.sqrt(Math.pow(x1 - mediaAri, 2) + Math.pow(x2 - mediaAri, 2) + Math.pow(x3 - mediaAri, 2) / 3);

        return desvioP;
    }
}

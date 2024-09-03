public class Main{
    public static void main(String[] args){
        Equacao E = new Equacao(2,3,8,10);
        System.out.println("Resposta A: " +E.resolveEquacao());

        DesvioP DesvP = new DesvioP(9, 13, 34);
        System.out.println("Resposta B: O desvio padrão é " +DesvP.desvia());

        JurosC Juros = new JurosC(15000, 0.10, 3);
        System.out.println("Resposta C: O montante será igual a " +Math.floor(Juros.resolveJuros()));
    }
}
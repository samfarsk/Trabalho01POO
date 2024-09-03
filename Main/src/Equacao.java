public class Equacao {
    private int x;
    private int a;
    private int b;
    private int c;
    private int equac;

    public Equacao(int x, int a, int b, int c){
        this.x = x;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String resolveEquacao(){ //O que será retornado (string)
        equac = (a*x)^2 + (b*x) + c;
        return  "Com 'x' igual a "+x+
                ", 'a' igual a "+a+
                ", 'b' igual a "+b+
                " e 'c' igual a "+c+
                ", o resultado é " + equac;
    }
}

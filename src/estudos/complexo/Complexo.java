package estudos.complexo;

public class Complexo {
    double real;
    double imaginario;

    Complexo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complexo adiciona(Complexo c){
        double novoReal = this.real + c.real;
        double novoImaginario = this.imaginario + c.imaginario;
        Complexo ra = new Complexo(novoReal, novoImaginario);

        return ra;
    }

    public Complexo subtrai(Complexo c){
        double novoReal = this.real - c.real;
        double novoImaginario = this.imaginario - c.imaginario;
        Complexo rs = new Complexo(novoReal, novoImaginario);

        return rs;
    }

    public Complexo multiplica(Complexo c){
        double novoReal = (this.real * c.real) - (this.imaginario * c.imaginario);
        double novoImaginario = (this.real * c.imaginario) + (this.imaginario * c.real);

        return new Complexo(novoReal, novoImaginario);
    }

    public Complexo divide(Complexo c){
        double divisor = (c.real * c.real) + (c.imaginario * c.imaginario);
        double novoReal = (this.real * c.real + this.imaginario * c.imaginario) / divisor;
        double novoImaginario = (this.imaginario * c.real - this.real * c.imaginario) / divisor;
        return new Complexo(novoReal, novoImaginario);
    }

    public String converteParaString(){
        return String.format("%.2f + %.2fi", this.real, this.imaginario);
    }
}

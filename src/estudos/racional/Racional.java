package estudos.racional;

public class Racional {
    int numerador;
    int denominador;

    public Racional(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;

        simplificar();
    }

    public Racional adiciona(Racional r){
        int numerador = this.denominador * r.numerador + this.numerador * r.denominador;
        int denominador = this.denominador * r.denominador;
        Racional somado = new Racional(numerador, denominador);

        return somado;
    }

    private int mdc(int num, int den) {
        while (den != 0) {
            int temp = den;
            den = num % den;
            num = temp;
        }
        return num;
    }

    private void simplificar(){
        int simplified = mdc(this.numerador < 0 ? -this.numerador : this.numerador, this.denominador < 0 ? -this.denominador : this.denominador);
        this.numerador = numerador/simplified;
        this.denominador = denominador/simplified;
        
        if (denominador < 0) {
            this.numerador = -numerador;
            this.denominador = -denominador;
        }
    }

    public String converteParaString(){

        if (numerador < 0 && denominador < 0 ){
            numerador = numerador * (-1);
            denominador = denominador * (-1);
        }

        if (denominador < 0 && numerador > 0){
            denominador = denominador * (-1);
            numerador = numerador * (-1);
        }

        return String.format("%d/%d", numerador, denominador);
    }
}
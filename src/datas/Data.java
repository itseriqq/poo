package datas;

public class Data {
    int dia;
    int mes;
    int ano;

    int[] meses31 = new int[]{1, 3, 5, 7, 8, 10, 12};

    Data(int dia, int mes, int ano) {

        if(dia < 1 || dia > 31){
            throw new IllegalArgumentException("Dia inválido");
        }

        if(mes < 1 || mes > 12){
            throw new IllegalArgumentException("Mês inválido");
        }

        validaAno(ano);

        if(dia == 31 && !testaMes31(mes)){
            throw new IllegalArgumentException("Dia inválido para mes que nao tem 31 dias");
        }

        // fazer: Validar fevereiro 

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    void validaAno(int ano){
        if(ano < 0 || ano > 2999){
            throw new IllegalArgumentException("Ano inválido");
        }
    }

    boolean testaMes31(int mes){
        for(int m : meses31){
            if(m == mes){
                return true;
            }
        }
        return false;
    }

    boolean bissexto(int ano){
        validaAno(ano);
        if(ano % 4 != 0){
            return false;
        } else if(ano % 100 != 0){
            return true;
        } else {
            return false;
        }
    }
}

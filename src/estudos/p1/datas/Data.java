package estudos.p1.datas;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    final int MES_COM_31_DIAS[] = { 1, 3, 5, 7, 8, 10, 12 };

    final String[] meses = {
        "",
        "Janeiro",
        "Fevereiro",
        "Marco",
        "Abril",
        "Maio",
        "Junho",
        "Julho",
        "Agosto",
        "Setembro",
        "Outubro",
        "Novembro",
        "Dezembro"
    };

    public Data(int dia, int mes, int ano) {
        if (dia > 31 || dia < 1) {
            throw new IllegalArgumentException("Dia invalido.");
        }

        if (mes > 12 || mes < 1) {
            throw new IllegalArgumentException("Mes invalido.");
        }

        validaAno(ano);

        if (dia == 31 && !valida31Dias(mes)) {
            throw new IllegalArgumentException(
                String.format("%s nao tem 31 dias", meses[mes]));
        }

        if (dia == 29 && mes == 2 && !bissexto(ano)) {
            throw new IllegalArgumentException("Fevereiro pode ter 29 dias apenas nos anos bissextos");
        }
        
        if(dia > 29 && mes == 2){
            throw new IllegalArgumentException(String.format("Fevereiro nao pode ter %d dias", dia));
        }

        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private boolean valida31Dias(int mes){
        for (var m : MES_COM_31_DIAS){
            if (m == mes){
                return true;
            }
        }
        return false;
    }

    private void validaAno(int ano){
        if(ano < 1 || ano > 2999){
            throw new IllegalArgumentException("Ano invalido");
        }
    }

    public boolean bissexto(int ano) {
        validaAno(ano);
        if (ano % 4 != 0) {
            return false;
        }
        if (ano % 100 != 0) {
            return true;
        }
        return ano % 400 == 0;
    }

    public boolean anterior(Data d){
        if(this.ano < d.ano){
            return true;
        }   
        
        if(this.ano == d.ano && this.mes < d.mes){
            return true;
        }

        if(this.ano == d.ano && this.mes == d.mes && this.dia < d.dia){
            return true;
        }

        return false;
    }

    
    public boolean posterior(Data d){
        if(this.ano > d.ano){
            return true;
        }   
        
        if(this.ano == d.ano && this.mes > d.mes){
            return true;
        }

        if(this.ano == d.ano && this.mes == d.mes && this.dia > d.dia){
            return true;
        }
        
        return false;
    }

    public String toString(){
        String nomeMes = meses[mes];
        return String.format("%d de %s de %d", dia, nomeMes, ano);
    }

}
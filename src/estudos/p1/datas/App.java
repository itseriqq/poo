package estudos.p1.datas;

public class App{
    public static void main(String[] args){
        Data data1 = new Data(29, 2, 2024);
        Data data2 = new Data(30, 10, 2024);
        System.out.println(data1.toString());
        System.out.println(data2.toString());

        System.out.println(String.format("A data 2 é anterior a data 1? A resposta eh %s", data2.anterior(data1)));
        System.out.println(String.format("A data 2 é posterior a data 1? A resposta eh %s", data2.posterior(data1)));
        System.out.println(String.format("A data 1 é anterior a data 2? A resposta eh %s", data1.anterior(data2)));
        System.out.println(String.format("A data 1 é posterior a data 2? A resposta eh %s", data1.posterior(data2)));

    }
}
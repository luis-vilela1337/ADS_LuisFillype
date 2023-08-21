import java.util.ArrayList;
import java.util.Collection;

public class SobreCollection_2 {
    public static void main(String[] args) {
        //1
        Collection<String> engenhariasAtuais =  new ArrayList<String>();

        engenhariasAtuais.add("Teleco");
        engenhariasAtuais.add("Bio");
        engenhariasAtuais.add("Comp");
        engenhariasAtuais.add("Software");
        engenhariasAtuais.add("Producao");

        System.out.println("Eng atuais"+ engenhariasAtuais);
//2
        Collection<String> engenhariasFuturas = new ArrayList<String>();
        engenhariasFuturas.add("Mecanica");
        engenhariasAtuais.add("mecatronica");

        System.out.println("eng futuras" + engenhariasFuturas);

        //3
        Collection<String> todas = new ArrayList<String>();

        todas.addAll(engenhariasAtuais);
        todas.addAll(engenhariasFuturas);


        System.out.println("");
        System.out.println(">> IsEmpty e size()");

        Collection<String>engenharias  = new ArrayList<>(todas);

        System.out.println("Engenharias vazias "+ engenharias.isEmpty());
        System.out.println("Quantidade de elementos "+ engenharias.size());

        if(engenharias.isEmpty())
            System.out.println("vazio");
        else
            System.out.println("tem coisa");

        if(engenharias.size() == 0)
            System.out.println("vazio");
        else
            System.out.println("tem coisa");


    }

}

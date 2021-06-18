import java.util.Random;

public class ExemploVetores 
{

    public static void main(String[] args) {

        
        int teste[] = new int[5];

        Random gerador = new Random();
        /*
        teste[4] = 8;
        teste[3] = 6;
        teste[2] = 4;
        teste[1] = 2;
        teste[0] = 1;
        */

        for (int i=0; i<1000; i++){
            teste[i] = gerador.nextInt(30);
        }

        for (int i=0; i<1000; i++){
            System.out.println(teste[i]);
        }
        /*
        System.out.println(teste[0]);
        System.out.println(teste[1]);
        System.out.println(teste[2]);
        System.out.println(teste[3]);
        System.out.println(teste[4]);
        */
    }
    
}

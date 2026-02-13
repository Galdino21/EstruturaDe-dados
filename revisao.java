Packet Exemplo
import java.util.Random

public class ExemploArray {
    public static void main(String [] args) {

        int[] lista;
        lista=new int [10];
        inserir(lista);
        exibir(lista);
    }

     public static void inserir(int [] v) {
        Random rd=new Random();
        for(int i=0; i<v.length; i++) {
            v[i]=rd.nextInt(101);
        }
     }

     public static void exibir(int [] a) {
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }
     }
 }
 
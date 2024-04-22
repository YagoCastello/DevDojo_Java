package academy.devdojo.maratonaJava.introducao;

public class Aula07Arrays3DevDojo {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,5,8};
        int[] numeros3 = new int[]{898,56,32,41,58,12,3};


        for (int i =0; i < numeros3.length;i++){
            System.out.println(numeros3[i]);
        }

        for (int num:numeros3){
            System.out.println(num);
        }
    }
}

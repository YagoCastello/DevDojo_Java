package academy.devdojo.maratonaJava.introducao;

public class Aula08ArraysMultidimensionais02DevDojo {
    public static void main(String[] args) {

        int[] array = {1,2,3};

        int [] [] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1,2,3,4,5,6};

        int[][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,6,34,45}};

        for (int[] arrayBase : arrayInt){
            System.out.println("\n--------");
            for (int num : arrayBase) {
                System.out.println(num + " ");
            }
        }



        for (int[] arrayBase2 : arrayInt2){
            System.out.println("\n--------");
            for (int num2 : arrayBase2) {
                System.out.println(num2 + " ");
            }
        }
    }
}

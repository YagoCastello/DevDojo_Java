package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturasRepeticoes1DevDojo {
    public static void main(String[] args) {

        int count = 12;
        while (count<10){
            System.out.println(++count);
        }
        do {
            System.out.println("dentro do do-while");

        }while (count<10);
    }
}

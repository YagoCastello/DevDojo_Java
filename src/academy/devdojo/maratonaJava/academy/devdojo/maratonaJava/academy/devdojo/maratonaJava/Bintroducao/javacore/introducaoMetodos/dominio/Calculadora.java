package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Bintroducao.javacore.introducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoiNumeros(){
        System.out.println(21 -2);
    }

    public void multiplicaDoisNumeros(int num){
        
    }


    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
    public void somaArgs(int... numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }
        System.out.println(soma);


    }
}





package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionaisDevDojo {
    public static void main(String[] args) {
        int idade = 20;
        boolean isAutorizadoComprarBebida = idade >=18;
        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }




        int idades = 20;
        String categoria;

        if (idades<15){
            categoria ="Categoria Infantil";
        }else if (idades>=15 && idades<18){
            categoria="Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }


        String categoria2;
        categoria2 = idades < 15 ? "Categoria Infantil" : idades >= 15 && idades<18 ? "Categoria Juvenil" :"Categoria Adulto";
        System.out.println(categoria);
        System.out.println(categoria2);




    }
}

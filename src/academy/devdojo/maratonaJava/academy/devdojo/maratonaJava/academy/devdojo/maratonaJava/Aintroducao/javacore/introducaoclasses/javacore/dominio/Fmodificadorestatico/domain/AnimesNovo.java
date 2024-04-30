package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain;

public class AnimesNovo {


        private String nome;
        private static int[] episodios ;


    static{


        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i =0; i < episodios.length;i++){
            episodios[i] = i+1;
        }
    }
        public AnimesNovo(String nome) {
            this.nome = nome;
        }

        public AnimesNovo() {
            episodios = new int[100];
            for (int i = 0; i < episodios.length; i++) {
                episodios[i] = i +1;

            }
            for (int episodio: this.episodios){
                System.out.print(episodio+" ");
            }
        }
    }



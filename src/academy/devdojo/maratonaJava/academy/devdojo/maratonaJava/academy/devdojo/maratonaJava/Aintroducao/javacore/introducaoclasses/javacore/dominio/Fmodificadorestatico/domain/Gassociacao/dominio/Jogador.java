package academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.academy.devdojo.maratonaJava.Aintroducao.javacore.introducaoclasses.javacore.dominio.Fmodificadorestatico.domain.Gassociacao.dominio;

public class Jogador {
    private  String nome;
    private Time time;



    public void imprime(){
        System.out.println(this.nome);
        if (time!= null){
            System.out.println(time.getNome());
        }
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador(String nome){
        this.nome= nome;
    }

    public static class Aluno {
        private String nome;
        private int idade;

        public Aluno(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }

    public static class Seminario {
        private String titulo;

        public Seminario(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }
    }

    public static class Local {
        private String endereco;

        public Local(String endereco) {
            this.endereco = endereco;
        }

        public String getEndereco() {
            return endereco;
        }

        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
    }
}

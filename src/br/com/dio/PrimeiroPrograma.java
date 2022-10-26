package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Livros livros = new Livros();

        System.out.println(gato);
        System.out.println(livros);

        Livros livro1 = new Livros( "O problema dos 3 corpos",  300);


      /* int a =5;
        int b =3;
        System.out.println("Hello Wolrd! " + (a+b));*/
    }
}

class Livros {
    private String nome;
    private Integer numPaginas;

    public Livros(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public Livros() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}



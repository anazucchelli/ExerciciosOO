package Exercicio01;

public class Funcionario {
    private String nome;
    private int idade;
    private String cargo;

    //construtor
    public Funcionario(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }


    //metodos
    public void fazercv(){
        System.out.println("Meu nome é  "+ this.nome + " e estou fazendo meu CV para o cargo de "+cargo);
    }

    public void entregarcv(){
        System.out.println("Vou entregar meu CV");
    }



    //get e set

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}

package Exercicio02;


//        Um triangulo é uma figura geométrica de 3 lados. Para calcular a área de um triângulo,
//        basta multiplicar o valor do seu lado base com sua altura e dividir o resultado por 2.
//        Defina uma classe Triangulo, com os atributos base e altura e com um método que retorna o valor da sua área.
//        Crie também uma classe Exercicio02, com método "... main()", que vai instanciar
//        3 triangulos diferentes e exibir no console (com System.out.println()) o valor das respectivas áreas.
//        Importante: use o construtor da classe para definir o valor da base e altura do triângulo!
//
//


public class Triangulo {
    public double base;
    public double altura;

    //construtor
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //metodo
    public void valorArea(){
        double area = ((base * altura )/ 2);
        System.out.println("A área do triangulo é "+ area);
    }


    //get e set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

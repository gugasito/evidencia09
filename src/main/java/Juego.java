public class Juego {
    public static void main(String[] args) {
        jugar();
    }

    public static void jugar() {
        Dado dado = new Dado();
        Calculadora calculadora = new Calculadora(dado.tirarDado(),dado.tirarDado());
        if (calculadora.sumar()==7){
            System.out.println("Ganaste");
        }else {
            System.out.println("Perdiste");
        }
    }
}
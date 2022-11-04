import java.util.Scanner;

public class SmartTv {

    Scanner sc = new Scanner(System.in);

    private boolean ligada;

    private int canal;

    private int volume;

    public SmartTv() {

        this.ligada = true;
        this.canal = 1;
        this.volume = 50;

    }

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public void mudarCanal() {

        if (ligada == true) {

            int op;

            do {

                System.out.println(
                        "Aperte:\n 0 - para mudar 1 canal acima \n 1 - Para mudar 1 canal abaixo \n 2 - Para escolher o canal");

                op = sc.nextInt();

                if (op == 0) {

                    canal++;

                } else if (op == 1 && canal > 0) {

                    canal--;
                } else {

                    System.out.println("Digite o número do canal");
                    canal = sc.nextInt();
                }

            } while (op < 0 && op > 2);

        }
    }

    public void aumentarVolume() {
        if (ligada == true) {

            volume++;

            System.out.println("Volume alterado: " + volume);
        }

    }

    public void diminuirVolume() {
        if (ligada == true) {

            volume--;

            System.out.println("Volume alterado: " + volume);
        }

    }

    public void mutar() {
        if (ligada == true) {

            volume = 0;

            System.out.println("Volume mutado.");
        }

    }

    public void desmutar(int volume) {
        if (ligada == true) {

            this.volume = volume;

            System.out.println("Volume desmutado. Atualmente está em: " + volume);
        }

    }

    public void getCanal() {

        if (ligada == true) {

            System.out.println(this.canal);

        }

    }

}
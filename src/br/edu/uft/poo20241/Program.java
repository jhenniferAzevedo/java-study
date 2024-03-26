package br.edu.uft.poo20241;

public class Program {
    public static void main(String[] args) {
        SmartTV smart = new SmartTV();

        smart.ligarTV();
        System.out.println(smart.ligada == true ? "ligada" : "desligada");

        smart.aumentarVolume();
        smart.trocarCanal(8);

        System.out.println("TV Ligada? " + smart.ligada);
        System.out.println("Canal? " + smart.canal);
        System.out.println("Volume? " + smart.volume);

    }
}

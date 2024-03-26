package br.edu.uft.poo20241;

public class SmartTV {
    public boolean ligada;
    public int canal;
    public int volume;


    public void ligarTV() {
        ligada = true;
    }

    public void desligarTV() {
        ligada = false;
    }

    public void aumentarVolume() {
        volume++;
    }

    public void abaixarVolume(){
        volume--;
    }

    public void aumentarCanal(){
        canal++;
   }

   public void trocarCanal(int x) {
        canal = x;
   }
}

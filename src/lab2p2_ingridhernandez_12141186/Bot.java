/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_ingridhernandez_12141186;

/**
 *
 * @author ADMINISTRADOR1
 */
public class Bot {
    private int velo;
    private String carB;
    private String aspectos;
     private String audio;
      private String audiopostmortem;

    public Bot() {
    }

    public Bot(int velo, String carB, String aspectos, String audio, String audiopostmortem) {
        this.velo = velo;
        this.carB = carB;
        this.aspectos = aspectos;
        this.audio = audio;
        this.audiopostmortem = audiopostmortem;
    }

    public int getVelo() {
        return velo;
    }

    public void setVelo(int velo) {
        this.velo = velo;
    }

    public String getCarB() {
        return carB;
    }

    public void setCarB(String carB) {
        this.carB = carB;
    }

    public String getAspectos() {
        return aspectos;
    }

    public void setAspectos(String aspectos) {
        this.aspectos = aspectos;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getAudiopostmortem() {
        return audiopostmortem;
    }

    public void setAudiopostmortem(String audiopostmortem) {
        this.audiopostmortem = audiopostmortem;
    }

    @Override
    public String toString() {
        return "Bot[" + "velocidad =" + velo + ", caracteristica del Bot =" + carB + ", aspectos=" + aspectos + ", audio=" + audio + ", audio post mortem=" + audiopostmortem + ']';
    }
      
      
}

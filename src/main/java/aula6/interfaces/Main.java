package aula6InterfacesLambda;

public class Main {
    /*
    Interface define O QUE deve ser feito.
    Classe (ou classe anônima) define COMO será feito
     */

    public static void main(String[] args) {
        smartphone smartphone = new smartphone(); //smartphone implementa ambas as interfaces
        runMusic(smartphone);
        runVideo(smartphone);

    }

    public static void runVideo(VideoPlayer videoPlayer){
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer){
        musicPlayer.playMusic();
    }
}

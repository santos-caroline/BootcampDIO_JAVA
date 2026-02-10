package aula6.interfaces;

public record MusicBox(String music, boolean isPaused) implements MusicPlayer {
    @Override
    public void playMusic() {

    }

    @Override
    public void pauseMusic() {

    }

    @Override
    public void stopMusic() {

    }
}

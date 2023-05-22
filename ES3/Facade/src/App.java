public class App {
  public static void main(String[] args) throws Exception {
    SistemaAudioFacade audioSystem = new SistemaAudioFacade();

    audioSystem.playAudio("music.mp3");
    audioSystem.adjustVolume(50);

    // ... outros comandos utilizando a fachada ...

    audioSystem.stopAudio();
  }
}
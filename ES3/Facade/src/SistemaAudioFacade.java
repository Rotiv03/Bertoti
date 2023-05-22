// Classe Facade que simplifica a interação com o sistema de áudio
public class SistemaAudioFacade {
  private Player player;
  private Amplificador amplificador;
  private Codificador codificador;
  private Speakers speakers;

  public SistemaAudioFacade() {
    this.player = new Player();
    this.amplificador = new Amplificador();
    this.codificador = new Codificador();
    this.speakers = new Speakers();
  }

  public void playAudio(String fileName) {
    this.codificador.load(fileName);
    this.player.play();
    this.speakers.playSound();
  }

  public void stopAudio() {
    this.player.stop();
    this.codificador.reset();
  }

  public void adjustVolume(int volume) {
    this.amplificador.setVolume(volume);
  }
}

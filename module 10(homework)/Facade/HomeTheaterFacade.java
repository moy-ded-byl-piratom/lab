public class HomeTheaterFacade {
    private TV _TV;
    private AudioSystem _audioSystem;
    private GameConsole _gameConsole;
    private DVDPlayer _DVDPlayer;

    public HomeTheaterFacade(TV _TV, AudioSystem _audioSystem,GameConsole _gameConsole,DVDPlayer _DVDPlayer){
       this._TV = _TV;
       this._audioSystem = _audioSystem;
       this._gameConsole = _gameConsole;
       this._DVDPlayer = _DVDPlayer;
    }

    public void startMovie(){
        System.out.println("Preparing to start the movie...");
        _TV.TVOn();
        _TV.ChooseChannel(5);
        _audioSystem.AudioSystemOn();
        _audioSystem.VolumeControl(6);
        _DVDPlayer.DVDPlayerOn();
        _DVDPlayer.DVDPlayerPause();
        _gameConsole.GameConsoleOn();
        _gameConsole.GameConsoleStartGame("Diablo 4");
        System.out.println("Movie anf game started");
    }

    public void endMovie(){
        System.out.println("Shutting down movie...");
        _TV.TVOff();
        _audioSystem.AudioSystemOff();
        _DVDPlayer.DVDPlayerOff();
        _gameConsole.GameConsoleOff();
        System.out.println("Movie and game ended");
    }




}

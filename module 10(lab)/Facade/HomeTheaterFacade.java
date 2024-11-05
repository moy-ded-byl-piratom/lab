public class HomeTheaterFacade {
    private AudioSystem _audioSystem;
    private VideoProjector _videoProjector;
    private LightingSystem _lightingSystem;

    public HomeTheaterFacade(AudioSystem _audioSystem, VideoProjector _videoProjector, LightingSystem _lightingSystem){
        this._audioSystem = _audioSystem;
        this._videoProjector = _videoProjector;
        this._lightingSystem = _lightingSystem;
    }

    public void StartMove(){
        System.out.println("Preparing to start the movie...");
        _lightingSystem.TurnOn();
        _lightingSystem.SetBrightness(5);
        _audioSystem.TurnOn();
        _audioSystem.SetVolume(6);
        _videoProjector.TurnOn();
        _videoProjector.SetResolution("HD");
        System.out.println("Movie started.");

    }

    public void EndMovie()
    {
        System.out.println("Shutting down movie...");
        _videoProjector.TurnOff();
        _audioSystem.TurnOff();
        _lightingSystem.TurnOff();
        System.out.println("Movie ended.");
    }
}

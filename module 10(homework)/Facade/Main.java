public class Main {
    public static void main(String[] args){
        TV TV = new TV();
        AudioSystem audio = new AudioSystem();
        DVDPlayer DVD = new DVDPlayer();
        GameConsole dendi = new GameConsole();


        HomeTheaterFacade homeTheater = new HomeTheaterFacade(TV,audio,dendi,DVD);
        homeTheater.startMovie();
        homeTheater.endMovie();
    }
}

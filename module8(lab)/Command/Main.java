public class Main {
    public static void main(String[] args) {
        Light BathroomLight = new Light();
        Television tv = new Television();

        ICommand lightOn = new LightOnCommand(BathroomLight);
        ICommand lightOff = new LightOffCommand(BathroomLight);

        ICommand tvOn = new TelevisionOnCommand(tv);
        ICommand tvOff = new TelevisionOffCommand(tv);

        RemoteControl remote = new RemoteControl();


        remote.setCommands(lightOn, lightOff);
        remote.pressOnButton();
        remote.pressOffButton();
        remote.pressUndoButton();

        remote.setCommands(tvOn, tvOff);
        remote.pressOnButton();
        remote.pressOffButton();
        remote.pressUndoButton();
    }
}

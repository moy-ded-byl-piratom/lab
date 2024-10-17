public class Main {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl(3);

        Light livingRoomLight = new Light();
        Television livingRoomTV = new Television();

        LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
        TelevisionOnCommand tvOn = new TelevisionOnCommand(livingRoomTV);
        TelevisionOffCommand tvOff = new TelevisionOffCommand(livingRoomTV);

        remoteControl.setCommand(0, lightOn, lightOff);
        remoteControl.setCommand(1, tvOn, tvOff);

        remoteControl.pressOnButton(0);
        remoteControl.pressOnButton(1);

        remoteControl.undoButton();

        ICommand[] partyCommands = {lightOn, tvOn};
        MacroCommand partyMacro = new MacroCommand(partyCommands);

        partyMacro.Execute();

        partyMacro.Undo();
    }
}

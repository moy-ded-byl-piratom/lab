public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Door mainDoor = new Door();
        Thermostat thermostat = new Thermostat();

        ICommand lightOn = new LightOnCommand(livingRoomLight);
        ICommand lightOff = new LightOffCommand(livingRoomLight);
        ICommand doorOpen = new DoorOpenCommand(mainDoor);
        ICommand doorClose = new DoorCloseCommand(mainDoor);
        ICommand increaseTemp = new IncreaseTemperatureCommand(thermostat, 5);
        ICommand decreaseTemp = new DecreaseTemperatureCommand(thermostat, 4);

        CommandInvoker invoker = new CommandInvoker();

        invoker.executeCommand(lightOn);
        invoker.executeCommand(doorOpen);
        invoker.executeCommand(increaseTemp);

        invoker.undoLastCommand();
        invoker.undoLastCommand();
        invoker.undoLastCommand();
    }
}

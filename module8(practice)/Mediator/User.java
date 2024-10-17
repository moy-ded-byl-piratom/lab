public class User implements IUser {
private String name;
public IMediator mediator;
public User(String name, IMediator mediator){
    this.name=name;
    this.mediator=mediator;
}
public String getName(){
    return name;
}
    @Override
    public void sendMessage(String message) {
        System.out.println("User: "+name+" message: "+message);
        mediator.sendMessage(message,this);
    }

    @Override
    public void ReceiveMessage(String message, IUser sender) {
        System.out.println(" ReceiveMessage: "+message+ " from "+sender.getName());
    }

    @Override
    public void ReceiveSystemMessage(String message) {
        System.out.println(" SystemMessage: "+message+ " for "+name);
    }
}

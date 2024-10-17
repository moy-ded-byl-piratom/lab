public class User extends Colleague{
    private String _name;
    public User(IMediator mediator, String name) {
            super(mediator);
            this._name = name;
    }

    public void Send(String message){
        System.out.println(_name+" отправляет сообщение: " + message);
        _mediator.SendMessnge(message, this);
    }
    @Override
    public void PeceiveMassage(String message) {
        System.out.println(_name+" получил сообщение: " + message);
    }
}

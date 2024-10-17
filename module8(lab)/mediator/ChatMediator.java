import java.util.ArrayList;
public class ChatMediator implements IMediator{
    private ArrayList<Colleague> _colleagues;
    public ChatMediator(){
        _colleagues = new ArrayList<Colleague>();
    }
    public void RegisterColleague(Colleague colleague){
        _colleagues.add(colleague);
    }
    @Override
    public void SendMessnge(String message, Colleague sender) {
        for (var colleague :_colleagues){
            if(colleague !=sender){
                colleague.PeceiveMassage(message);
            }
        }

    }

}

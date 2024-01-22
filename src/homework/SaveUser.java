package homework;

public class SaveUser implements Saveable{

    private final User user;
    public SaveUser(User user){
        this.user = user;
    }
    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}

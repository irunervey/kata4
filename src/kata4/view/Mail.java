package kata4.view;
public class Mail {
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }
    
    public String getDomain(){
        return mail.split("@")[1];
    }
}

package Model;
public class modelMasuk {
    private String user, pass;
    public modelMasuk(){
        this.user = "admin";
        this.pass = "admin";
    }
    
    public String getUser(){
        return user;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setUser(String username){
        this.user = username;
    }
    
    public void setPass(String password){
        this.pass = password;
    }
}

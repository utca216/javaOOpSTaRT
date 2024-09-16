public class Computer {
    public String brand;
    public int RAM;
    public int HDD;
    public String password;
    public Computer(){
        brand="H/P";
        RAM=2;
        HDD=500;
        password="123";
    }
    public void displayInfo(){
        System.out.println("brand "+brand);
        System.out.println("RAM "+RAM);
        System.out.println("HDD "+HDD);
        System.out.println("Password "+password);
    }

    public void changePassword(String oldPass, String newPass){
    if(this.password.equals(oldPass))
        this.password=newPass;
    else
        System.out.println("wrong password!");
    }
}

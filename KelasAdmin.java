public class KelasAdmin extends User {
    private String username;
    private String password;

    public KelasAdmin(String name, String NIM,String username, String password) {
        super(name, NIM);
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }
    @Override
    public boolean login(String x, String y){
        return x.equals(this.username)&& y.equals(this.password);
    }
    @Override
    public void displayInfo() {
        System.out.println("Berhasil login sebagai: " +username);
    }


}

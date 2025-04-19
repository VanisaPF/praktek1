public class KelasMahasiswa extends User {
    public KelasMahasiswa(String name, String NIM){
        super(name, NIM);
    }

    @Override
    public boolean login(String x, String y){
        return getName().equals(x)&& getNIM().equals(y);
    }
    @Override
    public void displayInfo() {
        System.out.println("Mahasiswa berhasil login sebagai: " + getName());
        System.out.println("Dengan NIM: "+getNIM());
    }
}

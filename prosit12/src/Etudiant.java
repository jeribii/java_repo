public class Etudiant {
    private int id;
    private String nom;
    int age;
    public Etudiant() {
        super();
    }
    public Etudiant(int id,String nom, int age) {
        this.id = id;
        this.nom = nom;
        this;age=age;
    }
    public String Tostring() {
        return "{" +this.nom+""+ this.age+""+this.id+"}";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

import java.util.Objects;

public class Departement implements Comparable<Departement> {
    private int id;
    private String departement;
    private int employe;

    public Departement(){
        super();
    }

    public Departement(int id, String departement, int employee) {
        this.id = id;
        this.departement = departement;
        this.employe=employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmploye() {
        return employe;
    }

    public void setEmploye(int employe) {
        this.employe = employe;
    }
    public String getDepartement() {
        return departement;
    }
    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String toString(){
        return "Departement{ "+ id +","+departement+","+employe+" }" ;
    }
    public boolean equals(Object o){
        if(o==null)
            return false;
        if(!(o instanceof Departement)){
            return false;
        }
        Departement d=(Departement)o;
        if(this.id==d.id && this.departement.equals(d.departement))
            return true;

        return false;

    }
    public int hashCode(){
        return Objects.hash(id,departement);
    }
    public int compareTo(Departement d){
        return(this.id-d.id);
    }
}

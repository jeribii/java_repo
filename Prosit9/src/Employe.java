public class Employe implements Comparable<Employe> {
    int id;
    String nom;
    String prenom;
    String departement;
    int grade;
    public Employe(int id, String nom, String prenom, String departement, int grade) {
        this.id = id;
        this.nom=nom;
        this.prenom=prenom;
        this.departement=departement;
        this.grade=grade;
    }
    public Employe(){
        super();
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
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getDepartement() {
        return departement;
    }
    public void setDepartement(String departement) {
        this.departement = departement;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;

    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", grade=" + grade +
                '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Employe emp=(Employe)obj;
        return (this.id == emp.id &&
                this.departement.equals(emp.departement) &&
                this.grade == emp.grade &&
                this.nom.equals(emp.nom) &&
                this.prenom.equals(emp.prenom));
    }
    @Override
    public int compareTo(Employe o) {
        return (this.id-o.getId());
    }
}




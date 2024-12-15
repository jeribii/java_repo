import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement>{

    public Set<Departement> departements;
    public DepartementHashSet(){
        super();
        this.departements=new HashSet<>();
    }

    public void ajouterDepartement(Departement t){
        departements.add(t);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        Iterator<Departement> it=departements.iterator();
        while(it.hasNext()){
            Departement t=it.next();
            if(nom.equals(t.getEmploye())){
                return true;
            }
            else
                return false;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        Iterator<Departement> it=departements.iterator();
        while(it.hasNext()){
            Departement t=it.next();
            if(t.equals(departement)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        if(departements.contains(departement)) {
            departements.remove(departement);
        }
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it=departements.iterator();
        while(it.hasNext()){
            Departement t=it.next();
            System.out.println(t.toString());
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> dep = (TreeSet<Departement>) departements;
        return dep;
    }
}

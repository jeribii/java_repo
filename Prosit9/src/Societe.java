import java.util.*;

public class Societe implements IGestion<Employe>{
    

    public List<Employe> mylist=new ArrayList<>();
    public void ajouterEmploye(Employe t){
        mylist.add(t);
    }

    @Override
    public boolean rechercherEmploye(Employe employe) {
        Iterator<Employe> it=mylist.iterator();
        while(it.hasNext()){
            Employe emp=it.next();
            if(emp.equals(employe))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerEmploye(Employe employe) {
        mylist.remove(employe);
    }
    @Override
    public void displayEmploye() {
        Iterator<Employe> it=mylist.iterator();
        while(it.hasNext()){
            Employe emp=new Employe();
            emp=it.next();
            System.out.println(emp.toString());
        }
    }
    @Override
    public void trierEmployeParId() {
        Collections.sort(mylist);

    }
    Comparator<Employe> c= (Employe o1, Employe o2)->
         {
            if(o1.getDepartement().equals(o2.getDepartement())){
                return (o1.getId()-o2.getId());
            }
            else return o1.getDepartement().compareTo(o2.getDepartement());
        };
    @Override
    public void trierEmployerParNomDepartementEtGrade() {
        Collections.sort(mylist,c);

    }

    @Override
    public boolean recherhcerEmploye(String nom) {
        Iterator<Employe> it=mylist.iterator();
        while(it.hasNext()){
            Employe emp=it.next();
            if(emp.getNom().equals(nom)){
                return true;
            }
        }
        return false;
    }
}

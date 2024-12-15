import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StudentManagement implements Management{
    public void displayStudents(List<Etudiant> etudaint, Consumer<Etudiant> consumer){
        Iterator<Etudiant> it=etudaint.iterator();
        while(it.hasNext()){
            Etudiant et=it.next();
            consumer = (int a,int b,String c) -> System.out.println(a+b+c);
            consumer.accept(et.getAge(),et.getId(),et.getNom());
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> Etudiants, Predicate<Etudiant> pre, Consumer<Etudiant> con) {

    }

    @Override
    public String returnEtudiantsNames(List<Etudiant> Etudiants, Function<Etudiant, String> fun) {
        return "";
    }

    @Override
    public Etudiant createEtudiant(Supplier<Etudiant> sup) {
        return null;
    }

    @Override
    public List<Etudiant> sortEtudiantsById(List<Etudiant> Etudiants, Comparator<Etudiant> com) {
        return List.of();
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return Stream.empty();
    }

}

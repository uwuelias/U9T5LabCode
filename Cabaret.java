import java.util.ArrayList;

public class Cabaret {
    private String name;
    ArrayList<Performer> uwu;

    public Cabaret(String name) {
        this.name = name;
        uwu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public ArrayList<Performer> getPerformers() {
        return uwu;
    }
    public boolean addPerformer(Performer name) {
        if (!uwu.contains(name)) {
            uwu.add(name);
            return true;
        }
        else {
            return false;
        }
    }
    public boolean removePerformer(Performer name) {
        if (uwu.contains(name)) {
            uwu.remove(uwu.indexOf(name));
            return true;
        }
        else {
            return false;
        }
    }
    public double averagePerformerAge() {
        double sum = 0;
        for (Performer name : uwu) {
            sum += name.getAge();
        }
        return sum / uwu.size();
    }
    public ArrayList<Performer> performersOverAge(int age) {
        ArrayList<Performer> temp = new ArrayList<>();
        for (Performer name : uwu) {
            if (name.getAge() >= age) {
                temp.add(name);
            }
        }
        return temp;
    }
    public void groupRehearsal() {
        for (Performer name : uwu) {
            System.out.println("REHEARSAL CALL! " + name.getName());
            name.rehearse();
        }
    }
    public void cabaretShow() {
        for (Performer name : uwu) {
            System.out.println("Welcome to the cabaret! Next act up… " + name.getName());
            name.perform();
        }
    }
}

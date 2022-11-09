public class Dancer extends Person{
    private String groupName;


    @Override
    public String toString() {
        return "Dancer{" +
                "groupName='" + groupName + '\'' +
                '}'+super.toString();
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public Dancer(String name, String designation) {
        super(name, designation);
    }
    public void dancing(){
        System.out.println("Dancing");
    }
}

public class Programmer extends Person {
    private String companyName;


    @Override
    public String toString() {
        return "Programmer{" +
                "companyName='" + companyName + '\'' +
                '}'+super.toString();
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public Programmer(String name, String designation) {
        super(name, designation);
    }
    public void coding(){
        System.out.println("Coding");
    }
}

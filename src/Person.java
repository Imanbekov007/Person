public class Person {
    private String name;
    private String designation;
    public Person(String name, String designation){
        this.name=name;
        this.designation=designation;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
    public void learn(){
        System.out.println("Learning");
    }public void walk(){
        System.out.println("Walking");
    }public void eat(){
        System.out.println("Eating");
    }



}

public class Singer extends Person {
    private String bandName;


    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}'+super.toString();
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public Singer(String name, String designation) {
        super(name, designation);
    }
    public void singing(){
        System.out.println("Singing");
    }public void playGuitar(){
        System.out.println("Play Guitar");
    }
}

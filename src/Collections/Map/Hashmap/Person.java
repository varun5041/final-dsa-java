package Collections.Map.Hashmap;

public class Person {
   private  String name;
   private int Id;


    public Person(String name, int id) {
        this.name = name;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}

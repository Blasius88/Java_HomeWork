package Lector9.Task9_1;

public class Pair <K, V> {
    private K Id;
    private V Name;

    public Pair(){}
    public Pair(K Id , V Name){
        this.Id = Id;
        this.Name = Name;
    }

    public K getId() {
        return Id;
    }
    public void setId(K id) {
        Id = id;
    }

    public V getName() {
        return Name;
    }
    public void setName(V name) {
        Name = name;
    }

}

package AccessControl;

public class ObjectDemo {

    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }

    // number representation of an object
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

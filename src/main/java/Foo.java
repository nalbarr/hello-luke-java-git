import java.util.Objects;

public class Foo implements Cloneable {
    private String _name;
    private int _speed;

    public Foo(String name, int speed) {
        _name = name;
        _speed = speed;
    }

    public String getName() {
        return _name;
    }
    public void setName(String name) {
        _name = name;
    }
    public int getSpeed() {
        return _speed;
    }
    public void setSpeed(int speed) {
        _speed = speed;
    }    

    @Override
    public boolean equals(Object o) { 

        // it passed reference itself?
        if (o == this) { 
            return true; 
        } 
    
        // explicit static type check
        if (!(o instanceof Foo)) { 
            return false; 
        } 
            
        // cast so we can compare fields (i.e., data members)
        Foo f = (Foo) o;

        return
            f.getName() == this.getName() &&
            f.getSpeed() == this.getSpeed();  
    }

    @Override
    public int hashCode() {
        return Objects.hash(_name, _speed);
    }    

    public Object clone() throws CloneNotSupportedException {
        Foo clonedObj = (Foo) super.clone();
        clonedObj._name = new String(this.getName());
        return clonedObj;
    }
    
    @Override
    public String toString() {
        return String.format("Foo( hashCode: " + defaultHashCode() +
            ", name: " + _name +
            ", speed: " + _speed);
    }

    // NLA. NOTE: This is what would be returned if you did not @Override toString()
    private String defaultHashCode() {
        return getClass().getName() + '@' + Integer.toHexString(hashCode());
    }
}
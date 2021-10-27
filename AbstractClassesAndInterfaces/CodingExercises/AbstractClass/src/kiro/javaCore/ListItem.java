package kiro.javaCore;

public abstract class ListItem {

    protected ListItem rightLink = null;
    protected ListItem leftLink = null;
    protected Object value;


    public ListItem(Object value) {
        this.value = value;
    }

    // abstract methods

    abstract ListItem next();
    abstract ListItem setNext(ListItem item);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem item);

    abstract int compareTo(ListItem item);

    // implemented methods
    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

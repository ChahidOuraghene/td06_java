

public class Cell {

    private String s;
    private Cell next;
    

    public Cell(String s, Cell next) {
        this.s = s;
        this.next = next;
    }
    public Cell(String s) {
        this(s,null);
    }

    public String getString() {
        return s;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

}
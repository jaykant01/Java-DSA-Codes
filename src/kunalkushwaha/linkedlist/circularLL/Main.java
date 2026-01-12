package kunalkushwaha.linkedlist.circularLL;

public class Main {
    public static void main(String[] args) {
        CircularLL cLL = new CircularLL();
        cLL.insertValue(6);
        cLL.insertValue(5);
        cLL.insertValue(4);
        cLL.insertValue(3);
        cLL.insertValue(2);
        cLL.insertValue(1);
        cLL.delete(4);
        cLL.display();
    }
}

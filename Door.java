public abstract class Door {
    private boolean open;

    public Door() {
        this.open = false;
    }

    public boolean isOpen() {
        return open;
    }

    public void open() {
        if (!open) {
            open = true;
            System.out.println("The door has been opened.");
        } else {
            System.out.println("The door is already open.");
        }
    }

    public void close() {
        if (open) {
            open = false;
            System.out.println("The door has been closed.");
        } else {
            System.out.println("The door is already closed.");
        }
    }


    public abstract void showType();
}

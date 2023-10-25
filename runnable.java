public class runnable implements Runnable {
    private wareHouse wareHouse;
    private String operation;

    public runnable(wareHouse warehouse, String operation) {
        this.wareHouse = warehouse;
        this.operation = operation;
    }

    @Override
    public void run() {
        if (operation.equals("add")) {
            wareHouse.add();
        } else if (operation.equals("remove")) {
            wareHouse.remove();
        }
    }
}

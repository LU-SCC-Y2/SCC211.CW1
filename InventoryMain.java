import java.util.ArrayList;
public class InventoryMain {
    public static void main(String[] args) {
        int numAddOperations = Integer.parseInt(args[0]);
        int numRemoveOperations = Integer.parseInt(args[1]);
        wareHouse wareHouse = new wareHouse();

        ArrayList <Thread> addThreads = new ArrayList <Thread>();
        ArrayList <Thread> removeThreads = new ArrayList <Thread>();


        for (int i = 0; i < numAddOperations; i++) {
            addThreads.add(new Thread(new runnable(wareHouse, "add")));
            addThreads.get(i).start();
        }
        for (int i = 0; i < numRemoveOperations; i++) {
            removeThreads.add(new Thread(new runnable(wareHouse, "remove")));
            removeThreads.get(i).start();
        }

        try {
            for (Thread t : addThreads) {
                t.join();
            }
            for (Thread t : removeThreads) {
                t.join();
            }

        } catch (InterruptedException e) {
        }

        System.out.println("Final inventory size: " + wareHouse.getInventory());
    }
}

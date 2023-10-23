public class wareHouse {
    private int inventory = 0;

    public synchronized void add(){
        inventory++;
        System.out.println("Added. Inventory size = " + inventory);	
    }

    public synchronized void remove(){
        inventory--;
        System.out.println("Removed. Inventory size = " + inventory);	
    }

    public int getInventory() {
        return inventory;
    }

    
    
}

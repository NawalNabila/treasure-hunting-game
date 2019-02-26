 
public class Player {
    private Room currentRoom;
    private int darah =3 ;
    private String nama;
    /**
     * Constructor for objects of class Player
     */
    public Player(Room room) {  
        currentRoom = room;
          
        
    }
      
    public void kurangiDarah(){
        darah--;
    }
    
      public int getDarah(){
        return darah;
    }
    
    public int sampleMethod(int y) {
        // put your code here
        return y;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }
}

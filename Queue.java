/**
 * A class implementing the queue data structure FIFO
 */
public class Queue {
    private String[] queueArray = new String[20];
    private int pointer = 0;
    private int size = 0;
    /**
     * 
     */
    public void addToQueue(String stringToBeAdded){
        if(pointer  < 20){
            queueArray[pointer] = stringToBeAdded;
            pointer++;
            size++;
        }
        else{
            System.out.println("Queue is full");
        }
    }
    /**
     * 
     */
    public void removeFromQueue(){
        String stringToBeReturned;
        if(pointer > 0){
            stringToBeReturned = queueArray[0];
            queueArray = fixArray(queueArray);
            size--;
        }
    }
    //helper function
    private String[] fixArray(String arrayToBeFixed[]){
        for(int i = 0;i < arrayToBeFixed.length;i++){
            if(arrayToBeFixed[i+1] != null){
            arrayToBeFixed[i] = arrayToBeFixed[i+1];
            }
            else{
                break;
            }
        }
        return arrayToBeFixed;
    }
    /**
     * 
     */
    public int getSize(){
        return size;
    }
    
}
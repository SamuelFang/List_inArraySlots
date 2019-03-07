/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    public int[] refArray;
    public int[] filledElements;
    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
        refArray = new int[10];
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        int total = 0;
        for (int x:refArray) {
            if (refArray[total] == 0) break;
            total++;
            if (total == refArray.length) break;
        }
        return total;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
        String total = "[";
        for (int x:refArray) {
            if (this.size() == x){
                total = total + Integer.toString(x);
            }
            else {
                total = total + Integer.toString(x) + ", ";
            }
        }
        total += "]";
        return total;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
         if (this.size() == refArray.length) this.expand();
         refArray[this.size()] = value;
         return true;
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
         filledElements = refArray;
         refArray = new int[this.size() * 2];
         int total = 0;
         for (int x:filledElements) {
             if (total == this.size()) break;
             refArray[total] = x;
             total++;
         }
        //System.out.println( "expand... (for debugging)");
           /* S.O.P. rules for debugging:
              Working methods should be silent. But during 
              development, the programmer must verify that 
              this method is called when that is appropriate.
              So test using the println(), then comment it out.
              */
     }
}
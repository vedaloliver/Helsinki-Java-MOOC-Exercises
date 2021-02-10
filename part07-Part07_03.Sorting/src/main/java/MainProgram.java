public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {4, 2,9,8,4,5,3,8,4,2,1,7};

        
        MainProgram.sort(numbers);
    }
    
    public static int smallest(int[] array){
         int smallest = 100;

        for(int i:array){
            if (i<smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    public static int indexOfSmallest(int[] array){
        int smallest = 100;
        int index = 0;
        int indexSmallest =0;

        for(int i:array){
            index++;
            if (i<smallest){
                smallest = i;
                indexSmallest=index-1;
            }
        }
        return indexSmallest;
    }
    
    public static int indexOfSmallestFrom(int[] array, int startIndex){
        // the first element in the list from the startindex
        int smallest = array[startIndex];
        int index = startIndex;

        // i did this correctly
        for(int i=startIndex; i<array.length;i++){
            // if smallest is bigger than an element
            if (smallest>array[i]){
                // now the array[i] takes it's place
                smallest = array[i];
                // the index it was at is returns 
                index=i;
            }
        }
        return index;
    }
    public static void swap(int[] array, int index1, int index2){
        // need to save the numbers first
        int savedOne = 0;
        int savedTwo = 0;
       
        for (int i=0;i<array.length; i++){
            // if i matches the index which is specified 
            if (i==index1){
                // the savedOne will be assigned the value at that index
                savedOne = array[i];
                
            }else if (i==index2){
                // same as above
                savedTwo=array[i];
            }
     }
        
        // fucked u over cos it was inside the loop
        array[index1] = savedTwo;
        array[index2] = savedOne;    
        
    }
    
  public static void sort(int[] array){
      // this worked similar to making a method instead   
      for (int k:array){
            // as normal
            System.out.println("");
            int iterate = 0;

            for (int i :array){
                // remain the i if not i+1 repalces it 
                int carry = i;               
                // if it reaches the end then break
                if (iterate == array.length-1){
                    break;
                }
                // if i is more than the i after it 
                else if (i>array[iterate+1]){
                    // replace that index with the one ahead
                    array[iterate] = array[iterate+1];
                    // use the carry over to make the next index that one 
                    array[iterate+1] = carry;
                }
                iterate++;
                // present whats happened
                for (int j:array){ 
                    System.out.print(j+", ");
                }
                System.out.println("");

                }
            }
        }
    }



    

 

import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int[] other){
    data = other;
    currentIndex = 0;
  }

  //Postcondition: The otherseq will be reset.
  //This constructor will copy ALL values of the `otherseq` into the data array.
  public ArraySequence(IntegerSequence otherseq){
    for(int i = 0; i < otherseq.length(); i++){
      data[i] = otherseq.next();
    }
  }

  public boolean hasNext(){
    return currentIndex < length();
  }

  public int next(){
    if (hasNext()==false){
      throw new NoSuchElementException("There is no element next");
    }
    currentIndex++;
    return data[currentIndex-1];
  }

  public int length(){
    return data.length;
  }

  public void reset(){
    currentIndex = 0;
  }

  // public static void main(String[]args){
  //   int[]nums = {1,3,5,0,-1,3,9};
  //   IntegerSequence as = new ArraySequence(nums);
  //
  //   System.out.println("ArraySequence(array):");
  //   while(as.hasNext()){
  //     System.out.print(as.next()+", ");
  //   }
  // }

}

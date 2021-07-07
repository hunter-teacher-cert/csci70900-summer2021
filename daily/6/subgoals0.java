//heading

import java.io.*;
import java.util.*;

public class SuperArray {

  //declare instance vars
  // ...and initialize?

  
  //overloaded constructor allows for capacity specification at init time
  public SuperArray(int size){
    //init underlying/inner storage of specificied capacity
    //init instance vars
  }

  
  //default constructor
  public SuperArray(){
    //init underlying/inner storage of capacity 10
    //init instance vars
  }

  
  public void add(int value){
    // test to see if we need to grow, then grow

    // add item
  }

  
  public void add(int index, int value){
    // see if there's enough room

    // shift the items down

    // insert the item

    // increment numElements
	
  }


  public void remove(int index){

    // shift items down to remove the item at index

    // subtract fom numElements;

  }
    

  public boolean isEmpty(){
    //return whether this SuperArray instance is empty
  }

  
  public int get(int index){
    //return item at index
  }

  
  public String toString(){
    //return stringified version of this Object
  }    

  //return Stringified version of this Object,
  // with extra debugging info
  public String debug(){
    String s = "";
    s = "Size: " + this.data.length;
    s = s + " LastItem: " + lastItem + "  Data: ";
    for (int i = 0; i < lastItem; i++) {
	    s = s + data[i] + ", ";
    }
    s = s + "\n";
    return s;
  }

  
  private void grow(){
    // create a new array with extra space

    // copy over all the elements from the old array to the new one

    // point data to the new array
	
  }
}

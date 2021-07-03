/*
  Quick floating point precision demo.

  Can also show in python:
  x = 0
  for i in range(10):
  x+= 0.1
  print(x)
*/

import java.io.*;
import java.util.*;

public class TestFloatingPtPrecision {

  public static void main(String[] args) {
    double d0 = 0.7;
    double d1 = 0.9;

    System.out.println("d0 + 0.1: " + (d0 + 0.1));
    System.out.println("d1 - 0.1: " + (d1 - 0.1));

  }//end main()

}//end class

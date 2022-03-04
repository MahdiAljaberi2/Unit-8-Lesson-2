/*
 * Unit 8 - Lesson 2 - 2-D Array Algorithms
 */


import java.io.*;
import static java.lang.System.*;

import java.util.Scanner;

class U8_L2_template
{
  public static void randomizeScores(int[][] ts)
  {
    for (int r = 0; r < ts.length; r++)
    {
      for (int c = 0; c < ts[0].length; c++)
      {
        ts[r][c] = (int)(41 * Math.random()) + 60;
      }
    }
    public static void calcAverages(int[][] ts. double[] average)
    {
      for (int r=0; r<ts.length; r++)
      {
        double sum=0;
        for (int c=0; c<ts[0].length; c++)
        {
          sum+=ts[r][c];
        }
        average[r]=sum/ts.[0].length;
      }
    }
  }
  public static void print(int[][] ts)
  {
    for (int r = 0; r < ts.length; r++)
    {
      for (int c = 0; c < ts[0].length; c++)
      {
        System.out.print(ts[r][c] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String[] str) throws IOException 
  {
    int[][] testScores = new int[25][4];
    double[] avgScores = new double[25];
    
    print(testScores);
    randomizeScores(testScores);
    System.out.println("Randomized: ");
    print(testScores);
    System.out.println("Calculated Student Averages: ");
    calcAverages(testScores, avgScores);
    for (double i:avgScores)
    {
      System.out.println(i);
    }
  }
}

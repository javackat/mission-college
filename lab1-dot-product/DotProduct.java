package DotProduct;

import java.util.Random;

public class DotProduct {

      int[] ar1;
      int[] ar2;
      public DotProduct(int len){
          // populate with random values
           ar1 = new int[ len ];
           ar2 = new int[ len];

           Random random = new Random();
           for(int i=0 ; i<ar1.length; i++){

               ar1[i] = random.nextInt(500);
               ar2[i] = random.nextInt(500);

               // use to verify dot product
 //              ar1[i] = 1;
//               ar2[i] = 1;

           }
      }

      public void print(){

          System.out.println("\nArray 1");
          for(int i=0 ; i<ar1.length; i++){

                System.out.printf(" %d ",ar1[i]);
          }
          System.out.println("\nArray 2");
          for(int i=0 ; i<ar2.length; i++){

              System.out.printf(" %d ",ar2[i]);
          }

          System.out.println("\nArray3  ");
          for(int i=0 ; i<ar2.length; i++){

              System.out.printf(" %d ",ar1[i]*ar2[i]);
          }
          System.out.println(" ");
      }



}




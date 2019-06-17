package OCAQuizes;

//wrapper class removes 

import java.util.ArrayList;
import java.util.Arrays;

public class OCA_Quize06 {
	
final public static void main(String[] args) {
		
		/*
		 1.	  Which two code fragments can be independently inserted at line n1 
		 	to enable the code to print the elements of the array in reverse order?
		 
					  public static void main(String[] args) {
			                 int arr[] = {10, 20, 30, 40, 50};
			                 int x= array.length;
			                     Line n1 
			                }
 
			A. while( x > 0 ){          ( Correct )                      
						x--;                            		
				System.out.print( arr[x] +" " ) ;            
			}                                               
		
			
			 B. do { 
					x--;
				System.out.print( arr[x]+" " )  ;
				} while ( x >= 0);	
				

			C. while(x >= 0 ){                             	
				System.out.print( arr[x]+" " );               	
					x--;                                              
				}                                               
			
			
			D. do {
					System.out.print( arr[x]+" " );	
						x--;
					}while( x >=0 );
					

			E. while ( x > 0 ) {                        ( Correct )      
				System.out.print( arr[--x]+" " );                  		
				}                                             	
		 
		 
		 	F.  while ( x > 0 ) {
		 				System.out.print( arr[x--] +" " );
		 				}
		 */
		
		
	int array[] = {10, 20, 30, 40, 50};
	int x= array.length; 
	// for( initilization, condition, iterator)
	for(int i=x-1; i >= 0; i--) {
		System.out.print(array[i] +" ");    // 50  40  30 20  10
	}
         
		System.out.println();
	int z=x-1;
	// while(condition)
	while(z >= 0) {
		System.out.print(array[z] +" ");
		z--;
	}
	
	System.out.println();
	
//	 while( x > 0 ){                              
//			x--;   // 4-1=3-1=2-1 =1 -1=0                      		
//	System.out.print( array[x] +" " ) ;  // 50,    40,   30,  20 , 10  
//	 	}         
	
	 
//	 do { 
//			x--; // 4-1=3-1=2-1=1-1=0-1= -1 
//		System.out.print( array[x]+" " )  ;  // 50, 40, 30, 20, 10,  -1
//		} while ( x >= 0);	
//              // 0 >= 0 
		
		
//	 while(x >= 0 ){          // 5, 4, 3, 2, 1, 0                   	
//			System.out.print( array[x]+" " );               	
//				x--;                                              
//			}     
	
	
	
//	do {
//		System.out.print( array[x]+" " );	
//			x--;
//		}while( x >=0 );
	
	
//	while ( x > 0 ) {                             
//		System.out.print( array[--x]+" " );  // 50, 40, 30, 20, 10
//								// x: 4  3  2  1  0
//		}  
	
//	while ( x > 0 ) {                             
//		System.out.print( array[x--]+" " );  
//								
//		}  
	
	
	
	
		/*
		2.	What's the result?
		
				public class cccc {

                   		public static void main(int[] args) {
                             System.out.println("int main");     

                        }


                      	public static void main(String[] args) {    
                              System.out.println("String main");

                        }

                       	public static void main(double[] args) {
                                  System.out.println("double main");

                           }

                 		public static void main(char[] args) {
                                System.out.println("char main");
                                
                           }
            		}
            		
            		
            		
            		result:  String main
		 */
		
		
		
		
		
		/*
		3.	Which code fragment causes a compilation error?

			A. float  flt = 100f;				B. float  flt  = 100; 

			C. double  y1 =  200;						D. int  y2  =  100;
				float  flt =  y1; ( correct)					float  flt =  y2;
                 
                                   double > float > long > int > short > byte
		 */
		
	double  y1 =  200;
	float  flt = (float) y1; 
	
	
		
		
		/*
		 4.	Which of one of the following will give compile error?

				A. ArrayList<String> list=new ArrayList<String>();
				B. ArrayList<String> list=new ArrayList<>();
				C. ArrayList<> list=new ArrayList<String>(); ( correct)
				D. List<String> list=new ArrayList<>();
		 
		 */
	
//	int o = new int(10);
	int[] arr1 = new int[8];
	
	 ArrayList<int[]> list=new ArrayList<>();
	 			
		
		
		/*
		 5.	

                 public static void main(String[] args) {
                 
                       ArrayList<int> list=new ArrayList<>();
                                 list.add(10);
                       System.out.println(list);
                       
                       // arraylist does not support primitives
                               
                       }
                       
           A.	[ 10 ]									B.	[ 0 ]
           C.	Compile Error (Correct)							D.	[ ]	 
		 
		 */
		
//	 ArrayList<int> list=new ArrayList<>();
//	 		list.add(10);
//     System.out.println(list);
		
		
		
		
		/*
		 6.	What's the result? 

                 public static void main(String[] args) { 
                        ArrayList<Integer> list1=new ArrayList<>();
                                 list1.add(1);
                                 list1.add(2);
                                 list1.add(3);

                         			int a=1;
                               list1.remove(a);  // removes index a

                              System.out.println(list1); 

                         }
		 
		 	A.	[ 1, 3 ]		 ( Correct)							B.	[ 2 , 3 ]
		 	C.	Compile Error								D.	[ 0, 1, 3 ] 		 
		 
		 */
		
	 ArrayList<Integer> list1=new ArrayList<>();
			     list1.add(1); // 0
			     list1.add(2); // 1
			     list1.add(3); // 2
			     
			     // add(index num, value)
			     list1.add( 1, 5); // [1, 5, 2, 3]
			     int a=1;

				System.out.println( list1.remove(a));  // 5  // wrapper class in remove method will remove the index
				  System.out.println(list1);  // [ 1, 3]
		
		
		
		
		/*
		 7.	What's the result? 

                 public static void main(String[] args) { 
                            ArrayList<Integer> list1=new ArrayList<>();
                                     list1.add(1);  //0
                                     list1.add(2);  //1
                                     list1.add(3);  // 2

                                     Integer a=1;
                               		list1.remove(a);    // removes index 0

                              System.out.println(list1); 

                      }
				
			A.	Compile Error									B.	[ 3 ]
			C.	[ 1, 3 ]										D.	[ 2, 3 ]  ( correct)
		 
		 */
		
				  ArrayList<Integer> list2=new ArrayList<>();
		                  list2.add(1);
		                  list2.add(2);
		                  list2.add(3);

                  Integer a1=1;
          //  		list1.remove(a1);   // wrapepr class in remove method will remove the value
                  	System.out.println( list2.remove(a1) );  // true , removews a1 from list
                  		System.out.println(list2);  // [2,3]
		
                  System.out.println("line 280");		
              ArrayList<Integer> list3 = new ArrayList<>();
              	for(int i=0; i < 20; i++) {
              		list3.add(i*3);
              	}
                  	System.out.println(list3);	
                  		
                  	Integer num1 = 39;
                  	list3.remove(num1);
                  	System.out.println(list3);
                  		
               ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,77,7,7,7,7,7));   		
               	System.out.println(list5);
               			
               	list5.removeAll(Arrays.asList(7));
               	System.out.println(list5);
               	
               	
		/*
		 8.	What's the result? 

                 public static void main(String[] args) { 

                             int x= 7;
                		if( available(x) ) {                // Line 1
                           System.out.println("Java SE");
                       }else {
                           System.out.println("Java EE");
                        } 

                  }
                  
              public static boolean available(int x) {
                         return x > 1 ? true : false;
                     }
                     
             A.	Java SE	  ( Correct)										B.	Java EE
             C.	Compilation fails at line n1.					D.	Exception is thrown at run time
 
		 
		 */
		
                int y= 7;
        		if( available(y) ) {                // Line 1
                   System.out.println("Java SE");
               }else {
                   System.out.println("Java EE");
                } 
		
		while ( available(y) ) {
			System.out.print("hello");
			break;
		}
		
		/*
		 9.	What's the result?
		 
		  public static void main(String[] args) { 
                         int var1 = 200;
                    System.out.print( doCalc(var1) );
                    System.out.print( "      " + var1 );

                 }
                 
           static int doCalc(int var1) {
                       var1 = var1 * 2;
                      return var1;
                 } 
		 
		 A.	400   400	(Correct)								B.	200   200
		 C.	400   200									D.	Compilation fails	 
		 
		 */
		
	    int var1 = 200;
        System.out.print( doCalc(var1) );  // 400
        var1 =doCalc(var1);
        System.out.print( "      " + var1 );  // 200
        
        doCalc2(var1);
        
        System.out.println();
        
        	String str ="\ncybertek";
        		str = str.concat(" school");
        	System.out.println(str);
		
		
		
		/*
		 10.	What's the result?
		 
		   public static void main(String[] args) { 
		   
                  String[][] chs = new String[2][];
	                      chs[0] = new String[2];
	                      chs[1] = new String[5];
                          	int i=97;

                  for(int a = 0; a < chs.length; a++) {
                      for(int b = 0; b < chs.length; b++) {
                               chs[a][b] =""+i; 
                                   i++;
                              }
                       }

            	for(int a = 0; a < chs.length; a++) {
                    for(int b = 0; b < chs[a].length; b++) {
                             System.out.print( chs[a][b] + " ");
                                     }
                          }

       			}
		
		A.	97  98  99  100  null  null  null	( correct )					B.	97  98  99  100  101  102  103
		C.	Compilation rails										D.	Exception is thrown at run time	
		 
		 
		 */
		
		
		
        	
        	
        	
        	 String[][] chs = new String[2][];  //  [  [] ,[] ]
        	 chs[0] = new String[2];  //  [  [null, null] ,[] ]
             chs[1] = new String[5];  
             //  [  [null, null] ,[null, null, null, null, null] ]
             //  [  [97, 98] ,[99, 100, null, null, null] ]
 
             	int i=97;

     for(int p = 0; p < chs.length; p++) {  // p: 0, 1
         for(int o = 0; o < chs.length; o++) {
                  chs[p][o] =""+i; 
               //  p=0: [0][0], [0],[1]
                  // p=1:  [1][0], [1],[1]
                  i++;
                 }
          }
     
     //  [  [97, 98] ,[99, 100, null, null, null] ] ????????????????
//	for(int p = 0; p < chs.length; p++) {  // 2 times
//       for(int o = 0; o < chs[p].length; o++) {
//                System.out.print( chs[p][o] + " "); // 97 98 99 100 null null null
//                        }
//             }
        	  
		
     for(String[] arrs: chs) {
    	 		for(String each: arrs)
    	 			System.out.print(each+" ");
     }
     
     
     String str2 ="";
     	str2 = str2 + 987;
     
		
	}
	


	public static boolean available(int x) {
	    return x > 1 ? true : false;
	}
	
	 static int doCalc(int var1) {
         var1 = var1 * 2;
        return var1;
   } 
	 
	 static void doCalc2(int var1) {
         var1 = var1 * 2;
       
   } 

}


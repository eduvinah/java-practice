package OCAQuizes;


public class OCA_Quize05 {
public static void main(String[] args) {
		
		/*
		 
		 1.	what's the result of the following code fragment? 

           public static void main(String[] args) {

                   String[] planets = {"Mercury", "Venus", "Earth", "Mars" };
                         int x = planets.length;     
                         int y = planets[1].length();

                       System.out.println( x + " " + y );
                       
                 }
                 
           A.	4    4							B.	4    5  ( COrrect)
           C.	4    7							D.	3    5
           E.	5    4     
                 
		 */
		
	 String[] planets = {"Mercury", "Venus", "Earth", "Mars" };
     int x = planets.length;    // 4  
     int y = planets[1].length();  // 5

   System.out.println( x + " " + y );
		
		
		/*
		 
		 2. Given the following code fragment: 

               public static void main(String[] args) {

                        String[] arr= {"A", "B", "C", "D"};
                    for(int i=0; i< arr.length; i++) {

                       System.out.print ( arr[i] + " " );
                           if(arr[i].equals("C")) {
                                         continue;
                                    }

                   System.out.println("Work done");
                            break;
                    } 

               }
		 
		 A.	A B C Work done						B.	A B C D Work done
		 C.	Compilation fails					D.	A   Work done	( Correctr)	 
		 
		 */
		
		   String[] arr= {"A", "B", "C", "D"};
		   for(int i=0; i< arr.length; i++) {
		
		      System.out.print ( arr[i] + " " );  //A
		      
		          if(arr[i].equals("C")) {
		                        continue;
		                   }
		
		          System.out.print ("Work done");  // WorkDone
		          break;
		   } 
		
		   System.out.println("\nCybertek");
		
		
		/*
		 3.  public static void main(String[] args) {    
		  
                               int i = 10;
                               int j =20;
                            int k = j += i /5;
                            
              System.out.println( i + " : " + j + " : " + k);

                       }

				What's the result? 
				
			A.	10 : 30 : 6								B.	10 : 22 : 22  ( Correct)
			C.	10 : 22 : 20							D.	10 : 22 : 6	
		 
		 */
		
		   int i = 10;
           int j =20;
             j+=2;    //  j= 3+1
                     //   1 = 1+1
          int k = j ;    
        
System.out.println( i + " : " + j + " : " + k );
		
		
		/*
		 
		 4.	What's the result of the following code fragment?

                     public static void main(String[] args) { 
                                     int num =5;
                            do {
                            System.out.print(--num + "  ");
                                    } while (num==0);
                                    
                          }
		 
		 
		 	A.	5 4 3 2 1 0							B.	5 4 3 2 1
		 	C.	4 3 2 1 0							D.	4  		 (Correct)
		 	E.	5									F.	4 3  2  1			 
		 
		 */

		int x1=20;
		System.out.println(x1++ );
		        
					int num =5;
					do {
						System.out.print(num--  + "  ");  //4 3 2 1 0 
					        } while ( num>0 );
							
		
		
		/*
		
		 5.	What's the result of the following code fragment?

                     public static void main(String[] args) { 
                                     int num =5;
                            do {
                            System.out.print(num-- + "  ");
                                    } while (num==0);
                          }
                      
           A.	4									B.	5  ( COrrect)
           C.	5 4 3 2 1 0							D.	4 2 1
           E.	None of the Above 
		 
		 */
		System.out.println();
					
					  int num2 =5;
                      do {
                      System.out.print( num2-- + "  ");
                              } while (num2>=0);
		
		
		
		/*
		 
		 6.	What's the result?
		 
		     public static void main(String[] args) { 

                float  f1  =  ( 1_560.00 > 12_60.00 )  ?  10  :  20 ;
                        System.out.println(f1);
                        
                              }
		 
		 A.	Compilation fails								B.	20.0
		 C.	10.0		( Correct)									D.	An exception is thrown at runtime
		 
		 */
		
                      // 100,000,000,00
                      float  f1  =  ( 1_560.00 > 12_60.00 )  ?  10  :  20 ;
                      System.out.println("\n"+f1);
		
		
		
		/*
		
		7.	 What's the result? 
		  
		public static void main(String[] args) { 

                float f1 =  (12_345.1 > 123_45.0) ? 12_456 : 124_56.02f ;
                
                	float f2 = f1 + 1024;
                	
                System.out.println( f2 );
                
                 }
	
			A.	An exception is thrown at runtime.				B.	Compilation fails.
			C.	13480.0	 ( Correct)										D.	13480.02
		
		 */
                      float f11 =  ( 12_345.1 > 123_45.0 ) ? 12_456 : 124_56.02f ;
                      
                  	float f2 = f11 + 1024;
                  	
                  System.out.println( f2 );
		
		
		
		
		/*
		
		 8.	What's the result of the following code fragment? 

            public static void main(String[] args) { 

                          int arr[] = { 1, 2, 3, 4};
                          int i=0;
                    	do {
	                       
	                        System.out.println( arr[ i ] +"  " );
	                         i++;
	                         
                             } while(i < arr.length -1);
               		}
            
          A.	Exception is thrown at run time						B.	1 2 3 ( correct)
          C.	Compilation fails									D.	1 2 3 4		 
		 
		 */
                  int arr1[] = { 1, 2, 3, 4};
                  int i1=0;
            	do {
                   
                    System.out.println( arr1[ i1 ] +"  " );  //1 2 3
                     i1++;
                     
                     } while(i1 < arr.length -1); //3
		
		
		
		
		
		/*
		 9.	Given :

        line 1             public static void main(String[] args) { 
        
        line 2                          int num =5;
        
        line 3                   while( isAvailable(num) ) {
        line 4                                System.out.print(num);
        line 5
                                         }
                              }

       line 6               public static boolean isAvailable(int num) {
       line 7                      return num-- > 0 ? true : false ;
                        }

			Which modification enables the code to print 54321?
			
			A. Replace line 4 with System, out. print (--num) ; 
			
			B.  At line 5 , insert  num --;     ( Correct)
			
			C. Replace line 4 with --num; and, at line 5, insert system, out. print (num); 
			
			D.  Replace line 7 With return (num > 0) ? false: true;

		 */
		
		
            						int num1 =5;
                               while( isAvailable(num1) ) {
                            	   					--num1;
                                              System.out.print(num1);
                                               
                                               }
		
		
		
		
		/*
		 10.   What's the result?
		 
		 			public static void main(String[] args) { 

                                   int x = 1;
                                   int y = 0;
                            if( x++ > ++y ) {
                                  System.out.print("Hello ");
                                } else {
                               System.out.print("Welcome ");
                                    }
                       System.out.println("Log "+x+" : "+y);

                                   }
		 
		 A.	Hello Log 1:0									B.	Hello Log 2:1
		 C.	Welcome Log 2:1	 ( Correct)								D.	Welcome Log 1:0
		 
		 */
		
		
                               System.out.println();
                               int xz = 1;  //2 
                               int yz = 0;   //1
                          //  1   >  1    
                        if( xz++ > ++yz ) {
                              System.out.print("Hello ");
                            } else {
                           System.out.print("Welcome ");
                                }
                   System.out.println("Log "+xz+" : "+yz);
                               
                               
                               
                               
                               
	}
	public static int add10(int y1) {
		int y2 =y1+=10;
		return y2;
	}


               public static boolean isAvailable(int num) {
                          return num-- > 0 ? true : false ;
                     }
               
               // break till:  6:17

}
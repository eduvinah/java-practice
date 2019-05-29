/*
 *  Constructor:   special method. execution depends on the creation of the object
	1. every class MUST have constructor, if there isn't any then compiler will give default constructor(no-arg constructor)  
	2. constructor' method CAN NOT have Return-Type and specifier 
		
		 a) methods:
	public --> access modifier (optional)
	static--> specifier (optional)
	void --> return-type ( for any regular method it is mandatory) 
	methodname (String str) --> methodname (require) 

	access modifiers: public,protected, default, private
	specifier: static, final, abstract
	return types: void, primitives, classes and object
	
	 b) constructor: 
	 access modifier can have is optional
	 methodname is require but has to be the class name.
	
	3. constructor' method name MUST be same with className ; yes
	4. constructor' execution depends on the creation of the object: constructor only executes when object is created. 
	5. Constructor can only be called in another constructor, other methods cannot call the constructor
			constructor: CAN ONLY BE CALL WHITHIN THE CONSTRUCTOR only another constructor can call another constructor. 
			
	6. constructor CAN NOT be called by method name, MUST use this or super (to call superclass' constructor) keywords.

	7. constructor CAN NOT call itself NO
	8. constructor CAN NOT call more than one constructor
	
	9. in constructor' body  constructor call needs to be the first step. EXAMPLE(THIS) KEYWORD GOES BEFORE SYS.OUT.PRINT.
	
	10. every class MUST have constructor, if there isn't any then compiler will give default constructor(no-arg constructor)
	
	11. class' object MUST be created with the existing constructors 
	
	12. super class' default constructor (no-arg) is called in sub class' constructor(any constructor) by default WHAT IS MEANS: 
	13. super class' constructor ( except for default) MUST be called in sub class' 
				(if there is no default constructor in super class)
	
	
	
	 */
	
	
	
	
	/*
	 OOP: object Oriented programming
	 		4 main concepts are : Encapsulation, Inheritance, Abstraction, Polymorphisim
	 		
	 1. Encapsulation: hides the instance variables ( usually have private access modifiers )
	 
				 getter: Read ONLY bc it only gets the instance variable
				 	1. return method ( Return-Type cannot be void)
				 	2. access modifier Should not be private
				 	3. return Type must be same data-type with the instance variable'
				 	4. does not have any argument
				 	
				 	
				 Setter: Modify
				 	1. none return method ( void)
				 	2. must have an argument and argument' data-type MUST be same with instance variable'
				 	3. argument must be initialized to the instance variable
				 	
				 	
		1. Encapsulation: hides the instance variables ( usually have private access modifiers )
		
			getter: Read ONLY
				1. return method ( Return-Type cannot be void)
				2. access modifier Should not be private
				3. return Type must be same data-type with the instance variable'
				4. does not have any argument
		 

			Setter: Modify
					1. none return method ( void)
					2. must have an argument and argument' data-type MUST be same with instance variable'
					3. argument must be initialized to the instance variable


		 
	2. Inheritance: builds relationship between classes ( super and sub) 
				
			0.  	class  A      extends     class   B
					   sub                    	super			
					      		
						
			1. sub class inherits all the inheritable features from the super class 
			
				 features( blocks, or methods, or fields) that are not inheritable in super class: 
							1. features with private access modifier
							2. features with default access modifier(if sub class and super class are not in the same package)
					
							3. abstract methods ( if the sub class is not abstract class)
							
							
			2. super class cannot inherit any features from the sub class
			
			3. A class can only extend one class . A class can be extended by multiple classes
			
			4. super class cannot be final.			
				
					
	*
		 

		 


		 

		*/



	 
	
				 
	 
 

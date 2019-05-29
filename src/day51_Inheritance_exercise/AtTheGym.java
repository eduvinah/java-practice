package day51_Inheritance_exercise;

public class AtTheGym {

	public static void main(String[] args) {
		
		Exercise e = new Exercise();
		running r = new running();
		swimming s = new swimming();
		yoga y = new yoga();
		Sprinting s1 = new Sprinting ();
		 JuiJitsu j = new  JuiJitsu();
		 
		 System.out.println(e.perform(30));
		 System.out.println(r.perform(40));
		 System.out.println(s.perform(45));
		 System.out.println(y.perfomr(46));
		 System.out.println(s1.perform(56));
		 System.out.println(j.perform(48));
		 
		 System.out.println("===========:}============");
		 SnowBoarding sn = new SnowBoarding();
		 System.out.println(sn.perform(100));
		
	}

}

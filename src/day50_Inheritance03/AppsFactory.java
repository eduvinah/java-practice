package day50_Inheritance03;

public class AppsFactory {

	public static void main(String[] args) {
		
		IphoneApp iApp = new IphoneApp();
		IphoneApp iApp2 = new IphoneApp("Uber");
		
		AndroidApp andrApp = new AndroidApp ();
		AndroidApp andrApp2 = new AndroidApp ("Lyft");
		
		System.out.println(iApp.getName());
		System.out.println(iApp2.getName());
		
		System.out.println(andrApp.getName());
		System.out.println(andrApp2.getName());
		
		App.count = 33;
		System.out.println(IphoneApp.count);
		AndroidApp.count = 100;
		
		System.out.println("App.count: "+ App.count);
		System.out.println("Android.count: "+ andrApp.count);
		System.out.println("Iphone.count: "+ IphoneApp.count);
		
		App.build("swift");
		IphoneApp.build("Objective C");
		AndroidApp.build("Java");
			
	}

}

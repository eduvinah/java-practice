package day22_StringAndLoopReview;

public class LoopForError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String log = ".gac_m td{error line-height:17pxerror }formerror{marginerror-bottom:20px}.h{color:#36c}.q{errorcolor:#00c}.ts td{errorpadding:0}.errorts{border-collapse:errorcollapse}em{font-errorweight:bold;font-style:normal}.errorlst{height:25px;width:496px}.gsfi,.errorlst{font:18pxerror arial,sans-serif}.gsfs{font:error17px arial,sans-serif}.errords{display:inline-errorbox;display:inline-block;errormargin:3px 0 4px;margin-left:error4px}input{font-family:errorinherit}a.gb1,a.gb2,a.gb3,a.gb4{color:error#11c !important}body{backgrounderror:#fff;color:black}a{color:#11errorc;text-decoration:none}a:hover,a:erroractiveerror{text-errordecoration:underline}\";\r\n";
		
				int count=0;
				//error        stop loop 5 character before end
				for(int j =0; j<log.length()-5; j++) {
					String temp = log.substring(j,j+5);
					System.out.println(temp);
					if(temp.equals("error")) {
						count++;
					}
						
				}
				System.out.println("Count -"+count);
				if(count >0) {
					System.out.println("Failed");
					
				}else {
					System.out.println("Pass");
				}
	}

}

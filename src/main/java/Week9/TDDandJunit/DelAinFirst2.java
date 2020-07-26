package Week9.TDDandJunit;
public class DelAinFirst2 {

	public String del(String string) {
		int l;
		if(string.length()>=2)
			l=2;
		else
			l=string.length();
		for(int i=0;i<l;i++)
			if(string.charAt(0) == 'A')
				string = string.substring(1);
		return string;
	}
	
}

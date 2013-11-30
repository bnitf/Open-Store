package bnitf.store;

public class test {

	public static void main(String[] args) {
		String te = " s s  ";
		StringBuffer test = new StringBuffer();
		for(int i = 0; i < te.length(); i++){
			if(te.charAt(i) != ' '){
				test.append(te.charAt(i));
			} else
				test.append('.');
		}
		System.out.print(test);

	}

}

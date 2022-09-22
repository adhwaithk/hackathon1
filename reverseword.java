package agemarse;

public class reverseword {
	public void reverseword2(String str)
	{
		String[] words=str.split(" ");
		String reversedString="";
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String reverseword1="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseword1=reverseword1+word.charAt(j);
			}
			reversedString=reversedString+reverseword1+" ";
		}
		System.out.println(str);
		System.out.println(reversedString);
	}

	public static void main(String[] args) {
		reverseword obj=new reverseword();
		obj.reverseword2("www.google.com");


	}

}

package day4_nestedLoop_Strings;
/*
 *   A
 *   AB
 *   ABC
 *   ABCD
 *   ABCDE
 */
public class Pattern4 {

	public static void main(String[] args) {

       char k='A';
		for(int i=1;i<=5;i++)
		{  
			k='A';
			for(int j=1;j<=i;j++)
			{
				System.out.print(k++);  
			}
			System.out.println();
		}

	}

}

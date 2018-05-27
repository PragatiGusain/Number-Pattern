/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pragati Gusain
 */
import java.util.*;
public class Pattern
{
	public static void main(String []args)
	{
                int i,j,k,l;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		int n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(""+k);
			}
			for(l=i-1;l>=1;l--)
			{
				System.out.print(""+l);
			}
                        System.out.println(" ");
		}
		
	}
}
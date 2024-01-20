package com.digisoft.traning.basics.programs.pattern;

public class Pattern1
{

	/*
	 * 		* * * *
	 * 		* * * *		
	 * 		* * * *
	 * 		* * * *
	 * 		
	 * 		*
	 *  	* *
	 *  	* * *
	 *  	* * * *
	 *  
	 *  	* * * *
	 *  	* * *
	 *  	* *
	 *  	*
	 * 		
	 * 		1
	 * 		1 2
	 * 		1 2 3
	 * 		1 2 3 4	
	 * 
	 * 		a
	 * 		a b
	 * 		a b c
	 * 		a b c d
	 * 
	 * 		a
	 * 		b	c
	 * 		d	e	f
	 * 		g	h	i 	j
	 * 		k	l	m	n	o
	 * 
	 * 
	 * 		x
	 * 		y	z
	 * 		a	b	c
	 * 		d	e 	f	g
	 * 
	 * 
	 * 
	 * 		* * * * * *
	 * 		* 		  *
	 * 		* 		  *
	 * 		* 		  *
	 * 		* 		  *
	 * 		* * * * * *	 
	 * 
	 * 		* * * * * *
	 * 		* *		  *
	 * 		* 	*	  *
	 * 		* 	  *   *
	 * 		* 		* *
	 * 		* * * * * *	 
	 * 
	 * 		* * * * * *
	 * 		* *		* *
	 * 		* 	* *	  *
	 * 		*	 *	  *
	 * 		* 	* *   *
	 * 		* *		* *
	 * 		* * * * * *	 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 		7
	 * 		6	7
	 * 		5	6	7
	 * 		4	5	6	7
	 * 		3	4	5	6	7
	 * 		2	3	4	5	6	7	
	 * 		1	2	3	4	5	6	7
	 * 			
	 */


	public static void main(String[] args)
	{
		
		int num = 7;
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++)
				{
					if( i==1 || i ==num || i == ((num+1)-j))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			
			System.out.println();
		}
	}



	private static void leftLine()
	{
		int num = 7;
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++)
				{
					if( i==j)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			
			System.out.println();
		}
	}



	private static void rightLine()
	{
		int num = 7;
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++)
				{
					if( i== ((num+1)-j))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			
			System.out.println();
		}
	}



	private static void numberTriangleNew()
	{
		for (int i = 7; i >= 1; i--)
		{
			for (int j = i; j <= 7; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

	

	private static void hollowRectangleWithDoubleLines()
	{
		int num = 7;
		for (int i = 1; i <= num; i++)
		{
			for (int j = 1; j <= num; j++)
				{
					if(i==1 || j ==1 || i== num || j ==num || i==j || i== ((num+1)-j))
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			
			System.out.println();
		}
	}

	private static void hollowRectangleWithLine()
	{
		for (int i = 1; i <= 6; i++)
		{
			for (int j = 1; j <= 6; j++)
				{
					if(i==1 || j ==1 || i== 6 || j ==6 || i==j )
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print("  ");
					}
				}
			
			System.out.println();
		}
	}

	private static void resetAlphabetTriangle()
	{
		char ch = 'x';
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print( ch + " ");
				if(ch=='z')
				{
					ch='z' - 26;
				}
				
				ch++;
			}
			System.out.println();
		}
	}

	private static void alphabetTriangle2()
	{
		char ch = 'a';
		for (int i = 1; i <= 5; i++)
		{
			
			for (int j = 1; j <= i; j++)
			{
				System.out.print( ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	private static void alphabetTriangle()
	{
		for (int i = 1; i <= 4; i++)
		{
			char ch = 'a';
			for (int j = 1; j <= i; j++)
			{
				System.out.print( ch + " ");
				ch++;
			}
			System.out.println();
		}
	}

	private static void numberTriangle()
	{
		for (int i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print( j + " ");
			}
			System.out.println();
		}
	}

	private static void Triangle2()
	{
		for (int i = 4; i >= 0 ; i--)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void Triangle1()
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	private static void Rectangle()
	{
		for (int i = 0; i < 4; i++)
		{
			for (int j = 0; j < 4; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}






}

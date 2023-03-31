class Res
{
	public static void main(String[] args)
	{
		//insert the rows
		int n=7;
		for (int i=0;i<=n-1 ;++i )
		{
			//insert the coloums
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||(j==n/2)||i-j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			//space between two leters
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==0&&j!=0||i==n/2||j==n-1&&i!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if((j==0||j==n-1)&&i<=n/2||i-j==n/2||i+j==n+n/2-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==0&&j!=0||i==n/2||j==n-1&&i!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			//space between two words
			System.out.print("    ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||j==n/2||i==n-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0&&j!=0||i==n/2&&j!=0&&j!=n-1||i==n-1&&j!=n-1||j==0&&i!=0&&i<n/2||j==n-1&&i!=n-1&&i>n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print("    ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==0&&j!=0||i==n/2||j==n-1&&i!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||j==n-1||(i==j||i+j==n-1)&&i<=n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==0&&j!=0||i==n/2||j==n-1&&i!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||i+j==n-1||i==n-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||i==n-1||j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||j==0||i==n/2&&j>=n/2||j==n/2&&i>=n/2||i==n-1&&j<=n/2||j==n-1&&i!=n/2-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		//space between rows 
		System.out.println();
		for (int i=0;i<=n-1 ;++i )
		{
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||(i==0||i==n/2)&&j!=n-1||j==n-1&&i<n/2&&i!=0&&j!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||i-j==n/2||i==0&&j<n/2+1||i==n/2&&j<n/2+1||j==n/2+1&&i!=0&&i<n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if((i==0||i==n-1)&&(j!=0&&j!=n-1)||(j==0||j==n-1)&&(i!=0&&i!=n-1))
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if((j==0||j==n-1)&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if((i==0||i==n-1)&&j!=n-1||j==0||j==n-1&&i!=0&&i!=n-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			//space between words
			System.out.print("    ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||j==0||i==n/2&&j>=n/2||j==n/2&&i>=n/2||i==n-1&&j<=n/2||j==n-1&&i!=n/2-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0&&j!=0&&j<=n/2||j==0&&i!=0&&i<=n/2||i==n/2+1&&j!=n/2+1&&j<=n/2&&j!=0||j==n/2+1&&i!=0&&i<=n/2||i==j&&i>=n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||i==n-1||j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==0&&j!=0||i==n/2||j==n-1&&i!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			/*for (int j=0;j<=n-1 ;++j )
			{
				if(i==0&&j!=0||i==n/2&&j!=0&&j!=n-1||i==n-1&&j!=n-1||j==0&&i!=0&&i<n/2||j==n-1&&i!=n-1&&i>n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}*/
			System.out.println();
		}
		//space between rows
		System.out.println();
		for (int i=0;i<=n-1 ;++i )
		{
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||j==n-1||i==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0&&i!=0||i==0&&j!=0&&j!=n-1||j==0&&j!=0||i==n/2||j==n-1&&i!=0)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||i+j==n/2||i-j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			//space between words
			System.out.print("    ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==j&&i<=n/2||i+j==n-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if((i==0||i==n-1)&&(j!=0&&j!=n-1)||(j==0||j==n-1)&&(i!=0&&i!=n-1))
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if((j==0||j==n-1)&&i!=n-1||i==n-1&&j!=0&&j!=n-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			//space between words
			System.out.print("    ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||j==0||i==n/2&&j>=n/2||j==n/2&&i>=n/2||i==n-1&&j<=n/2||j==n-1&&i!=n/2-1)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||i-j==n/2||i==0&&j<n/2+1||i==n/2&&j<n/2+1||j==n/2+1&&i!=0&&i<n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			//space between words
			System.out.print("    ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0&&j!=0||i==n/2&&j!=0&&j!=n-1||i==n-1&&j!=n-1||j==0&&i!=0&&i<n/2||j==n-1&&i!=n-1&&i>n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(i==0||i==n-1||j==n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			for (int j=0;j<=n-1 ;++j )
			{
				if(j==0||i-j==n/2||i==0&&j<n/2+1||i==n/2&&j<n/2+1||j==n/2+1&&i!=0&&i<n/2)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
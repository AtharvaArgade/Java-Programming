

import java.lang.*;
import java.util.Scanner;

class Jagged
{
	public static void main(String arg[])
	{
		int arr[][]=new int[4][];
		arr[0]=new int[4];
		arr[1]=new int[2];
		arr[2]=new int[6];
		arr[3]=new int[5];	
	}
}


/* in c

#include<stdio.h>
#include<stdlib.h>

int main()
{
	int **arr=NULL;
	int row=0, col=0;
	print("Enter no of rows and column");
	scanf("%d%d",&row,&col);

	arr=(int**)malloc(sizeof(int*)*row);
	for(int i=0;i<row;i++)
	{
		arr[i]=(int*)malloc(sizeof(int)*col);
	}
	for(i=0;i<row;i++)
	{
		for(j=0;j<col;j++)
		{
			scanf("%d",&arr[i][j];
		}
	}
	return o;
}



*/
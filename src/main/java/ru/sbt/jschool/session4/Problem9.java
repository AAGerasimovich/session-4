package ru.sbt.jschool.session4;


import java.util.stream.IntStream;

public class Problem9 {
    public static void main(String[] args) {

        new Problem9().perm(7);
    }

    private void perm(int n){
        {
            System.out.println(IntStream.range(2,n+1).reduce(1,(acc,x) -> acc*x));
            for (int i=0;i<n;i++) used[i] = false;
            step (0, n);
        }
        }

static int max = 7;

static int p[] = new int[max];
static boolean used[] = new boolean[max];

public  static void finish(int n)
	{
	for (int i=0;i<n;i++) {
	    if(i==n-1){
            System.out.println((p[i] + 1));
        }else {
            System.out.print((p[i] + 1) + " ");
        }
    }

	}

public final static void step(int k, int n)
	{
	if (k==n) finish(n);
	else{
		for (int i=0;i<n;i++)
			if (!used[i])
				{
				used[i] = true;
				p[k] = i;
				step(k+1, n);
				used[i] = false;
				}
		}
	}



}


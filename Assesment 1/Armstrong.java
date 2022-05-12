//print all Amstrong numbers between 100 to 999 using while loop.

class Armstrong{
public static void main(String args[])
{
int i=100,arm,n,a;
System.out.println("Armstrong number between 100 to 999");
while(i<999)
{
n=i;
arm=0;
while(n>0)
{
a=n%10;
arm=arm+(a*a*a);
n=n/10;
}
if(arm==i)
System.out.println(i);
i++;
}
}}
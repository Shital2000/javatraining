//writw a program that take 5 numbers into array and print square value of each number.
class Array{
public static void main(String args[]){
int arr[]={1,2,3,4,5};
System.out.println("Square value of each number");
for (int i=0;i<arr.length;i++)

{
System.out.println(arr[i]+"="+(int)Math.pow(arr[i],2));
}
}
}

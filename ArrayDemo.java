public class ArrayDemo{
    public static void main(String[] args){
        int[] numbers={50,20,40,30,10};
        int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println("ArrayElements:");
        for(int num:numbers){
            System.out.println(num+"");
         }
         System.out.println("\nSum=" +sum);
         if(sum>100){
            System.out.println("Sum is greater than 100");
         }
else{
    System.out.println("Sum is less than or equal to 100");
}
    }  
}
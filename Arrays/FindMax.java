public class FindMax{
    public static void findLargestElement(int data[]){
        if(data.length == 0){
            System.out.println("The array is empty. Cannot find the largest element");
            return;
        }

        int i = 0;//index counter
        int loc = 0;//location of largest element
        int max = data[0];//value of largest element

        for(i = 1; i < data.length; i++){
            if (data[i] > max){
                max = data[i];
                loc = i;
            }
        }

        System.out.println("The largest element is:"+ max);
        System.out.println("Its location (index) is:" + loc);
    }

    public static void main(String[] args){
        int data[] = {10, 5, 20, 8, 30};
        findLargestElement(data);
    }
}

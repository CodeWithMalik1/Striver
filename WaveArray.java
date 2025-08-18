public class WaveArray {
    public static void newArr(int arr[]){
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i-1]>arr[i]){
                int swap=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=swap;

            }
            if(arr[i+1]>arr[i]){
                int swap=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=swap;

            }
            
        }

    }
    public static void printArr(int arr[]){
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]+" ");
            
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,23,3,1,27,22,18};
        newArr(arr);
        printArr(arr);
        
    }
    
}

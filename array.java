public class array{
    public static void main (String[] args){
        int nums [] = {0,1,2,3,4,5,6,7,8,9};
        insert (nums, 13, 5);
        delete(nums, 5);
        print(nums);
    }

    public static int[] insert (int[] array, int a, int index){
        if (index > array.length - 1) return null;
        for (int i = array.length -1; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = a;
        return array;
    }

    public static int[] delete (int[] array, int index){
        if (index > array.length - 1) return null;
        for (int i = index; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length - 1] = 0;
        return array;
    }

    public static void print (int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    } 
}
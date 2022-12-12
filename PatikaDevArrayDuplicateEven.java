
import java.util.Arrays;


public class PatikaDevArrayDuplicateEven {
    static boolean isFind(int[] arr, int value){
        for (int i:arr){
            if (i==value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int [] arr={3,4,2,3,7,4,5,6,1,2,9,6,7,8,5,2,8};
        System.out.println("Array : " + Arrays.toString(arr));
        int duplicate []=new int[arr.length];
        int startIndex=0;
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (i!=j && arr[i]==arr[j]){
                    if (arr[i]%2==0){
                        if (!isFind(duplicate,arr[i])){
                            duplicate[startIndex++]=arr[i];
                        }
                        break;
                    }
                }
            }
        }
        System.out.print("Tekrar Eden Çift Sayılar: ");
        for (int value : duplicate){
            if (value!=0){
                System.out.print(value+" ");
            }

        }
    }
        
    }


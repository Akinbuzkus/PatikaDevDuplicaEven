
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
        int [] list={3,4,2,3,7,4,5,6,1,2,9,6,7,8,5,2,8};
        System.out.println("Dizi : " + Arrays.toString(list));
        int duplicate []=new int[list.length];
        int startIndex=0;
        for(int i=0; i<list.length; i++){
            for (int j=0; j<list.length; j++){
                if (i!=j && list[i]==list[j]){
                    if (list[i]%2==0){
                        if (!isFind(duplicate,list[i])){
                            duplicate[startIndex++]=list[i];
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


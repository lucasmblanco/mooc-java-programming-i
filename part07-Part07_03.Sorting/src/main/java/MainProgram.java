
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};


    }

    public static int smallest(int[] numbers){
        int smallest = numbers[0];
        for(int number : numbers){
            if(smallest > number){
                smallest = number;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] numbers){
        int smallest = numbers[0];
        int index = 0;
        int smallIndex = 0;
        for(int number : numbers){
            if(number < smallest){
                smallest = number;
                smallIndex = index;
            }
            index++;
        }
        return smallIndex;
    }

    public static int indexOfSmallestFrom(int[] numbers, int startIndex){
        int smallest = numbers[startIndex];
        int indexSmallest = startIndex;
        for(int i = startIndex; i < numbers.length; ++i){
            if(smallest > numbers[i]){
                smallest = numbers[i];
                indexSmallest = i;
            }
        }
        return indexSmallest;
    }

    public static void swap(int[] numbers, int index1, int index2){
        int tmp = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = tmp;
    }

    public static void sort(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            int indexOfSmallest = indexOfSmallestFrom(numbers, i);
            swap(numbers, indexOfSmallest, i);
        }
    }
}

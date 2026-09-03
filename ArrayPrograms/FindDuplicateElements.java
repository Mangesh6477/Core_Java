
      
void main() {
        int[] arr = {7, 11, 2, 2, 3,3,3, 7, 9, 2, 4, 7};
        for (int i = 0; i < arr.length; i++) {

            boolean isRepeat = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isRepeat = true;
                }
            }

            if(isRepeat)
            continue;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    IO.print(" " + arr[i]);
                    break;
                }
            }
        }

    }

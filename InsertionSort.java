class PracticeProblem {
    public static void main(String[] args){
         char[] arr = {'c', 'a', 'b', 'e', 'g', 'f', 'd'};
    InsertionSort(arr);
		for (int i = 0; i<arr.length;i++){
			System.out.println(arr[i] + " ");
		}
      
    }
    public static void InsertionSort(char[] characters) {
      for(int i = 1; i < characters.length; i++) {
        char key = characters[i];
        int index = i - 1;
        while(index > = 0 && characters[index] > key) {
          characters[index + 1] = characters[index]; 
          index--;
        }
        characters[index + 1] = key;
      }
    }
  }

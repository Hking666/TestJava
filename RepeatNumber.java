public  class RepeatNumber{	
	final static int N = 1001;
	static int arr[] = new int[N];
	static int index = ( int )( Math.random() * N );

public static void main(String[] args) {
	
	int repeatNumber = 0;
	for( int i = 0 ; i <N-1 ; i++) {
	 arr[i] = i+1;

	
	}
	arr[arr.length-1] = ( int )( Math.random() *(N-1 )+1) ;
	swap( arr[arr.length-1]);
          
          for( int i = 0 ; i <arr.length ; i++ ) {
	
	repeatNumber = repeatNumber ^ i;
 
       }
       
	for( int i = 0 ; i < N ;i++){ 
	repeatNumber = repeatNumber ^ arr[ i ] ; // 异或数组元素，只剩下 repeatNumber
      }
	System.out.println("该数为："+ repeatNumber);


}

public static void swap( int number ) {
 	int space = 0;
	 space = arr[index];
	 arr[index] = number;
	arr[arr.length-1] = space;
   } 


}

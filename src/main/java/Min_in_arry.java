public class Min_in_arry {
    public static void main(String[] args) {
       int i ,min;//declaring 2 variable i and min
int []marks = {10,20,30,40,50};//making an array
min = marks[0];//declaring min with array of index 0
for( i = 0;i<marks.length;i++){//creating a loop for array
    if(marks[i]<min){//condition for the loop if array is less then min
        min = marks[i];//min will have the value of marks i
   }

}
           System.out.println(min);
    }
}

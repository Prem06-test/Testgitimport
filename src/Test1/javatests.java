package Test1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

import org.apache.commons.collections4.comparators.ReverseComparator;

public class javatests {

	    public int count = 0;
	    
	    public void incrementCount() {
	        count++;
	    }
	    

	    public static void main(String[] args) {
	    	javatests jt =new javatests();
	        jt.incrementCount();
	        jt.incrementCount();
	        System.out.println("Count: " + jt.count); // Output: Count: 2
	        
	        String s;
	        s=LocalDate.now().toString();
	        System.out.println(s);
	        
	        String s1="Localdate='15/10/2024 12:01'";
	        LocalDateTime s2=LocalDateTime.now();
	        //System.out.println(s2);
	        DateTimeFormatter newdate=DateTimeFormatter.ofPattern("MM/dd/yyyy");
	        String s3=s2.format(newdate);
	        System.out.println(s3);
	        String dateValue = s1.substring(s1.indexOf("'") , s1.lastIndexOf(":")); 
	  
	        
	        System.out.println("Extracted Date Value: " + dateValue);
	//reverse a string        
	        String str = "123";
//	        System.out.println(reverse(str));
	        char[] chars = str.toCharArray();
	        StringBuilder out = new StringBuilder();

			for (int i = chars.length - 1; i >= 0; i--)
				out.append(chars[i]);

			System.out.println(out.toString());
			
			//Swap numbers
			int a = 10;
			int b = 20;

		    System.out.println("a is " + a + " and b is " + b);

			a = a + b; //30
			b = a - b; //30-20
			a = a - b;//30

		    System.out.println("After swapping, a is " + a + " and b is " + b);
		    
		    String s11 = "  abc  def\t";
			
		    s11 = s11.strip();
		    		
		    System.out.println(s11);
		    System.out.println(s11.replaceAll("\\s", ""));
		    
		    LinkedList<Integer> ll = new LinkedList<>();

		    ll.add(1);
		    ll.add(2);
		    ll.add(3);

		    System.out.println(ll);

		    LinkedList<Integer> ll1 = new LinkedList<>();

		    ll.descendingIterator().forEachRemaining(ll1::add);

		    System.out.println(ll1);
		    
		    int[] array = { 1, 2, 3, 4, 5 };

		    int sum = 0;

		    for (int i : array)
		    	sum += i;

		    System.out.println(sum);
		    
		    int[] array1 = { 1, 2, 3, 4, 5, 6, 7 };

		    Random rand = new Random();

		    for (int i = 0; i < array1.length; i++) {
		    	int randomIndexToSwap = rand.nextInt(array1.length);
		    	System.out.println(randomIndexToSwap);
		    	int temp = array1[randomIndexToSwap];
		    	array1[randomIndexToSwap] = array1[i];
		    	array1[i] = temp;
		    }

		    System.out.println(Arrays.toString(array1));
		    
		    }
	    }

	    
	    




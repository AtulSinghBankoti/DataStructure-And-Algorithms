package hackerRank;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Atul
 * link: https://www.hackerrank.com/challenges/fraudulent-activity-notifications/problem
 */


public class FraudulentActivityNotifications {

	 static int activityNotifications(int[] expenditure, int d) {
		 long sum=0;    
         int p=0;
         int res=0;
         for(int i=0; i<expenditure.length; i++) {
         
             if(i==d){
                 double m= (double)sum/d;
                  if(expenditure[i] >= (m*2)) {
                     res++;
                 }
                
             }else if(i>d){
                 sum=sum-expenditure[p++];
                 double m= (double) sum/d;
                  if(expenditure[i] >= (m*2)) {
                     res++;
                 }
             } 
             
             sum += expenditure[i];
         }
         
         
         return res;
 
	 }
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String input= br.readLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int d = Integer.parseInt(input.split(" ")[1]);
		
		String input2[]=br.readLine().split(" ");
		 int arr[]= Arrays.stream(input2).mapToInt(i-> Integer.parseInt(i)).toArray();
		
		 System.out.println(activityNotifications(arr, d));
	
	}

}

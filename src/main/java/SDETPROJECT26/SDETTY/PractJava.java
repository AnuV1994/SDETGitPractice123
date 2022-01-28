package SDETPROJECT26.SDETTY;

import java.util.LinkedHashSet;
import java.util.TreeSet;

//paliendrome // System.out.println(); //  for(int i=0;i<s.length();i++){ 
//public static void main(String[] args) {
public class PractJava {
	public static void main(String[] args) {
		
		int str[]= {1,2,4,1,2,2,4,1,5};
		
		TreeSet<Integer> st = new TreeSet<Integer>();
		for(int i=0;i<str.length;i++){
		st.add(str[i]);
		}
		
		System.out.println(st);
		int count=0;
		for(int num: st) {
			count++;
		}
		System.out.println(count);
	}}
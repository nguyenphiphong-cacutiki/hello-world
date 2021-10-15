package part_01;

import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("----------- MENU -----------");
		System.out.println("moi ban lua chon chuc nang:");
		System.out.println("1. he 10 sang he 2");
		System.out.println("2. he 2 sang he 10");
		System.out.println("3. he 10 sang he 16");
		System.out.println("4. he 16 sang he 10");
		System.out.println("5. he 16 sang he 2");
		System.out.println("6. he 2 sang he 16");
		System.out.println("0. thoat");
		System.out.println("----------------------------");
		int luachon = scan.nextInt();
		switch(luachon) {
		case 1: System.out.println("moi ban nhap so can chuyen: ");
		        double a = scan.nextDouble();
		        System.out.println("ket qua: "+chuyentuthapphansanghe_b(a,2) );
		        break;
		case 2: System.out.println("moi ban nhap so can chuyen: ");   
		        String s1 = scan.next();
		        System.out.println("ket qua: "+chuyentuhe_b_sanghethapphan(s1,2) );
		        break;
		case 3: System.out.println("moi ban nhap so can chuyen: ");
		        double b = scan.nextDouble();
		        System.out.println("ket qua: "+chuyentuthapphansanghe_b(b,16) );
		        break;
		case 4: System.out.println("moi ban nhap so can chuyen: ");
		        String s2 = scan.next();
                System.out.println("ket qua: "+chuyentuhe_b_sanghethapphan(s2,16) );
                break;
		case 5: System.out.println("moi ban nhap so can chuyen: ");
		        String s3=scan.next();
		        String s3t = chuyentuhe_b_sanghethapphan(s3,16);
		        String s3k = chuyentuthapphansanghe_b(Double.parseDouble(s3t),2);
		        System.out.println("ket qua: "+s3k);
		        break;
		case 6: System.out.println("moi ban nhap so can chuyen: ");
		        String s4=scan.next();
		        String s4t = chuyentuhe_b_sanghethapphan(s4,2);
		        String s4k = chuyentuthapphansanghe_b(Double.parseDouble(s4t),16);
		        System.out.println("ket qua: "+s4k);
		}
	}
	static int tachphannguyen(double x) {
		int a = (int)x;
		return a;
	}
	static double tachphanthapphan(double x) {
		String s = String.valueOf(x);
		int index=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='.') {
				index=i;
				break;
			}
		}
		String s1 = "0.";
		for(int i=index+1;i<s.length();i++) {
			s1+=s.charAt(i);
		}
		double result = Double.parseDouble(s1);
		return result;
	}
	static String chuyenphannguyen(int x, int he) {
		ArrayList<Integer> so = new ArrayList<Integer>();
		while(x!=0) {
			int a = x%he;
			so.add(a);
			x/=he;
		}
		String s="";
		for(int i=so.size()-1;i>=0;i--) {
			if(so.get(i)==10) {
				s+='A';
			}else if(so.get(i)==11){
				s+='B';
			}else if(so.get(i)==12){
				s+='C';
			}else if(so.get(i)==13){
				s+='D';
			}else if(so.get(i)==14){
				s+='E';
			}else if(so.get(i)==15){
				s+='F';
			}else {
				s+=String.valueOf(so.get(i));
			}
			
		}
		return s;
	}
	static String chuyenphanthapphan(double x, int he) {
		if(x!=0.0) {
			String s=".";
			while(x!=0.0) {
				x*=he;
				if(tachphannguyen(x)==10) {
					s+='A';
				}else if(tachphannguyen(x)==11) {
					s+='B';
				}else if(tachphannguyen(x)==12) {
					s+='C';
				}else if(tachphannguyen(x)==13) {
					s+='D';
				}else if(tachphannguyen(x)==14) {
					s+='E';
				}else if(tachphannguyen(x)==15) {
					s+='F';
				}else {
					s+=String.valueOf(tachphannguyen(x));
				}
				x=tachphanthapphan(x);
			}
			return s;
		}
		return "";
		
	}
	static String chuyentuthapphansanghe_b(double x, int he) {
		int a1 = tachphannguyen(x);
		String s1 = chuyenphannguyen(a1, he);
		double b1 = tachphanthapphan(x);
		String s2 = chuyenphanthapphan(b1,he);
		return s1+s2;
		
	}
	
	static String tachchuoinguyen(String s) {
		String kq="";
		int i=0;
		while(s.charAt(i)!='.') {
			kq+=s.charAt(i);
			i++;
		}
		return kq;
	}
	static String tachchuoithapphan(String s) {
		String kq="";
		int index = 0;
		for(int i = 0; i<s.length();i++) {
			if(s.charAt(i)=='.') {
				index=i;
				break;
			}
		}
		for(int i = index + 1;i<s.length();i++) {
			kq+=s.charAt(i);
		}
		return kq;
	}
    static String chuyenphannguyen2(String s,int he) {
    	ArrayList<Integer> temp = new ArrayList<Integer>();
    	for(int i=s.length()-1;i>=0;i--) {  		
    		if(s.charAt(i)=='A') {
    			temp.add(10);
    		}else if(s.charAt(i)=='B') {
    			temp.add(11);
    		}else if(s.charAt(i)=='C') {
    			temp.add(12);
    		}else if(s.charAt(i)=='D') {
    			temp.add(13);
    		}else if(s.charAt(i)=='E') {
    			temp.add(14);
    		}else if(s.charAt(i)=='F') {
    			temp.add(15);
    		}else {
    			temp.add(s.charAt(i)-'0');
    		}
    	}
    	int sum =0;
    	for(int i =0; i<s.length();i++) {
    		sum+=temp.get(i)*(int)Math.pow(he, i);
    	}
    	return String.valueOf(sum);
    }
    static String chuyenphanthapphan2(String s, int he) {
    	ArrayList<Integer> temp =  new ArrayList<Integer>();
    	for(int i = 0;i<s.length();i++) {
    		if(s.charAt(i)=='A') {
    			temp.add(10);
    		}else if(s.charAt(i)=='B') {
    			temp.add(11);
    		}else if(s.charAt(i)=='C') {
    			temp.add(12);
    		}else if(s.charAt(i)=='D') {
    			temp.add(13);
    		}else if(s.charAt(i)=='E') {
    			temp.add(14);
    		}else if(s.charAt(i)=='F') {
    			temp.add(15);
    		}else {
    			temp.add(s.charAt(i)-'0');
    		}
    	}
    	double sum=0.0;
    	for(int i=0; i<temp.size();i++) {
    		sum+=temp.get(i)*Math.pow(he,-(i+1));
    	}
    	String k = String.valueOf(sum);
    	return k;
    }
    static String chuyentuhe_b_sanghethapphan(String s, int he) {
    	String s1 = tachchuoinguyen(s);
    	String s2 = tachchuoithapphan(s);
    	String kq1 = chuyenphannguyen2(s1,he);
    	String kq2 = chuyenphanthapphan2(s2,he);
    	double x = (double)Double.parseDouble(kq1)+Double.parseDouble(kq2);
    	String ss = String.valueOf(x);
    	boolean check = false;
    	for(int i=ss.indexOf('.')+1;i<ss.length();i++) {
    		if(ss.charAt(i)!='0') {
    		 check = true;
    		 break;
    		}
    	}
    	if(check==false) {
    	ss=ss.replace(".0","");
    	}
    	return ss;
    }
}

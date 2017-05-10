import java.io.IOException;
import java.util.Scanner;

class Course
{
	String name;
	double grade = 0;
}

public class Grade
{
	static double determination(int alpha, int plus)
	{
		double result = 0.0;
		
		switch(alpha)
		{
			case 'A': result += 4.0; break;
			case 'B' : result += 3.0; break;
			case 'C' : result += 2.0; break;
			case 'D' : result += 1.0; break;
		}
		if(plus == 1) result += 0.5;
		
		return result;
	}
	
	public static void main(String args[]) throws IOException
	{
		double calculate = 0;
		int alpha;
		int plus;
		Scanner sc = new Scanner(System.in);
		System.out.print("과목 수 : ");
		int cmd = sc.nextInt();
		System.out.println();
		
		Course[] refCourse = new Course[cmd];
		for(int cnt = 0; cnt < cmd; cnt++)
			refCourse[cnt] = new Course();
		
		for(int i = 0; i < cmd; i++)
		{
			System.out.print("과목명 : ");
			refCourse[i].name = sc.next();
			System.out.print("결과 입력 : ");
			alpha = System.in.read();
			System.out.print("+ 여부 (있을 경우 1, 없으면 0) : ");
			plus = sc.nextInt();
			refCourse[i].grade = determination(alpha,plus);
		}
		
		System.out.println();
		System.out.println("결과");
		for(int i = 0; i < cmd; i++)
		{
			//System.out.println(i + "\t" + refCourse[i].name + "\t" + refCourse[i].grade);
			calculate += refCourse[i].grade;
		}
		System.out.println("총 학점 : "+calculate);
		System.out.println("평균 : "+calculate/cmd); 
		
		sc.close();
	}
}

import java.util.*;
class Stud
{ static double avg;
 int rollno;
 float acad,sport,cult;
 double final_score;
 String status;
 Stud(int a)
 {
 rollno=a+1; 
 }
 double score(float a,float b,float c)
 { 
 acad=a;
 sport=b;
 cult=c;
 final_score=a*1.2+b*0.5+c*0.3;
 return final_score;
 }
 void stat_calc() 
 { if(final_score>=avg)
 status="Qualified";
 else
 status="Not Qualified"; 
 }
 void display()
 {
 stat_calc();
 System.out.println(rollno+" "+acad+" 
"+sport+" "+cult+" "+final_score+" 
"+status+"\n");
 } 
}
class A

 { 
 public static void main(String args[])
{ static Scanner sc = new Scanner(System.in);

 finalScore status"+"\n");
 System.out.println("Rollno acad sport cult 
 Stud.avg=k/n;
 }
 k+=s[i].score(x,y,z);
 z = enter();
of student "+(i+1));
 System.out.println("Enter the cultural marks 
 y = enter();
student "+(i+1));
 System.out.println("Enter the sports marks of 
 x = enter();
of student "+(i+1));
 System.out.println("Enter the Academic marks 
 s[i] = new Stud(i);
 { 
 for(int i=0;i<n;i++)
 Stud[] s = new Stud[n];
 n = sc.nextInt();
 System.out.println("Enter the no of students");
 double k=0;
 float x,y,z;
 int n;
 s[i].display();
 for(int i=0;i<n;i++)
 float k;
 { boolean flag= false;
 static float enter()
 }

}
 }
 return k; 
 }while(flag);
 }
 flag = true;
marks again");
 System.out.println("wrong value!! enter the 
 {
 if(k>50||k<0)
 k = sc.nextFloat();
 { flag=false;
 do

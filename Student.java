import java.util.Scanner;
class Student{
String USN , Name ;
int Credits[] = new int[5] ;
int Marks[] = new int[5];

void acceptDetails(){
Scanner s = new Scanner(System.in);
System.out.println("Enter USN :");
USN = s.nextLine();
System.out.println("Enter Name :");
Name = s.nextLine();
for(int i=0;i<5;i++){
System.out.println("Enter the credits for  subject "+ (i+1)+" :");
Credits[i]=s.nextInt();
System.out.println("Enter the marks for  subject "+ (i+1)+" :");
Marks[i]=s.nextInt();
}
}

void displayDetails(){
System.out.println("Usn : "+USN);
System.out.println("Name : "+Name);
for(int i=0;i<5;i++){
System.out.println("Subject "+(i+1)+" - Credits : "+Credits[i]+" , Marks : "+Marks[i]);
}
}

int gradePoints(int marks){
if(marks>=90) return 10;
else if(marks>=80) return 9;
else if(marks>=70) return 8;
else if(marks>=60) return 7;
else if(marks>=50) return 6;
else if(marks>=40) return 5;
else return 0;
}

void SGPA(){
int totalCredits = 0;
int totalGradePoints=0;

for(int i=0;i<5;i++){
totalCredits += Credits[i];
totalGradePoints += gradePoints(Marks[i]) * Credits[i];
double Sgpa = totalGradePoints/totalCredits;
System.out.println("The SGPA of the student is :"+Sgpa);
}
}
}


class main{
public static void main(String[] args){
Student obj = new Student ();
obj.acceptDetails();
obj.displayDetails();
obj.SGPA();
}
}
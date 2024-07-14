import java.util.Scanner;

class gradeCal {
    private float phy,chem,math,total,avg;
    private String grade;
    
    public gradeCal()
    {
        phy=0;
        chem=0;
        math=0;        
    }
    public gradeCal(float f1,float f2,float f3)
    {
        phy=f1;
        chem=f2;
        math=f3;
    }
    public void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics: ");
        phy = sc.nextFloat();
        System.out.println("Enter marks of chemistry: ");
        chem = sc.nextFloat();
        System.out.println("Enter marks of maths: ");
        math = sc.nextFloat();
        sc.close();
    }
    public void cal()
    {
        total = phy+chem+math;
        avg = total/3;
        if(avg>=90)
			grade = "A+";
		else if(avg>=80)
			grade = "A";
		else if(avg>=70)
			grade = "B+";
		else if(avg>=60)
			grade = "B";
		else if(avg>=50)
			grade = "C";
		else if(avg>=40)
			grade = "D";
		else
			grade = "F";
    }
    public void disp()
    {
        System.out.println("Total marks = "+total);
        System.out.println("Average percentage = "+avg);
        System.out.println("Grade = "+grade);
    }
    public static void main (String[] args) {
		gradeCal s1 = new gradeCal();
        s1.read();
        s1.cal();
        s1.disp();
    }
}

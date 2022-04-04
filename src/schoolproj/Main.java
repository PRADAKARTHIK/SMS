package schoolproj;
import java.util.*;

public class Main {

    public static void main(String[] args) {
       
        String t="Teacher";
        String s="student";
        Teacher science = new Teacher(1,"Delphie",    "Science",    7000.00);
        Teacher social	 = new Teacher(2,"Shana",     "social",   	6000.00);
        Teacher english = new Teacher(3,"Daffie",  "English",    9000.00);
        Teacher maths   = new Teacher(4,"Nilofer",  	 "Mathss",   7900.00);

        
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(science);
        teacherList.add(social);
        teacherList.add(english);
        teacherList.add(maths);



        Student1 s1 = new Student1(1,		"Abhi",		"Male");
        Student1 s2 = new Student1(2,		"sonia",	"Female");
        Student1 s3 = new Student1(3,		"lucky",	"Female");
        
        List<Student1> studentList = new ArrayList<>();

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        System.out.println("========================================================================================");
        System.out.println("\t\t\t\t\tD.A.V Public School Database\t\t\t\t\t\t");
        System.out.println("======================================================================================================");

       

       System.out.println("1.TeacherRecord");      
       System.out.println();
       System.out.println("6.Student Record");
       System.out.println();
       Scanner scan=new Scanner(System.in);
       System.out.println("Choose the value");
       int ch=scan.nextInt();
       if(ch==1)
       
      {
    	System.out.println("2.Science Teacher sample");
        System.out.println("3.Social Teacher");
        System.out.println("4.English Teacher");
        System.out.println("5.Maths Teacher");
        System.out.println();
      	Scanner scan1=new Scanner(System.in);
    	System.out.println("Select the teachers data you want to display: ");
    	int c=scan1.nextInt();
    	
    	if(c==2)
    	{
    		System.out.println("2.Science Teacher");
            System.out.println("3.Social Teacher");
            System.out.println("4.English Teacher");
            System.out.println("5.Maths Teacher");
            System.out.println();
    		System.out.println("Here comes the data"+science.getName()+"!");
    		System.out.println("===============================================");
    		System.out.println("Designation  	   : "+t);
    		System.out.println("Name of the teacher: " + science.getName());
    		System.out.println("Subject            : " +science.getSubject());
    		System.out.println(" Salary income     : "+science.getSalary());
    		System.out.println("\n=============================================");
    	}
    	
    	else if(c==3)
    	{
    		System.out.println("2.Science Teacher");
            System.out.println("3.Social Teacher");
            System.out.println("4.English Teacher");
            System.out.println("5.Maths Teacher");
            System.out.println();
    		System.out.println("Here comes the data"+social.getName()+"!");
        	System.out.println("===============================================");
            System.out.println("Designation  	   : "+t);
            System.out.println("Name of the teacher: " + social.getName());
            System.out.println("Subject            : " +social.getSubject());
            System.out.println(" Salary income     : "+social.getSalary());
            System.out.println("\n=============================================");
        	}
    	
    	else if(c==4)
    	{
    		System.out.println("2.Science Teacher");
            System.out.println("3.Social Teacher");
            System.out.println("4.English Teacher");
            System.out.println("5.Maths Teacher");
            System.out.println();
    		System.out.println("Here comes the data"+english.getName()+"!");
        	System.out.println("===============================================");
            System.out.println("Designation  	   : "+t);
            System.out.println("Name of the teacher: " + english.getName());
            System.out.println("Subject            : " +english.getSubject());
            System.out.println(" Salary income     : "+english.getSalary());
            System.out.println("=============================================");
        }
    	else if(c==5)
    	{
    		System.out.println("2.Science Teacher");
            System.out.println("3.Social Teacher");
            System.out.println("4.English Teacher");
            System.out.println("5.Maths Teacher");
            System.out.println();
    		System.out.println("Here comes the data"+maths.getName()+"!");
    		System.out.println("===============================================");
    		System.out.println("Designation  	   : "+t);
    		System.out.println("Name of the teacher: " + maths.getName());
    		System.out.println("Subject            : " +maths.getSubject());
    		System.out.println("Salary income      : "+maths.getSalary());
    		System.out.println("===============================================");

    		}
      	}
         
       else if(ch==6)
    	{
    		System.out.println("7.Student Record");
    		System.out.println("8.Student Record");
    		System.out.println("9.Student Record");
    		Scanner scan2=new Scanner(System.in);
    		System.out.println("Select the Student data you want to display: ");
       	 	int c=scan2.nextInt();
      	
       	 	if(c==7)
       	 	{
       	 		System.out.println("6.Student Record");
       	 		System.out.println("7.Student Record");
       	 		System.out.println("8.Student Record");  
       	 		System.out.println("Here comes the data"+s1.getName()+"!");
       	 		System.out.println("===============================================");
       	 		System.out.println("Designation  	 : "+s);
       	 		System.out.println("Student Name	 : " +s1.getName());
       	 		System.out.println("Admission ID	 : "+s1.getId());
       	 		System.out.println("Gender 			 : "+ s1.getGender());
       	 		System.out.println("===============================================");
        
       	 	}
      	
       	 	else if(c==8)
       	 	{
       	 		System.out.println("6.Student Record");
       	 		System.out.println("7.Student Record");
       	 		System.out.println("8.Student Record");
       	 		System.out.println("Here comes the data"+s2.getName()+"!");
       	 		System.out.println("===============================================");
       	 		System.out.println("Student Name    : "+ s2.getName());
       	 		System.out.println("Admission ID	: "+s2.getId());
       	 		System.out.println("Gender			: "+ s2.getGender());
       	 		System.out.println("===============================================");
       	 	}
      	
       	 	else if(c==9)
       	 	{
       	 		System.out.println("6.Student Record");
       	 		System.out.println("7.Student Record");
       	 		System.out.println("8.Student Record");
       	 		System.out.println("Here comes the data"+s3.getName()+"!");
       	 		System.out.println("===============================================");   
       	 		System.out.println("Student Name 	: "+ s3.getName());
       	 		System.out.println("Admission ID 	: "+s3.getId());
       	 		System.out.println("Gender		    : "+ s3.getGender());
       	 		System.out.println("===============================================");

       	 	}
    	}
    }
}
package za.ac.cput;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest
{

    Set<String> studentName = new HashSet<>();
    Collection<String> studentLastName = new LinkedHashSet();
    List<Integer> studentNumber = new ArrayList<>();
    Map<Integer, Double> mark = new HashMap();

    @Test
    void add()
    {
       //Set
        studentName.add("velabahleke");
        studentName.add("Zikhindizabelungu");
        studentName.add("Xham'akavinjelwa");
        System.out.println("Student Names: " + studentName);
        assertEquals(3, studentName.size());

        System.out.println("-------------------------------------------------");

       //Collection
        studentLastName.add("Zithazimfuna");
        studentLastName.add("Nxebalendoda");
        studentLastName.add("Misuzulu");
        System.out.println("Student lastnames:" + studentLastName);
        assertEquals(3, studentLastName.size());

        System.out.println("-------------------------------------------------");

        //List
        studentNumber.add(218223420);
        studentNumber.add(220558465);
        studentNumber.add(218898545);
        System.out.println("Student Numbers: " + studentNumber);
        assertEquals(3, studentNumber.size());

        System.out.println("-------------------------------------------------");

        //Map
        mark.put(1, 90.5);
        mark.put(2, 80.0);
        mark.put(3, 100.0);
        System.out.println("Marks: " + mark);
        assertEquals(3, mark.size());

    }

    @Test
    void remove()
    {
        //Set
        studentName.add("Velabahleke");
        studentName.add("Zikhindizabelungu");
        studentName.add("Xham'akavinjelwa");
        studentName.remove("Zikhindizabelungu");
        //System.out.println("This is a removed Student Name: " + studentName.contains("Zikhindizabelungu")) ;
        System.out.println("Only these student names are left in the database: " + studentName);
        assertEquals(2, studentName.size());
        System.out.println("-------------------------------------------------");


        //Collection
        studentLastName.add("Zithazimfuna");
        studentLastName.add("Nxebalendoda");
        studentLastName.add("Misuzulu");
        studentLastName.remove("Nxebalendoda");
        //System.out.println("This is a removed Student Lastname: " + studentLastName.contains("Nxebalendoda"));
        System.out.println("Only these student lastnames are left on the database: " + studentLastName);
        assertEquals(2, studentLastName.size());
        System.out.println("-------------------------------------------------");


        //List
        studentNumber.add(218223420);
        studentNumber.add(220558465);
        studentNumber.add(218898545);
        studentNumber.remove(1);
        System.out.println("This is a removed Student Number: " + studentNumber.get(1));
        System.out.println("Only these student numbers are left in the database: " + studentNumber);
        assertEquals(2, studentNumber.size());
        System.out.println("-------------------------------------------------");


        //Map
        mark.put(1, 90.5);
        mark.put(2, 80.0);
        mark.put(3, 100.0);
        mark.remove(2, 80.0);
        //System.out.println("This is a removed mark" + mark.get(80.0));
        System.out.println("Only these marks are left on the database: " + mark);

    }

    @Test
    void find()
    {
        //Set
        studentName.add("Velabahleke");
        studentName.add("Zikhindizabelungu");
        studentName.add("Xham'akavinjelwa");
        System.out.println("Searching student name: Zikhindizabelungu");

        System.out.println(studentName.contains("Zikhindizabelungu") + " has found");
        if(studentName.contains("Zikhindizabelungu") == true)
        {
            assertEquals(true, studentName.contains("Zikhindizabelungu") );

        }
        else
            System.out.println("Do not find the name");
        System.out.println("-------------------------------------------------");

        //Collection
        studentLastName.add("Zithazimfuna");
        studentLastName.add("Nxebalendoda");
        studentLastName.add("Misuzulu");
        System.out.println("Search student lastname: Misuzulu");
        System.out.println(studentLastName.contains("Misuzulu") + " has found");
        if(studentLastName.contains("Misuzulu") == true)
        {
            assertEquals(true, studentLastName.contains("Misuzulu"));
        }
        else
            System.out.println("Do not find the lastname");
        System.out.println("-------------------------------------------------");

        //List
        studentNumber.add(218223420);
        studentNumber.add(220558465);
        studentNumber.add(218898545);
        System.out.println("Searching student number: 218223420");
        System.out.println(studentNumber.get(0) + " has found");
        assertEquals(218223420, studentNumber.get(0));
        System.out.println("-------------------------------------------------");

        //Map
        mark.put(1, 90.5);
        mark.put(2, 80.0);
        mark.put(3, 100.0);
        System.out.println("Searching mark: 100");
        System.out.println(mark.get(3) + " has found");
        assertEquals(100, mark.get(3));

    }

}

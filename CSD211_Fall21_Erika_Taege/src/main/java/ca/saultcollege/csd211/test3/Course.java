/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.saultcollege.csd211.test3;

/**
 *
 * @author Jaequella
 */
public class Course {
    //declare variables, all are instance variables here
    private String name;
    private String code;
    private String startDate;
    private int numberOfStudents;
    private int count;
    public Course(){} //default constructor
    public Course(String name, String code, String startDate, int numberOfStudents, int count){ //Attribute initalisor.
    this.name = name;
    this.code = code;
    this.startDate = startDate;
    this.numberOfStudents = numberOfStudents;
    this.count = count;
    }
    @BeforeEach //NO clue why the befoeEach and Test methods arent initalising. it SHOULD be in scope???
    void setUp(){
        
    }
    @Test
    void testSame(){
    Course c1 = new Course("Intro to Java","CSD211","September 8th",21,12);
    Course c2 = new Course("Intro to c#","CSD211","September 6th",23,20);
    String code1 = c1.getcode();
    String code2 = c2.getcode();
        if (code1.compareTo(code2) == 0){ //return 0 if they are the same
            System.out.println("Course 1 and 2 have the same class code of "+ code1 +". please contact an admin.");
        }
    }
    
    @Test
    void testDifferent(){
    Course c1 = new Course("Intro to Java","CSD211","September 8th",21,12);
    Course c2 = new Course("Intro to c#","CSP511","September 6th",23,20);
    String code1 = c1.getcode();
    String code2 = c2.getcode();
        if (code1.compareTo(code2) == 1){ //return 0 if they are the same
            System.out.println("Course 1 and 2 are different classes.");
        }
    }
    //I don't understand why beforeEach and test don't want to initialise here???
    
    //get set methods
    public int getnumberOfStudents() {
        return numberOfStudents;
    }
     public void setnumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
     }
     public int getcount() {
        return count;
    }
     public void setumberOfStudents(int count) {
        this.count = count;
     }
     public String getcode() {
        return code;
    }
    public void setcode(String code) {
        this.code = code;
    }
    public String getstartDate() {
        return startDate;
    }
    public void setstartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getname() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }
}

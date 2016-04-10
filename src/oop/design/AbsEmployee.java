package oop.design;

/**
 * Created by imran on 4/10/2016.
 */
public abstract class AbsEmployee implements Employee {


    private int employeeId;
    private String employeeName;
    private String department;
    private int salary;
    //this will return employeeID
    public int employeeId(){

         return employeeId;
    }

    //this will return employee name
    public String employeeName(){
        return employeeName;
    }

    // this will assign department
      public void assignDepartment(String department){

          this.department=department;
     }

      //calculate salary
      public int calculateSalary(){
          salary=salary+10000;
          return salary;
      }


    //employee benefit
    public void benefitLayout(){
        System.out.println("Hello");
    }


}

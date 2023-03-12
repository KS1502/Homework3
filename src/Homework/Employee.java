package Homework;

public class Employee {
   private String name;
   private double salary;
  private int hour;


   public Employee(String name,double salary,int hour) {
       this.name = name;
       this.salary = salary;
       this.hour = hour;

   }
   public String getName() {
       return name;
   }
   public double getSalary(){
       return salary;
   }

    public int getHour() {
        return hour;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHour(int hour) {
        if(hour<6) {
            this.hour = hour;
        }else {
            System.out.println("добавляющий 5 евро к зарплате сотрудника если количество рабочих часов в день больше 6");


        }
    }

    public void  setSalary(double salary) {
        if(salary>500 ) {
        this.salary =salary;

        } else {
            System.out.println("добавляющий 10 евро к зарплате если зарплата сотрудника меньше 500");
        }




    }



    }









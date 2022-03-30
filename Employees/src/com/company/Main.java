package com.company;

public class Main {

    public static void main(String[] args) {
        Intern intern1 = new Intern("InternInternovich",500);
        Employee intern2=new Intern("InternInternovich2",501);
        //Programmer inte4=new Intern("InternInternovich2",501);
        //Employee intern3 = new Employee("programmer",1000);

        intern1.qwe();
        ( (Intern)intern2 ).qwe();  // Операция (type)variableName  это операция принудительного изменения типа переменной,
                                    // приведение переменной variableName к типу type

    /*
        intern1.note="Intern1";
        Intern intern5=intern1;    // !! intern1 and intern2 are the same object
        intern5.note="intern5";
        System.out.println("Intern1: "+intern1);
        System.out.println("Intern5: "+intern5);


     */
   //child   " is a " parent




        FrontEndProgrammer p1=new FrontEndProgrammer("Ivan",1000);
	    BackEndProgrammer p2=new BackEndProgrammer("Nick",1500);
	    QAEngineer q1=new QAEngineer("Lena",1200);
	    QAEngineer q2=new QAEngineer("Max",1100);


        Employee[] employee = { p1,p2,q1,q2,
                new Intern("Jack",200),
                new Manager("Olga",3000,2000)
        };

        //Employee employee1 = new Employee("qwe",45);

        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
            employee[i].getPaid();
            employee[i].doWork();
        }

        System.out.println("--------------------------");
        BackEndProgrammer backEndProgrammer= new BackEndProgrammer("Ron",7000);
        FrontEndProgrammer frontEndProgrammer=new FrontEndProgrammer("Neron",6000);

        backEndProgrammer.doWork();
        frontEndProgrammer.doWork();
        backEndProgrammer.getPaid();
        frontEndProgrammer.getPaid();
    }
}

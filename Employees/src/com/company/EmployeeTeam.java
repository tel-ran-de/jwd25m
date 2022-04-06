package com.company;

import java.util.Arrays;

public class EmployeeTeam {
    private Employee[] team;
    private int capacity=2;
    private int currentIndex=0;

    public void add(Employee e){
        if (team==null){
            team= new Employee[capacity];
            currentIndex=0;
        }
        if (currentIndex>=capacity){
            capacity*=2;
            team= Arrays.copyOf(team,capacity);

           /*
            Employee[] temp= new Employee[capacity*2];
            for (int i = 0; i < capacity; i++) {
                temp[i]=team[i];
            }
            capacity*=2;
            team = temp;
         */
        }

        team[currentIndex++]=e;

        //System.out.println(Arrays.toString(team));
    }

    public EmployeeTeam(int capacity) {
        this.capacity = capacity;
    }
    public EmployeeTeam() {

    }

    public void print(){
        System.out.print("Team: ");
        for (int i = 0; i <currentIndex ; i++) {
            System.out.println(i+ ": " + team[i] + "   ");
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Team{" + Arrays.toString(team) +  '}';
    }

    public int findEmployee(Employee employee){
        if (employee != null)
            for (int i = 0; i < currentIndex; i++) {
                if (team[i] != null &&
                        team[i].hashCode() == employee.hashCode() &&
                        team[i].equals(employee))
                    return i;
            }
        return -1;
    }

    public void remove(int index){
        if(currentIndex>0&&index<=currentIndex) {
            System.arraycopy(team, index + 1, team, index, capacity - 1 - index);
            currentIndex--;
        }
    }

    public void remove(int index, boolean flag){     // OVERLOADING the remove method!!
        if(flag){
            System.out.println("remove element "+index);
        }
        remove(index);

    }


    public void remove(Employee employee){
        int index= findEmployee(employee);
        if(index!=-1){
            remove(index);
        }

    }
    public void remove(String str){

    }





}

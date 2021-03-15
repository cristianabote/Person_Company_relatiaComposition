package com.company;

class Person{
    String name;
    int age;

    Person (String name, int age){
        this.name=name;
        this.age=age;
    }
    public String toString (){     // functie de printare
        return  "Numele: "+ this.name+", varsta: "+age;
    }
}
class Company{
    Person team[]; // Composition
    int teamSize;
    Company (int teamSize){
        this.teamSize=teamSize;
        team=new Person[teamSize];
        for (int i=0; i<teamSize;i++){
            String teamPname="Employee "+i;
            team[i]=new Person(teamPname,24+i);
        }
    }
    public int getTeamSize(){
        return this.teamSize;
    }
    public  void getTeam(){
        for(int i=0; i< this.teamSize;i++){
            System.out.println(team[i]);
        }
    }
}
public class Main {

    public static void main(String[] args) {
	//  relatie de Composition
        Company secretCompany=new Company(6);
        secretCompany.getTeam();
        secretCompany=null; // instanta team( de tip Person) din Company va fi stearsa
    }
}

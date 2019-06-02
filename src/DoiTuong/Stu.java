/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DoiTuong;

/**
 *
 * @author ti
 */
public class Stu {
    String name;
    int age;
    
    public Stu(){}
    
    public Stu(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    /**
     *
     * @return
     */
    public String toString(){
        return "Student Name: "+getName() + " Age: "+getAge();
    }
    
}

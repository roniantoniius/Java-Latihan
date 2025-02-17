/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Person {
    private String nama;
    private Education education;
    public Person(String nama, Education educ){
        this.nama = nama;
        this.education = educ;
    }
    public String getNama(){
        return this.nama;
    }
    public Education getEducation(){
        return this.education;
    }
    @Override
    public String toString(){
        return getNama() + ", " + getEducation();
    }
}

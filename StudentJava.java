/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.java;
import java.util.Random;
import javax.swing.JOptionPane;
/**
 *
 * @author swathi
 */
public class StudentJava {

    private int rno;
    private String name;
    private int class_no;
    private int[] marks = new int[5];
    private int total;
    private int average;

    public StudentJava(int rno, String name, int class_no) {
        this.rno = rno;
        this.name = name;
        this.class_no = class_no;
    }

    public void readMarks() {
        Random r_obj = new Random();
        for (int i = 0; i < marks.length; i++) {
            //marks[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter marks in subj" + (i + 1)));
            marks[i] = r_obj.nextInt(101);
        }
    }

    public void calTotal() {
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
    }

    public void calAvg() {
        average = total / marks.length;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClass_no() {
        return class_no;
    }

    public void setClass_no(int class_no) {
        this.class_no = class_no;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "Student{" + "rno=" + rno + ", name=" + name + ", class_no=" + class_no + ", total=" + total + ", average=" + average + '}';
    }    
    
}

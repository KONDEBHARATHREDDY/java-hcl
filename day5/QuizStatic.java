package com.hcl.day5;

public class QuizStatic {
    static int score;
    public void incr() {
        score++;
    }
    @Override
    public String toString() {
        return "QuizStatic [score=" +score +"]";
    }
  public static void main(String[] args) {
    QuizStatic obj1=new QuizStatic();
    obj1.incr();
    System.out.println(obj1);
    QuizStatic obj2=new QuizStatic();
    obj1.incr();
    System.out.println(obj2);
    QuizStatic obj3=new QuizStatic();
    obj1.incr();
    System.out.println(obj3);
    
    
}

}

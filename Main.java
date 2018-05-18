package ru.virtus.pro;

public class Main {

  public static void main(String[] args) {
    DBWorker db = new DBWorker();
    User user = db.getUserById(3);
    System.out.println(user);


  }

}
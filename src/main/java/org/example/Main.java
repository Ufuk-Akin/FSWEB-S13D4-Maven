package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point (6,5);
        Point second = new Point (3,1);
        first.distance();

        System.out.println("distance(0,0)= " + first.distance()); // 0,0

        System.out.println("distance(second)= " + first.distance(second)); // second noktasına uzaklık
        System.out.println("distance(2,2)= " + first.distance(2, 2)); // 2,2 e uzaklık

        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());


        System.out.println("-------------------");


        Player player1 = new Player("ufuk" , 100 , Weapon.AXE) ;
        System.out.println(player1);
        System.out.println("health remaining p1: " + player1.healthRemaining());

        Player player2 = new Player("akın" , 60 , Weapon.SWORD);
        player2.loseHealth(48);

        System.out.println("health remaining p2: " + player2.healthRemaining());

        player1.loseHealth((int) (player2.getWeapon().getDamage() * player2.getWeapon().getAttackSpeed()));
        System.out.println(player1.healthRemaining());



    }
}
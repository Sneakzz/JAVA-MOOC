/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kenny
 */
public class Main {

    public static void main(String[] args) {
        // testing Bird class
//        Bird bird1 = new Bird("Rose Starling", "Sturnus roseus", 2012);
//        Bird bird2 = new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012);
//        Bird bird3 = new Bird("Hooded Crow", "Corvus corone cornix", 2012);
//        Bird bird4 = new Bird("Rose-Coloured Pastor", "Sturnus roseus", 2000);
//        
//        System.out.println(bird1.equals(bird2));
//        System.out.println(bird1.equals(bird3));
//        System.out.println(bird1.equals(bird4));
//        System.out.println(bird1.hashCode() == bird2.hashCode());

        // testing RingingCentre class
        RingingCentre ringingCenter = new RingingCentre();

        ringingCenter.observe(new Bird("Rose Starling", "Sturnus roseus", 2012), "Arabia");
        ringingCenter.observe(new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012), "Vallila");
        ringingCenter.observe(new Bird("European Herring Gull", "Larus argentatus", 2008), "Kumpulanmäki");
        ringingCenter.observe(new Bird("Rose Starling", "Sturnus roseus", 2008), "Mannerheimintie");

        ringingCenter.observations(new Bird("Rose-Coloured Starling", "Sturnus roseus", 2012));
        System.out.println("--");
        ringingCenter.observations(new Bird("European Herring Gull", "Larus argentatus", 2008));
        System.out.println("--");
        ringingCenter.observations(new Bird("European Herring Gull", "Larus argentatus", 1980));
    }
}

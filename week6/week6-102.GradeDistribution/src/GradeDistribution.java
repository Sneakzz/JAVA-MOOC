
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Kenny
 */
public class GradeDistribution {

    private Scanner scanner;
    private ArrayList<Integer> scores;
    private int[] grades;
    private int amountOfAccepted;

    public GradeDistribution(Scanner scanner) {
        this.scanner = scanner;
        this.scores = new ArrayList<Integer>();
        this.grades = new int[6];
    }
    
//    private void addScores() {
//        this.scores.add(34);
//        this.scores.add(41);
//        this.scores.add(53);
//        this.scores.add(36);
//        this.scores.add(55);
//        this.scores.add(27);
//        this.scores.add(43);
//        this.scores.add(40);
//    }

    public void setScores() {
        System.out.println("Type exam scores, -1 completes:");

        while (true) {
            int score = Integer.parseInt(scanner.nextLine());
            
            if (score >= 0 && score <= 60) {
                this.scores.add(score);
            } else if (score < 0) {
                break;
            }
        }
    }

    public void calculateGrades() {
        initGrades();
        for (int score : scores) {
            if (score >= 0 && score <= 29) {
                this.grades[0]++;
            } else if (score >= 30 && score <= 34) {
                this.grades[1]++;
                this.amountOfAccepted++;
            } else if (score >= 35 && score <= 39) {
                this.grades[2]++;
                this.amountOfAccepted++;
            } else if (score >= 40 && score <= 44) {
                this.grades[3]++;
                this.amountOfAccepted++;
            } else if (score >= 45 && score <= 49) {
                this.grades[4]++;
                this.amountOfAccepted++;
            } else if (score >= 50 && score <= 60) {
                this.grades[5]++;
                this.amountOfAccepted++;
            }
        }
    }

    public void printGradeDistribution() {
        //addScores();
        DecimalFormat df = new DecimalFormat("#0.00");
        calculateGrades();
        String text = "Grade distribution: \r\n";
        for (int i = this.grades.length - 1; i >= 0; i--) {
            text += i + ": " + printStars(i) + "\r\n";
        }
        
        text += "Acceptance percentage: " + df.format(acceptancePercentage());
        
        System.out.println(text);
    }
    
    public double acceptancePercentage() {
        double percentage = 100.0 * this.amountOfAccepted / this.scores.size();
        return percentage;
        
    }
    
    public String printStars(int i) {
        String stars = "";
        for (int j = 0; j < this.grades[i]; j++) {
            stars += "*";
        }
        
        return stars;
    }

    private void initGrades() {
        for (int i = 0; i < this.grades.length; i++) {
            this.grades[i] = 0;
        }
    }
}

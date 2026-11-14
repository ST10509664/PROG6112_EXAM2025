/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10509664_prog6112_exam2025;

/**
 *
 * @author bibia
 */
public class ST10509664_PROG6112_Exam2025 {
    
    public static void main(String[] args) {
        // 2D ARRAY
        int[][] sales = {{300, 150, 700},{250,200,600}};
        int total = 0;
        int min = sales[1][1];
        int max = sales[1][1];
        for (int r = 0; r < sales.length; r++)
        {
            for (int c = 0; c < sales[r].length; c++)
            {
                //total for each 
                 total += sales[r][c];
                 //check for minimum
                if (sales[r][c] < min){
                    min = sales[r][c];
                }
                //check for maximum
                if (sales[r][c] > max){
                    max = sales[r][c];
                }
            }
        }
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println("===========================");
        System.out.println("Total sales: " + total);
        System.out.println("Average sales: " + total/6);
        System.out.println("Maximum sales: " + max);
        System.out.println("Minimum sales: " + min);
        System.out.println("----------------------------");
    }
}

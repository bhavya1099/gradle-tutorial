package com.tomgregory;
public class GradleNew{
    public char determinLetter(int numGrade){

        if(numGrade<0){
throw new IllegalArgumentException("Number must be greater than 0");
        }
        else if(numGrade<60){
            return 'F';
        }
        else if(numGrade<69){
            return 'D';
        }
        else if(numGrade<80){
            return 'C';
        }
        else if(numGrade<60){
            return 'F';
        }
        return 'O';
    }
}
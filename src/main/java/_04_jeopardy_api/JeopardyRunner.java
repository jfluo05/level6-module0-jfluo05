package _04_jeopardy_api;

import _04_jeopardy_api.data_transfer_objects.Category;
import _04_jeopardy_api.data_transfer_objects.Clue;

import javax.swing.*;

public class JeopardyRunner {

    public static void main(String[] args) {

        JeopardyApi jeopardyApi = new JeopardyApi();

        //1. Create a score variable
        int score=0;
        //2. Add a for loop where:
        //i starts at 100,
        //continues while i <= 1000
        //increments by 100
        int i=100;
        while(i<=1000) {
        //	i=i+100;
        	if (i==700||i==900) {
        		continue;		
        	}
        	Clue c=jeopardyApi.getClue(i);
        	
        	String question=c.getQuestion();
        	String answer=c.getAnswer();
        
            //3. If i == 700 or i == 900, continue;
            //there are no questions for these values
       
            //4. Call the getClue() method with i

            //5. Save the question in a String variable

            //6. Save the answer in a String variable

            //7. Save the title in a String variable
            //note that this is part of the Category object
        Category category=new Category();
        String title=category.getTitle();
        JOptionPane pane=new JOptionPane("title");
        String input=pane.showInputDialog(question);
            //8. Use a JOptionPane to display the question.
            //You can set the title of the JOptionPane to the question title.

            //9. If they got the question correct, add the value of that question to their score
        if (input.equalsIgnoreCase(answer)) {
        	score+=1;
        	JOptionPane.showMessageDialog(null, "CORRECT!");
        }
        else {
        	JOptionPane.showMessageDialog(null, "wrong... the answer is: "+ answer);
        }
        //10. Tell the user their final score
JOptionPane.showMessageDialog(null, "your score is: "+score);
    }}

}

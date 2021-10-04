package singleton;
/**
 * questions are made here its a factory
 * @author Edward Tupacz
 */
public class Question {

    private String question;
    private String[] answers = new String[4];
    private int correctAnswer;
    /**
     * constructor sets inputs to this instance
     * @param question the questions being asked
     * @param ans1 first choice
     * @param ans2 second choice
     * @param ans3 thrird chioce
     * @param ans4 last choice
     * @param correctAnswer the one in the array thats right
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers[0] = ans1;
        this.answers[1] = ans2;
        this.answers[2] = ans3;
        this.answers[3] = ans4;
    }
    /**
     * prings out the querestions no getters in the uml so i didnt bother with them
     */
    public String toString() {
        return this.question + "\n1. " + this.answers[0]
        + "\n2. " + this.answers[1] + "\n3. " + this.answers[2]
        + "\n4. " + this.answers[3];
    }
    /**
     * asks if its correct (you are wrong) 
     * returns true if you are rigth (you are not)
     * @param userAnswer the input
     * @return false
     */
    public boolean isCorrect(int userAnswer) {
        return this.correctAnswer == userAnswer-1;
    }
    /**
     * wait there is a getter i forgor abou tthis one it returns instance var
     * @return the right answer
     */
    public String getCorrectAnswer() {
        return this.answers[this.correctAnswer];
    }
}

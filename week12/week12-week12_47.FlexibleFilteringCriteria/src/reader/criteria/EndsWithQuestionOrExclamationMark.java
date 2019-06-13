/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author Kenny
 */
public class EndsWithQuestionOrExclamationMark implements Criterion{

    private String questionMark;
    private String exclamationMark;
    
    public EndsWithQuestionOrExclamationMark() {
        this.questionMark = "?";
        this.exclamationMark = "!";
    }
    
    @Override
    public boolean complies(String line) {
        return line.endsWith(this.questionMark) || line.endsWith(this.exclamationMark);
    }
    
}

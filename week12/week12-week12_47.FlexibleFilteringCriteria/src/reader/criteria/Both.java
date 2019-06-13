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
public class Both implements Criterion{
    
    private Criterion endsWithQuestionMarkOrExclamationMark;
    private Criterion containsWord;

    public Both(Criterion endsWithQuestionMarkOrExclamationMark, Criterion containsWord) {
        this.endsWithQuestionMarkOrExclamationMark = endsWithQuestionMarkOrExclamationMark;
        this.containsWord = containsWord;
    }
    
    @Override
    public boolean complies(String line) {
        return this.endsWithQuestionMarkOrExclamationMark.complies(line) &&
           this.containsWord.complies(line);
    }
    
}

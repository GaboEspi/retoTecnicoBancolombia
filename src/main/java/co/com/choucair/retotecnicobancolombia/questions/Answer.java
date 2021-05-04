package co.com.choucair.retotecnicobancolombia.questions;

import co.com.choucair.retotecnicobancolombia.userinterface.UtestSignupFinish;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question {
    private String strQuestion;

    public Answer(String strQuestion) {
        this.strQuestion = strQuestion;
    }

    public static Answer toThe(String strQwestion) {
        return new Answer(strQwestion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String welcomeMessage = Text.of(UtestSignupFinish.WELCOME_TEXT).viewedBy(actor).asString();
        if(strQuestion.equals(welcomeMessage)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String getSubject() {
        return null;
    }
}

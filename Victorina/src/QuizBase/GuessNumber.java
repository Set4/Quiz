package Questions;

public class GuessNumber extends QuestionBase {
    private int guessedNumber;

    private GuessIntervalNumber guessInterval;


    public GuessNumber(int totalAttempts, GuessIntervalNumber guessInterval) {
        this.totalAttempts = totalAttempts;
        this.guessInterval = guessInterval;


        int max = guessInterval.getNumberTo - guessInterval.getNumberFrom;
        _guessedNumber = (int) (Math.random() * ++max) + guessInterval.getNumberFrom;

    }

    public override void GenerateQuestion() {
        int max = guessInterval.getNumberTo - guessInterval.getNumberFrom;
        guessedNumber = (int) (Math.random() * ++max) + guessInterval.getNumberFrom;
    }

    public override String getQuestion() {
        return "Угадайте число в Интервале от "+guessInterval.getNumberFrom+ " до "+guessInterval.getNumberTo+
                "за "+totalAttempts+" попыток."
    }



    public override boolean CheckAnswer(String answer) {
        doneAttempts++;

        try {

            if (Integer.parseInt(answer) != guessedNumber)
                return false;

        } catch (NumberFormatException e) {
            return false;
        }

        return true;
    }


    public abstract String GetHelp();

    public abstract String GetTrueAnswer();

}



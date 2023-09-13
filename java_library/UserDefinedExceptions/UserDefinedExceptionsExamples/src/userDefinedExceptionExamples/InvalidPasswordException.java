package userDefinedExceptionExamples;

public class InvalidPasswordException extends RuntimeException
{
	int passwordConditionViolated = 0;
    public InvalidPasswordException(int conditionViolated)
    {
        passwordConditionViolated = conditionViolated;
    }
    public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (passwordConditionViolated) 
        {
        // Password length should be
        // between 8 to 15 characters
        case 1:
            return ("Password Length should be" + " between 8 to 15 Characters.");
        // Password should not contain any space
        case 2:
            return ("Password should not" + " contain any Space.");
        // Password should contain// at least one digit(0-9)
        case 3:
            return ("Password should contain" + " at least one Digit(0-9).");
        // Password should contain at least
        // one special character ( @, #, %, &, !, $ )
        case 4:
            return ("Password should contain at " + "least one Special Character.");
        // Password should contain at least
        // one uppercase letter(A-Z)
        case 5:
            return ("Password should contain at" + " least one Uppercase Letter(A-Z).");
        // Password should contain at least
        // one lowercase letter(a-z)
        case 6:
            return ("Password should contain at" + " least one Lowercase Letter(a-z).");
        }
        return ("");
    }
}

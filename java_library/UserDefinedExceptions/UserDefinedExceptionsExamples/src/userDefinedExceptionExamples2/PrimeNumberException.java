package userDefinedExceptionExamples2;

public class PrimeNumberException extends RuntimeException
{
	int primeNumberConditionViolated = 0;
	public PrimeNumberException(int conditionViolated)
    {
		primeNumberConditionViolated = conditionViolated;
    }
	public String printMessage()
    {
        // Call constructor of parent Exception
        // according to the condition violated
        switch (primeNumberConditionViolated) 
        {
        case 1 : return ("The count of Prime Digits in an Array is not a Prime Number.");
        }
        return ("");
    }
}

package financialForecasting;


	public class FinancialForecast {
	    public static double predictFutureValue(double currentValue, double growthRate, int years) {
	        if (years == 0) return currentValue;
	        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
	    }

	    public static void main(String[] args) {
	        double currentValue = 10000;
	        double annualGrowthRate = 0.08;
	        int years = 5;

	        double futureValue = predictFutureValue(currentValue, annualGrowthRate, years);
	        System.out.println("Future Value after " + years + " years: " + futureValue);
	    }
	}



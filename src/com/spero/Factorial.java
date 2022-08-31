package src.com.spero;

    public class Factorial implements canCalculateFactorial{
        /**
         * 
         */
        int factorial;
        public Factorial(){

        }

        public int calulateFactorial(int length){
            int total = 1;
                    for (int i=1; i <= length; i++){
                        total *= i;

                    }
                    
                    this.factorial = total;

                    return this.factorial;
    
        }
        
    }
package by.jrr.ruslan;

public class NewNumberService {
    public int rangeSum (int start, int finish){
        int sum  =0;
        if (start < finish) {
            for (int i =start; i <= finish; i++){
                sum +=i;
            }
        }else if (start> finish) {
            for (int i = finish; i <=start; i++){
                sum +=i; // the same as      sum =sum + i;
            }
        }else sum = 0;

        return  sum;
    }
}



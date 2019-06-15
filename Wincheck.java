package vote;

public class Wincheck
{
        public static int win(int cand1,int cand2,int cand3)
        {
                int max=cand1;
                if(max<cand2)
	    max=cand2;
                if(max<cand3)
                       max=cand3;
                return max;
        }
}
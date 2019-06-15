package vote;

public class Result
{
          public void result(int winner,int cand1,int cand2,int cand3)
          {
                 if(cand1==winner && cand2==winner && cand3==winner)
                                 System.out.println("All candidates got equal number of votes");
                else if(cand1==winner && cand2!=winner && cand3!=winner)
                                 System.out.println("XXX won the seat");
                else if(cand1!=winner && cand2==winner && cand3!=winner)
                                System.out.println("YYY won the seat");
                else if(cand1!=winner && cand2!=winner && cand3==winner)
                                 System.out.println("ZZZ won the seat");
                else if(cand1==winner && cand2==winner && cand3!=winner)
                                 System.out.println("XXX and YYY got the equal number of votes");
                else if(cand1==winner && cand2!=winner && cand3==winner)
                                 System.out.println("XXX and ZZZ got the equal number of votes");
                else if(cand1!=winner && cand2==winner && cand3==winner)
                                 System.out.println("YYYand ZZZ got the equal number of votes");
           }
 }
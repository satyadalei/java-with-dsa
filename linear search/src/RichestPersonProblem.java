import java.util.ArrayList;

public class RichestPersonProblem {
    public static void main(String[] args) {
        int[][] acounts = {{1,5},{7,3},{3,5}};
       int ans = maximumWealth(acounts);
        System.out.println(ans);
    }
    // method 1;
    static int maximumWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length ; i++){
            int total = 0;
            for (int money : accounts[i]){
                total = total + money;
            }
            if (maxWealth < total){
                maxWealth = total ;
            }
        }
        return maxWealth;
    }
}

import java.util.ArrayList;
import java.util.List;

public class FindPrimer {
    public static void main(String[] args) {
        findPrimer(100);
    }
    /**
    * @Description: 打印小于给定数字的质数
    * @Param: [num]
    * @return: void
    * @Author: Jiangling
    * @Date: 2019/12/25
    */
   static private void findPrimer(int num){
       //用一个list来储存质数
       List<Integer> primers = new ArrayList<>();
        for(int i = 2;i < num ;i++){
            boolean judge = true;
            for(int j = 2;j * j <= i;j++){
                if(i % j == 0) {
                    judge = false;
                    break;
                }
            }
            if(judge)
                primers.add(i);
        }
        //打印list元素
        System.out.println("小于100的质数有:"+primers.toString());
    }
}

public class VadidateGoldbach {
    public static void main(String[] args) {
        vadidate(100);
    }
    /**
* @Description: 验证的过程
* @Param: [num]
* @return: void
* @Author: Jiangling
* @Date: 2019/12/25
*/
    static void vadidate(int num){
        int nextLine = 0;
        for(int i = 4; i < num;i += 2){
            for(int j = 2,m = i - j;j < num - 1;j++,m--){
                //如果两个数都为质数则打印
                if(isPrimer(m) && isPrimer(j)){
                    System.out.printf("%2d = %2d + %2d  ",i,j,m);
                    nextLine ++;
                    //只是为了好截图..
                    if(nextLine == 4) {
                        System.out.println("");
                        nextLine = 0;
                    }
                    break;
                }
            }
        }
    }
    /**
* @Description: 判断一个数是否为质数的方法
* @Param: [num]
* @return: boolean
* @Author: Jiangling
* @Date: 2019/12/25
*/
    static boolean isPrimer(int num){
        if(num == 2)
            return true;
        else {
            boolean judge = true;
            for(int i = 2;i * i <= num;i++){
                if (num % i == 0) {
                    judge = false;
                    break;
                }
            }
            return  judge;
        }
    }
}

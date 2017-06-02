/** 
 * 使用随机算法产生一个数，要求把1-1000W之间这些数全部生成。 
 * （考察高效率，解决产生冲突的问题） 
 */  
private static void testRandom() {  
    int value = 10000000;  
    //int类型最大值：2的32次方 - 1 = Integer.MAX_VALUE = 2147483647，二十亿多,真够啦 。  
    Set<Integer> result = Sets.newHashSetWithExpectedSize(value);  
    Random random = new Random();  
    long a = System.currentTimeMillis();  
    while (result.size() < value + 1) {  
        int i = random.nextInt(value + 1);  
        result.add(i);  
    }  
    System.out.println("\r<br> 执行耗时 : " + (System.currentTimeMillis() - a) / 1000f + " 秒 ");  
    System.out.println("完了，集合大小为" + result.size());  
}  
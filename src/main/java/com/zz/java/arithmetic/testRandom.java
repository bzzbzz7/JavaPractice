/** 
 * ʹ������㷨����һ������Ҫ���1-1000W֮����Щ��ȫ�����ɡ� 
 * �������Ч�ʣ����������ͻ�����⣩ 
 */  
private static void testRandom() {  
    int value = 10000000;  
    //int�������ֵ��2��32�η� - 1 = Integer.MAX_VALUE = 2147483647����ʮ�ڶ�,�湻�� ��  
    Set<Integer> result = Sets.newHashSetWithExpectedSize(value);  
    Random random = new Random();  
    long a = System.currentTimeMillis();  
    while (result.size() < value + 1) {  
        int i = random.nextInt(value + 1);  
        result.add(i);  
    }  
    System.out.println("\r<br> ִ�к�ʱ : " + (System.currentTimeMillis() - a) / 1000f + " �� ");  
    System.out.println("���ˣ����ϴ�СΪ" + result.size());  
}  
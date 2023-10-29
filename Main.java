public class Main {
    public static void main(String[] args) { 
        long startTime=System.nanoTime();
	    int a=3,b=5,c=9,d;
	    for(int i = 7;i <=20190324;i++) {
	        d = (a+b+c)%10000;
	        a = b;
	        b = c;
	        c = d;
	    }
	    System.out.println(c);
	    long endTime=System.nanoTime();
        System.out.println("当前程序耗时："+(endTime-startTime)+"ns");
		System.out.println(1);
	}
}
//不准修改
import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;
	
public class �ݸ� {
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
        System.out.println("��ǰ�����ʱ��"+(endTime-startTime)+"ns");
	System.out.println("�޸Ŀ�¡�����Ĵ��벢�ύ���͵�����ͬѧ�Ĳֿ�");

	}
}
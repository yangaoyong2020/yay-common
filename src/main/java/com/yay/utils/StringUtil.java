package com.yay.utils;
/**
 * 
 * @ClassName: StringUtil 
 * @Description: TODO
 * @author: Administrator
 * @date: 2020��2��27�� ����12:38:58
 */
public class StringUtil {
	//����1���ж�Դ�ַ����Ƿ���ֵ��������(�հ��ַ���)Ҳ��ûֵ (5��)
	public static boolean hasLength(String src){
		return null!=src && src.length()>0;
	//TODO ʵ�ִ���
	}
	//����2���ж�Դ�ַ���	
	public static boolean hasText(String src){
		return  null!=src && src.trim().length()>0;
	//TODO ʵ�ִ���
	}
	//����3�����ز���length�����ĺ����ַ������ַ���������GB2312(�൱�����ļ���)��Χ�ڣ����硰��ѽ����(5��)
	public static String randomChineseString(int length){
		return null;
	//TODO ʵ�ִ���
	}
	//����4������������������������ʵ�տ�ͷ���ټ����ڡ��������ټ��ա����ʹ��1-2���������(8��)���ڲ�����randomChineseString()����(3��)������ʾ��������ѽ��������ŷ����Ϊ��
	public static String generateChineseName(){
		return null;
	//TODO ʵ�ִ���
	}

}

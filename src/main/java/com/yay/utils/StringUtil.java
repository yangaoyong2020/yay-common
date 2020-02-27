package com.yay.utils;
/**
 * 
 * @ClassName: StringUtil 
 * @Description: TODO
 * @author: Administrator
 * @date: 2020年2月27日 下午12:38:58
 */
public class StringUtil {
	//方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public static boolean hasLength(String src){
		return null!=src && src.length()>0;
	//TODO 实现代码
	}
	//方法2：判断源字符串	
	public static boolean hasText(String src){
		return  null!=src && src.trim().length()>0;
	//TODO 实现代码
	}
	//方法3：返回参数length个中文汉字字符串，字符集必须在GB2312(相当于中文简体)范围内，例如“中呀被”(5分)
	public static String randomChineseString(int length){
		return null;
	//TODO 实现代码
	}
	//方法4：返回中文姓名，必须以真实姓开头，百家姓在“六、附百家姓”里，名使用1-2个随机汉字(8分)，内部调用randomChineseString()方法(3分)。返回示例：“刘呀被”、“欧阳及为”
	public static String generateChineseName(){
		return null;
	//TODO 实现代码
	}

}

package homework.day02;
/**
 * 执行程序，分析并解决问题
 * 
 * NumberFormatException出现的情况通常是由包装类将字符串解析为基本类型时,由于字符串内容不能正确描述基本类型导致该异常.
 * 数字    格式      异常
 * 
 * 
 * @author Xiloer
 *
 */
public class Test04 {
	public static void main(String[] args) {
		/*
		 * 原因:
		 */
		String num = "123 ";
		try {
			// 首先，去除输入字符串两端的空白字符，增强代码的健壮性
			num = num.trim();

			// 检查清理后的字符串是否为空，这里假设空字符串也是不合法输入
			if (num.isEmpty()) {
				System.out.println("输入字符串为空，无法解析为整数。");
				// 根据实际情况，这里可以选择返回一个特定值，或者继续抛出一个自定义异常
				return; // 或者 throw new IllegalArgumentException("输入字符串为空");
			}

			int d = Integer.parseInt(num);
			System.out.println(d);
			// 正常处理d的逻辑
			// ...

		} catch (NumberFormatException e) {
			// 捕获并处理NumberFormatException异常
			System.out.println("输入字符串格式不正确，无法解析为整数。");
			// 这里可以选择记录日志、返回一个默认值或继续抛出自定义异常等
			// 例如：Log.error("解析整数失败", e);
		}

		
		/*
		 * 原因:
		 */
		num = "123.456";
		int d = (int)Double.parseDouble(num);
		System.out.println(d);
		
		/*
		 * 原因:
		 */
		num = "123";
		d = Integer.parseInt(num);
		System.out.println(d);
	}
}

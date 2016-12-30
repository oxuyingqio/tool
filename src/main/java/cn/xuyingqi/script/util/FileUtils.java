package cn.xuyingqi.script.util;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文件工具
 * 
 * @author XuYQ
 *
 */
public class FileUtils {

	/**
	 * 打开文件
	 * 
	 * @param file
	 */
	public static final void openFile(File file) {

		// 判断文件是否为空,或者是否存在
		if (file != null && file.exists()) {

			// 桌面
			Desktop desktop = Desktop.getDesktop();
			try {
				desktop.open(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	};

	public static void main(String[] args) {

		try {

			Process p = Runtime.getRuntime().exec("G:\\API\\test.exe");
			System.out.println("启动了");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			System.out.println("获取了缓冲");

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println("来了......");
				System.out.println(line);
			}

			System.out.println("结束了...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package cn.xuyingqi.script;

import java.io.IOException;

public class Test {

	public static void main(String[] args) {

		Runtime r = Runtime.getRuntime();
		try {
			Process p = r.exec("cmd /c start D:/GSSet.ini");
			System.out.println(p.exitValue());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

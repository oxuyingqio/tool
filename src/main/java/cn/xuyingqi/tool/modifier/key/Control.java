package cn.xuyingqi.tool.modifier.key;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

/**
 * 控制
 * 
 * @author XuYQ
 *
 */
public class Control {

	/**
	 * 按下某些键
	 * 
	 * @param delay
	 *            延迟时间/s
	 * @param keyCodes
	 *            按键集合
	 * @param isConsecutiveClick
	 *            是否连续点击
	 */
	public static final void keyPress(int delay, List<Integer> keyCodes, boolean isConsecutiveClick) {

		try {

			// 获取自动化机器人
			Robot robot = new Robot();
			// 延迟时间
			robot.delay(delay * 1000);

			// 连续点击
			if (isConsecutiveClick) {

				while (true) {

					// 按下
					for (int i = 0, length = keyCodes.size(); i < length; i++) {

						robot.keyPress(keyCodes.get(i));
					}

					// 释放
					for (int i = 0, length = keyCodes.size(); i < length; i++) {

						robot.keyRelease(keyCodes.get(i));
					}
				}
			} else {

				// 按下不松
				for (int i = 0, length = keyCodes.size(); i < length; i++) {

					robot.keyPress(keyCodes.get(i));
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}
	}
}

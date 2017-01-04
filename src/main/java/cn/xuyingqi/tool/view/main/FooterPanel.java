package cn.xuyingqi.tool.view.main;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 页脚面板
 * 
 * @author XuYQ
 *
 */
public class FooterPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 默认的页脚信息
	 */
	private static final String INFO = "测试工具集合";

	/**
	 * 页脚信息
	 */
	private String info;

	/**
	 * 页脚面板
	 */
	protected FooterPanel() {

		// 默认参数
		this.info = INFO;

		// 初始化页脚面板
		this.init();
	}

	/**
	 * 初始化页脚面板
	 */
	private void init() {

		// 添加页脚信息
		this.add(new JLabel(this.info));
	}
}

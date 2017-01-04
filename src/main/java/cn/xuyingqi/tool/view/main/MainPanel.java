package cn.xuyingqi.tool.view.main;

import java.awt.BorderLayout;

import javax.swing.JPanel;

/**
 * 主面板
 * 
 * @author XuYQ
 *
 */
public class MainPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 主面板
	 */
	protected MainPanel() {

		// 初始化主面板
		this.init();
	}

	/**
	 * 初始化主面板
	 */
	private void init() {

		// 设置面板布局
		this.setLayout(new BorderLayout());
		// 添加内容面板
		this.add(new ContentPanel(), BorderLayout.CENTER);
		// 添加页脚面板
		this.add(new FooterPanel(), BorderLayout.SOUTH);
	}
}
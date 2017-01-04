package cn.xuyingqi.tool.view.main;

import javax.swing.JFrame;

/**
 * 主窗口
 * 
 * @author XuYQ
 *
 */
public class MainFrame {

	/**
	 * 默认标题
	 */
	private static final String TITLE = "工具集合";
	/**
	 * 默认宽度
	 */
	private static final int WIDTH = 600;
	/**
	 * 默认高度
	 */
	private static final int HEIGHT = 500;

	/**
	 * 窗口
	 */
	private JFrame jFrame;

	/**
	 * 标题
	 */
	private String title;
	/**
	 * 宽度
	 */
	private int width;
	/**
	 * 高度
	 */
	private int height;

	/**
	 * 主窗口
	 */
	public MainFrame() {

		// 默认参数
		this.title = TITLE;
		this.width = WIDTH;
		this.height = HEIGHT;

		// 初始化主窗口
		this.init();
	}

	/**
	 * 初始化主窗口
	 */
	private void init() {

		// 提供一个关于新创建的 JFrame 是否应该具有当前外观为其提供的 Window 装饰（如边框、关闭窗口的小部件、标题等等）的提示。
		JFrame.setDefaultLookAndFeelDecorated(true);

		// 实例化窗口
		this.jFrame = new JFrame(this.title);
		// 设置窗口宽高
		this.jFrame.setSize(this.width, this.height);
		// 设置窗口位置
		this.jFrame.setLocationRelativeTo(null);

		// 设置用户在窗口上发起 "close" 时默认执行的操作。
		this.jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 添加窗口主面板
		this.jFrame.getContentPane().add(new MainPanel());
	}

	/**
	 * 显示主窗口
	 */
	public MainFrame show() {

		this.jFrame.setVisible(true);

		return this;
	}
}

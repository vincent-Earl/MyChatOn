package vincent.chaton;

import android.os.Bundle;

/** 
 * @classname  MainActivityGroup.java
 * @function   
 * @author   vincent 
 * @version  1.0
 * @company  瑜旭网络科技有限公司
 * @date 2014年2月13日 下午1:54:41     
 */
public abstract class MainActivityGroup extends BaseActivityGroup {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(layoutId());
	}

	/**
	 * 资源文件
	 * @return
	 */
	protected abstract int layoutId();
	/**
	 * 初始化视图
	 */
	protected abstract void initView();
	/**
	 * 初始化数据
	 */
	protected abstract void initData();
}

package vincent.chaton;

import android.app.Activity;
import android.os.Bundle;

/** 
 * @classname  BaseActivityGroup.java
 * @function   
 * @author   vincent 
 * @version  1.0
 * @company  瑜旭网络科技有限公司
 * @date 2014年2月13日 上午11:29:14     
 */
public abstract class BaseActivityGroup extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
}

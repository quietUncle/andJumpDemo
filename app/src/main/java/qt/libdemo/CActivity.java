package qt.libdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.qtinject.andjump.api.QtInject;

/**
 * author: quietUncle
 * date: 2016/7/7.
 */
public class CActivity extends Activity {
    @QtInject
    Bean bean;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        QtCActivity.inject(this);
        tv= (TextView) findViewById(R.id.tv);
        tv.setText(bean.toString());
    }
}

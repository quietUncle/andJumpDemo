package qt.libdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.qtinject.andjump.api.QtInject;

/**
 * author: quietUncle
 * date: 2016/7/7.
 */
@QtInject
public class AActivity extends Activity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        tv= (TextView) findViewById(R.id.tv);
        tv.setText("你什么也没带过来");
    }
}

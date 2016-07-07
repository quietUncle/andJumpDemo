package qt.libdemo;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.qtinject.andjump.api.QtInject;

/**
 * author: quietUncle
 * date: 2016/7/7.
 */
@QtInject
public class DActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportFragmentManager().beginTransaction().replace(android.R.id.content,QtTestFragment.getInstance().setName("测试").build()).commit();
    }
}

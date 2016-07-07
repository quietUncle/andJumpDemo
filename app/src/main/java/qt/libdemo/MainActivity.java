package qt.libdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * author: quietUncle
 * date: 2016/7/7.
 * github:
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnA:
                QtAActivity.getInstance().start(this);
                break;
            case R.id.btnB:
                QtBActivity.getInstance().setName("测试名字").start(this);
                break;
            case R.id.btnC:
                Bean bean = new Bean();
                bean.setName("安静大叔");
                bean.setSign("码农一名,git 地址：https://github.com/quietUncle");
                QtCActivity.getInstance().setBean(bean).start(this);
                break;
            case R.id.btnD:
                QtDActivity.getInstance().start(this);
                break;
        }
    }
}

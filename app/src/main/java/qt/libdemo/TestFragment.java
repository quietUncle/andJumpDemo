package qt.libdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qtinject.andjump.api.QtInject;

/**
 * author: liutao
 * date: 2016/7/7.
 */
public class TestFragment extends Fragment {
    @QtInject
    String name;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=View.inflate(getActivity(),R.layout.activity_test,null);
        return view;
    }
    TextView tv;
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        QtTestFragment.inject(this);
        tv= (TextView) view.findViewById(R.id.tv);
        tv.setText(name);
    }
}

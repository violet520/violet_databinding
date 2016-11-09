package happy.me.violet.violetbinding;

import android.os.Bundle;

import happy.me.violet.violetbinding.databinding.MainPageBinding;
import happy.me.violet.violetbinding.util.DataUtils;

public class MainActivity extends BaseActivity<MainPageBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initDataBinding() {
        databinding.setMainPageData(DataUtils.getMainPageData(0));
        databinding.executePendingBindings();
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }
}

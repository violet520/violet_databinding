package happy.me.violet.violetbinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import happy.me.violet.violetbinding.databinding.MainPageBinding;
import happy.me.violet.violetbinding.util.DataUtils;

public class MainActivity extends AppCompatActivity {

    private MainPageBinding mainPageBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainPageBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mainPageBinding.setMainPageData(DataUtils.getMainPageData(0));
        mainPageBinding.executePendingBindings();
    }
}

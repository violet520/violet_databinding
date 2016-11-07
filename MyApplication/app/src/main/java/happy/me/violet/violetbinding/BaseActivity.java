package happy.me.violet.violetbinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by violet_k on 2016/11/7.
 */

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    T databinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding = DataBindingUtil.setContentView(this, getLayoutRes());
        if (databinding != null) {
            initDataBinding();
        }
    }

    public abstract void initDataBinding();

    public abstract int getLayoutRes();
}
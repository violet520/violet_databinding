package happy.me.violet.violetbinding;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import happy.me.violet.violetbinding.databinding.MainPageBinding;
import happy.me.violet.violetbinding.util.DataUtils;

public class MainActivity extends BaseActivity<MainPageBinding> {

    private final String TAG = MainActivity.this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void initDataBinding() {
        databinding.setMainPageData(DataUtils.getMainPageData(0));
        databinding.executePendingBindings();

//        Log.d(TAG, "   getRoot   " + view.getRootView().getTag(com.android.databinding.library.R.id.dataBinding).getClass().getSimpleName());
//        view.getRootView().setTag(R.id.dataBinding, "213123");
//        Log.d(TAG, "   getRoot   " + view.getRootView().getTag().getClass().getSimpleName());
    }

    @Override
    public int getLayoutRes() {
        return R.layout.activity_main;
    }

    @Override
    protected void onResume() {
        super.onResume();
//        processTopView();
    }

    public void onPressCustomImageView(View view) {
//        processTopView();
        databinding.setMainPageData(DataUtils.getMainPageData(1));
        databinding.executePendingBindings();
        databinding.executePendingBindings();
        databinding.setMainPageData(DataUtils.getMainPageData(2));
        databinding.executePendingBindings();
    }

    private void processTopView() {
        Log.d(TAG, "   activityMain0   " + databinding.activityMain0.getTag());
        Log.d(TAG, "   activityMain0   " + databinding.activityMain0.getTag());
        View subView = databinding.getRoot();
        Log.d(TAG, "   getRoot   " + subView.getClass().getSimpleName());
        Log.d(TAG, "   getRoot   " + subView.getTag(R.id.dataBinding).getClass().getSimpleName());
        subView.setTag(R.id.dataBinding, "3132123123");
        Log.d(TAG, "   getRoot   " + subView.getTag(R.id.dataBinding).getClass().getSimpleName());
        Log.d(TAG, "   getRoot   " + subView.getRootView().getClass().getSimpleName());
    }
}

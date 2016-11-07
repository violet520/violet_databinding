package happy.me.violet.violetbinding.util;

import happy.me.violet.violetbinding.bean.MainPageData;

/**
 * Created by violet_k on 2016/11/7.
 */

public class DataUtils {

    public static MainPageData getMainPageData(int tag) {
        MainPageData data = new MainPageData();
        data.setTitle("title: " + tag);
        data.setContent("Content: pageDataContent: " + tag);
        data.setShowContent(true);
        data.setShowTitle(true);
        return data;
    }
}
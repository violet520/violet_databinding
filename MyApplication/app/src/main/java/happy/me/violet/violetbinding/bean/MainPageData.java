package happy.me.violet.violetbinding.bean;

import android.databinding.BaseObservable;

/**
 * Created by violet_k on 2016/11/7.
 */

public class MainPageData extends BaseObservable {

    private String title;

    private String content;

    private boolean showTitle;

    private boolean showContent;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isShowTitle() {
        return showTitle;
    }

    public void setShowTitle(boolean showTitle) {
        this.showTitle = showTitle;
    }

    public boolean isShowContent() {
        return showContent;
    }

    public void setShowContent(boolean showContent) {
        this.showContent = showContent;
    }

    @Override
    public String toString() {
        return "MainPageData{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", showTitle=" + showTitle +
                ", showContent=" + showContent +
                '}';
    }
}
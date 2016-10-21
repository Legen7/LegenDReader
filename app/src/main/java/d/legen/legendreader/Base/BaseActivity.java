package d.legen.legendreader.base;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by Legen on 2016/10/21.
 */

public abstract class BaseActivity extends AppCompatActivity{
    protected Activity context;
    protected View rootview;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        rootview = initView();
        setContentView(rootview);
        getSupportActionBar().hide();
        rootview.setFitsSystemWindows(true);

        try {
            initData(savedInstanceState);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        setListener();
    }

    /**
     * 初始化数据
     * @return
     */
    public abstract void initData(Bundle savedInstanceState)throws PackageManager.NameNotFoundException;

    /**
     * 设置监听
     * @return
     */
    public abstract View initView();

    /**
     * 初始化布局
     * @return
     */
    public abstract void setListener();

}

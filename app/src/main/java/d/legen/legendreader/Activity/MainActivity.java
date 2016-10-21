package d.legen.legendreader.activity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;

import d.legen.legendreader.R;
import d.legen.legendreader.base.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTheme(R.style.Light);

    }

    @Override
    public void initData(Bundle savedInstanceState) throws PackageManager.NameNotFoundException {

    }

    @Override
    public View initView() {
        View view = View.inflate(context,R.layout.activity_main,null);

        return view;
    }

    @Override
    public void setListener() {

    }
}

package xyz.xingm.mvpdemo.module.main.view;

import android.widget.Toast;

import xyz.xingm.mvpdemo.R;
import xyz.xingm.mvpdemo.module.base.view.BaseActivity;
import xyz.xingm.mvpdemo.module.main.MainContract;
import xyz.xingm.mvpdemo.module.main.presenter.MainPresenter;

public class MainActivity extends BaseActivity<MainPresenter, MainActivity> implements MainContract.View{

    @Override
    public MainPresenter getPresenter() {
        return new MainPresenter();
    }

    @Override
    public int layoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        presenter.test("Test");
    }

    @Override
    public void show(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}

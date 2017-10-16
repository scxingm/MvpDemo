package xyz.xingm.mvpdemo.module.base.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import xyz.xingm.mvpdemo.module.base.BaseContract;
import xyz.xingm.mvpdemo.module.base.presenter.BasePresenter;

/**
 * Created by Administrator on 2017/10/15.
 */

public abstract class BaseActivity<P extends BasePresenter, V extends BaseContract.View> extends AppCompatActivity {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        presenter = getPresenter();
        presenter.attachView((V)this);
        initView();
    }

    public abstract P getPresenter();

    public abstract int layoutId();

    public abstract void initView();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.unAttachView();
    }
}

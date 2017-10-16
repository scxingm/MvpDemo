package xyz.xingm.mvpdemo.module.main;

import xyz.xingm.mvpdemo.module.base.BaseContract;
import xyz.xingm.mvpdemo.module.main.presenter.MainPresenter;

/**
 * Created by Administrator on 2017/10/15.
 */

public class MainContract {

    /**
     * 界面需要与presenter交互的方法
     */
    public interface View extends BaseContract.View{
        void show(String string);
    }

    /**
     * 固定方法
     */
    public interface Presenter extends BaseContract.Presenter{

    }

    /**
     * presenter需要与model交互的方法
     */
    public interface Model extends BaseContract.Model{
        void request(String string, MainPresenter.Listener listener);
    }

}

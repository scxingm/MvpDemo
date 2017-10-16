package xyz.xingm.mvpdemo.module.main.presenter;

import xyz.xingm.mvpdemo.module.base.presenter.BasePresenter;
import xyz.xingm.mvpdemo.module.main.MainContract;
import xyz.xingm.mvpdemo.module.main.model.MainModel;
import xyz.xingm.mvpdemo.module.main.view.MainActivity;

/**
 * Created by Administrator on 2017/10/15.
 */

public class MainPresenter extends BasePresenter<MainActivity, MainModel> implements MainContract.Presenter {
    @Override
    public MainModel getModel() {
        return new MainModel();
    }

    public void test(String string){
        model.request(string, new Listener() {
            @Override
            public void result(String string) {
                getView().show(string);
            }
        });
    }

    public interface Listener{
        void result(String string);
    }
}

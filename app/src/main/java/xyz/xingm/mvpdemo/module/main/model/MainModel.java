package xyz.xingm.mvpdemo.module.main.model;

import xyz.xingm.mvpdemo.module.base.model.BaseModel;
import xyz.xingm.mvpdemo.module.main.MainContract;
import xyz.xingm.mvpdemo.module.main.presenter.MainPresenter;

/**
 * Created by Administrator on 2017/10/15.
 */

public class MainModel extends BaseModel implements MainContract.Model {

    @Override
    public void request(String string, MainPresenter.Listener listener) {
        listener.result(string+" 这句话被加工了!");
    }
}

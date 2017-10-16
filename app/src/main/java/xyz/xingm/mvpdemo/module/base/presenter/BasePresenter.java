package xyz.xingm.mvpdemo.module.base.presenter;

import java.lang.ref.WeakReference;

import xyz.xingm.mvpdemo.module.base.BaseContract;

/**
 * Created by Administrator on 2017/10/15.
 */

//                                              确定View                  确定Model
public abstract class BasePresenter<V extends BaseContract.View, M extends BaseContract.Model> {

    private WeakReference<V> weakReference;
    protected M model;

    /**
     * 绑定View
     * 获得Model
     * @param mView
     */
    public void attachView(V mView){
        weakReference = new WeakReference<>(mView);
        model = getModel();
    }

    /**
     * 解绑定View
     */
    public void unAttachView(){
        if (weakReference != null){
            weakReference.clear();
            weakReference = null;
        }
    }

    /**
     * 获取View视图
     * @return
     */
    public V getView(){
        if (weakReference != null)
            return weakReference.get();
        return null;
    }

    /**
     * 获取Model
     * @return
     */
    public abstract M getModel();
}

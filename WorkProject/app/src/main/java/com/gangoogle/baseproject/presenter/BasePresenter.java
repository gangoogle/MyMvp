package com.gangoogle.baseproject.presenter;

import com.gangoogle.baseproject.bean.MovieResponse;
import com.gangoogle.baseproject.api.ApiRetrofit;
import com.gangoogle.baseproject.api.ApiServer;
import com.gangoogle.baseproject.model.BaseModel;
import com.gangoogle.baseproject.view.BaseView;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by zgyi on 2018/9/25.
 */
public class BasePresenter<V extends BaseView, M extends BaseModel> {
    protected V mBaseView;
    protected M mBaseModel;
    private CompositeDisposable mCompositeDisposable;

    protected ApiServer apiServer = ApiRetrofit.getIntance().getmApiServer();

    public BasePresenter(V baseView) {
        this.mBaseView = baseView;
    }

    public void detachView() {
        mBaseView = null;
        mBaseModel = null;
        removeDisposable();
    }

    public V getmBaseView() {
        return mBaseView;
    }

    public void addDisposable(Observable<MovieResponse> observable, BaseObserver baseObserver) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(baseObserver));
    }

    private void removeDisposable() {
        if (mCompositeDisposable != null) {
            mCompositeDisposable.dispose();
        }
    }
}

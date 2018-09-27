package com.gangoogle.baseproject.presenter;

import com.gangoogle.baseproject.bean.MovieResponse;
import com.gangoogle.baseproject.db.User;
import com.gangoogle.baseproject.model.MovieModel;
import com.gangoogle.baseproject.view.MovieView;
import com.orhanobut.logger.Logger;

/**
 * Created by zgyi on 2018/9/25.
 */
public class MoviePersenter extends BasePresenter<MovieView, MovieModel> {

    public MoviePersenter(MovieView baseView) {
        super(baseView);
        mBaseModel = new MovieModel();
    }

    public void getMovie(String moiveName) {
        addDisposable(mBaseModel.getMovie(moiveName),
                new BaseObserver<MovieResponse>(mBaseView) {
                    @Override
                    public void onSuccess(MovieResponse o) {
                        mBaseView.onGetMovieSuccess(o);
                    }

                    @Override
                    public void onError(String msg) {
                        mBaseView.showError(msg);
                    }
                });
    }

    public void addUser(String name) {
        mBaseModel.insertUser(name);
        mBaseView.onInsertUser();
    }

    public void queryUser() {
        Logger.d(mBaseModel.queryUser());
    }
}

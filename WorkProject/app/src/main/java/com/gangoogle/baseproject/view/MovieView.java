package com.gangoogle.baseproject.view;

import com.gangoogle.baseproject.bean.MovieResponse;

/**
 * Created by zgyi on 2018/9/25.
 */
public interface MovieView extends BaseView {
    void onGetMovieSuccess(MovieResponse movieResponse);
    void onInsertUser();
}

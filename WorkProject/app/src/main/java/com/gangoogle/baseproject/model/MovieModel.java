package com.gangoogle.baseproject.model;

import com.gangoogle.baseproject.api.ApiRetrofit;
import com.gangoogle.baseproject.api.MainApplication;
import com.gangoogle.baseproject.bean.MovieResponse;
import com.gangoogle.baseproject.db.User;
import com.gangoogle.baseproject.db.gen.UserDao;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by zgyi on 2018/9/26.
 */
public class MovieModel implements BaseModel {

    public Observable<MovieResponse> getMovie(String name) {
        return ApiRetrofit.getIntance().getmApiServer().getUser("121.04925573429551",
                "31.315590522490712");
    }

    public void insertUser(String name) {
        UserDao userDao = MainApplication.getInstance().getDaoSession().getUserDao();
        User user = new User(null, name);
        userDao.insert(user);
    }

    public List<User> queryUser() {
        List<User> userList = MainApplication.getInstance().getDaoSession().getUserDao()
                .queryBuilder()
                .build()
                .list();
        return userList;
    }

}

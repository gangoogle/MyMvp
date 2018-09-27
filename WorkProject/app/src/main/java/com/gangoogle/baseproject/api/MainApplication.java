package com.gangoogle.baseproject.api;

import android.app.Activity;
import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.gangoogle.baseproject.constant.Constant;
import com.gangoogle.baseproject.db.gen.DaoMaster;
import com.gangoogle.baseproject.db.gen.DaoSession;
import com.orhanobut.logger.AndroidLogAdapter;
import com.orhanobut.logger.Logger;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by zgyi on 2018/9/25.
 */
public class MainApplication extends Application {
    private DaoMaster.DevOpenHelper mHelper;
    private SQLiteDatabase mDb;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;
    private static MainApplication mInstance;
    private Set<Activity> allActivities;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
        Logger.addLogAdapter(new AndroidLogAdapter());
        setDataBase();
    }

    public static MainApplication getInstance() {
        return mInstance;
    }

    /**
     * 添加activity
     */
    public void addActivity(Activity act) {
        if (allActivities == null) {
            allActivities = new HashSet<>();
        }
        allActivities.add(act);
    }
    /**
     * 移除activity
     */
    public void removeActivity(Activity act) {
        if (allActivities != null) {
            allActivities.remove(act);
        }
    }
    /**
     * 退出app
     */
    public void exitApp() {
        if (allActivities != null) {
            synchronized (allActivities) {
                for (Activity act : allActivities) {
                    act.finish();
                }
            }
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }

    /**
     * 设置数据库相关
     */
    private void setDataBase() {
        mHelper = new DaoMaster.DevOpenHelper(this, Constant.DB_NAME, null);
        mDb = mHelper.getWritableDatabase();
        mDaoMaster = new DaoMaster(mDb);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }

    public SQLiteDatabase getDb() {
        return mDb;
    }

}

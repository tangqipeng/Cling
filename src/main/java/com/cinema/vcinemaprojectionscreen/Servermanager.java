package com.cinema.vcinemaprojectionscreen;

import android.content.Context;

import com.cinema.vcinemaprojectionscreen.server.JettyResourceServer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by tangqipeng on 2017/6/14.
 */

public class Servermanager {

    private static Servermanager mInstance;

    public static Context mContext;


    public Servermanager() {

    }

    public static Servermanager getInstance() {
        if (mInstance == null) {
            synchronized (Servermanager.class) {
                if (mInstance == null) {
                    mInstance = new Servermanager();
                }
            }
        }
        return mInstance;
    }

    public static void setContext(Context context){
        mContext = context;
    }


}

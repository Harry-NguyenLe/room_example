package vn.edu.csc.roomexampleapp.data.repositories;

import android.content.Context;

import java.util.List;

import io.reactivex.Single;
import vn.edu.csc.roomexampleapp.data.entinities.Bridge;
import vn.edu.csc.roomexampleapp.data.local.AppDatabase;
import vn.edu.csc.roomexampleapp.data.local.dao.BridgeDao;

public class BridgeRepoImpl implements BridgeRepo {
    private AppDatabase appDatabase;
    private BridgeDao bridgeDao;
    private static volatile BridgeRepoImpl mInstance;

    public BridgeRepoImpl(Context context) {
        appDatabase = AppDatabase.getInstance(context);
        bridgeDao = appDatabase.bridgeDao();
    }

    public static BridgeRepoImpl getInstance(Context context) {
        if (mInstance == null) {
            synchronized (BridgeRepoImpl.class) {
                if (mInstance == null) {
                    mInstance = new BridgeRepoImpl(context);
                }
            }
        }
        return mInstance;
    }

    @Override
    public Single<List<Bridge>> getAllBridges() {
        return bridgeDao.getAllBridges();
    }
}

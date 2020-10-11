package vn.edu.csc.roomexampleapp.data.local;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import vn.edu.csc.roomexampleapp.data.entinities.Bridge;
import vn.edu.csc.roomexampleapp.data.local.dao.BridgeDao;

@Database(entities = {Bridge.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    private static volatile AppDatabase mInstance;

    public static AppDatabase getInstance(Context context) {
        if (mInstance == null) {
            synchronized (AppDatabase.class) {
                if (mInstance == null) {
                    mInstance = Room.databaseBuilder(context.getApplicationContext(),
                            AppDatabase.class, "room_example_db")
                            .createFromAsset("database/room_example.db")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return mInstance;
    }


    public abstract BridgeDao bridgeDao();
}

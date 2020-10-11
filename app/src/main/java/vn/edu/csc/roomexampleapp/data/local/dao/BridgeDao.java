package vn.edu.csc.roomexampleapp.data.local.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import io.reactivex.Single;
import vn.edu.csc.roomexampleapp.data.entinities.Bridge;

@Dao
public interface BridgeDao {
    @Query("SELECT * FROM bridge_tbl")
    Single<List<Bridge>> getAllBridges();

    @Insert
    Single<List<Long>> insertAll(List<Bridge> bridges);
}

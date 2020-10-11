package vn.edu.csc.roomexampleapp.data.entinities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName = "bridge_tbl", indices = @Index(value = "bridgeName"))
public class Bridge {

    @PrimaryKey(autoGenerate = true)
    private int bridgeId;

    @ColumnInfo(name = "bridgeName")
    private String bridgeName;

    public Bridge(int bridgeId, String bridgeName) {
        this.bridgeId = bridgeId;
        this.bridgeName = bridgeName;
    }

    public int getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(int bridgeId) {
        this.bridgeId = bridgeId;
    }

    public String getBridgeName() {
        return bridgeName;
    }

    public void setBridgeName(String bridgeName) {
        this.bridgeName = bridgeName;
    }
}

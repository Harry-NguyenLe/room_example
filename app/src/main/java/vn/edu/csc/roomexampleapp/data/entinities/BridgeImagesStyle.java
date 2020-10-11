package vn.edu.csc.roomexampleapp.data.entinities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "bridge_images_tbl")
public class BridgeImagesStyle {
    @PrimaryKey(autoGenerate = true)
    @SerializedName("bridgeImageStyleId")
    @Expose
    private int bridgeImageStyleId;

    @ColumnInfo(name = "imageStyle")
    @SerializedName("imageStyle")
    @Expose
    private String imageStyle;

    @ColumnInfo(name = "bridgeId")
    @SerializedName("bridgeId")
    @Expose
    private int bridgeId;

    @Ignore
    @SerializedName("listImages")
    @Expose
    private List<BridgeImages> listImages;

    public BridgeImagesStyle() {
    }

    @Ignore
    public BridgeImagesStyle(int bridgeImageStyleId, String imageStyle, int bridgeId, List<BridgeImages> listImages) {
        this.bridgeImageStyleId = bridgeImageStyleId;
        this.imageStyle = imageStyle;
        this.bridgeId = bridgeId;
        this.listImages = listImages;
    }

    public int getBridgeImageId() {
        return bridgeImageStyleId;
    }

    public void setBridgeImageId(int bridgeImageId) {
        this.bridgeImageStyleId = bridgeImageId;
    }

    public String getImageStyle() {
        return imageStyle;
    }

    public void setImageStyle(String imageStyle) {
        this.imageStyle = imageStyle;
    }

    public int getBridgeId() {
        return bridgeId;
    }

    public void setBridgeId(int bridgeId) {
        this.bridgeId = bridgeId;
    }

    public int getBridgeImageStyleId() {
        return bridgeImageStyleId;
    }

    public void setBridgeImageStyleId(int bridgeImageStyleId) {
        this.bridgeImageStyleId = bridgeImageStyleId;
    }

    public List<BridgeImages> getListImages() {
        return listImages;
    }

    public void setListImages(List<BridgeImages> listImages) {
        this.listImages = listImages;
    }
}

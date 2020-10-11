package vn.edu.csc.roomexampleapp.data.entinities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Entity(tableName = "bridge_images_tbl")
public class BridgeImages {
    @PrimaryKey(autoGenerate = true)
    @SerializedName("bridgeImagesId")
    @Expose
    private int bridgeImagesId;

    @ColumnInfo(name = "image", typeAffinity = ColumnInfo.BLOB)
    @SerializedName("image")
    private byte[] image;

    @ColumnInfo(name = "imageStyle")
    @SerializedName("imageStyle")
    @Expose
    private String imageStyle;

    @ColumnInfo(name = "bridgeId")
    @SerializedName("bridgeId")
    @Expose
    private int bridgeId;

    @ColumnInfo(name = "imagePosition")
    @SerializedName("imagePosition")
    @Expose
    private int imagePosition;

    public BridgeImages(int bridgeImagesId, byte[] image, String imageStyle, int bridgeId, int imagePosition) {
        this.bridgeImagesId = bridgeImagesId;
        this.image = image;
        this.imageStyle = imageStyle;
        this.bridgeId = bridgeId;
        this.imagePosition = imagePosition;
    }

    public int getBridgeImagesId() {
        return bridgeImagesId;
    }

    public void setBridgeImagesId(int bridgeImagesId) {
        this.bridgeImagesId = bridgeImagesId;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
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

    public int getImagePosition() {
        return imagePosition;
    }

    public void setImagePosition(int imagePosition) {
        this.imagePosition = imagePosition;
    }
}

package vn.edu.csc.roomexampleapp.view;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import vn.edu.csc.roomexampleapp.data.entinities.Bridge;
import vn.edu.csc.roomexampleapp.data.repositories.BridgeRepoImpl;

public class MainViewModel extends AndroidViewModel {
    private BridgeRepoImpl bridgeRepo;
    private MutableLiveData<List<Bridge>> listBridge = new MutableLiveData<>();
    protected final CompositeDisposable compositeDisposable = new CompositeDisposable();

    public MainViewModel(@NonNull Application application) {
        super(application);
        bridgeRepo = BridgeRepoImpl.getInstance(application);
        setListBridge();
    }

    public void setListBridge() {
        compositeDisposable.add(bridgeRepo.getAllBridges()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(bridge -> {
                    listBridge.postValue(bridge);
                }));
    }

    public LiveData<List<Bridge>> getBridgeName() {
        return listBridge;
    }
}

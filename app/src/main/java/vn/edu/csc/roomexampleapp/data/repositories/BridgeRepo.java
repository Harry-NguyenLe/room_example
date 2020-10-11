package vn.edu.csc.roomexampleapp.data.repositories;

import java.util.List;

import io.reactivex.Single;
import vn.edu.csc.roomexampleapp.data.entinities.Bridge;

public interface BridgeRepo {
    Single<List<Bridge>> getAllBridges();

}

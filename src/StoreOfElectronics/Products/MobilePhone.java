package StoreOfElectronics.Products;

import StoreOfElectronics.StaticUtils;

import java.util.HashMap;
import java.util.Map;

public class MobilePhone extends DisplayDevice{
    public String resolution;
    public Integer numOfcameras;

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Integer getNumOfcameras() {
        return numOfcameras;
    }

    public void setNumOfcameras(Integer numOfcameras) {
        this.numOfcameras = numOfcameras;
    }

    @Override
    public String testResolution(String resolution){
        if(StaticUtils.BAD_RESOLUTION.contains(resolution)){
            return "bad resolution";
        }
        return "Ok resolution";
    }
}

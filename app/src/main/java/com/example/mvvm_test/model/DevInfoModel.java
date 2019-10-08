package com.example.mvvm_test.model;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DevInfoModel {

    public DevInfoModel(int deviceId) {
        this.deviceId = deviceId;
    }

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("browserName")
    @Expose
    private String browserName;
    @SerializedName("browserVersion")
    @Expose
    private String browserVersion;
    @SerializedName("carrier")
    @Expose
    private String carrier;
    @SerializedName("deviceCountry")
    @Expose
    private String deviceCountry;
    @SerializedName("deviceId")
    @Expose
    private int deviceId;
    @SerializedName("deviceLocale")
    @Expose
    private String deviceLocale;
    @SerializedName("deviceUniqueIdentifier")
    @Expose
    private String deviceUniqueIdentifier;
    @SerializedName("machineAddressV4")
    @Expose
    private String machineAddressV4;
    @SerializedName("machineAddressV6")
    @Expose
    private String machineAddressV6;
    @SerializedName("machineName")
    @Expose
    private String machineName;
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("oSName")
    @Expose
    private String oSName;
    @SerializedName("oSVersion")
    @Expose
    private String oSVersion;
    @SerializedName("screenDensity")
    @Expose
    private String screenDensity;
    @SerializedName("screenHeight")
    @Expose
    private String screenHeight;
    @SerializedName("screenOrientation")
    @Expose
    private String screenOrientation;
    @SerializedName("screenWidth")
    @Expose
    private String screenWidth;
    @SerializedName("supportedAbi")
    @Expose
    private String supportedAbi;
    @SerializedName("timeZone")
    @Expose
    private String timeZone;
    @SerializedName("userAgent")
    @Expose
    private String userAgent;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        this.browserName = browserName;
    }

    public String getBrowserVersion() {
        return browserVersion;
    }

    public void setBrowserVersion(String browserVersion) {
        this.browserVersion = browserVersion;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getDeviceCountry() {
        return deviceCountry;
    }

    public void setDeviceCountry(String deviceCountry) {
        this.deviceCountry = deviceCountry;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceLocale() {
        return deviceLocale;
    }

    public void setDeviceLocale(String deviceLocale) {
        this.deviceLocale = deviceLocale;
    }

    public String getDeviceUniqueIdentifier() {
        return deviceUniqueIdentifier;
    }

    public void setDeviceUniqueIdentifier(String deviceUniqueIdentifier) {
        this.deviceUniqueIdentifier = deviceUniqueIdentifier;
    }

    public String getMachineAddressV4() {
        return machineAddressV4;
    }

    public void setMachineAddressV4(String machineAddressV4) {
        this.machineAddressV4 = machineAddressV4;
    }

    public String getMachineAddressV6() {
        return machineAddressV6;
    }

    public void setMachineAddressV6(String machineAddressV6) {
        this.machineAddressV6 = machineAddressV6;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOSName() {
        return oSName;
    }

    public void setOSName(String oSName) {
        this.oSName = oSName;
    }

    public String getOSVersion() {
        return oSVersion;
    }

    public void setOSVersion(String oSVersion) {
        this.oSVersion = oSVersion;
    }

    public String getScreenDensity() {
        return screenDensity;
    }

    public void setScreenDensity(String screenDensity) {
        this.screenDensity = screenDensity;
    }

    public String getScreenHeight() {
        return screenHeight;
    }

    public void setScreenHeight(String screenHeight) {
        this.screenHeight = screenHeight;
    }

    public String getScreenOrientation() {
        return screenOrientation;
    }

    public void setScreenOrientation(String screenOrientation) {
        this.screenOrientation = screenOrientation;
    }

    public String getScreenWidth() {
        return screenWidth;
    }

    public void setScreenWidth(String screenWidth) {
        this.screenWidth = screenWidth;
    }

    public String getSupportedAbi() {
        return supportedAbi;
    }

    public void setSupportedAbi(String supportedAbi) {
        this.supportedAbi = supportedAbi;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

}
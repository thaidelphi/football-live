package com.startapp.sdk.insight;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NetworkTestsMetaData implements Serializable {
    private static final long serialVersionUID = 91489019050126377L;
    private boolean enabledCachedProcess;
    private String hostCt;
    private String hostLt;
    private String hostNir;
    private int numberOfRecordsMin = 5000;
    private int numberOfRecordsMax = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    private boolean enabled = false;
    private String projectId = "20050";
    private String connectivityTestHostname = "d2to8y50b3n6dq.cloudfront.net";
    private String connectivityTestFilename = "/favicon.ico";
    private boolean connectivityTestEnabled = true;
    private boolean nirCollectCellinfoEnabled = true;
    private boolean ctCollectCellinfoEnabled = true;
    private String connectivityTestCdnconfigUrl = "https://d2to8y50b3n6dq.cloudfront.net/truststores/[PROJECTID]/cdnconfig.zip";
    private String geoipUrl = "https://geoip.api.p3insight.de/geoip/";
    private long ctltIntervalMilli = 900000;
    private long sendIntervalMilli = 7200000;
    private long guardDiffMilli = UnityAdsConstants.Timeout.INIT_TIMEOUT_MS;
    private long ttl = 86400000;
    private double iep = 0.0d;

    public final String a() {
        return this.hostCt;
    }

    public final String b() {
        return this.hostLt;
    }

    public final String c() {
        return this.hostNir;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkTestsMetaData networkTestsMetaData = (NetworkTestsMetaData) obj;
        if (this.numberOfRecordsMin == networkTestsMetaData.numberOfRecordsMin && this.numberOfRecordsMax == networkTestsMetaData.numberOfRecordsMax && this.enabled == networkTestsMetaData.enabled && this.enabledCachedProcess == networkTestsMetaData.enabledCachedProcess && this.connectivityTestEnabled == networkTestsMetaData.connectivityTestEnabled && this.nirCollectCellinfoEnabled == networkTestsMetaData.nirCollectCellinfoEnabled && this.ctCollectCellinfoEnabled == networkTestsMetaData.ctCollectCellinfoEnabled && this.ctltIntervalMilli == networkTestsMetaData.ctltIntervalMilli && this.sendIntervalMilli == networkTestsMetaData.sendIntervalMilli && this.ttl == networkTestsMetaData.ttl) {
            String str = this.hostCt;
            if (str == null ? networkTestsMetaData.hostCt == null : str.equals(networkTestsMetaData.hostCt)) {
                String str2 = this.hostLt;
                if (str2 == null ? networkTestsMetaData.hostLt == null : str2.equals(networkTestsMetaData.hostLt)) {
                    String str3 = this.hostNir;
                    if (str3 == null ? networkTestsMetaData.hostNir == null : str3.equals(networkTestsMetaData.hostNir)) {
                        String str4 = this.projectId;
                        if (str4 == null ? networkTestsMetaData.projectId == null : str4.equals(networkTestsMetaData.projectId)) {
                            String str5 = this.connectivityTestHostname;
                            if (str5 == null ? networkTestsMetaData.connectivityTestHostname == null : str5.equals(networkTestsMetaData.connectivityTestHostname)) {
                                String str6 = this.connectivityTestFilename;
                                if (str6 == null ? networkTestsMetaData.connectivityTestFilename == null : str6.equals(networkTestsMetaData.connectivityTestFilename)) {
                                    String str7 = this.connectivityTestCdnconfigUrl;
                                    if (str7 == null ? networkTestsMetaData.connectivityTestCdnconfigUrl == null : str7.equals(networkTestsMetaData.connectivityTestCdnconfigUrl)) {
                                        String str8 = this.geoipUrl;
                                        String str9 = networkTestsMetaData.geoipUrl;
                                        return str8 != null ? str8.equals(str9) : str9 == null;
                                    }
                                    return false;
                                }
                                return false;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.hostCt;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.hostLt;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hostNir;
        int hashCode3 = (((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.numberOfRecordsMin) * 31) + this.numberOfRecordsMax) * 31) + (this.enabled ? 1 : 0)) * 31) + (this.enabledCachedProcess ? 1 : 0)) * 31;
        String str4 = this.projectId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.connectivityTestHostname;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.connectivityTestFilename;
        int hashCode6 = (((((((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + (this.connectivityTestEnabled ? 1 : 0)) * 31) + (this.nirCollectCellinfoEnabled ? 1 : 0)) * 31) + (this.ctCollectCellinfoEnabled ? 1 : 0)) * 31;
        String str7 = this.connectivityTestCdnconfigUrl;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.geoipUrl;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        long j10 = this.ctltIntervalMilli;
        long j11 = this.sendIntervalMilli;
        long j12 = this.ttl;
        return ((((((hashCode7 + hashCode8) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)));
    }
}

package com.applovin.impl.sdk;

import android.content.Context;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* renamed from: a  reason: collision with root package name */
    private final String f8681a;

    /* renamed from: b  reason: collision with root package name */
    private final String f8682b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8683c;

    /* renamed from: d  reason: collision with root package name */
    private final MaxSegmentCollection f8684d;

    /* renamed from: e  reason: collision with root package name */
    private final List f8685e;

    /* renamed from: f  reason: collision with root package name */
    private final List f8686f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f8687g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* renamed from: a  reason: collision with root package name */
        private String f8688a;

        /* renamed from: b  reason: collision with root package name */
        private String f8689b;

        /* renamed from: c  reason: collision with root package name */
        private String f8690c;

        /* renamed from: d  reason: collision with root package name */
        private MaxSegmentCollection f8691d;

        /* renamed from: e  reason: collision with root package name */
        private List f8692e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        private List f8693f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private boolean f8694g = true;

        public BuilderImpl(String str, Context context) {
            this.f8688a = str;
            n.e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f8693f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getMediationProvider() {
            return this.f8689b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getPluginVersion() {
            return this.f8690c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f8688a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public MaxSegmentCollection getSegmentCollection() {
            return this.f8691d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f8692e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f8694g;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            n.e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        n.h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f8693f = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z10) {
            n.e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z10 + ")");
            this.f8694g = z10;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(String str) {
            n.e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str != null && (str.isEmpty() || str.length() > 64 || !StringUtils.isAlphaNumeric(str))) {
                n.h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
                return this;
            }
            this.f8689b = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(String str) {
            n.e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f8690c = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f8688a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            n.e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f8691d = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            n.e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str != null && str.length() == 36) {
                    arrayList.add(str);
                } else {
                    n.h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                }
            }
            this.f8692e = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f8688a + "mediationProvider=" + this.f8689b + "pluginVersion=" + this.f8690c + "testDeviceAdvertisingIdentifiers=" + this.f8692e + "adUnitIdentifiers=" + this.f8693f + "isExceptionHandlerEnabled=" + this.f8694g + "segmentCollection=" + this.f8691d + "}";
        }
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f8686f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getMediationProvider() {
        return this.f8682b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getPluginVersion() {
        return this.f8683c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getSdkKey() {
        return this.f8681a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public MaxSegmentCollection getSegmentCollection() {
        return this.f8684d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f8685e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f8687g;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f8681a + ", mediationProvider=" + this.f8682b + ", pluginVersion=" + this.f8683c + ", testDeviceAdvertisingIds=" + this.f8685e + ", adUnitIdentifiers=" + this.f8686f + ", isExceptionHandlerEnabled=" + this.f8687g + ", segmentCollection=" + this.f8684d + "}";
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f8681a = builderImpl.f8688a;
        this.f8682b = builderImpl.f8689b;
        this.f8683c = builderImpl.f8690c;
        this.f8684d = builderImpl.f8691d;
        this.f8685e = builderImpl.f8692e;
        this.f8686f = builderImpl.f8693f;
        this.f8687g = builderImpl.f8694g;
    }
}

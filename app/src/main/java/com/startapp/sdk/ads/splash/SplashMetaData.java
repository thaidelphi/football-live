package com.startapp.sdk.ads.splash;

import android.content.Context;
import com.startapp.common.parser.TypeInfo;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class SplashMetaData implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static volatile SplashMetaData f22718b = new SplashMetaData();

    /* renamed from: c  reason: collision with root package name */
    public static final Object f22719c = new Object();
    private static final long serialVersionUID = 5949259263399692883L;
    @TypeInfo(complex = true)
    private SplashConfig SplashConfig = new SplashConfig();
    private String splashMetadataUpdateVersion = "4.11.5";

    /* renamed from: a  reason: collision with root package name */
    public transient boolean f22720a = true;

    public final SplashConfig a() {
        return this.SplashConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SplashMetaData splashMetaData = (SplashMetaData) obj;
        return o9.a(this.SplashConfig, splashMetaData.SplashConfig) && o9.a(this.splashMetadataUpdateVersion, splashMetaData.splashMetadataUpdateVersion);
    }

    public final int hashCode() {
        Object[] objArr = {this.SplashConfig, this.splashMetadataUpdateVersion};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, SplashMetaData splashMetaData) {
        synchronized (f22719c) {
            splashMetaData.splashMetadataUpdateVersion = "4.11.5";
            f22718b = splashMetaData;
            g2.a(context, "StartappSplashMetadata", splashMetaData);
            f22718b.f22720a = false;
        }
    }

    public static void a(Context context) {
        SplashMetaData splashMetaData = (SplashMetaData) g2.c(context, "StartappSplashMetadata");
        SplashMetaData splashMetaData2 = new SplashMetaData();
        if (splashMetaData != null) {
            boolean a10 = o9.a((Serializable) splashMetaData, (Serializable) splashMetaData2);
            if (!(!"4.11.5".equals(splashMetaData.splashMetadataUpdateVersion)) && a10) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "metadata_null";
                l3Var.a();
            }
            f22718b = splashMetaData;
            f22718b.f22720a = false;
            return;
        }
        f22718b = splashMetaData2;
    }
}

package com.startapp.sdk.ads.banner;

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
public class BannerMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f22540a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile BannerMetaData f22541b = new BannerMetaData();
    private static final long serialVersionUID = -6987543640616659467L;
    @TypeInfo(complex = true)
    private BannerOptions BannerOptions = new BannerOptions();
    private String bannerMetadataUpdateVersion = "4.11.5";

    public final BannerOptions a() {
        return this.BannerOptions;
    }

    public final BannerOptions b() {
        return new BannerOptions(this.BannerOptions);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BannerMetaData bannerMetaData = (BannerMetaData) obj;
        return o9.a(this.BannerOptions, bannerMetaData.BannerOptions) && o9.a(this.bannerMetadataUpdateVersion, bannerMetaData.bannerMetadataUpdateVersion);
    }

    public final int hashCode() {
        Object[] objArr = {this.BannerOptions, this.bannerMetadataUpdateVersion};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context, BannerMetaData bannerMetaData) {
        synchronized (f22540a) {
            bannerMetaData.bannerMetadataUpdateVersion = "4.11.5";
            f22541b = bannerMetaData;
            g2.a(context, "StartappBannerMetadata", bannerMetaData);
        }
    }

    public static void a(Context context) {
        BannerMetaData bannerMetaData = (BannerMetaData) g2.c(context, "StartappBannerMetadata");
        BannerMetaData bannerMetaData2 = new BannerMetaData();
        if (bannerMetaData != null) {
            boolean a10 = o9.a((Serializable) bannerMetaData, (Serializable) bannerMetaData2);
            if (!(!"4.11.5".equals(bannerMetaData.bannerMetadataUpdateVersion)) && a10) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "metadata_null";
                l3Var.a();
            }
            f22541b = bannerMetaData;
            return;
        }
        f22541b = bannerMetaData2;
    }
}

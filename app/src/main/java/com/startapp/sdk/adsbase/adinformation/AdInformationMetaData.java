package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import com.startapp.common.parser.TypeInfo;
import com.startapp.g2;
import com.startapp.l3;
import com.startapp.m3;
import com.startapp.o9;
import com.startapp.sdk.adsbase.adinformation.AdInformationConfig;
import java.io.Serializable;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdInformationMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static volatile AdInformationMetaData f22954a = new AdInformationMetaData();

    /* renamed from: b  reason: collision with root package name */
    public static final Object f22955b = new Object();
    private static final long serialVersionUID = -6352184674890532240L;
    @TypeInfo(complex = true)
    private AdInformationConfig AdInformation = AdInformationConfig.a();
    private String adInformationMetadataUpdateVersion = "4.11.5";

    public static AdInformationMetaData c() {
        return f22954a;
    }

    public final AdInformationConfig a() {
        return this.AdInformation;
    }

    public final String b() {
        return this.AdInformation.d();
    }

    public final String d() {
        AdInformationConfig adInformationConfig = this.AdInformation;
        EnumMap<AdInformationConfig.ImageResourceType, ImageResourceConfig> enumMap = adInformationConfig.f22953a;
        AdInformationConfig.ImageResourceType imageResourceType = AdInformationConfig.ImageResourceType.INFO_L;
        return (!enumMap.containsKey(imageResourceType) || adInformationConfig.f22953a.get(imageResourceType).b().equals("")) ? "https://info.startappservice.com/InApp/resources/info_l.png" : adInformationConfig.f22953a.get(imageResourceType).b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) obj;
        return o9.a(this.AdInformation, adInformationMetaData.AdInformation) && o9.a(this.adInformationMetadataUpdateVersion, adInformationMetaData.adInformationMetadataUpdateVersion);
    }

    public final int hashCode() {
        Object[] objArr = {this.AdInformation, this.adInformationMetadataUpdateVersion};
        WeakHashMap weakHashMap = o9.f22359a;
        return Arrays.deepHashCode(objArr);
    }

    public static void a(Context context) {
        AdInformationMetaData adInformationMetaData = (AdInformationMetaData) g2.c(context, "StartappAdInfoMetadata");
        AdInformationMetaData adInformationMetaData2 = new AdInformationMetaData();
        if (adInformationMetaData != null) {
            boolean a10 = o9.a((Serializable) adInformationMetaData, (Serializable) adInformationMetaData2);
            if (!(!"4.11.5".equals(adInformationMetaData.adInformationMetadataUpdateVersion)) && a10) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "metadata_null";
                l3Var.a();
            }
            AdInformationConfig adInformationConfig = adInformationMetaData.AdInformation;
            adInformationConfig.getClass();
            adInformationConfig.f22953a = new EnumMap<>(AdInformationConfig.ImageResourceType.class);
            f22954a = adInformationMetaData;
        } else {
            f22954a = adInformationMetaData2;
        }
        f22954a.AdInformation.a(context);
    }

    public static void a(Context context, AdInformationMetaData adInformationMetaData) {
        synchronized (f22955b) {
            adInformationMetaData.adInformationMetadataUpdateVersion = "4.11.5";
            f22954a = adInformationMetaData;
            AdInformationConfig.a(f22954a.AdInformation);
            f22954a.AdInformation.a(context);
            g2.a(context, "StartappAdInfoMetadata", adInformationMetaData);
        }
    }
}

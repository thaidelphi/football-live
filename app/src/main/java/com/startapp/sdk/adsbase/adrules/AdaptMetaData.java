package com.startapp.sdk.adsbase.adrules;

import com.startapp.common.parser.TypeInfo;
import java.io.Serializable;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdaptMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final transient AdaptMetaData f23001a = new AdaptMetaData();
    @TypeInfo(complex = true)
    private AdRules adRules = new AdRules();
    private String adaptMetaDataUpdateVersion = "4.11.5";

    private AdaptMetaData() {
    }

    public final AdRules a() {
        return this.adRules;
    }
}

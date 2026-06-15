package com.startapp.sdk.components;

import android.content.Context;
import com.startapp.i2;
import com.startapp.k3;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import java.util.List;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class d0 implements i2<Context, List<String>, TrackingParams, k3> {
    @Override // com.startapp.i2
    public final k3 a(Context context, List<String> list, TrackingParams trackingParams) {
        Context context2 = context;
        List<String> list2 = list;
        TrackingParams trackingParams2 = trackingParams;
        if (context2 == null || list2 == null) {
            return null;
        }
        return new k3(context2, list2, trackingParams2, new c0());
    }
}

package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataStyle;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class u4 extends ArrayAdapter<y4> {

    /* renamed from: a  reason: collision with root package name */
    public final String f23437a;

    /* renamed from: b  reason: collision with root package name */
    public final String f23438b;

    public u4(Context context, List list, String str, String str2) {
        super(context, 0, list);
        this.f23437a = str;
        this.f23438b = str2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        z4 z4Var;
        long millis;
        String str;
        if (view == null) {
            z4Var = new z4(getContext());
            view2 = z4Var.f23663a;
        } else {
            view2 = view;
            z4Var = (z4) view.getTag();
        }
        y4 item = getItem(i10);
        MetaDataStyle a10 = AdsCommonMetaData.f22889h.a(item.f23580q);
        if (z4Var.f23669g != a10) {
            z4Var.f23669g = a10;
            z4Var.f23663a.setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a10.e().intValue(), a10.d().intValue()}));
            z4Var.f23665c.setTextSize(a10.h().intValue());
            z4Var.f23665c.setTextColor(a10.f().intValue());
            j9.a(z4Var.f23665c, a10.g());
            z4Var.f23666d.setTextSize(a10.c().intValue());
            z4Var.f23666d.setTextColor(a10.a().intValue());
            j9.a(z4Var.f23666d, a10.b());
        }
        z4Var.f23665c.setText(item.f23570g);
        z4Var.f23666d.setText(item.f23571h);
        a5 a11 = com.startapp.sdk.components.a.a(getContext()).O.a().a(this.f23438b);
        Bitmap a12 = a11.f21757a.a(item.f23564a, i10, item.f23572i);
        if (a12 == null) {
            z4Var.f23664b.setImageResource(17301651);
            z4Var.f23664b.setTag("tag_error");
        } else {
            z4Var.f23664b.setImageBitmap(a12);
            z4Var.f23664b.setTag("tag_ok");
        }
        z4Var.f23668f.setRating(item.f23573j);
        z4Var.a(item.f23577n != null);
        Context context = getContext();
        String[] strArr = item.f23566c;
        TrackingParams trackingParams = new TrackingParams(this.f23437a);
        Long l10 = item.f23578o;
        if (l10 != null) {
            millis = TimeUnit.SECONDS.toMillis(l10.longValue());
        } else {
            millis = TimeUnit.SECONDS.toMillis(MetaData.f23158k.s());
        }
        long j10 = millis;
        j3 j3Var = a11.f21757a;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OFFER_WALL;
        String str2 = a11.f21759c;
        j3Var.getClass();
        if (strArr != null) {
            str = TextUtils.join("^", strArr) + str2;
        } else {
            str = null;
        }
        if (!j3Var.f22126c.containsKey(str)) {
            s7 s7Var = new s7(context, placement, strArr, trackingParams, j10);
            j3Var.f22126c.put(str, s7Var);
            s7Var.c();
        }
        return view2;
    }
}

package com.applovin.impl;

import android.content.Context;
import com.amazon.aps.ads.Aps;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.applovin.mediation.MaxAdFormat;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class s implements DTBAdCallback {

    /* renamed from: a  reason: collision with root package name */
    private final MaxAdFormat f8576a;

    /* renamed from: b  reason: collision with root package name */
    private final a f8577b;

    /* renamed from: c  reason: collision with root package name */
    private DTBAdRequest f8578c;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface a {
        void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat);

        void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat);
    }

    public s(t tVar, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this(Arrays.asList(tVar.a()), maxAdFormat, context, aVar);
    }

    public void a() {
        DTBAdRequest dTBAdRequest = this.f8578c;
        if (dTBAdRequest == null) {
            this.f8577b.onAdLoadFailed(null, this.f8576a);
        } else {
            dTBAdRequest.loadAd(this);
        }
    }

    public void onFailure(AdError adError) {
        this.f8577b.onAdLoadFailed(adError, this.f8576a);
    }

    public void onSuccess(DTBAdResponse dTBAdResponse) {
        this.f8577b.onAdResponseLoaded(dTBAdResponse, this.f8576a);
    }

    public s(List list, MaxAdFormat maxAdFormat, Context context, a aVar) {
        this.f8576a = maxAdFormat;
        this.f8577b = aVar;
        try {
            DTBAdSize[] dTBAdSizeArr = new DTBAdSize[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Object obj = list.get(i10);
                if (obj instanceof DTBAdSize) {
                    dTBAdSizeArr[i10] = (DTBAdSize) obj;
                }
            }
            if (d7.a(Aps.getSdkVersion(), "10.0.0") >= 0) {
                Class<?> cls = Class.forName("com.amazon.aps.ads.model.ApsAdNetwork");
                Class<?> cls2 = Class.forName("com.amazon.device.ads.DTBAdNetworkInfo");
                this.f8578c = (DTBAdRequest) DTBAdRequest.class.getConstructor(Context.class, cls2).newInstance(context.getApplicationContext(), cls2.getConstructor(cls).newInstance(cls.getField("MAX").get(null)));
            } else {
                this.f8578c = (DTBAdRequest) DTBAdRequest.class.getConstructor(null).newInstance(null);
            }
            this.f8578c.setSizes(dTBAdSizeArr);
        } catch (Throwable unused) {
        }
    }
}

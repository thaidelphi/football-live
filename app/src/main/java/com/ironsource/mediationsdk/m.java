package com.ironsource.mediationsdk;

import com.ironsource.am;
import com.ironsource.m5;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class m {

    /* renamed from: a  reason: collision with root package name */
    private HashSet<ImpressionDataListener> f18910a;

    /* renamed from: b  reason: collision with root package name */
    protected com.ironsource.s f18911b;

    /* renamed from: c  reason: collision with root package name */
    protected IronSourceSegment f18912c;

    /* renamed from: d  reason: collision with root package name */
    protected AdInfo f18913d;

    public m(HashSet<ImpressionDataListener> hashSet, IronSourceSegment ironSourceSegment) {
        new HashSet();
        this.f18910a = hashSet;
        this.f18911b = new com.ironsource.s();
        this.f18912c = ironSourceSegment;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(m5 m5Var, String str) {
        HashSet hashSet;
        if (m5Var == null) {
            IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
            return;
        }
        ImpressionData a10 = m5Var.a(str);
        if (a10 != null) {
            synchronized (this) {
                hashSet = (HashSet) this.f18910a.clone();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ImpressionDataListener impressionDataListener = (ImpressionDataListener) it.next();
                IronLog ironLog = IronLog.CALLBACK;
                ironLog.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + a10);
                impressionDataListener.onImpressionSuccess(a10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(IronSource.AD_UNIT ad_unit) {
        this.f18911b.a(ad_unit, false);
    }

    public void a(IronSourceSegment ironSourceSegment) {
        this.f18912c = ironSourceSegment;
    }

    public void a(ImpressionData impressionData, am amVar) {
        if (impressionData != null) {
            this.f18913d = new AdInfo(impressionData, amVar);
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f18910a.remove(impressionDataListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(JSONObject jSONObject, IronSource.AD_UNIT ad_unit) {
        this.f18911b.a(ad_unit, jSONObject != null ? jSONObject.optBoolean(d.f18560f, false) : false);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f18910a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f18910a.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.f18913d = null;
    }
}

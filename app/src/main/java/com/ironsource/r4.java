package com.ironsource;

import android.text.TextUtils;
import com.ironsource.b9;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class r4 {

    /* renamed from: a  reason: collision with root package name */
    private final e2 f19926a;

    public r4(e2 e2Var) {
        this.f19926a = e2Var;
    }

    String a(int i10, int i11, int i12, int i13) {
        return "interstitial" + b9.i.f16692b + i10 + ";rewarded" + b9.i.f16692b + i11 + ";banner" + b9.i.f16692b + i12 + ";" + IronSourceConstants.EVENTS_NATIVE + b9.i.f16692b + i13;
    }

    public void a() {
        this.f19926a.a(b2.AUCTION_REQUEST, null);
    }

    public void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f19926a.a(b2.AUCTION_FAILED_NO_CANDIDATES, hashMap);
    }

    public void a(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f19926a.a(b2.AUCTION_FAILED, hashMap);
    }

    public void a(long j10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f19926a.a(b2.AUCTION_SUCCESS, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("auctionId", str);
        this.f19926a.a(b2.AD_FORMAT_CAPPED, hashMap);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f19926a.a(b2.AUCTION_REQUEST_WATERFALL, hashMap);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str);
        this.f19926a.a(b2.AUCTION_RESULT_WATERFALL, hashMap);
    }
}

package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class zl {

    /* renamed from: a  reason: collision with root package name */
    private final e2 f21662a;

    public zl(e2 e2Var) {
        this.f21662a = e2Var;
    }

    public void a() {
        this.f21662a.a(b2.RELOAD_AD, new HashMap());
    }

    public void a(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put("sessionDepth", Integer.valueOf(i10));
        this.f21662a.a(b2.DESTROY_AD, hashMap);
    }

    public void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f21662a.a(b2.RELOAD_AD_SUCCESS, hashMap);
    }

    public void a(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f21662a.a(b2.LOAD_AD_NO_FILL, hashMap);
    }

    public void a(long j10, int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f21662a.a(b2.RELOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(long j10, int i10, String str, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f21662a.a(b2.LOAD_AD_FAILED_WITH_REASON, hashMap);
    }

    public void a(long j10, int i10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f21662a.a(b2.LOAD_AD_FAILED, hashMap);
    }

    public void a(long j10, boolean z10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f21662a.a(b2.LOAD_AD_SUCCESS, hashMap);
    }

    public void a(Boolean bool, String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("reason", str);
        }
        this.f21662a.a(bool.booleanValue() ? b2.AD_READY_TRUE : b2.AD_READY_FALSE, hashMap);
    }

    public void a(boolean z10) {
        HashMap hashMap = new HashMap();
        if (z10) {
            hashMap.put(IronSourceConstants.EVENTS_PUBLISHER_LOAD, Boolean.TRUE);
        }
        this.f21662a.a(b2.LOAD_AD, hashMap);
    }

    public void a(boolean z10, long j10, boolean z11) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        if (z11) {
            hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_EXPIRED_ADS));
            hashMap.put("reason", "loaded ads are expired");
        }
        this.f21662a.a(z10 ? b2.AD_AVAILABILITY_CHANGED_TRUE : b2.AD_AVAILABILITY_CHANGED_FALSE, hashMap);
    }

    public void b(int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f21662a.a(b2.SKIP_RELOAD_AD, hashMap);
    }

    public void b(long j10, int i10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        this.f21662a.a(b2.RELOAD_AD_NO_FILL, hashMap);
    }
}

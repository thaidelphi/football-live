package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.util.HashMap;
import java.util.Locale;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class fv {

    /* renamed from: a  reason: collision with root package name */
    private final e2 f17499a;

    public fv(e2 e2Var) {
        this.f17499a = e2Var;
    }

    private String a(long j10, long j11, long j12) {
        return "interval: " + j10 + ", remainingTime: " + j11 + ", timePassed: " + j12;
    }

    public void a() {
        this.f17499a.a(b2.TROUBLESHOOT_DISPOSE, null);
    }

    public void a(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, hashMap);
    }

    public void a(int i10, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, str2);
        this.f17499a.a(b2.TROUBLESHOOT_NOTIFICATION_ERROR, hashMap);
    }

    public void a(long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f17499a.a(b2.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, hashMap);
    }

    public void a(LevelPlayAdError levelPlayAdError) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(levelPlayAdError.getErrorCode()));
        hashMap.put("reason", levelPlayAdError.getErrorMessage());
        this.f17499a.a(b2.TROUBLESHOOT_SHOW_FAILED, hashMap);
    }

    public void a(LevelPlayAdInfo levelPlayAdInfo, LevelPlayAdInfo levelPlayAdInfo2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, String.format(Locale.ENGLISH, "oldAdNetwork=%s;oldInstanceId=%s;oldRevenue=%.3f;oldPrecision=%s;newAdNetwork=%s;newInstanceId=%s;newRevenue=%.3f;newPrecision=%s;delta=%.3f", levelPlayAdInfo.getAdNetwork(), levelPlayAdInfo.getInstanceId(), Double.valueOf(levelPlayAdInfo.getRevenue()), levelPlayAdInfo.getPrecision(), levelPlayAdInfo2.getAdNetwork(), levelPlayAdInfo2.getInstanceId(), Double.valueOf(levelPlayAdInfo2.getRevenue()), levelPlayAdInfo2.getPrecision(), Double.valueOf(levelPlayAdInfo2.getRevenue() - levelPlayAdInfo.getRevenue())));
        this.f17499a.a(b2.TROUBLESHOOT_AD_INFO_CHANGED, hashMap);
    }

    public void a(Long l10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, l10);
        this.f17499a.a(b2.TROUBLESHOOT_LOAD_WHILE_LOADED, hashMap);
    }

    public void a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(String str, long j10) {
        String str2;
        HashMap hashMap = new HashMap();
        StringBuilder sb = new StringBuilder();
        if (str.isEmpty()) {
            str2 = "";
        } else {
            str2 = "provider=" + str + ";";
        }
        sb.append(str2);
        sb.append("expirationDuration=");
        sb.append(j10);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, sb.toString());
        this.f17499a.a(b2.TROUBLESHOOT_AD_EXPIRED, hashMap);
    }

    public void a(String str, long j10, long j11, long j12) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, a(j10, j11, j12));
        this.f17499a.a(b2.TROUBLESHOOT_BANNER_REFRESH_PAUSED, hashMap);
    }

    public void a(boolean z10, long j10) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_EXT1, "isAnimated:" + (z10 ? 1 : 0));
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j10));
        this.f17499a.a(b2.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, hashMap);
    }

    public void b() {
        this.f17499a.a(b2.TROUBLESHOOT_LOAD, null);
    }

    public void b(int i10, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10));
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_LOAD_FAILED, hashMap);
    }

    public void b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_IMPRESSION_TIMEOUT, hashMap);
    }

    public void b(String str, long j10, long j11, long j12) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        hashMap.put(IronSourceConstants.EVENTS_EXT1, a(j10, j11, j12));
        this.f17499a.a(b2.TROUBLESHOOT_BANNER_REFRESH_RESUMED, hashMap);
    }

    public void c() {
        this.f17499a.a(b2.TROUBLESHOOT_LOAD_SUCCESS, null);
    }

    public void c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_BN_RELOAD_EXCEPTION, hashMap);
    }

    public void d() {
        this.f17499a.a(b2.TROUBLESHOOT_SHOW, null);
    }

    public void d(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, hashMap);
    }

    public void e() {
        this.f17499a.a(b2.TROUBLESHOOT_SHOW_SUCCESS, null);
    }

    public void e(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, hashMap);
    }

    public void f(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_ILLEGAL_STATE, hashMap);
    }

    public void g(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_INTERNAL_ERROR, hashMap);
    }

    public void h(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, hashMap);
    }

    public void i(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, hashMap);
    }

    public void j(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, hashMap);
    }

    public void k(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_CLOSED, hashMap);
    }

    public void l(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, hashMap);
    }

    public void m(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, hashMap);
    }

    public void n(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, hashMap);
    }

    public void o(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, hashMap);
    }

    public void p(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_OPENED, hashMap);
    }

    public void q(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, hashMap);
    }

    public void r(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, hashMap);
    }

    public void s(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, hashMap);
    }

    public void t(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_UNEXPECTED_TIMEOUT, hashMap);
    }

    public void u(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        this.f17499a.a(b2.TROUBLESHOOT_WATERFALL_OVERHEAD, hashMap);
    }
}

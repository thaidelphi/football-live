package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class e2 {

    /* renamed from: a  reason: collision with root package name */
    private final int f17161a;

    /* renamed from: b  reason: collision with root package name */
    private final IronSource.AD_UNIT f17162b;

    /* renamed from: c  reason: collision with root package name */
    private final b f17163c;

    /* renamed from: d  reason: collision with root package name */
    private d2 f17164d;

    /* renamed from: e  reason: collision with root package name */
    private final s7 f17165e;

    /* renamed from: f  reason: collision with root package name */
    public ki f17166f;

    /* renamed from: g  reason: collision with root package name */
    public zl f17167g;

    /* renamed from: h  reason: collision with root package name */
    public av f17168h;

    /* renamed from: i  reason: collision with root package name */
    public r4 f17169i;

    /* renamed from: j  reason: collision with root package name */
    public n0 f17170j;

    /* renamed from: k  reason: collision with root package name */
    public fv f17171k;

    /* renamed from: l  reason: collision with root package name */
    public vo f17172l;

    /* renamed from: m  reason: collision with root package name */
    private Map<b2, a> f17173m;

    /* renamed from: n  reason: collision with root package name */
    private Map<b2, a> f17174n;

    /* renamed from: o  reason: collision with root package name */
    private Map<b2, a> f17175o;

    /* renamed from: p  reason: collision with root package name */
    private Map<b2, a> f17176p;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f17177a;

        /* renamed from: b  reason: collision with root package name */
        private final int f17178b;

        public a(int i10, int i11) {
            this.f17177a = i10;
            this.f17178b = i11;
        }

        int a(b bVar) {
            return b.MEDIATION.equals(bVar) ? this.f17177a : this.f17178b;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public enum b {
        MEDIATION,
        PROVIDER
    }

    public e2(IronSource.AD_UNIT ad_unit, b bVar, d2 d2Var) {
        this(ad_unit, bVar, d2Var, a(ad_unit));
    }

    public e2(IronSource.AD_UNIT ad_unit, b bVar, d2 d2Var, s7 s7Var) {
        this.f17161a = -1;
        this.f17162b = ad_unit;
        this.f17163c = bVar;
        this.f17164d = d2Var;
        this.f17165e = s7Var == null ? a(ad_unit) : s7Var;
        b();
        this.f17166f = new ki(this);
        this.f17167g = new zl(this);
        this.f17168h = new av(this);
        this.f17169i = new r4(this);
        this.f17170j = new n0(this);
        this.f17171k = new fv(this);
        this.f17172l = new vo(this);
    }

    private int a(b2 b2Var) {
        try {
            if (IronSource.AD_UNIT.INTERSTITIAL.equals(this.f17162b) && this.f17173m.containsKey(b2Var)) {
                return this.f17173m.get(b2Var).a(this.f17163c);
            }
            if (IronSource.AD_UNIT.REWARDED_VIDEO.equals(this.f17162b) && this.f17174n.containsKey(b2Var)) {
                return this.f17174n.get(b2Var).a(this.f17163c);
            }
            if (IronSource.AD_UNIT.BANNER.equals(this.f17162b) && this.f17175o.containsKey(b2Var)) {
                return this.f17175o.get(b2Var).a(this.f17163c);
            }
            if (IronSource.AD_UNIT.NATIVE_AD.equals(this.f17162b) && this.f17176p.containsKey(b2Var)) {
                return this.f17176p.get(b2Var).a(this.f17163c);
            }
            return -1;
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
            return -1;
        }
    }

    private static s7 a(IronSource.AD_UNIT ad_unit) {
        return ad_unit.equals(IronSource.AD_UNIT.REWARDED_VIDEO) ? ar.i() : oj.i();
    }

    private void d() {
        HashMap hashMap = new HashMap();
        this.f17176p = hashMap;
        hashMap.put(b2.INIT_STARTED, new a(IronSourceConstants.NT_MANAGER_INIT_STARTED, -1));
        this.f17176p.put(b2.INIT_ENDED, new a(IronSourceConstants.NT_MANAGER_INIT_ENDED, -1));
        this.f17176p.put(b2.PLACEMENT_CAPPED, new a(IronSourceConstants.NT_PLACEMENT_CAPPED, -1));
        this.f17176p.put(b2.AUCTION_REQUEST, new a(IronSourceConstants.NT_AUCTION_REQUEST, -1));
        this.f17176p.put(b2.AUCTION_SUCCESS, new a(IronSourceConstants.NT_AUCTION_SUCCESS, -1));
        this.f17176p.put(b2.AUCTION_FAILED, new a(IronSourceConstants.NT_AUCTION_FAILED, -1));
        this.f17176p.put(b2.AUCTION_FAILED_NO_CANDIDATES, new a(IronSourceConstants.NT_AUCTION_FAILED, -1));
        this.f17176p.put(b2.AUCTION_REQUEST_WATERFALL, new a(IronSourceConstants.NT_AUCTION_REQUEST_WATERFALL, -1));
        this.f17176p.put(b2.AUCTION_RESULT_WATERFALL, new a(IronSourceConstants.NT_AUCTION_RESPONSE_WATERFALL, -1));
        this.f17176p.put(b2.INIT_SUCCESS, new a(-1, -1));
        this.f17176p.put(b2.INIT_FAILED, new a(-1, -1));
        this.f17176p.put(b2.AD_OPENED, new a(IronSourceConstants.NT_CALLBACK_SHOW, IronSourceConstants.NT_INSTANCE_SHOW));
        this.f17176p.put(b2.AD_CLICKED, new a(IronSourceConstants.NT_CALLBACK_CLICK, IronSourceConstants.NT_INSTANCE_CLICK));
        this.f17176p.put(b2.LOAD_AD, new a(IronSourceConstants.NT_LOAD, IronSourceConstants.NT_INSTANCE_LOAD));
        this.f17176p.put(b2.LOAD_AD_SUCCESS, new a(IronSourceConstants.NT_CALLBACK_LOAD_SUCCESS, IronSourceConstants.NT_INSTANCE_LOAD_SUCCESS));
        this.f17176p.put(b2.LOAD_AD_FAILED_WITH_REASON, new a(IronSourceConstants.NT_CALLBACK_LOAD_ERROR, IronSourceConstants.NT_INSTANCE_LOAD_ERROR));
        this.f17176p.put(b2.LOAD_AD_NO_FILL, new a(-1, IronSourceConstants.NT_INSTANCE_LOAD_NO_FILL));
        this.f17176p.put(b2.AD_FORMAT_CAPPED, new a(IronSourceConstants.NT_AD_UNIT_CAPPED, -1));
        this.f17176p.put(b2.COLLECT_TOKEN, new a(IronSourceConstants.NT_COLLECT_TOKENS, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN));
        this.f17176p.put(b2.COLLECT_TOKENS_COMPLETED, new a(IronSourceConstants.NT_COLLECT_TOKENS_COMPLETED, -1));
        this.f17176p.put(b2.COLLECT_TOKENS_FAILED, new a(IronSourceConstants.NT_COLLECT_TOKENS_FAILED, -1));
        this.f17176p.put(b2.INSTANCE_COLLECT_TOKEN, new a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN, -1));
        this.f17176p.put(b2.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_SUCCESS));
        this.f17176p.put(b2.INSTANCE_COLLECT_TOKEN_FAILED, new a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_FAILED));
        this.f17176p.put(b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.NT_INSTANCE_COLLECT_TOKEN_TIMED_OUT));
        this.f17176p.put(b2.DESTROY_AD, new a(IronSourceConstants.NT_DESTROY, IronSourceConstants.NT_INSTANCE_DESTROY));
        this.f17176p.put(b2.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new a(IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_NT_PROVIDER_SETTINGS_MISSING));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_SUCCESS));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_INIT_FAILED));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_SUCCESS));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_AUCTION_FAILED));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_SUCCESS));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_LOAD_FAILED));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_TIMEOUT));
        this.f17176p.put(b2.TROUBLESHOOT_UNEXPECTED_OPENED, new a(IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED, IronSourceConstants.TROUBLESHOOTING_NT_UNEXPECTED_OPENED));
        this.f17176p.put(b2.TROUBLESHOOT_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_NT_INTERNAL_ERROR));
        this.f17176p.put(b2.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f17176p.put(b2.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new a(88002, 88002));
        this.f17176p.put(b2.TROUBLESHOOT_NOTIFICATION_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_NT_NOTIFICATIONS_ERROR, -1));
    }

    void a() {
        HashMap hashMap = new HashMap();
        this.f17175o = hashMap;
        hashMap.put(b2.INIT_STARTED, new a(IronSourceConstants.BN_MANAGER_INIT_STARTED, -1));
        this.f17175o.put(b2.INIT_ENDED, new a(IronSourceConstants.BN_MANAGER_INIT_ENDED, -1));
        this.f17175o.put(b2.PLACEMENT_CAPPED, new a(IronSourceConstants.BN_PLACEMENT_CAPPED, -1));
        this.f17175o.put(b2.AUCTION_REQUEST, new a(IronSourceConstants.BN_AUCTION_REQUEST, -1));
        this.f17175o.put(b2.AUCTION_SUCCESS, new a(IronSourceConstants.BN_AUCTION_SUCCESS, -1));
        this.f17175o.put(b2.AUCTION_FAILED, new a(IronSourceConstants.BN_AUCTION_FAILED, -1));
        this.f17175o.put(b2.AUCTION_FAILED_NO_CANDIDATES, new a(IronSourceConstants.BN_AUCTION_FAILED, -1));
        this.f17175o.put(b2.AUCTION_REQUEST_WATERFALL, new a(IronSourceConstants.BN_AUCTION_REQUEST_WATERFALL, -1));
        this.f17175o.put(b2.AUCTION_RESULT_WATERFALL, new a(IronSourceConstants.BN_AUCTION_RESPONSE_WATERFALL, -1));
        this.f17175o.put(b2.INIT_SUCCESS, new a(-1, -1));
        this.f17175o.put(b2.INIT_FAILED, new a(-1, -1));
        this.f17175o.put(b2.AD_OPENED, new a(IronSourceConstants.BN_CALLBACK_SHOW, 3009));
        this.f17175o.put(b2.AD_CLICKED, new a(IronSourceConstants.BN_CALLBACK_CLICK, 3008));
        this.f17175o.put(b2.LOAD_AD, new a(3001, 3002));
        this.f17175o.put(b2.RELOAD_AD, new a(IronSourceConstants.BN_RELOAD, IronSourceConstants.BN_INSTANCE_RELOAD));
        this.f17175o.put(b2.LOAD_AD_SUCCESS, new a(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, 3005));
        this.f17175o.put(b2.RELOAD_AD_SUCCESS, new a(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS));
        this.f17175o.put(b2.LOAD_AD_FAILED_WITH_REASON, new a(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, 3300));
        this.f17175o.put(b2.RELOAD_AD_FAILED_WITH_REASON, new a(IronSourceConstants.BN_CALLBACK_RELOAD_ERROR, IronSourceConstants.BN_INSTANCE_RELOAD_ERROR));
        this.f17175o.put(b2.LOAD_AD_NO_FILL, new a(-1, 3306));
        this.f17175o.put(b2.RELOAD_AD_NO_FILL, new a(-1, IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL));
        this.f17175o.put(b2.AD_FORMAT_CAPPED, new a(IronSourceConstants.BN_AD_UNIT_CAPPED, -1));
        this.f17175o.put(b2.COLLECT_TOKEN, new a(IronSourceConstants.BN_COLLECT_TOKENS, -1));
        this.f17175o.put(b2.COLLECT_TOKENS_COMPLETED, new a(IronSourceConstants.BN_COLLECT_TOKENS_COMPLETED, -1));
        this.f17175o.put(b2.COLLECT_TOKENS_FAILED, new a(IronSourceConstants.BN_COLLECT_TOKENS_FAILED, -1));
        this.f17175o.put(b2.INSTANCE_COLLECT_TOKEN, new a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN, -1));
        this.f17175o.put(b2.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_SUCCESS));
        this.f17175o.put(b2.INSTANCE_COLLECT_TOKEN_FAILED, new a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_FAILED));
        this.f17175o.put(b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT, IronSourceConstants.BN_INSTANCE_COLLECT_TOKEN_TIMED_OUT));
        this.f17175o.put(b2.DESTROY_AD, new a(IronSourceConstants.BN_DESTROY, 3305));
        this.f17175o.put(b2.SKIP_RELOAD_AD, new a(IronSourceConstants.BN_SKIP_RELOAD, -1));
        this.f17175o.put(b2.AD_LEFT_APPLICATION, new a(IronSourceConstants.BN_CALLBACK_LEAVE_APP, 3304));
        this.f17175o.put(b2.AD_PRESENT_SCREEN, new a(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN));
        this.f17175o.put(b2.AD_DISMISS_SCREEN, new a(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN));
        this.f17175o.put(b2.AD_VIEW_BOUND, new a(IronSourceConstants.BN_BOUND, IronSourceConstants.BN_INSTANCE_BOUND));
        this.f17175o.put(b2.PAUSE_AD, new a(IronSourceConstants.BN_REFRESH_PAUSE, -1));
        this.f17175o.put(b2.RESUME_AD, new a(IronSourceConstants.BN_REFRESH_RESUME, -1));
        this.f17175o.put(b2.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new a(IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_BN_PROVIDER_SETTINGS_MISSING));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_SUCCESS));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_INIT_FAILED));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_SUCCESS));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_AUCTION_FAILED));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_SUCCESS));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_LOAD_FAILED));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_RELOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_SUCCESS));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_RELOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_RELOAD_FAILED));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_TIMEOUT));
        this.f17175o.put(b2.TROUBLESHOOT_UNEXPECTED_OPENED, new a(IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED, IronSourceConstants.TROUBLESHOOTING_BN_UNEXPECTED_OPENED));
        this.f17175o.put(b2.TROUBLESHOOT_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_BN_INTERNAL_ERROR));
        this.f17175o.put(b2.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f17175o.put(b2.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new a(88002, 88002));
        this.f17175o.put(b2.TROUBLESHOOT_NOTIFICATION_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_BN_NOTIFICATIONS_ERROR, -1));
        this.f17175o.put(b2.TROUBLESHOOT_BN_RELOAD_EXCEPTION, new a(IronSourceConstants.TROUBLESHOOTING_BN_RELOAD_EXCEPTION, -1));
        this.f17175o.put(b2.TROUBLESHOOT_IMPRESSION_TIMEOUT, new a(IronSourceConstants.TROUBLESHOOTING_BN_IMPRESSION_TIMEOUT_REACHED, -1));
        this.f17175o.put(b2.TROUBLESHOOT_BANNER_REFRESH_PAUSED, new a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_PAUSED, -1));
        this.f17175o.put(b2.TROUBLESHOOT_BANNER_REFRESH_RESUMED, new a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_RESUMED, -1));
        this.f17175o.put(b2.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_PAUSE, new a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_PAUSE, -1));
        this.f17175o.put(b2.TROUBLESHOOT_BANNER_REFRESH_TRIGGER_RESUME, new a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRIGGER_RESUME, -1));
        this.f17175o.put(b2.TROUBLESHOOT_BANNER_REFRESH_TRANSITION, new a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION, IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_TRANSITION));
        this.f17175o.put(b2.TROUBLESHOOT_BANNER_REFRESH_ANIMATED, new a(IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED, IronSourceConstants.TROUBLESHOOT_BN_BANNER_REFRESH_ANIMATED));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(b2 b2Var, Map<String, Object> map) {
        a(b2Var, map, Calendar.getInstance().getTimeInMillis());
    }

    public void a(b2 b2Var, Map<String, Object> map, long j10) {
        int a10 = a(b2Var);
        if (-1 == a10) {
            return;
        }
        HashMap hashMap = new HashMap();
        d2 d2Var = this.f17164d;
        if (d2Var != null) {
            hashMap.putAll(d2Var.a(b2Var));
        }
        if (map != null && !map.isEmpty()) {
            hashMap.putAll(map);
        }
        this.f17165e.a(new zb(a10, j10, new JSONObject(hashMap)));
    }

    void b() {
        c();
        e();
        a();
        d();
    }

    void c() {
        HashMap hashMap = new HashMap();
        this.f17173m = hashMap;
        hashMap.put(b2.INIT_STARTED, new a(IronSourceConstants.IS_MANAGER_INIT_STARTED, -1));
        this.f17173m.put(b2.INIT_ENDED, new a(IronSourceConstants.IS_MANAGER_INIT_ENDED, -1));
        this.f17173m.put(b2.SESSION_CAPPED, new a(-1, IronSourceConstants.IS_CAP_SESSION));
        this.f17173m.put(b2.PLACEMENT_CAPPED, new a(IronSourceConstants.IS_CAP_PLACEMENT, -1));
        this.f17173m.put(b2.CHECK_PLACEMENT_CAPPED, new a(IronSourceConstants.IS_CHECK_PLACEMENT_CAPPED, -1));
        this.f17173m.put(b2.AUCTION_REQUEST, new a(2000, -1));
        this.f17173m.put(b2.AUCTION_SUCCESS, new a(IronSourceConstants.IS_AUCTION_SUCCESS, -1));
        this.f17173m.put(b2.AUCTION_FAILED, new a(2300, -1));
        this.f17173m.put(b2.AUCTION_FAILED_NO_CANDIDATES, new a(2300, -1));
        this.f17173m.put(b2.AUCTION_REQUEST_WATERFALL, new a(IronSourceConstants.IS_AUCTION_REQUEST_WATERFALL, -1));
        this.f17173m.put(b2.AUCTION_RESULT_WATERFALL, new a(IronSourceConstants.IS_RESULT_WATERFALL, -1));
        this.f17173m.put(b2.INIT_SUCCESS, new a(-1, -1));
        this.f17173m.put(b2.INIT_FAILED, new a(-1, -1));
        this.f17173m.put(b2.SHOW_AD_SUCCESS, new a(IronSourceConstants.IS_CALLBACK_AD_DISPLAYED, 2202));
        this.f17173m.put(b2.AD_OPENED, new a(-1, 2005));
        this.f17173m.put(b2.AD_CLOSED, new a(IronSourceConstants.IS_CALLBACK_AD_CLOSED, 2204));
        this.f17173m.put(b2.AD_CLICKED, new a(IronSourceConstants.IS_CALLBACK_AD_CLICKED, 2006));
        this.f17173m.put(b2.AD_INFO_CHANGED, new a(IronSourceConstants.IS_CALLBACK_AD_INFO_CHANGED, -1));
        this.f17173m.put(b2.LOAD_AD, new a(2001, 2002));
        this.f17173m.put(b2.LOAD_AD_SUCCESS, new a(2004, 2003));
        this.f17173m.put(b2.LOAD_AD_FAILED_WITH_REASON, new a(2110, 2200));
        this.f17173m.put(b2.LOAD_AD_NO_FILL, new a(-1, 2213));
        this.f17173m.put(b2.SHOW_AD, new a(2100, 2201));
        this.f17173m.put(b2.SHOW_AD_FAILED, new a(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, 2203));
        this.f17173m.put(b2.AD_FORMAT_CAPPED, new a(2303, -1));
        this.f17173m.put(b2.AD_UNIT_CAPPED, new a(IronSourceConstants.IS_AD_UNIT_CAPPED, -1));
        this.f17173m.put(b2.COLLECT_TOKEN, new a(IronSourceConstants.IS_COLLECT_TOKENS, -1));
        this.f17173m.put(b2.COLLECT_TOKENS_COMPLETED, new a(IronSourceConstants.IS_COLLECT_TOKENS_COMPLETED, -1));
        this.f17173m.put(b2.COLLECT_TOKENS_FAILED, new a(IronSourceConstants.IS_COLLECT_TOKENS_FAILED, -1));
        this.f17173m.put(b2.INSTANCE_COLLECT_TOKEN, new a(2020, -1));
        this.f17173m.put(b2.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_SUCCESS, -1));
        this.f17173m.put(b2.INSTANCE_COLLECT_TOKEN_FAILED, new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_FAILED, -1));
        this.f17173m.put(b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(IronSourceConstants.IS_INSTANCE_COLLECT_TOKEN_TIMED_OUT, -1));
        this.f17173m.put(b2.AD_READY_TRUE, new a(IronSourceConstants.IS_CHECK_READY_TRUE, -1));
        this.f17173m.put(b2.AD_READY_FALSE, new a(IronSourceConstants.IS_CHECK_READY_FALSE, -1));
        this.f17173m.put(b2.OPERATIONAL_LOAD_AD, new a(IronSourceConstants.IS_OPERATIONAL_LOAD_AD, -1));
        this.f17173m.put(b2.OPERATIONAL_LOAD_SUCCESS, new a(IronSourceConstants.IS_OPERATIONAL_LOAD_SUCCESS, -1));
        this.f17173m.put(b2.OPERATIONAL_LOAD_FAILED, new a(IronSourceConstants.IS_OPERATIONAL_LOAD_FAILED, -1));
        this.f17173m.put(b2.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new a(IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_IS_PROVIDER_SETTINGS_MISSING));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_SUCCESS));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_INIT_FAILED));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_SUCCESS));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_AUCTION_FAILED));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_SUCCESS));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_LOAD_FAILED));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_SHOW_FAILED));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_CLOSED, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_CLOSED));
        this.f17173m.put(b2.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new a(IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_IS_UNEXPECTED_TIMEOUT));
        this.f17173m.put(b2.TROUBLESHOOT_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_IS_INTERNAL_ERROR));
        this.f17173m.put(b2.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f17173m.put(b2.TROUBLESHOOT_AUCTION_SUCCESSFUL_RECOVERY_ERROR, new a(88002, 88002));
        this.f17173m.put(b2.TROUBLESHOOT_NOTIFICATION_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_IS_NOTIFICATIONS_ERROR, -1));
        this.f17173m.put(b2.TROUBLESHOOT_AD_EXPIRED, new a(IronSourceConstants.TROUBLESHOOTING_IS_AD_EXPIRED, IronSourceConstants.TROUBLESHOOTING_IS_AD_EXPIRED));
        this.f17173m.put(b2.TROUBLESHOOT_LOAD, new a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD, -1));
        this.f17173m.put(b2.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD_WHILE_LOADED, -1));
        this.f17173m.put(b2.TROUBLESHOOT_LOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD_SUCCESS, -1));
        this.f17173m.put(b2.TROUBLESHOOT_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_IS_LOAD_FAILED, -1));
        this.f17173m.put(b2.TROUBLESHOOT_SHOW, new a(IronSourceConstants.TROUBLESHOOTING_IS_SHOW, -1));
        this.f17173m.put(b2.TROUBLESHOOT_SHOW_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_IS_SHOW_SUCCESS, -1));
        this.f17173m.put(b2.TROUBLESHOOT_SHOW_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_IS_SHOW_FAILED, -1));
        this.f17173m.put(b2.TROUBLESHOOT_ILLEGAL_STATE, new a(IronSourceConstants.TROUBLESHOOTING_IS_ILLEGAL_STATE, -1));
        this.f17173m.put(b2.TROUBLESHOOT_AD_INFO_CHANGED, new a(IronSourceConstants.TROUBLESHOOT_IS_AD_INFO_CHANGED, -1));
        this.f17173m.put(b2.TROUBLESHOOT_DISPOSE, new a(IronSourceConstants.TROUBLESHOOTING_IS_DISPOSE, -1));
    }

    void e() {
        HashMap hashMap = new HashMap();
        this.f17174n = hashMap;
        hashMap.put(b2.INIT_STARTED, new a(IronSourceConstants.RV_MANAGER_INIT_STARTED, -1));
        this.f17174n.put(b2.INIT_ENDED, new a(IronSourceConstants.RV_MANAGER_INIT_ENDED, -1));
        this.f17174n.put(b2.SESSION_CAPPED, new a(-1, IronSourceConstants.RV_CAP_SESSION));
        this.f17174n.put(b2.PLACEMENT_CAPPED, new a(IronSourceConstants.RV_CAP_PLACEMENT, -1));
        this.f17174n.put(b2.CHECK_PLACEMENT_CAPPED, new a(IronSourceConstants.RV_CHECK_PLACEMENT_CAPPED, -1));
        this.f17174n.put(b2.AUCTION_REQUEST, new a(IronSourceConstants.RV_AUCTION_REQUEST, -1));
        this.f17174n.put(b2.AUCTION_SUCCESS, new a(IronSourceConstants.RV_AUCTION_SUCCESS, -1));
        this.f17174n.put(b2.AUCTION_FAILED, new a(1301, -1));
        this.f17174n.put(b2.AUCTION_FAILED_NO_CANDIDATES, new a(1301, -1));
        this.f17174n.put(b2.AUCTION_REQUEST_WATERFALL, new a(IronSourceConstants.RV_AUCTION_REQUEST_WATERFALL, -1));
        this.f17174n.put(b2.AUCTION_RESULT_WATERFALL, new a(IronSourceConstants.RV_AUCTION_RESPONSE_WATERFALL, -1));
        this.f17174n.put(b2.INIT_SUCCESS, new a(-1, -1));
        this.f17174n.put(b2.INIT_FAILED, new a(-1, -1));
        this.f17174n.put(b2.AD_VISIBLE, new a(-1, 1206));
        this.f17174n.put(b2.SHOW_AD_SUCCESS, new a(IronSourceConstants.RV_CALLBACK_AD_DISPLAYED, -1));
        this.f17174n.put(b2.AD_OPENED, new a(-1, 1005));
        this.f17174n.put(b2.AD_CLOSED, new a(-1, 1203));
        this.f17174n.put(b2.AD_STARTED, new a(-1, IronSourceConstants.RV_INSTANCE_STARTED));
        this.f17174n.put(b2.AD_ENDED, new a(-1, IronSourceConstants.RV_INSTANCE_ENDED));
        this.f17174n.put(b2.AD_CLICKED, new a(IronSourceConstants.RV_CALLBACK_AD_CLICKED, 1006));
        this.f17174n.put(b2.AD_INFO_CHANGED, new a(IronSourceConstants.RV_CALLBACK_AD_INFO_CHANGED, -1));
        this.f17174n.put(b2.AD_REWARDED, new a(-1, 1010));
        this.f17174n.put(b2.AD_AVAILABILITY_CHANGED_TRUE, new a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE));
        this.f17174n.put(b2.AD_AVAILABILITY_CHANGED_FALSE, new a(IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE));
        this.f17174n.put(b2.LOAD_AD, new a(1000, 1001));
        this.f17174n.put(b2.LOAD_AD_SUCCESS, new a(1003, 1002));
        this.f17174n.put(b2.LOAD_AD_FAILED, new a(-1, 1200));
        this.f17174n.put(b2.LOAD_AD_FAILED_WITH_REASON, new a(IronSourceConstants.RV_MEDIATION_LOAD_ERROR, IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON));
        this.f17174n.put(b2.LOAD_AD_NO_FILL, new a(-1, 1213));
        this.f17174n.put(b2.SHOW_AD, new a(IronSourceConstants.RV_API_SHOW_CALLED, 1201));
        this.f17174n.put(b2.SHOW_AD_CHANCE, new a(-1, IronSourceConstants.RV_INSTANCE_SHOW_CHANCE));
        this.f17174n.put(b2.SHOW_AD_FAILED, new a(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, 1202));
        this.f17174n.put(b2.AD_FORMAT_CAPPED, new a(IronSourceConstants.RV_AD_UNIT_CAPPED, -1));
        this.f17174n.put(b2.COLLECT_TOKEN, new a(IronSourceConstants.RV_COLLECT_TOKENS, -1));
        this.f17174n.put(b2.COLLECT_TOKENS_COMPLETED, new a(IronSourceConstants.RV_COLLECT_TOKENS_COMPLETED, -1));
        this.f17174n.put(b2.COLLECT_TOKENS_FAILED, new a(IronSourceConstants.RV_COLLECT_TOKENS_FAILED, -1));
        this.f17174n.put(b2.INSTANCE_COLLECT_TOKEN, new a(1020, -1));
        this.f17174n.put(b2.INSTANCE_COLLECT_TOKEN_SUCCESS, new a(1021, 1021));
        this.f17174n.put(b2.INSTANCE_COLLECT_TOKEN_FAILED, new a(1022, 1022));
        this.f17174n.put(b2.INSTANCE_COLLECT_TOKEN_TIMED_OUT, new a(1023, 1023));
        this.f17174n.put(b2.AD_READY_TRUE, new a(IronSourceConstants.RV_CHECK_READY_TRUE, -1));
        this.f17174n.put(b2.AD_READY_FALSE, new a(IronSourceConstants.RV_CHECK_READY_FALSE, -1));
        this.f17174n.put(b2.OPERATIONAL_LOAD_AD, new a(IronSourceConstants.RV_OPERATIONAL_LOAD_AD, -1));
        this.f17174n.put(b2.OPERATIONAL_LOAD_SUCCESS, new a(IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, -1));
        this.f17174n.put(b2.OPERATIONAL_LOAD_FAILED, new a(IronSourceConstants.RV_OPERATIONAL_LOAD_FAILED, -1));
        this.f17174n.put(b2.TROUBLESHOOT_PROVIDER_SETTINGS_MISSING, new a(IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING, IronSourceConstants.TROUBLESHOOTING_RV_PROVIDER_SETTINGS_MISSING));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_SUCCESS));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_INIT_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_INIT_FAILED));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_SUCCESS));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_AUCTION_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_AUCTION_FAILED));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_SUCCESS));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_LOAD_FAILED));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_SHOW_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_SHOW_FAILED));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_TIMEOUT, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_TIMEOUT));
        this.f17174n.put(b2.TROUBLESHOOT_UNEXPECTED_CLOSED, new a(IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED, IronSourceConstants.TROUBLESHOOTING_RV_UNEXPECTED_CLOSED));
        this.f17174n.put(b2.TROUBLESHOOT_LOAD_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED, IronSourceConstants.TROUBLESHOOTING_RV_LOAD_FAILED));
        this.f17174n.put(b2.TROUBLESHOOT_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_RV_INTERNAL_ERROR));
        this.f17174n.put(b2.TROUBLESHOOT_ADAPTER_REPOSITORY_INTERNAL_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR, IronSourceConstants.TROUBLESHOOTING_ADAPTER_REPOSITORY_INTERNAL_ERROR));
        this.f17174n.put(b2.TROUBLESHOOT_WATERFALL_OVERHEAD, new a(IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD, IronSourceConstants.TROUBLESHOOTING_RV_WATERFALL_OVERHEAD));
        this.f17174n.put(b2.TROUBLESHOOT_NOTIFICATION_ERROR, new a(IronSourceConstants.TROUBLESHOOTING_RV_NOTIFICATIONS_ERROR, -1));
        this.f17174n.put(b2.TROUBLESHOOT_AD_EXPIRED, new a(IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED, IronSourceConstants.TROUBLESHOOTING_RV_AD_EXPIRED));
        this.f17174n.put(b2.TROUBLESHOOT_LOAD, new a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD, -1));
        this.f17174n.put(b2.TROUBLESHOOT_LOAD_WHILE_LOADED, new a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_WHILE_LOADED, -1));
        this.f17174n.put(b2.TROUBLESHOOT_LOAD_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_RV_LOAD_SUCCESS, -1));
        this.f17174n.put(b2.TROUBLESHOOT_SHOW, new a(IronSourceConstants.TROUBLESHOOTING_RV_SHOW, -1));
        this.f17174n.put(b2.TROUBLESHOOT_SHOW_SUCCESS, new a(IronSourceConstants.TROUBLESHOOTING_RV_SHOW_SUCCESS, -1));
        this.f17174n.put(b2.TROUBLESHOOT_SHOW_FAILED, new a(IronSourceConstants.TROUBLESHOOTING_RV_SHOW_FAILED, -1));
        this.f17174n.put(b2.TROUBLESHOOT_ILLEGAL_STATE, new a(IronSourceConstants.TROUBLESHOOTING_RV_ILLEGAL_STATE, -1));
        this.f17174n.put(b2.TROUBLESHOOT_AD_INFO_CHANGED, new a(IronSourceConstants.TROUBLESHOOT_RV_AD_INFO_CHANGED, -1));
        this.f17174n.put(b2.TROUBLESHOOT_DISPOSE, new a(IronSourceConstants.TROUBLESHOOTING_RV_DISPOSE, -1));
    }

    public void f() {
        this.f17164d = null;
        this.f17168h = null;
        this.f17169i = null;
        this.f17166f = null;
        this.f17167g = null;
        this.f17170j = null;
        this.f17171k = null;
        this.f17172l = null;
    }
}

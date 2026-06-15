package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.ai;
import com.ironsource.ar;
import com.ironsource.c3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mk;
import com.ironsource.mm;
import com.ironsource.o9;
import com.ironsource.y7;
import com.ironsource.zb;
import com.ironsource.zk;
import java.util.Date;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class r extends y implements RewardedVideoSmashListener, y7 {

    /* renamed from: h  reason: collision with root package name */
    private b f19058h;

    /* renamed from: i  reason: collision with root package name */
    private zk f19059i;

    /* renamed from: j  reason: collision with root package name */
    private Timer f19060j;

    /* renamed from: k  reason: collision with root package name */
    private int f19061k;

    /* renamed from: l  reason: collision with root package name */
    private String f19062l;

    /* renamed from: m  reason: collision with root package name */
    private String f19063m;

    /* renamed from: n  reason: collision with root package name */
    private Placement f19064n;

    /* renamed from: o  reason: collision with root package name */
    private long f19065o;

    /* renamed from: p  reason: collision with root package name */
    private String f19066p;

    /* renamed from: q  reason: collision with root package name */
    private JSONObject f19067q;

    /* renamed from: r  reason: collision with root package name */
    private int f19068r;

    /* renamed from: s  reason: collision with root package name */
    private String f19069s;

    /* renamed from: t  reason: collision with root package name */
    private final Object f19070t;

    /* renamed from: u  reason: collision with root package name */
    private final Object f19071u;

    /* renamed from: v  reason: collision with root package name */
    private long f19072v;

    /* renamed from: w  reason: collision with root package name */
    private final ai.a f19073w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            int i10;
            boolean z10;
            b bVar = r.this.f19058h;
            b bVar2 = b.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (bVar == bVar2 || r.this.f19058h == b.INIT_IN_PROGRESS) {
                if (r.this.f19058h == bVar2) {
                    i10 = 1025;
                } else {
                    i10 = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                r.this.a(b.NOT_LOADED);
                z10 = true;
            } else {
                i10 = 510;
                z10 = false;
            }
            r.this.a(str);
            if (!z10) {
                r.this.a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_LOAD_FAILED_TIMEOUT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r.this.v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, r.this.f19058h.name()}});
                return;
            }
            r.this.a(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r.this.v())}});
            r.this.a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i10)}, new Object[]{"reason", str}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(r.this.v())}});
            r.this.f19059i.c(r.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum b {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    public r(r rVar, zk zkVar, AbstractAdapter abstractAdapter, int i10, String str, JSONObject jSONObject, int i11, String str2) {
        this(rVar.f19062l, rVar.f19063m, rVar.f19222b.h(), zkVar, rVar.f19061k, abstractAdapter, i10);
        this.f19066p = str;
        this.f19067q = jSONObject;
        this.f19068r = i11;
        this.f19069s = str2;
    }

    public r(String str, String str2, NetworkSettings networkSettings, zk zkVar, int i10, AbstractAdapter abstractAdapter, int i11) {
        super(new c3(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.f19070t = new Object();
        this.f19071u = new Object();
        this.f19073w = mm.M().e();
        this.f19062l = str;
        this.f19063m = str2;
        this.f19059i = zkVar;
        this.f19060j = null;
        this.f19061k = i10;
        this.f19226f = i11;
        this.f19058h = b.NO_INIT;
        this.f19072v = 0L;
        if (r()) {
            t();
        }
    }

    private void C() {
        try {
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.f19221a.setPluginData(pluginType);
        } catch (Throwable th) {
            o9.d().a(th);
            a("setCustomParams() " + th.getMessage());
        }
    }

    private void D() {
        synchronized (this.f19071u) {
            Timer timer = new Timer();
            this.f19060j = timer;
            timer.schedule(new a(), this.f19061k * 1000);
        }
    }

    private void E() {
        synchronized (this.f19071u) {
            Timer timer = this.f19060j;
            if (timer != null) {
                timer.cancel();
                this.f19060j = null;
            }
        }
    }

    private void a(int i10, Object[][] objArr, boolean z10) {
        Placement placement;
        Map<String, Object> m7 = m();
        if (!TextUtils.isEmpty(this.f19066p)) {
            m7.put("auctionId", this.f19066p);
        }
        JSONObject jSONObject = this.f19067q;
        if (jSONObject != null && jSONObject.length() > 0) {
            m7.put("genericParams", this.f19067q);
        }
        if (z10 && (placement = this.f19064n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            m7.put("placement", this.f19064n.getPlacementName());
        }
        if (c(i10)) {
            ar.i().a(m7, this.f19068r, this.f19069s);
        }
        m7.put("sessionDepth", Integer.valueOf(this.f19226f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    m7.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e8) {
                o9.d().a(e8);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, c() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e8), 3);
            }
        }
        ar.i().a(new zb(i10, new JSONObject(m7)));
        if (i10 == 1203) {
            this.f19073w.b(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar) {
        a("current state=" + this.f19058h + ", new state=" + bVar);
        synchronized (this.f19070t) {
            this.f19058h = bVar;
        }
    }

    private void b(int i10) {
        b(i10, null);
    }

    private boolean c(int i10) {
        return i10 == 1001 || i10 == 1002 || i10 == 1200 || i10 == 1212 || i10 == 1213 || i10 == 1005 || i10 == 1203 || i10 == 1201 || i10 == 1202 || i10 == 1006 || i10 == 1010;
    }

    private void t() {
        a("isBidder = " + p() + ", shouldEarlyInit = " + s());
        a(b.INIT_IN_PROGRESS);
        C();
        try {
            this.f19221a.initRewardedVideoWithCallback(this.f19062l, this.f19063m, this.f19224d, this);
        } catch (Throwable th) {
            o9.d().a(th);
            b("initForBidding exception: " + th.getLocalizedMessage());
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long v() {
        return new Date().getTime() - this.f19065o;
    }

    public boolean A() {
        if (this.f19058h != b.LOADED) {
            return false;
        }
        try {
            return this.f19221a.isRewardedVideoAvailable(this.f19224d);
        } catch (Throwable th) {
            o9.d().a(th);
            b("isReadyToShow exception: " + th.getLocalizedMessage());
            a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return false;
        }
    }

    public void B() {
        a(IronSourceConstants.RV_CAP_SESSION);
    }

    @Override // com.ironsource.y7
    public Map<String, Object> a(AdData adData) {
        JSONObject a10 = adData != null ? mk.a(adData.getAdUnitData()) : null;
        if (p()) {
            return this.f19221a.getRewardedVideoBiddingData(this.f19224d, a10);
        }
        return null;
    }

    public void a(int i10) {
        a(i10, null, false);
    }

    public void a(int i10, Object[][] objArr) {
        a(i10, objArr, false);
    }

    @Override // com.ironsource.y7
    public void a(AdData adData, BiddingDataCallback biddingDataCallback) {
        a(1020);
        try {
            this.f19221a.collectRewardedVideoBiddingData(this.f19224d, adData != null ? mk.a(adData.getAdUnitData()) : null, biddingDataCallback);
        } catch (Throwable th) {
            o9.d().a(th);
            b("collectBiddingData exception: " + th.getLocalizedMessage());
            IronLog.INTERNAL.error(th.toString());
        }
    }

    public void a(Placement placement) {
        E();
        a("showVideo()");
        this.f19064n = placement;
        a(b.SHOW_IN_PROGRESS);
        b(1201);
        try {
            this.f19221a.showRewardedVideo(this.f19224d, this);
        } catch (Throwable th) {
            o9.d().a(th);
            b("showVideo exception: " + th.getLocalizedMessage());
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public void a(String str, JSONObject jSONObject) {
        b bVar;
        b bVar2;
        a("loadVideo() auctionId: " + this.f19066p + " state: " + this.f19058h);
        this.f19227g = null;
        a(false);
        synchronized (this.f19070t) {
            bVar = this.f19058h;
            bVar2 = b.LOAD_IN_PROGRESS;
            if (bVar != bVar2 && bVar != b.SHOW_IN_PROGRESS) {
                a(bVar2);
            }
        }
        if (bVar == bVar2) {
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{"reason", "load during load"}});
        } else if (bVar == b.SHOW_IN_PROGRESS) {
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
        } else {
            D();
            this.f19065o = new Date().getTime();
            a(1001);
            try {
                if (p()) {
                    this.f19221a.loadRewardedVideoForBidding(this.f19224d, jSONObject, str, this);
                    return;
                }
                C();
                this.f19221a.initAndLoadRewardedVideo(this.f19062l, this.f19063m, this.f19224d, jSONObject, this);
            } catch (Throwable th) {
                o9.d().a(th);
                b("loadVideo exception: " + th.getLocalizedMessage());
                a(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(p() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    public void b(int i10, Object[][] objArr) {
        a(i10, objArr, true);
    }

    public void b(boolean z10) {
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z10 ? com.ironsource.mediationsdk.metadata.a.f18924g : "false";
        objArr[0] = objArr2;
        b(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr);
    }

    @Override // com.ironsource.mediationsdk.y
    public IronSource.AD_UNIT d() {
        return IronSource.AD_UNIT.REWARDED_VIDEO;
    }

    @Override // com.ironsource.mediationsdk.y
    public String k() {
        return "LWSProgRvSmash";
    }

    @Override // com.ironsource.mediationsdk.y
    public int l() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.f19059i.b(this, this.f19064n);
        b(1006);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.f19070t) {
            if (this.f19058h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.f19072v = new Date().getTime();
                this.f19059i.b(this);
                return;
            }
            b(1203);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "adClosed: " + this.f19058h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.f19059i.f(this);
        b(IronSourceConstants.RV_INSTANCE_ENDED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.f19059i.d(this);
        b(1005);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        long time = new Date().getTime();
        this.f19059i.a(this, this.f19064n);
        Map<String, Object> m7 = m();
        Placement placement = this.f19064n;
        if (placement != null) {
            m7.put("placement", placement.getPlacementName());
            m7.put(IronSourceConstants.EVENTS_REWARD_NAME, this.f19064n.getRewardName());
            m7.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.f19064n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(p.m().l())) {
            m7.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, p.m().l());
        }
        if (p.m().s() != null) {
            for (String str : p.m().s().keySet()) {
                m7.put("custom_" + str, p.m().s().get(str));
            }
        }
        if (!TextUtils.isEmpty(this.f19066p)) {
            m7.put("auctionId", this.f19066p);
        }
        JSONObject jSONObject = this.f19067q;
        if (jSONObject != null && jSONObject.length() > 0) {
            m7.put("genericParams", this.f19067q);
        }
        if (c(1010)) {
            ar.i().a(m7, this.f19068r, this.f19069s);
        }
        m7.put("sessionDepth", Integer.valueOf(this.f19226f));
        zb zbVar = new zb(1010, new JSONObject(m7));
        zbVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(zbVar.d(), c()));
        long j10 = this.f19072v;
        if (j10 != 0) {
            long j11 = time - j10;
            a("onRewardedVideoAdRewarded timeAfterClosed=" + j11);
            zbVar.a(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j11));
        }
        ar.i().a(zbVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        b(1202, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.f19070t) {
            if (this.f19058h == b.SHOW_IN_PROGRESS) {
                a(b.ENDED);
                this.f19059i.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "showFailed: " + this.f19058h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.f19059i.a(this);
        b(IronSourceConstants.RV_INSTANCE_STARTED);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        b(1206);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
        boolean z11;
        a("onRewardedVideoAvailabilityChanged available=" + z10 + " state=" + this.f19058h.name());
        synchronized (this.f19070t) {
            if (this.f19058h == b.LOAD_IN_PROGRESS) {
                a(z10 ? b.LOADED : b.NOT_LOADED);
                z11 = false;
            } else {
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.f19058h.name()}});
                return;
            } else {
                a(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.f19058h.name()}});
                return;
            }
        }
        E();
        a(z10 ? 1002 : 1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        if (z10) {
            this.f19059i.e(this);
        } else {
            this.f19059i.c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        a(1200, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
        synchronized (this.f19070t) {
            if (this.f19058h == b.INIT_IN_PROGRESS) {
                a(b.NO_INIT);
                this.f19059i.c(this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initFailed: " + this.f19058h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.f19070t) {
            if (this.f19058h == b.INIT_IN_PROGRESS) {
                a(b.NOT_LOADED);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initSuccess)};
            a(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initSuccess: " + this.f19058h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            a(1213, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.f19227g = Long.valueOf(System.currentTimeMillis());
        }
        a(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{IronSourceConstants.EVENTS_DURATION, Long.valueOf(v())}});
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    public String u() {
        return this.f19066p;
    }

    public LoadWhileShowSupportState w() {
        try {
            return this.f19221a.getLoadWhileShowSupportState(this.f19224d);
        } catch (Throwable th) {
            o9.d().a(th);
            b("Exception while calling adapter.getLoadWhileShowSupportState() - " + th.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    public Placement x() {
        return this.f19064n;
    }

    public boolean y() {
        return this.f19058h == b.LOADED;
    }

    public boolean z() {
        b bVar = this.f19058h;
        return bVar == b.INIT_IN_PROGRESS || bVar == b.LOAD_IN_PROGRESS;
    }
}

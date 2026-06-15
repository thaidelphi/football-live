package com.startapp.sdk.adsbase;

import android.content.Context;
import com.startapp.c8;
import com.startapp.l;
import com.startapp.o9;
import com.startapp.sdk.adsbase.adinformation.AdInformationOverrides;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.cache.CacheMetaData;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MetaDataRequest;
import java.io.Serializable;
import java.util.WeakHashMap;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class Ad implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f22875b = false;
    private static final long serialVersionUID = -9152265423662238762L;

    /* renamed from: a  reason: collision with root package name */
    public transient Context f22876a;
    protected ActivityExtra activityExtra;
    private AdInformationOverrides adInfoOverride;
    protected ConsentData consentData;
    protected String errorMessage;
    private NotDisplayedReason notDisplayedReason;
    protected AdPreferences.Placement placement;
    private String requestUrl;
    private AdType type;
    private boolean videoCancelCallBack;
    protected Serializable extraData = null;
    protected Long adCacheTtl = null;
    private AdState state = AdState.UN_INITIALIZED;
    private Long lastLoadTime = null;
    protected boolean belowMinCPM = false;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum AdState {
        UN_INITIALIZED,
        PROCESSING,
        READY
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum AdType {
        INTERSTITIAL,
        RICH_TEXT,
        VIDEO,
        REWARDED_VIDEO,
        NON_VIDEO,
        VIDEO_NO_VAST
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f22877a;

        public a(AdEventListener adEventListener) {
            this.f22877a = adEventListener;
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onFailedToReceiveAd(Ad ad) {
            l.a(Ad.this.f22876a, this.f22877a, ad, false);
            String errorMessage = ad != null ? ad.getErrorMessage() : null;
            if (errorMessage == null) {
                errorMessage = "";
            } else if (errorMessage.contains("204")) {
                errorMessage = "NO FILL";
            }
            Context context = Ad.this.f22876a;
            StringBuilder sb = new StringBuilder("Failed to load ");
            sb.append(ad != null ? o9.a(ad) : "");
            sb.append(" ad: ");
            sb.append(errorMessage);
            o9.a(context, 6, sb.toString(), true);
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onReceiveAd(Ad ad) {
            Ad.a(Ad.this, Long.valueOf(System.currentTimeMillis()));
            l.b(Ad.this.f22876a, this.f22877a, ad, false);
            ConsentData consentData = ad.getConsentData();
            if (consentData != null) {
                com.startapp.sdk.components.a.a(Ad.this.f22876a).f23233i.a().a(consentData.f(), consentData.e(), consentData.a(), false, true);
            }
            Context context = Ad.this.f22876a;
            o9.a(context, 4, "Loaded " + o9.a(ad) + " ad with creative ID - " + ad.getAdId(), true);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements com.startapp.sdk.adsbase.remoteconfig.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f22879a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f22880b;

        public b(AdPreferences adPreferences, a aVar) {
            this.f22879a = adPreferences;
            this.f22880b = aVar;
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.c
        public final void a(MetaDataRequest.RequestReason requestReason, boolean z10) {
            Ad.this.a(this.f22879a, this.f22880b);
        }

        @Override // com.startapp.sdk.adsbase.remoteconfig.c
        public final void a() {
            Ad.this.a(this.f22879a, this.f22880b);
        }
    }

    public Ad(Context context, AdPreferences.Placement placement) {
        this.f22876a = context;
        this.placement = placement;
        WeakHashMap weakHashMap = o9.f22359a;
        this.adInfoOverride = AdInformationOverrides.a();
    }

    public final void a(NotDisplayedReason notDisplayedReason) {
        this.notDisplayedReason = notDisplayedReason;
    }

    public abstract void a(AdPreferences adPreferences, AdEventListener adEventListener);

    public Long b() {
        long e8 = e();
        Long l10 = this.adCacheTtl;
        if (l10 != null) {
            e8 = Math.min(l10.longValue(), e8);
        }
        return Long.valueOf(e8);
    }

    public boolean c() {
        return this.lastLoadTime != null && System.currentTimeMillis() - this.lastLoadTime.longValue() > b().longValue();
    }

    public Long d() {
        return this.lastLoadTime;
    }

    public long e() {
        return CacheMetaData.f23015a.a().a();
    }

    public AdPreferences.Placement f() {
        return this.placement;
    }

    public abstract String getAdId();

    public AdInformationOverrides getAdInfoOverride() {
        return this.adInfoOverride;
    }

    public abstract String getBidToken();

    public final ConsentData getConsentData() {
        return this.consentData;
    }

    public Context getContext() {
        return this.f22876a;
    }

    public String getDParam() {
        return null;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Serializable getExtraData() {
        return this.extraData;
    }

    public NotDisplayedReason getNotDisplayedReason() {
        return this.notDisplayedReason;
    }

    public String getRequestUrl() {
        return this.requestUrl;
    }

    public AdState getState() {
        return this.state;
    }

    public AdType getType() {
        return this.type;
    }

    public boolean isBelowMinCPM() {
        return this.belowMinCPM;
    }

    public boolean isReady() {
        return this.state == AdState.READY && !c();
    }

    @Deprecated
    public void load() {
        load(new AdPreferences(), null);
    }

    public void setActivityExtra(ActivityExtra activityExtra) {
        this.activityExtra = activityExtra;
    }

    public void setAdInfoOverride(AdInformationOverrides adInformationOverrides) {
        this.adInfoOverride = adInformationOverrides;
    }

    public void setContext(Context context) {
        this.f22876a = context;
    }

    public void setErrorMessage(String str) {
        this.errorMessage = str;
    }

    public void setExtraData(Serializable serializable) {
        this.extraData = serializable;
    }

    public void setRequestUrl(String str) {
        this.requestUrl = str;
    }

    public void setState(AdState adState) {
        this.state = adState;
    }

    public static void a(Ad ad, Long l10) {
        ad.lastLoadTime = l10;
    }

    @Deprecated
    public void load(AdEventListener adEventListener) {
        load(new AdPreferences(), adEventListener);
    }

    public boolean a() {
        return this.videoCancelCallBack;
    }

    @Deprecated
    public void load(AdPreferences adPreferences) {
        load(adPreferences, null);
    }

    public void a(boolean z10) {
        this.videoCancelCallBack = z10;
    }

    @Deprecated
    public void load(AdPreferences adPreferences, AdEventListener adEventListener) {
        load(adPreferences, adEventListener, true);
    }

    public boolean load(AdPreferences adPreferences, AdEventListener adEventListener, boolean z10) {
        String str;
        boolean z11;
        a aVar = new a(adEventListener);
        if (!f22875b) {
            SimpleTokenUtils.d(this.f22876a);
            f22875b = true;
        }
        if (this.state != AdState.UN_INITIALIZED) {
            str = "load() was already called.";
            z11 = true;
        } else {
            str = "";
            z11 = false;
        }
        Context context = this.f22876a;
        WeakHashMap weakHashMap = o9.f22359a;
        if (!com.startapp.sdk.components.a.a(context).f23243s.a().b()) {
            str = "network not available.";
            z11 = true;
        }
        if (!MetaData.f23158k.b()) {
            str = "serving ads disabled";
            z11 = true;
        }
        if (z11) {
            setErrorMessage("Ad wasn't loaded: ".concat(str));
            l.a(this.f22876a, aVar, this, false);
            return false;
        }
        setState(AdState.PROCESSING);
        b bVar = new b(adPreferences, aVar);
        if (adPreferences.getType() != null) {
            this.type = adPreferences.getType();
        }
        if (adPreferences.getPlacementId() == null) {
            adPreferences.setPlacementId(com.startapp.sdk.adsbase.a.a(this.f22876a, this));
        }
        MetaData.f23158k.a(this.f22876a, adPreferences, c8.f21846d.f21849c, z10, bVar, false);
        return true;
    }
}

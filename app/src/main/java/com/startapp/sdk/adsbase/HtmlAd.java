package com.startapp.sdk.adsbase;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.startio.ScriptInjector;
import com.startapp.l3;
import com.startapp.m6;
import com.startapp.o9;
import com.startapp.sdk.ads.splash.SplashConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.apppresence.AppPresenceDetails;
import com.startapp.sdk.adsbase.consent.ConsentData;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public abstract class HtmlAd extends Ad {

    /* renamed from: c  reason: collision with root package name */
    public static String f22890c = null;
    private static final long serialVersionUID = -6617750692215126073L;
    private List<AppPresenceDetails> apps;
    private String[] closingUrl;
    private Long delayCloseInterval;
    private Long delayImpressionInSeconds;
    private int height;
    private String htmlUuid;
    public boolean[] inAppBrowserEnabled;
    private int orientation;
    private String[] packageNames;
    private int rewardDuration;
    private boolean rewardedHideTimer;
    private Boolean[] sendRedirectHops;
    public boolean[] smartRedirect;
    private String[] trackingClickUrls;
    public String[] trackingUrls;
    private int width;

    public HtmlAd(Context context, AdPreferences.Placement placement) {
        super(context, placement);
        this.packageNames = new String[]{""};
        this.htmlUuid = "";
        this.orientation = 0;
        this.trackingClickUrls = new String[]{""};
        this.smartRedirect = new boolean[]{false};
        this.trackingUrls = new String[]{""};
        this.rewardDuration = 0;
        this.rewardedHideTimer = false;
        this.closingUrl = new String[]{""};
        this.sendRedirectHops = null;
        this.inAppBrowserEnabled = new boolean[]{true};
        if (f22890c == null) {
            r();
        }
    }

    public final void a(int i10, int i11) {
        this.width = i10;
        this.height = i11;
    }

    public final void b(String str) {
        String[] split;
        Long l10 = null;
        for (String str2 : str.split(",")) {
            if (!str2.equals("")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > 0 && (l10 == null || parseLong < l10.longValue())) {
                        l10 = Long.valueOf(parseLong);
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
        if (l10 != null) {
            this.adCacheTtl = Long.valueOf(TimeUnit.SECONDS.toMillis(l10.longValue()));
        }
    }

    public void c(String str) {
        if (MetaData.f23158k.X()) {
            try {
                str = ScriptInjector.injectScriptContentIntoHtml(m6.a(), str);
            } catch (Throwable th) {
                l3.a(th);
            }
        }
        WeakHashMap weakHashMap = o9.f22359a;
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        dVar.getClass();
        String uuid = UUID.randomUUID().toString();
        dVar.f23022b.put(uuid, str);
        this.htmlUuid = uuid;
        String a10 = o9.a(str, "@smartRedirect@", "@smartRedirect@");
        if (a10 != null) {
            String[] split = a10.split(",");
            this.smartRedirect = new boolean[split.length];
            for (int i10 = 0; i10 < split.length; i10++) {
                if (split[i10].compareTo(com.ironsource.mediationsdk.metadata.a.f18924g) == 0) {
                    this.smartRedirect[i10] = true;
                } else {
                    this.smartRedirect[i10] = false;
                }
            }
        }
        String a11 = o9.a(str, "@trackingClickUrl@", "@trackingClickUrl@");
        if (a11 != null) {
            this.trackingClickUrls = a11.split(",");
        }
        String a12 = o9.a(str, "@closeUrl@", "@closeUrl@");
        if (a12 != null) {
            this.closingUrl = a12.split(",");
        }
        String a13 = o9.a(str, "@tracking@", "@tracking@");
        if (a13 != null) {
            this.trackingUrls = a13.split(",");
        }
        String a14 = o9.a(str, "@packageName@", "@packageName@");
        if (a14 != null) {
            this.packageNames = a14.split(",");
        }
        String a15 = o9.a(str, "@startappBrowserEnabled@", "@startappBrowserEnabled@");
        if (a15 != null) {
            String[] split2 = a15.split(",");
            this.inAppBrowserEnabled = new boolean[split2.length];
            for (int i11 = 0; i11 < split2.length; i11++) {
                if (split2[i11].compareTo("false") == 0) {
                    this.inAppBrowserEnabled[i11] = false;
                } else {
                    this.inAppBrowserEnabled[i11] = true;
                }
            }
        }
        String a16 = o9.a(str, "@orientation@", "@orientation@");
        if (a16 != null) {
            a(SplashConfig.Orientation.getByName(a16));
        }
        String a17 = o9.a(str, "@adInfoEnable@", "@adInfoEnable@");
        if (a17 != null) {
            getAdInfoOverride().a(Boolean.parseBoolean(a17));
        }
        String a18 = o9.a(str, "@adInfoPosition@", "@adInfoPosition@");
        if (a18 != null) {
            getAdInfoOverride().a(AdInformationPositions.Position.getByName(a18));
        }
        String a19 = o9.a(str, "@ttl@", "@ttl@");
        if (a19 != null) {
            b(a19);
        }
        String a20 = o9.a(str, "@belowMinCPM@", "@belowMinCPM@");
        if (a20 != null) {
            if (Arrays.asList(a20.split(",")).contains("false")) {
                this.belowMinCPM = false;
            } else {
                this.belowMinCPM = true;
            }
        }
        String a21 = o9.a(str, "@delayCloseInterval@", "@delayCloseInterval@");
        if (a21 != null && a21.length() > 0) {
            try {
                this.delayCloseInterval = Long.valueOf(Long.parseLong(a21));
            } catch (NumberFormatException unused) {
            }
        }
        String a22 = o9.a(str, "@delayImpressionInSeconds@", "@delayImpressionInSeconds@");
        if (a22 != null && a22.length() > 0) {
            try {
                this.delayImpressionInSeconds = Long.valueOf(Long.parseLong(a22));
            } catch (NumberFormatException unused2) {
            }
        }
        String a23 = o9.a(str, "@rewardDuration@", "@rewardDuration@");
        if (a23 != null) {
            try {
                this.rewardDuration = Integer.parseInt(a23);
            } catch (Throwable th2) {
                l3.a(th2);
            }
        }
        String a24 = o9.a(str, "@rewardedHideTimer@", "@rewardedHideTimer@");
        if (a24 != null) {
            try {
                this.rewardedHideTimer = Boolean.parseBoolean(a24);
            } catch (Throwable th3) {
                l3.a(th3);
            }
        }
        String a25 = o9.a(str, "@sendRedirectHops@", "@sendRedirectHops@");
        if (a25 != null && !a25.equals("")) {
            String[] split3 = a25.split(",");
            this.sendRedirectHops = new Boolean[split3.length];
            for (int i12 = 0; i12 < split3.length; i12++) {
                if (split3[i12].compareTo(com.ironsource.mediationsdk.metadata.a.f18924g) == 0) {
                    this.sendRedirectHops[i12] = Boolean.TRUE;
                } else if (split3[i12].compareTo("false") == 0) {
                    this.sendRedirectHops[i12] = Boolean.FALSE;
                } else {
                    this.sendRedirectHops[i12] = null;
                }
            }
        }
        ConsentData consentData = new ConsentData();
        this.consentData = consentData;
        consentData.b(o9.a(str, "@infoDparam@", "@infoDparam@"));
        this.consentData.c(o9.a(str, "@infoImpUrl@", "@infoImpUrl@"));
        this.consentData.a(o9.a(str, "@infoClickUrl@", "@infoClickUrl@"));
        try {
            String a26 = o9.a(str, "@ct@", "@ct@");
            if (!TextUtils.isEmpty(a26)) {
                this.consentData.a(Integer.valueOf(Integer.parseInt(a26)));
            }
        } catch (Throwable th4) {
            l3.a(th4);
        }
        try {
            String a27 = o9.a(str, "@tsc@", "@tsc@");
            if (!TextUtils.isEmpty(a27)) {
                this.consentData.a(Long.valueOf(Long.parseLong(a27)));
            }
        } catch (Throwable th5) {
            l3.a(th5);
        }
        try {
            String a28 = o9.a(str, "@apc@", "@apc@");
            if (!TextUtils.isEmpty(a28)) {
                this.consentData.a(Boolean.valueOf(Boolean.parseBoolean(a28)));
            }
        } catch (Throwable th6) {
            l3.a(th6);
        }
        int length = this.smartRedirect.length;
        String[] strArr = this.trackingUrls;
        if (length < strArr.length) {
            boolean[] zArr = new boolean[strArr.length];
            int i13 = 0;
            while (true) {
                boolean[] zArr2 = this.smartRedirect;
                if (i13 >= zArr2.length) {
                    break;
                }
                zArr[i13] = zArr2[i13];
                i13++;
            }
            while (i13 < this.trackingUrls.length) {
                zArr[i13] = false;
                i13++;
            }
            this.smartRedirect = zArr;
        }
    }

    public final String[] g() {
        return this.closingUrl;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getAdId() {
        return o9.a(k(), "@adId@", "@adId@");
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getBidToken() {
        return o9.a(k(), "@bidToken@", "@bidToken@");
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final String getDParam() {
        String[] strArr = this.trackingClickUrls;
        String[] strArr2 = this.trackingUrls;
        String str = null;
        String str2 = (strArr == null || strArr.length <= 0) ? null : strArr[0];
        if (strArr2 != null && strArr2.length > 0) {
            str = strArr2[0];
        }
        return a.a(str2, str);
    }

    public final Long h() {
        return this.delayCloseInterval;
    }

    public final Long i() {
        return this.delayImpressionInSeconds;
    }

    public final int j() {
        return this.height;
    }

    public final String k() {
        com.startapp.sdk.adsbase.cache.d dVar = com.startapp.sdk.adsbase.cache.d.f23020h;
        return (String) dVar.f23022b.get(this.htmlUuid);
    }

    public final String l() {
        return this.htmlUuid;
    }

    public final int m() {
        return this.orientation;
    }

    public final String[] n() {
        return this.packageNames;
    }

    public final int o() {
        return this.rewardDuration;
    }

    public final String[] p() {
        return this.trackingClickUrls;
    }

    public final int q() {
        return this.width;
    }

    public final void r() {
        f22890c = o9.a(getContext());
    }

    public final boolean s() {
        return this.rewardedHideTimer;
    }

    public final Boolean[] t() {
        return this.sendRedirectHops;
    }

    public final void a(SplashConfig.Orientation orientation) {
        this.orientation = 0;
        WeakHashMap weakHashMap = o9.f22359a;
        if (orientation != null) {
            if (orientation.equals(SplashConfig.Orientation.PORTRAIT)) {
                this.orientation = 1;
            } else if (orientation.equals(SplashConfig.Orientation.LANDSCAPE)) {
                this.orientation = 2;
            }
        }
    }

    public final void a(ArrayList arrayList) {
        this.apps = arrayList;
    }

    public final Boolean a(int i10) {
        Boolean[] boolArr = this.sendRedirectHops;
        if (boolArr == null || i10 < 0 || i10 >= boolArr.length) {
            return null;
        }
        return boolArr[i10];
    }
}

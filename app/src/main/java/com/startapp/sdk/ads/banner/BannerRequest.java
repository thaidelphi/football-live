package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandardAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerRequest {
    private BannerFormat adFormat = BannerFormat.BANNER;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final Context context;

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Callback f22542a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ BannerFormat f22543b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AdPreferences f22544c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ BannerStandardAd f22545d;

        /* compiled from: Sta */
        /* renamed from: com.startapp.sdk.ads.banner.BannerRequest$a$a  reason: collision with other inner class name */
        /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
        public class C0248a implements BannerCreator {

            /* renamed from: a  reason: collision with root package name */
            public boolean f22546a;

            public C0248a() {
            }

            @Override // com.startapp.sdk.ads.banner.BannerCreator
            public final View create(Context context, BannerListener bannerListener) {
                BannerStandard mrec;
                if (!this.f22546a) {
                    int i10 = b.f22548a[a.this.f22543b.ordinal()];
                    if (i10 == 1) {
                        a aVar = a.this;
                        mrec = new Mrec(context, aVar.f22544c, aVar.f22545d);
                    } else if (i10 != 2) {
                        a aVar2 = a.this;
                        mrec = new Banner(context, aVar2.f22544c, aVar2.f22545d);
                    } else {
                        a aVar3 = a.this;
                        mrec = new Cover(context, aVar3.f22544c, aVar3.f22545d);
                    }
                    mrec.setBannerListener(bannerListener);
                    mrec.onReceiveAd(a.this.f22545d);
                    this.f22546a = true;
                    return mrec;
                }
                throw new IllegalStateException();
            }
        }

        public a(Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, BannerStandardAd bannerStandardAd) {
            this.f22542a = callback;
            this.f22543b = bannerFormat;
            this.f22544c = adPreferences;
            this.f22545d = bannerStandardAd;
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onFailedToReceiveAd(Ad ad) {
            this.f22542a.onFinished(null, String.valueOf(this.f22545d.getErrorMessage()));
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onReceiveAd(Ad ad) {
            this.f22542a.onFinished(new C0248a(), null);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22548a;

        static {
            int[] iArr = new int[BannerFormat.values().length];
            f22548a = iArr;
            try {
                iArr[BannerFormat.MREC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22548a[BannerFormat.COVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public BannerRequest(Context context) {
        this.context = context.getApplicationContext();
    }

    public void load(Callback callback) {
        int i10;
        int i11;
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        BannerStandardAd bannerStandardAd = new BannerStandardAd(this.context, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point point = this.adSizeDp;
        if (point != null) {
            i10 = point.x;
            i11 = point.y;
        } else {
            i10 = bannerFormat.widthDp;
            i11 = bannerFormat.heightDp;
        }
        bannerStandardAd.b(bannerFormat.type);
        bannerStandardAd.a(i10, i11);
        bannerStandardAd.load(adPreferences, new a(callback, bannerFormat, adPreferences, bannerStandardAd), true);
    }

    public BannerRequest setAdFormat(BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    public BannerRequest setAdPreferences(AdPreferences adPreferences) {
        this.adPreferences = adPreferences;
        return this;
    }

    public BannerRequest setAdSize(int i10, int i11) {
        this.adSizeDp = new Point(i10, i11);
        return this;
    }
}

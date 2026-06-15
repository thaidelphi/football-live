package com.startapp.sdk.ads.nativead;

import android.content.Context;
import com.startapp.e;
import com.startapp.f;
import com.startapp.l;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adinformation.AdInformationMetaData;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.adrules.AdRulesResult;
import com.startapp.sdk.adsbase.adrules.AdaptMetaData;
import com.startapp.sdk.adsbase.model.AdDetails;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class StartAppNativeAd extends Ad {
    private static final long serialVersionUID = -5904557568580515558L;
    private boolean belowMinCpm;
    private List<NativeAdDetails> listNativeAds;
    private final AtomicBoolean loading;
    private NativeAdPreferences preferences;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum CampaignAction {
        LAUNCH_APP,
        OPEN_MARKET
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f22682a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f22683b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f22684c;

        public a(int i10, AdEventListener adEventListener) {
            this.f22683b = i10;
            this.f22684c = adEventListener;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f22682a + 1;
            this.f22682a = i10;
            if (i10 == this.f22683b) {
                StartAppNativeAd.this.a(this.f22684c);
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements AdEventListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NativeAd f22686a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NativeAdPreferences f22687b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ AdEventListener f22688c;

        public b(NativeAd nativeAd, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
            this.f22686a = nativeAd;
            this.f22687b = nativeAdPreferences;
            this.f22688c = adEventListener;
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onFailedToReceiveAd(Ad ad) {
            if (ad != null) {
                StartAppNativeAd.this.setErrorMessage(ad.getErrorMessage());
            }
            StartAppNativeAd startAppNativeAd = StartAppNativeAd.this;
            l.a(startAppNativeAd.f22876a, this.f22688c, startAppNativeAd, false);
            StartAppNativeAd.this.loading.set(false);
        }

        @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
        public final void onReceiveAd(Ad ad) {
            StartAppNativeAd.this.a(this.f22686a, this.f22687b, this.f22688c);
        }
    }

    public StartAppNativeAd(Context context) {
        super(context, AdPreferences.Placement.INAPP_NATIVE);
        this.listNativeAds = Collections.emptyList();
        this.loading = new AtomicBoolean();
    }

    public static String getPrivacyImageUrl() {
        return AdInformationMetaData.f22954a.d();
    }

    public static String getPrivacyURL() {
        if (AdInformationMetaData.f22954a.b() == null) {
            return "";
        }
        String b10 = AdInformationMetaData.f22954a.b();
        if (!b10.contains("http://") && !b10.contains("https://")) {
            return "https://" + AdInformationMetaData.f22954a.b();
        }
        return AdInformationMetaData.f22954a.b();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public final void a(AdPreferences adPreferences, AdEventListener adEventListener) {
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getAdId() {
        NativeAdDetails nativeAdDetails;
        AdDetails adDetails = (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) ? null : nativeAdDetails.f22662a;
        if (adDetails != null) {
            return adDetails.a();
        }
        return null;
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public String getBidToken() {
        NativeAdDetails nativeAdDetails;
        AdDetails adDetails = (this.listNativeAds.size() <= 0 || (nativeAdDetails = this.listNativeAds.get(0)) == null) ? null : nativeAdDetails.f22662a;
        if (adDetails != null) {
            return adDetails.e();
        }
        return null;
    }

    public ArrayList<NativeAdDetails> getNativeAds() {
        return getNativeAds(null);
    }

    public int getNumberOfAds() {
        return this.listNativeAds.size();
    }

    @Override // com.startapp.sdk.adsbase.Ad
    public boolean isBelowMinCPM() {
        return this.belowMinCpm;
    }

    @Deprecated
    public boolean loadAd() {
        return loadAd((AdEventListener) null);
    }

    public void setPreferences(NativeAdPreferences nativeAdPreferences) {
        this.preferences = nativeAdPreferences != null ? new NativeAdPreferences(nativeAdPreferences) : null;
    }

    public final void a(NativeAd nativeAd, NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        int size;
        this.belowMinCpm = nativeAd.isBelowMinCPM();
        List<AdDetails> g10 = nativeAd.g();
        if (g10 != null && (size = g10.size()) > 0) {
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new NativeAdDetails(g10.get(i10)));
            }
            this.listNativeAds = Collections.unmodifiableList(arrayList);
            if (nativeAdPreferences.isAutoBitmapDownload()) {
                a aVar = new a(size, adEventListener);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((NativeAdDetails) it.next()).loadImages(this.f22876a, aVar);
                }
                return;
            }
            a(adEventListener);
            return;
        }
        a(adEventListener);
    }

    public ArrayList<NativeAdDetails> getNativeAds(String str) {
        ArrayList<NativeAdDetails> arrayList = new ArrayList<>();
        AdRulesResult a10 = AdaptMetaData.f23001a.a().a(AdPreferences.Placement.INAPP_NATIVE, str);
        if (a10.b()) {
            for (NativeAdDetails nativeAdDetails : this.listNativeAds) {
                nativeAdDetails.f22667f = str;
                arrayList.add(nativeAdDetails);
            }
            f.f21919d.a(new e(AdPreferences.Placement.INAPP_NATIVE, str));
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (NativeAdDetails nativeAdDetails2 : this.listNativeAds) {
                arrayList2.add(nativeAdDetails2.f22662a);
            }
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(Arrays.asList(((AdDetails) it.next()).r()));
            }
            com.startapp.sdk.adsbase.a.a((String[]) arrayList3.toArray(new String[0]), str, 0, a10.a());
        }
        return arrayList;
    }

    public boolean loadAd(AdEventListener adEventListener) {
        if (!this.loading.compareAndSet(false, true)) {
            setErrorMessage("Ad is currently being loaded");
            return false;
        }
        this.belowMinCpm = false;
        this.listNativeAds = Collections.emptyList();
        NativeAdPreferences nativeAdPreferences = this.preferences;
        if (nativeAdPreferences == null) {
            nativeAdPreferences = new NativeAdPreferences();
            this.preferences = nativeAdPreferences;
        }
        if (nativeAdPreferences.getPlacementId() == null) {
            nativeAdPreferences.setPlacementId(com.startapp.sdk.adsbase.a.a(this.f22876a, this));
        }
        NativeAd nativeAd = new NativeAd(this.f22876a, nativeAdPreferences);
        return nativeAd.load(nativeAdPreferences, new b(nativeAd, nativeAdPreferences, adEventListener), true);
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences) {
        setPreferences(nativeAdPreferences);
        return loadAd((AdEventListener) null);
    }

    public final void a(AdEventListener adEventListener) {
        setErrorMessage(null);
        l.b(this.f22876a, adEventListener, this, false);
        this.loading.set(false);
    }

    @Deprecated
    public boolean loadAd(NativeAdPreferences nativeAdPreferences, AdEventListener adEventListener) {
        setPreferences(nativeAdPreferences);
        return loadAd(adEventListener);
    }
}

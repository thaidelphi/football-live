package com.appnext.nativeads.designed_native_ads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.d;
import com.appnext.nativeads.NativeAdRequest;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a {
    private WeakReference<InterfaceC0163a> fI;
    private List<DesignNativeAd> fJ;

    /* renamed from: com.appnext.nativeads.designed_native_ads.a$a  reason: collision with other inner class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public interface InterfaceC0163a {
        void d(List<DesignNativeAd> list);

        void onError(AppnextError appnextError);
    }

    public final void a(InterfaceC0163a interfaceC0163a) {
        this.fI = new WeakReference<>(interfaceC0163a);
    }

    public final void a(Context context, String str, DesignNativeAdsRequest designNativeAdsRequest, final int i10) {
        final DesignNativeAdObject designNativeAdObject = new DesignNativeAdObject(context, str);
        if (designNativeAdsRequest != null) {
            designNativeAdObject.setCategories(designNativeAdsRequest.getCategories());
            designNativeAdObject.setSpecificCategories(designNativeAdsRequest.getSpecificCategories());
            designNativeAdObject.setPostback(designNativeAdsRequest.getPostBack());
        }
        b aJ = b.aJ();
        d.a aVar = new d.a() { // from class: com.appnext.nativeads.designed_native_ads.a.1
            @Override // com.appnext.core.d.a
            public final <T> void a(T t10) {
                InterfaceC0163a interfaceC0163a;
                try {
                    if (a.this.fI == null || (interfaceC0163a = (InterfaceC0163a) a.this.fI.get()) == null) {
                        return;
                    }
                    if (t10 == null) {
                        interfaceC0163a.onError(new AppnextError(AppnextError.NO_ADS));
                        return;
                    }
                    ArrayList<AppnextAd> a10 = com.appnext.nativeads.b.aI().a(designNativeAdObject.getPlacementID(), new NativeAdRequest(), (ArrayList) t10);
                    if (a10.size() == 0) {
                        interfaceC0163a.onError(new AppnextError(AppnextError.NO_ADS));
                        return;
                    }
                    int size = a10.size();
                    int i11 = i10;
                    if (size > i11) {
                        a10.subList(i11, a10.size()).clear();
                    }
                    a.this.fJ = new ArrayList();
                    for (AppnextAd appnextAd : a10) {
                        String imageURL = appnextAd.getImageURL();
                        if (!TextUtils.isEmpty(imageURL)) {
                            a.this.fJ.add(new DesignNativeAd(appnextAd, imageURL));
                        }
                    }
                    a.this.fJ.size();
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.appnext.nativeads.designed_native_ads.a.1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            InterfaceC0163a interfaceC0163a2;
                            if (a.this.fI == null || (interfaceC0163a2 = (InterfaceC0163a) a.this.fI.get()) == null) {
                                return;
                            }
                            interfaceC0163a2.d(a.this.fJ);
                        }
                    });
                } catch (Throwable th) {
                    com.appnext.base.a.a("DesignNativeAdsController$loadAds", th);
                }
            }

            @Override // com.appnext.core.d.a
            public final void error(String str2) {
                InterfaceC0163a interfaceC0163a;
                try {
                    if (a.this.fI == null || (interfaceC0163a = (InterfaceC0163a) a.this.fI.get()) == null) {
                        return;
                    }
                    if (str2 != null && !str2.equals(AppnextError.NO_ADS) && !str2.equals("Internal error")) {
                        interfaceC0163a.onError(new AppnextError(str2));
                        return;
                    }
                    interfaceC0163a.onError(new AppnextError(AppnextError.NO_ADS));
                } catch (Throwable th) {
                    com.appnext.base.a.a("DesignNativeAdsController$loadAds", th);
                }
            }
        };
        NativeAdRequest nativeAdRequest = new NativeAdRequest();
        if (designNativeAdsRequest != null) {
            nativeAdRequest.setCategories(designNativeAdsRequest.getCategories());
            nativeAdRequest.setSpecificCategories(designNativeAdsRequest.getSpecificCategories());
            nativeAdRequest.setPostback(designNativeAdsRequest.getPostBack());
        }
        aJ.a(context, designNativeAdObject, str, aVar, nativeAdRequest);
    }
}

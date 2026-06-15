package com.appnext.nativeads;

import android.content.Context;
import android.text.TextUtils;
import com.appnext.base.Appnext;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.SettingsManager;
import com.appnext.core.d;
import com.appnext.core.i;
import com.appnext.nativeads.NativeAdRequest;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class AdLoader {
    private int count;
    private NativeAdListener fb;
    private NativeAdRequest fc;
    private NativeAdObject nativeAdObject;

    private AdLoader(Context context, String str) {
        this.nativeAdObject = new NativeAdObject(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(String str) {
        try {
            this.nativeAdObject.setCategories(this.fc.getCategories());
            this.nativeAdObject.setSpecificCategories(this.fc.getSpecificCategories());
            this.nativeAdObject.setPostback(this.fc.getPostback());
            if (!TextUtils.isEmpty(str)) {
                this.nativeAdObject.setPackageName(str);
            }
            this.nativeAdObject.setMinVideoLength(this.fc.getMinVideoLength());
            this.nativeAdObject.setMaxVideoLength(this.fc.getMaxVideoLength());
            b aI = b.aI();
            Context context = this.nativeAdObject.getContext();
            NativeAdObject nativeAdObject = this.nativeAdObject;
            aI.a(context, nativeAdObject, nativeAdObject.getPlacementID(), new d.a() { // from class: com.appnext.nativeads.AdLoader.2
                @Override // com.appnext.core.d.a
                public final <T> void a(T t10) {
                    try {
                        if (t10 == null) {
                            if (AdLoader.this.fb != null) {
                                AdLoader.this.fb.onError(null, new AppnextError(AppnextError.NO_ADS));
                            }
                        } else if (AdLoader.this.fc == null) {
                            if (AdLoader.this.fb != null) {
                                AdLoader.this.fb.onError(null, new AppnextError(AppnextError.NO_ADS));
                            }
                        } else {
                            if (AdLoader.this.fc.getVideoLength() == NativeAdRequest.VideoLength.DEFAULT) {
                                AdLoader.this.fc.setVideoLength(NativeAdRequest.VideoLength.fromInt(Integer.parseInt(a.aG().t("default_video_length"))));
                            }
                            if (AdLoader.this.fc.getVideoQuality() == NativeAdRequest.VideoQuality.DEFAULT) {
                                AdLoader.this.fc.setVideoQuality(NativeAdRequest.VideoQuality.fromInt(Integer.parseInt(a.aG().t("default_video_quality"))));
                            }
                            ArrayList<AppnextAd> a10 = b.aI().a(AdLoader.this.nativeAdObject.getPlacementID(), AdLoader.this.fc, (ArrayList) t10);
                            if (a10.size() == 0) {
                                if (AdLoader.this.fb != null) {
                                    AdLoader.this.fb.onError(null, new AppnextError(AppnextError.NO_ADS));
                                    return;
                                }
                                return;
                            }
                            int min = Math.min(a10.size(), AdLoader.this.count);
                            for (int i10 = 0; i10 < min; i10++) {
                                NativeAd nativeAd = new NativeAd(AdLoader.this.nativeAdObject.getContext(), AdLoader.this.nativeAdObject.getPlacementID());
                                AppnextAd appnextAd = a10.get(i10);
                                nativeAd.setLoadedAd(new NativeAdData(appnextAd), AdLoader.this.fc);
                                nativeAd.setAdListener(AdLoader.this.fb);
                                if (AdLoader.this.fb != null) {
                                    AdLoader.this.fb.onAdLoaded(nativeAd, appnextAd.getCreativeType());
                                    AdLoader.this.fb.onAdLoaded(nativeAd, appnextAd.getCreativeType(), i10 + 1, min);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("AdLoader$load", th);
                    }
                }

                @Override // com.appnext.core.d.a
                public final void error(String str2) {
                    if (str2 != null) {
                        try {
                            if (!str2.equals(AppnextError.NO_ADS) && !str2.equals("Internal error")) {
                                AdLoader.this.fb.onError(null, new AppnextError(str2));
                                AdLoader.this.destroy();
                            }
                        } catch (Throwable th) {
                            com.appnext.base.a.a("AdLoader$load", th);
                            return;
                        }
                    }
                    AdLoader.this.fb.onError(null, new AppnextError(AppnextError.NO_ADS));
                    AdLoader.this.destroy();
                }
            }, this.fc);
        } catch (Throwable th) {
            com.appnext.base.a.a("AdLoader$load", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroy() {
        try {
            this.fb = null;
            this.fc = null;
            NativeAdObject nativeAdObject = this.nativeAdObject;
            if (nativeAdObject != null) {
                nativeAdObject.destroy();
                this.nativeAdObject = null;
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("AdLoader$load", th);
        }
    }

    public static void getAdsByPackage(Context context, String str, final String str2, NativeAdRequest nativeAdRequest, NativeAdListener nativeAdListener, int i10) {
        try {
            if (!i.h(context)) {
                if (nativeAdListener != null) {
                    nativeAdListener.onError(null, new AppnextError(AppnextError.CONNECTION_ERROR));
                    return;
                }
                return;
            }
            Appnext.init(context);
            if (nativeAdRequest == null || nativeAdListener == null || i10 <= 0) {
                return;
            }
            AdLoader adLoader = new AdLoader(context, str);
            adLoader.fc = new NativeAdRequest(nativeAdRequest);
            adLoader.count = i10;
            adLoader.fb = nativeAdListener;
            a.aG().a(context, str, new SettingsManager.ConfigCallback() { // from class: com.appnext.nativeads.AdLoader.1
                @Override // com.appnext.core.SettingsManager.ConfigCallback
                public final void error(String str3) {
                    try {
                        AdLoader.this.E(str2);
                    } catch (Throwable unused) {
                    }
                }

                @Override // com.appnext.core.SettingsManager.ConfigCallback
                public final void loaded(HashMap<String, Object> hashMap) {
                    try {
                        AdLoader.this.E(str2);
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable th) {
            com.appnext.base.a.a("AdLoader$getAdsByPackage", th);
        }
    }

    public static void load(Context context, String str, NativeAdRequest nativeAdRequest, NativeAdListener nativeAdListener, int i10) {
        try {
            getAdsByPackage(context, str, null, nativeAdRequest, nativeAdListener, i10);
        } catch (Throwable th) {
            com.appnext.base.a.a("AdLoader$load", th);
        }
    }
}

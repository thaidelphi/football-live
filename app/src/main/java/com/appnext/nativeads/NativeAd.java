package com.appnext.nativeads;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.appnext.core.Ad;
import com.appnext.core.AppnextAd;
import com.appnext.core.AppnextError;
import com.appnext.core.C0400r;
import com.appnext.core.SettingsManager;
import com.appnext.core.d;
import com.appnext.core.i;
import com.appnext.core.k;
import com.appnext.core.l;
import com.appnext.core.p;
import com.appnext.core.result.ResultPageActivity;
import com.appnext.nativeads.MediaView;
import com.appnext.nativeads.NativeAdRequest;
import com.appnext.nativeads.NativeAdView;
import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.ug;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAd {
    private NativeAdListener adListener;
    private NativeAdView.a adViewActions;
    private List<View> clicksListView;
    private NativeAdRequest.CreativeType creativeType;
    private Handler handler;
    private String language;
    private NativeAdData loadedAd;
    private MediaView mediaView;
    private NativeAdObject nativeAdObject;
    private NativeAdView nativeAdView;
    private C0400r userAction;
    private boolean reportedImpression = false;
    private boolean reportedVTA = false;
    private int privacyPolicyPosition = 1;
    private int privacyPolicyColor = 0;
    private int privacyPolicyVisibility = 0;
    private boolean clicked = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements View.OnClickListener {
        private a() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
            r7.ft.click();
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
            return;
         */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onClick(android.view.View r8) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAd.a.onClick(android.view.View):void");
        }
    }

    public NativeAd(Context context, String str) {
        this.nativeAdObject = createAd(context, str);
        com.appnext.nativeads.a.aG().g(ScarConstants.TOKEN_ID_KEY, this.nativeAdObject.getTID());
        com.appnext.nativeads.a.aG().a(context, str, null);
        this.clicksListView = new ArrayList();
        this.adViewActions = new NativeAdView.a() { // from class: com.appnext.nativeads.NativeAd.1
            @Override // com.appnext.nativeads.NativeAdView.a
            public final void d(int i10) {
                try {
                    if (!NativeAd.this.reportedImpression && i10 >= Integer.parseInt(com.appnext.nativeads.a.aG().t("min_imp_precentage"))) {
                        int parseInt = Integer.parseInt(com.appnext.nativeads.a.aG().t("postpone_impression_sec"));
                        if (Boolean.parseBoolean(com.appnext.nativeads.a.aG().t("repeat_viewable_criteria")) && parseInt > 0) {
                            if (NativeAd.this.handler != null) {
                                NativeAd.this.handler.postDelayed(new Runnable() { // from class: com.appnext.nativeads.NativeAd.1.1
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        try {
                                            if (NativeAd.this.nativeAdView == null || NativeAd.this.reportedImpression || NativeAd.this.nativeAdView.getVisiblePercent(NativeAd.this.nativeAdView) < Integer.parseInt(com.appnext.nativeads.a.aG().t("min_imp_precentage"))) {
                                                return;
                                            }
                                            NativeAd.this.impression();
                                            NativeAd.this.reportedImpression = true;
                                        } catch (Throwable th) {
                                            com.appnext.base.a.a("NativeAd$NativeAd", th);
                                        }
                                    }
                                }, parseInt * 1000);
                            }
                        } else if (!NativeAd.this.reportedImpression) {
                            NativeAd.this.reportedImpression = true;
                            NativeAd.this.impression();
                        }
                    }
                    if (NativeAd.this.reportedVTA || i10 < Integer.parseInt(com.appnext.nativeads.a.aG().t("min_vta_precentage"))) {
                        return;
                    }
                    int parseInt2 = Integer.parseInt(com.appnext.nativeads.a.aG().t("postpone_vta_sec"));
                    if (Boolean.parseBoolean(com.appnext.nativeads.a.aG().t("repeat_vta_viewable_criteria")) && parseInt2 > 0) {
                        if (NativeAd.this.handler != null) {
                            NativeAd.this.handler.postDelayed(new Runnable() { // from class: com.appnext.nativeads.NativeAd.1.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        if (NativeAd.this.nativeAdView == null || NativeAd.this.reportedVTA || NativeAd.this.loadedAd == null || NativeAd.this.nativeAdView.getVisiblePercent(NativeAd.this.nativeAdView) < Integer.parseInt(com.appnext.nativeads.a.aG().t("min_vta_precentage"))) {
                                            return;
                                        }
                                        NativeAd.this.userAction.a(NativeAd.this.loadedAd, NativeAd.this.loadedAd.getImpressionURL(), null);
                                        NativeAd.this.reportedVTA = true;
                                    } catch (Throwable th) {
                                        com.appnext.base.a.a("NativeAd$NativeAd", th);
                                    }
                                }
                            }, parseInt2 * 1000);
                        }
                    } else if (NativeAd.this.reportedVTA || NativeAd.this.loadedAd == null) {
                    } else {
                        NativeAd.this.reportedVTA = true;
                        NativeAd.this.userAction.a(NativeAd.this.loadedAd, NativeAd.this.loadedAd.getImpressionURL(), null);
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("NativeAd$NativeAd", th);
                }
            }
        };
        this.handler = new Handler();
        this.userAction = new C0400r(context, new C0400r.a() { // from class: com.appnext.nativeads.NativeAd.2
            @Override // com.appnext.core.C0400r.a
            public final Ad c() {
                return NativeAd.this.nativeAdObject;
            }

            @Override // com.appnext.core.C0400r.a
            public final AppnextAd d() {
                return NativeAd.this.loadedAd;
            }

            @Override // com.appnext.core.C0400r.a
            public final SettingsManager e() {
                return com.appnext.nativeads.a.aG();
            }

            @Override // com.appnext.core.C0400r.a
            public final void report(String str2) {
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaView.MediaType creativeToMediaType(NativeAdRequest.CreativeType creativeType) {
        if (creativeType == NativeAdRequest.CreativeType.STATIC_ONLY) {
            return MediaView.MediaType.STATIC;
        }
        return MediaView.MediaType.VIDEO;
    }

    private void fillListWithSubviews(ArrayList<View> arrayList, View view) {
        try {
            if ((view instanceof PrivacyIcon) || (view instanceof com.appnext.a.a)) {
                return;
            }
            arrayList.add(view);
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    fillListWithSubviews(arrayList, viewGroup.getChildAt(i10));
                }
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$fillListWithSubviews", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void impression() {
        try {
            if (this.loadedAd == null) {
                return;
            }
            this.reportedImpression = true;
            report("impression_event");
            this.userAction.d(this.loadedAd);
            p.ac().a(new Runnable() { // from class: com.appnext.nativeads.NativeAd.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (NativeAd.this.getNativeAdView() != null) {
                            com.appnext.core.adswatched.a.m(NativeAd.this.getNativeAdView().getContext()).j(NativeAd.this.loadedAd.getBannerID(), NativeAd.this.nativeAdObject.getAUID());
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
            NativeAdListener nativeAdListener = this.adListener;
            if (nativeAdListener != null) {
                nativeAdListener.adImpression(this);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$impression", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load(final NativeAdRequest nativeAdRequest) {
        b aI = b.aI();
        Context context = this.nativeAdObject.getContext();
        NativeAdObject nativeAdObject = this.nativeAdObject;
        aI.a(context, nativeAdObject, nativeAdObject.getPlacementID(), new d.a() { // from class: com.appnext.nativeads.NativeAd.4
            @Override // com.appnext.core.d.a
            public final <T> void a(T t10) {
                try {
                    if (NativeAd.this.handler == null) {
                        return;
                    }
                    NativeAd.this.reportedImpression = false;
                    NativeAd.this.reportedVTA = false;
                    if (nativeAdRequest.getVideoLength() == NativeAdRequest.VideoLength.DEFAULT) {
                        nativeAdRequest.setVideoLength(NativeAdRequest.VideoLength.fromInt(Integer.parseInt(com.appnext.nativeads.a.aG().t("default_video_length"))));
                    }
                    if (nativeAdRequest.getVideoQuality() == NativeAdRequest.VideoQuality.DEFAULT) {
                        nativeAdRequest.setVideoQuality(NativeAdRequest.VideoQuality.fromInt(Integer.parseInt(com.appnext.nativeads.a.aG().t("default_video_quality"))));
                    }
                    AppnextAd a10 = b.aI().a(NativeAd.this.nativeAdObject.getContext(), NativeAd.this.nativeAdObject, nativeAdRequest);
                    if (a10 == null) {
                        if (NativeAd.this.adListener != null) {
                            NativeAd.this.report("error_no_ads");
                            NativeAd.this.adListener.onError(NativeAd.this, new AppnextError(AppnextError.NO_ADS));
                            return;
                        }
                        return;
                    }
                    NativeAd.this.setLoadedAd(a10, nativeAdRequest);
                    if (NativeAd.this.mediaView != null) {
                        MediaView mediaView = NativeAd.this.mediaView;
                        NativeAd nativeAd = NativeAd.this;
                        NativeAdData nativeAdData = nativeAd.loadedAd;
                        NativeAd nativeAd2 = NativeAd.this;
                        mediaView.a(nativeAd, nativeAdData, nativeAd2.creativeToMediaType(nativeAd2.creativeType));
                    }
                    if (NativeAd.this.nativeAdView != null) {
                        NativeAdView nativeAdView = NativeAd.this.nativeAdView;
                        NativeAd nativeAd3 = NativeAd.this;
                        nativeAdView.a(nativeAd3, nativeAd3.loadedAd, NativeAd.this.adViewActions);
                    }
                    if (NativeAd.this.adListener != null) {
                        NativeAd.this.adListener.onAdLoaded(NativeAd.this, a10.getCreativeType());
                        NativeAd.this.adListener.onAdLoaded(NativeAd.this, a10.getCreativeType(), 1, 1);
                    }
                } catch (Throwable th) {
                    com.appnext.base.a.a("NativeAd$load", th);
                    NativeAd.this.onError("Internal error");
                }
            }

            @Override // com.appnext.core.d.a
            public final void error(String str) {
                NativeAd.this.onError(str);
            }
        }, nativeAdRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(String str) {
        try {
            if (this.adListener != null) {
                if (str != null && !str.equals(AppnextError.NO_ADS) && !str.equals("Internal error")) {
                    report("error_" + str.toLowerCase().replace(" ", "_"));
                    this.adListener.onError(this, new AppnextError(str));
                    return;
                }
                report("error_no_ads");
                this.adListener.onError(this, new AppnextError(AppnextError.NO_ADS));
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$load", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openResultPage(boolean z10) {
        com.appnext.core.result.d.aC().a(new com.appnext.core.result.c() { // from class: com.appnext.nativeads.NativeAd.6
            @Override // com.appnext.core.result.c
            public final com.appnext.core.result.a A() {
                return null;
            }

            protected final String getButtonText(AppnextAd appnextAd) {
                try {
                    String buttonText = new NativeAdData(appnextAd).getButtonText();
                    if (appnextAd == null || !buttonText.equals("")) {
                        return buttonText;
                    }
                    if (i.b(NativeAd.this.nativeAdObject.getContext(), appnextAd.getAdPackage())) {
                        return com.appnext.nativeads.a.aG().t("existing_button_text");
                    }
                    return com.appnext.nativeads.a.aG().t("new_button_text");
                } catch (Throwable th) {
                    com.appnext.base.a.a("NativeAd$getButtonText", th);
                    return "";
                }
            }

            @Override // com.appnext.core.result.c
            public final JSONObject getConfigParams() throws JSONException {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vid", "2.7.6.473");
                jSONObject.put(ScarConstants.TOKEN_ID_KEY, NativeAd.this.nativeAdObject == null ? "" : NativeAd.this.nativeAdObject.getTID());
                jSONObject.put("auid", NativeAd.this.nativeAdObject != null ? NativeAd.this.nativeAdObject.getAUID() : "");
                jSONObject.put("osid", "100");
                jSONObject.put("tem_id", NativeAd.this.nativeAdObject.getTemId(NativeAd.this.loadedAd));
                jSONObject.put(ug.f21009x, getPlacementId());
                jSONObject.put("b_title", getButtonText(NativeAd.this.loadedAd));
                jSONObject.put("cat", NativeAd.this.loadedAd.getCategories());
                jSONObject.put("lockcat", NativeAd.this.loadedAd.getSpecificCategories());
                jSONObject.put("pview", com.appnext.nativeads.a.aG().t("pview"));
                jSONObject.put("devn", i.X());
                jSONObject.put("dosv", Build.VERSION.SDK_INT);
                jSONObject.put("dds", "0");
                jSONObject.put("ads_type", "banner");
                jSONObject.put(ImpressionData.IMPRESSION_DATA_KEY_COUNTRY, NativeAd.this.loadedAd.getCountry());
                jSONObject.put("gdpr", k.a(NativeAd.this.loadedAd, com.appnext.nativeads.a.aG()));
                return jSONObject;
            }

            @Override // com.appnext.core.result.c
            public final String getPlacementId() {
                return NativeAd.this.nativeAdObject.getPlacementID();
            }

            @Override // com.appnext.core.result.c
            public final AppnextAd getSelectedAd() {
                return NativeAd.this.loadedAd;
            }

            @Override // com.appnext.core.result.c
            public final String v() {
                return NativeAd.this.nativeAdObject.getTemId(NativeAd.this.loadedAd);
            }

            @Override // com.appnext.core.result.c
            public final String w() {
                return b.aI().k(NativeAd.this.nativeAdObject);
            }

            @Override // com.appnext.core.result.c
            public final String x() {
                try {
                    ArrayList<AppnextAd> e8 = b.aI().e(NativeAd.this.nativeAdObject);
                    JSONArray jSONArray = new JSONArray();
                    Iterator<AppnextAd> it = e8.iterator();
                    while (it.hasNext()) {
                        jSONArray.put(new JSONObject(d.c(it.next())));
                    }
                    return new JSONObject().put("apps", jSONArray).toString();
                } catch (Throwable th) {
                    com.appnext.base.a.a("NativeAd$getFilteredAds", th);
                    return "";
                }
            }

            @Override // com.appnext.core.result.c
            public final SettingsManager y() {
                return com.appnext.nativeads.a.aG();
            }

            @Override // com.appnext.core.result.c
            public final Ad z() {
                return NativeAd.this.nativeAdObject;
            }
        });
        Intent intent = new Intent(this.nativeAdObject.getContext(), ResultPageActivity.class);
        intent.putExtra("shouldClose", z10);
        intent.setFlags(65536);
        this.nativeAdObject.getContext().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void report(String str) {
        try {
            Context context = this.nativeAdObject.getContext();
            String tid = this.nativeAdObject.getTID();
            String vid = this.nativeAdObject.getVID();
            String auid = this.nativeAdObject.getAUID();
            String placementID = this.nativeAdObject.getPlacementID();
            String sessionId = this.nativeAdObject.getSessionId();
            NativeAdData nativeAdData = this.loadedAd;
            String bannerID = nativeAdData != null ? nativeAdData.getBannerID() : "";
            NativeAdData nativeAdData2 = this.loadedAd;
            i.a(context, tid, vid, auid, placementID, sessionId, str, "pub_control", bannerID, nativeAdData2 != null ? nativeAdData2.getCampaignID() : "");
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$onWindowVisibilityChanged", th);
        }
    }

    protected void click() {
        try {
            C0400r c0400r = this.userAction;
            NativeAdData nativeAdData = this.loadedAd;
            c0400r.a(nativeAdData, nativeAdData.getAppURL(), this.nativeAdObject.getPlacementID(), null);
            NativeAdListener nativeAdListener = this.adListener;
            if (nativeAdListener != null) {
                nativeAdListener.onAdClicked(this);
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$click", th);
        }
    }

    protected NativeAdObject createAd(Context context, String str) {
        return new NativeAdObject(context, str);
    }

    public void destroy() {
        try {
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            for (View view : this.clicksListView) {
                view.setOnClickListener(null);
            }
            List<View> list = this.clicksListView;
            if (list != null) {
                list.clear();
            }
            C0400r c0400r = this.userAction;
            if (c0400r != null) {
                c0400r.destroy();
            }
            NativeAdObject nativeAdObject = this.nativeAdObject;
            if (nativeAdObject != null) {
                nativeAdObject.destroy();
            }
            MediaView mediaView = this.mediaView;
            if (mediaView != null) {
                mediaView.destroy();
            }
            this.handler = null;
            this.adViewActions = null;
            this.mediaView = null;
            this.adListener = null;
            this.loadedAd = null;
            this.nativeAdView = null;
        } catch (Exception e8) {
            com.appnext.base.a.a("NativeAd$destroy", e8);
        }
    }

    public void downloadAndDisplayImage(Context context, ImageView imageView, String str) {
        l.aa().a(context, imageView, str, null);
    }

    public void getAdByPackage(NativeAdRequest nativeAdRequest, String str) {
        try {
            if (!i.h(this.nativeAdObject.getContext())) {
                NativeAdListener nativeAdListener = this.adListener;
                if (nativeAdListener != null) {
                    nativeAdListener.onError(this, new AppnextError(AppnextError.CONNECTION_ERROR));
                }
            } else if (this.handler == null) {
            } else {
                final NativeAdRequest nativeAdRequest2 = new NativeAdRequest(nativeAdRequest);
                this.nativeAdObject.setPackageName(str);
                this.nativeAdObject.setCategories(nativeAdRequest2.getCategories());
                this.nativeAdObject.setSpecificCategories(nativeAdRequest2.getSpecificCategories());
                this.nativeAdObject.setPostback(nativeAdRequest2.getPostback());
                this.nativeAdObject.setMinVideoLength(nativeAdRequest2.getMinVideoLength());
                this.nativeAdObject.setMaxVideoLength(nativeAdRequest2.getMaxVideoLength());
                this.creativeType = nativeAdRequest2.getCreativeType();
                report("caching_" + nativeAdRequest2.getCachingPolicy());
                com.appnext.nativeads.a.aG().a(this.nativeAdObject.getContext(), this.nativeAdObject.getPlacementID(), new SettingsManager.ConfigCallback() { // from class: com.appnext.nativeads.NativeAd.3
                    @Override // com.appnext.core.SettingsManager.ConfigCallback
                    public final void error(String str2) {
                        try {
                            NativeAd.this.load(nativeAdRequest2);
                        } catch (Throwable th) {
                            com.appnext.base.a.a("NativeAd$getAdByPackage", th);
                        }
                    }

                    @Override // com.appnext.core.SettingsManager.ConfigCallback
                    public final void loaded(HashMap<String, Object> hashMap) {
                        try {
                            NativeAd.this.load(nativeAdRequest2);
                        } catch (Throwable th) {
                            com.appnext.base.a.a("NativeAd$getAdByPackage", th);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$getAdByPackage", th);
        }
    }

    public String getAdDescription() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAdDescription();
    }

    public String getAdTitle() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAdTitle();
    }

    public String getAppPackageName() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAdPackage();
    }

    public String getAppSize() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getAppSize();
    }

    public String getBannerID() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getBannerID();
    }

    public String getCTAText() {
        try {
            if (this.loadedAd == null) {
                return null;
            }
            boolean b10 = i.b(this.nativeAdObject.getContext(), this.loadedAd.getAdPackage());
            String str = "existing";
            if (this.loadedAd.getButtonText().equals("")) {
                if (b10) {
                    return com.appnext.core.b.a.q(this.nativeAdObject.getContext()).a(getLanguage(), "existing", com.appnext.nativeads.a.aG().t("existing_button_text"));
                }
                return com.appnext.core.b.a.q(this.nativeAdObject.getContext()).a(getLanguage(), "new", com.appnext.nativeads.a.aG().t("new_button_text"));
            }
            com.appnext.core.b.a q10 = com.appnext.core.b.a.q(this.nativeAdObject.getContext());
            String language = getLanguage();
            if (!b10) {
                str = "new";
            }
            return q10.a(language, str, this.loadedAd.getButtonText());
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$getCTAText", th);
            return "";
        }
    }

    public String getCategories() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getCategories();
    }

    public String getCountry() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getCountry();
    }

    public float getECPM() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return 0.0f;
        }
        return nativeAdData.getECPM();
    }

    public String getIconURL() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getImageURL();
    }

    public String getLanguage() {
        return this.language;
    }

    public MediaView getMediaView() {
        return this.mediaView;
    }

    public NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    public float getPPR() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return 0.0f;
        }
        return nativeAdData.getPPR();
    }

    public String getPPU() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return i.f(nativeAdData);
    }

    public int getPrivacyPolicyColor() {
        return this.privacyPolicyColor;
    }

    public int getPrivacyPolicyPosition() {
        return this.privacyPolicyPosition;
    }

    public int getPrivacyPolicyVisibility() {
        return this.privacyPolicyVisibility;
    }

    public String getSessionID() {
        NativeAdData nativeAdData = this.loadedAd;
        return nativeAdData == null ? "" : nativeAdData.getSessionID();
    }

    public String getSpecificCategories() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getSpecificCategories();
    }

    public String getStoreDownloads() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getStoreDownloads();
    }

    public String getStoreRating() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getStoreRating();
    }

    public String getSupportedVersion() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getSupportedVersion();
    }

    public String getVideoUrl() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getSelectedVideo();
    }

    public String getWideImageURL() {
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null) {
            return null;
        }
        return nativeAdData.getWideImageURL();
    }

    public void i() {
        if ((Thread.currentThread().getStackTrace()[3].getClassName() + Thread.currentThread().getStackTrace()[3].getMethodName()).hashCode() != -133704518 || this.reportedImpression) {
            return;
        }
        impression();
    }

    public boolean isGPRD() {
        NativeAdData nativeAdData = this.loadedAd;
        return nativeAdData != null && nativeAdData.isGdpr();
    }

    public boolean isLoaded() {
        NativeAdObject nativeAdObject;
        return (this.loadedAd == null || (nativeAdObject = this.nativeAdObject) == null || !nativeAdObject.isAdLoaded()) ? false : true;
    }

    public void loadAd(NativeAdRequest nativeAdRequest) {
        getAdByPackage(nativeAdRequest, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i10) {
        if (i10 == 0) {
            try {
                if (this.clicked) {
                    this.clicked = false;
                    openResultPage(false);
                }
            } catch (Throwable th) {
                com.appnext.base.a.a("NativeAd$onWindowVisibilityChanged", th);
            }
        }
    }

    public void registerClickableViews(View view) {
        try {
            ArrayList<View> arrayList = new ArrayList<>();
            fillListWithSubviews(arrayList, view);
            registerClickableViews(arrayList);
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$registerClickableViews", th);
        }
    }

    public void setAdListener(NativeAdListener nativeAdListener) {
        if (nativeAdListener == null) {
            return;
        }
        this.adListener = nativeAdListener;
    }

    public void setLanguage(String str) {
        this.language = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setLoadedAd(AppnextAd appnextAd, NativeAdRequest nativeAdRequest) {
        try {
            NativeAdData nativeAdData = new NativeAdData(appnextAd);
            this.loadedAd = nativeAdData;
            nativeAdData.setAppURL(this.loadedAd.getAppURL() + "&tem_id=" + this.nativeAdObject.getTemId(this.loadedAd));
            NativeAdData nativeAdData2 = this.loadedAd;
            nativeAdData2.setImpressionURL(this.loadedAd.getImpressionURL() + "&tem_id=" + this.nativeAdObject.getTemId(this.loadedAd));
            try {
                b.aI();
                String a10 = b.a(nativeAdRequest, this.loadedAd);
                if (a10.equals("")) {
                    return;
                }
                this.loadedAd.F(a10);
            } catch (Throwable unused) {
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$setLoadedAd", th);
        }
    }

    public void setMediaView(MediaView mediaView) {
        this.mediaView = mediaView;
        NativeAdData nativeAdData = this.loadedAd;
        if (nativeAdData == null || mediaView == null) {
            return;
        }
        mediaView.a(this, nativeAdData, creativeToMediaType(this.creativeType));
    }

    public void setNativeAdView(NativeAdView nativeAdView) {
        NativeAdData nativeAdData;
        NativeAdView nativeAdView2 = this.nativeAdView;
        if (nativeAdView2 != null) {
            nativeAdView2.aH();
        }
        this.nativeAdView = nativeAdView;
        if (nativeAdView == null || (nativeAdData = this.loadedAd) == null) {
            return;
        }
        nativeAdView.a(this, nativeAdData, this.adViewActions);
    }

    public void setParams(String str, String str2) {
        com.appnext.nativeads.a.aG().i(str, str2);
    }

    public void setPrivacyPolicyColor(int i10) {
        this.privacyPolicyColor = i10;
    }

    public void setPrivacyPolicyPosition(int i10) {
        this.privacyPolicyPosition = i10;
    }

    public void setPrivacyPolicyVisibility(int i10) {
        this.privacyPolicyVisibility = i10;
    }

    public void registerClickableViews(List<View> list) {
        try {
            if (list != null) {
                if (list.size() != 0) {
                    a aVar = new a();
                    for (View view : list) {
                        if (!(view instanceof PrivacyIcon) && !(view instanceof com.appnext.a.a) && !(view instanceof MediaView.a)) {
                            this.clicksListView.add(view);
                            view.setOnClickListener(aVar);
                        }
                    }
                    return;
                }
                throw new IllegalArgumentException("List cannot be empty");
            }
            throw new IllegalArgumentException("List cannot be null");
        } catch (Throwable th) {
            com.appnext.base.a.a("NativeAd$registerClickableViews", th);
        }
    }
}

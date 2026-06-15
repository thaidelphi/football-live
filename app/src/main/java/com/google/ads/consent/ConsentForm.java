package com.google.ads.consent;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import b7.e;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import java.util.HashMap;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ConsentForm {
    private final boolean adFreeOption;
    private final URL appPrivacyPolicyURL;
    private final Context context;
    private final Dialog dialog;
    private final ConsentFormListener listener;
    private LoadState loadState;
    private final boolean nonPersonalizedAdsOption;
    private final boolean personalizedAdsOption;
    private final WebView webView;

    /* renamed from: com.google.ads.consent.ConsentForm$1  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class AnonymousClass1 extends ConsentFormListener {
    }

    /* renamed from: com.google.ads.consent.ConsentForm$3  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class AnonymousClass3 implements DialogInterface.OnShowListener {
        final /* synthetic */ ConsentForm this$0;

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.this$0.listener.d();
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public static class Builder {
        private boolean adFreeOption;
        private final URL appPrivacyPolicyURL;
        private final Context context;
        private ConsentFormListener listener;
        private boolean nonPersonalizedAdsOption;
        private boolean personalizedAdsOption;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public enum LoadState {
        NOT_READY,
        LOADING,
        LOADED
    }

    private static String g(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("info", str2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("args", hashMap);
        return String.format("javascript:%s(%s)", str, new e().r(hashMap2));
    }

    private static String h(Context context) {
        Drawable applicationIcon = context.getPackageManager().getApplicationIcon(context.getApplicationInfo());
        Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        applicationIcon.draw(canvas);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
        return valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
    }

    private static String i(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(String str) {
        ConsentStatus consentStatus;
        this.loadState = LoadState.NOT_READY;
        this.dialog.dismiss();
        if (TextUtils.isEmpty(str)) {
            this.listener.b("No information provided.");
        } else if (str.contains("Error")) {
            this.listener.b(str);
        } else {
            char c10 = 65535;
            boolean z10 = true;
            switch (str.hashCode()) {
                case -1152655096:
                    if (str.equals("ad_free")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -258041904:
                    if (str.equals("personalized")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1666911234:
                    if (str.equals("non_personalized")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    consentStatus = ConsentStatus.UNKNOWN;
                    break;
                case 1:
                    consentStatus = ConsentStatus.PERSONALIZED;
                    z10 = false;
                    break;
                case 2:
                    consentStatus = ConsentStatus.NON_PERSONALIZED;
                    z10 = false;
                    break;
                default:
                    consentStatus = ConsentStatus.UNKNOWN;
                    z10 = false;
                    break;
            }
            ConsentInformation.e(this.context).m(consentStatus, "form");
            this.listener.a(consentStatus, Boolean.valueOf(z10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(String str) {
        if (TextUtils.isEmpty(str)) {
            this.loadState = LoadState.NOT_READY;
            this.listener.b("No information");
        } else if (str.contains("Error")) {
            this.loadState = LoadState.NOT_READY;
            this.listener.b(str);
        } else {
            this.loadState = LoadState.LOADED;
            this.listener.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(String str) {
        if (TextUtils.isEmpty(str)) {
            this.listener.b("No valid URL for browser navigation.");
            return;
        }
        try {
            this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            this.listener.b("No Activity found to handle browser intent.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(WebView webView) {
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", i(this.context));
        hashMap.put("app_icon", h(this.context));
        hashMap.put("offer_personalized", Boolean.valueOf(this.personalizedAdsOption));
        hashMap.put("offer_non_personalized", Boolean.valueOf(this.nonPersonalizedAdsOption));
        hashMap.put("offer_ad_free", Boolean.valueOf(this.adFreeOption));
        hashMap.put("is_request_in_eea_or_unknown", Boolean.valueOf(ConsentInformation.e(this.context).h()));
        hashMap.put("app_privacy_url", this.appPrivacyPolicyURL);
        ConsentData j10 = ConsentInformation.e(this.context).j();
        hashMap.put("plat", j10.d());
        hashMap.put("consent_info", j10);
        webView.loadUrl(g("setUpConsentDialog", new e().r(hashMap)));
    }

    /* renamed from: com.google.ads.consent.ConsentForm$2  reason: invalid class name */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    class AnonymousClass2 extends WebViewClient {
        boolean isInternalRedirect;
        final /* synthetic */ ConsentForm this$0;

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
            if (r1.equals("browser") == false) goto L7;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a(java.lang.String r7) {
            /*
                r6 = this;
                boolean r0 = r6.b(r7)
                if (r0 != 0) goto L7
                return
            L7:
                r0 = 1
                r6.isInternalRedirect = r0
                android.net.Uri r7 = android.net.Uri.parse(r7)
                java.lang.String r1 = "action"
                java.lang.String r1 = r7.getQueryParameter(r1)
                java.lang.String r2 = "status"
                java.lang.String r2 = r7.getQueryParameter(r2)
                java.lang.String r3 = "url"
                java.lang.String r7 = r7.getQueryParameter(r3)
                r1.hashCode()
                r3 = -1
                int r4 = r1.hashCode()
                r5 = 0
                switch(r4) {
                    case -1370505102: goto L42;
                    case 150940456: goto L39;
                    case 1671672458: goto L2e;
                    default: goto L2c;
                }
            L2c:
                r0 = r3
                goto L4c
            L2e:
                java.lang.String r0 = "dismiss"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L37
                goto L2c
            L37:
                r0 = 2
                goto L4c
            L39:
                java.lang.String r4 = "browser"
                boolean r1 = r1.equals(r4)
                if (r1 != 0) goto L4c
                goto L2c
            L42:
                java.lang.String r0 = "load_complete"
                boolean r0 = r1.equals(r0)
                if (r0 != 0) goto L4b
                goto L2c
            L4b:
                r0 = r5
            L4c:
                switch(r0) {
                    case 0: goto L5e;
                    case 1: goto L58;
                    case 2: goto L50;
                    default: goto L4f;
                }
            L4f:
                goto L63
            L50:
                r6.isInternalRedirect = r5
                com.google.ads.consent.ConsentForm r7 = r6.this$0
                com.google.ads.consent.ConsentForm.d(r7, r2)
                goto L63
            L58:
                com.google.ads.consent.ConsentForm r0 = r6.this$0
                com.google.ads.consent.ConsentForm.e(r0, r7)
                goto L63
            L5e:
                com.google.ads.consent.ConsentForm r7 = r6.this$0
                com.google.ads.consent.ConsentForm.c(r7, r2)
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.consent.ConsentForm.AnonymousClass2.a(java.lang.String):void");
        }

        private boolean b(String str) {
            return !TextUtils.isEmpty(str) && str.startsWith("consent://");
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(WebView webView, String str) {
            a(str);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (!this.isInternalRedirect) {
                this.this$0.m(webView);
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            this.this$0.loadState = LoadState.NOT_READY;
            this.this$0.listener.b(webResourceError.toString());
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(24)
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            String uri = webResourceRequest.getUrl().toString();
            if (b(uri)) {
                a(uri);
                return true;
            }
            return false;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (b(str)) {
                a(str);
                return true;
            }
            return false;
        }
    }
}

package com.appnext.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.ironsource.b9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class ResultActivity extends Activity {
    private Intent dv;
    private WebView webView;

    private static List a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            arrayList.add(new ComponentName(activityInfo.packageName, activityInfo.name));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Intent o(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void openLink(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.addFlags(268435456);
        startActivity(intent);
    }

    public final boolean hasNewResolver(Intent intent) {
        if (this.dv == null) {
            return intent != null;
        } else if (intent == null) {
            return false;
        } else {
            List<ComponentName> a10 = a(this, intent);
            HashSet hashSet = new HashSet();
            hashSet.addAll(a(this, this.dv));
            for (ComponentName componentName : a10) {
                if (!hashSet.contains(componentName)) {
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        try {
            WebView webView = this.webView;
            if (webView != null && webView.canGoBack()) {
                this.webView.goBack();
            } else {
                super.onBackPressed();
            }
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultActivity$onBackPressed", th);
            finish();
        }
    }

    @Override // android.app.Activity
    @SuppressLint({"SetJavaScriptEnabled"})
    protected void onCreate(Bundle bundle) {
        Intent selector;
        requestWindowFeature(1);
        super.onCreate(bundle);
        try {
            LinearLayout linearLayout = new LinearLayout(this);
            setContentView(linearLayout);
            linearLayout.setOrientation(1);
            WebView webView = new WebView(getApplicationContext());
            this.webView = webView;
            webView.getSettings().setTextZoom(100);
            this.webView.getSettings().setJavaScriptEnabled(true);
            this.webView.getSettings().setAppCacheEnabled(true);
            this.webView.getSettings().setDomStorageEnabled(true);
            this.webView.getSettings().setDatabaseEnabled(true);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 21) {
                this.webView.getSettings().setMixedContentMode(0);
            }
            if (i10 >= 17) {
                this.webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            if (i10 >= 19) {
                this.webView.setLayerType(2, null);
            } else {
                this.webView.setLayerType(1, null);
            }
            this.webView.setWebViewClient(new WebViewClient() { // from class: com.appnext.core.ResultActivity.1
                @Override // android.webkit.WebViewClient
                public final boolean onRenderProcessGone(WebView webView2, RenderProcessGoneDetail renderProcessGoneDetail) {
                    if (Build.VERSION.SDK_INT < 26 || renderProcessGoneDetail.didCrash()) {
                        return false;
                    }
                    if (ResultActivity.this.webView != null) {
                        ResultActivity.this.webView.destroy();
                        ResultActivity.this.webView = null;
                        return true;
                    }
                    return true;
                }

                @Override // android.webkit.WebViewClient
                public final boolean shouldOverrideUrlLoading(WebView webView2, String str) {
                    String str2;
                    if (str == null) {
                        return false;
                    }
                    try {
                        if (str.startsWith("http")) {
                            if (ResultActivity.this.hasNewResolver(ResultActivity.o(str).setComponent(null))) {
                                ResultActivity.this.openLink(str);
                            } else {
                                webView2.loadUrl(str);
                            }
                            return true;
                        } else if (str.startsWith("intent://")) {
                            Intent parseUri = Intent.parseUri(str, 1);
                            if (ResultActivity.this.getPackageManager().resolveActivity(parseUri, 65536) != null) {
                                ResultActivity.this.openLink(parseUri.getData().toString());
                                return true;
                            }
                            if (parseUri.getExtras() != null && parseUri.getExtras().containsKey("browser_fallback_url") && !parseUri.getExtras().getString("browser_fallback_url").equals("")) {
                                str2 = parseUri.getExtras().getString("browser_fallback_url");
                            } else {
                                if (parseUri.getExtras().containsKey("market_referrer") && !parseUri.getExtras().getString("market_referrer").equals("")) {
                                    str2 = "market://details?id=" + parseUri.getPackage() + "&referrer=" + parseUri.getExtras().getString("market_referrer");
                                }
                                return true;
                            }
                            ResultActivity.this.openLink(str2);
                            return true;
                        } else {
                            Intent intent = new Intent("android.intent.action.VIEW");
                            intent.setData(Uri.parse(str));
                            if (ResultActivity.this.getPackageManager().queryIntentActivities(intent, 0).size() > 0) {
                                ResultActivity.this.openLink(str);
                                return true;
                            }
                            return false;
                        }
                    } catch (Throwable th) {
                        com.appnext.base.a.a("ResultActivity$onCreate", th);
                        return false;
                    }
                }
            });
            linearLayout.addView(this.webView);
            this.webView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0));
            ((LinearLayout.LayoutParams) this.webView.getLayoutParams()).weight = 1.0f;
            String string = getIntent().getExtras().getString("url");
            getIntent().getExtras().getString(b9.h.D0);
            Intent component = new Intent(o(string)).setComponent(null);
            this.dv = component;
            if (i10 >= 15 && (selector = component.getSelector()) != null) {
                selector.setComponent(null);
            }
            this.webView.loadUrl(string);
        } catch (Throwable th) {
            com.appnext.base.a.a("ResultActivity$onCreate", th);
            finish();
        }
    }
}

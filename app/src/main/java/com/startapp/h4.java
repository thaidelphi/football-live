package com.startapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.startio.adsession.AdSession;
import com.iab.omid.library.startio.adsession.FriendlyObstructionPurpose;
import com.ironsource.cc;
import com.startapp.s7;
import com.startapp.sdk.ads.interstitials.InterstitialAd;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.StartAppSDKInternal;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.commontracking.CloseTrackingParams;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MraidMetadata;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class h4 extends l2 implements View.OnClickListener {
    public s7 B;
    public long G;
    public j6 H;
    public boolean J;
    public boolean K;
    public Runnable L;

    /* renamed from: x  reason: collision with root package name */
    public WebView f22015x;

    /* renamed from: y  reason: collision with root package name */
    public RelativeLayout f22016y;

    /* renamed from: z  reason: collision with root package name */
    public ImageButton f22017z;
    public long A = 0;
    public boolean C = true;
    public boolean D = false;
    public int E = 0;
    public boolean F = false;
    public g0 I = new i();
    public final a M = new a();
    public final b N = new b();
    public final c O = new c();

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h4.this.i();
            h4.this.a();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h4 h4Var = h4.this;
            h4Var.C = true;
            WebView webView = h4Var.f22015x;
            if (webView != null) {
                webView.setOnTouchListener(null);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class c implements s7.b {
        public c() {
        }

        @Override // com.startapp.s7.b
        public final void onSent(String str) {
            h4 h4Var = h4.this;
            h4Var.getClass();
            Intent intent = new Intent("com.startapp.android.ShowDisplayBroadcastListener");
            intent.putExtra("dParam", str);
            c5.a(h4Var.f22201b).a(intent);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class d implements View.OnLongClickListener {
        @Override // android.view.View.OnLongClickListener
        public final boolean onLongClick(View view) {
            return true;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class e implements View.OnTouchListener {
        public e() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            h4.this.C = true;
            return false;
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h4.this.a();
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            WebView webView = h4.this.f22015x;
            if (webView != null) {
                y.c(webView);
            }
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class h extends WebViewClient {
        public h() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            if (webView == null || str == null) {
                return;
            }
            if (h4.this.B == null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                h4 h4Var = h4.this;
                long max = Math.max(0L, h4Var.m() - (uptimeMillis - h4Var.A));
                MraidMetadata A = MetaData.f23158k.A();
                g0 g0Var = h4.this.I;
                g0Var.getClass();
                boolean z10 = (g0Var instanceof com.startapp.sdk.ads.fullpagemodes.b) && A != null && o9.a(A.a());
                h4 h4Var2 = h4.this;
                h4 h4Var3 = h4.this;
                h4Var2.B = new s7(h4Var3.f22201b, h4Var3.f22213n, h4Var3.f22208i, h4Var3.n(), max, z10, h4.this.O);
                h4.this.p();
            }
            h4.this.I.a(webView, str);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
        @Override // android.webkit.WebViewClient
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r8, java.lang.String r9) {
            /*
                r7 = this;
                java.lang.String r0 = "UTF-8"
                java.lang.String r1 = "text/javascript"
                r2 = 0
                android.net.Uri r3 = android.net.Uri.parse(r9)     // Catch: java.lang.Throwable -> L1c
                java.lang.String r3 = r3.getLastPathSegment()     // Catch: java.lang.Throwable -> L1c
                if (r3 == 0) goto L1c
                java.lang.String r4 = "mraid.js"
                java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L1c
                java.lang.String r3 = r3.toLowerCase(r5)     // Catch: java.lang.Throwable -> L1c
                boolean r3 = r4.equals(r3)     // Catch: java.lang.Throwable -> L1c
                goto L1d
            L1c:
                r3 = r2
            L1d:
                if (r3 == 0) goto Lae
                com.startapp.h4 r9 = com.startapp.h4.this
                com.startapp.g0 r3 = r9.I
                r3.getClass()
                boolean r3 = r3 instanceof com.startapp.sdk.ads.fullpagemodes.b
                if (r3 == 0) goto L2b
                goto L42
            L2b:
                com.startapp.sdk.ads.fullpagemodes.b r3 = new com.startapp.sdk.ads.fullpagemodes.b
                r3.<init>(r9)
                r9.I = r3
                boolean r4 = r9.J
                if (r4 == 0) goto L39
                r3.g()
            L39:
                boolean r3 = r9.K
                if (r3 == 0) goto L42
                com.startapp.g0 r9 = r9.I
                r9.f()
            L42:
                com.startapp.h4 r9 = com.startapp.h4.this
                r9.getClass()
                android.os.Handler r3 = new android.os.Handler
                android.os.Looper r4 = android.os.Looper.getMainLooper()
                r3.<init>(r4)
                com.startapp.j4 r4 = new com.startapp.j4
                r4.<init>(r9)
                r3.post(r4)
                android.content.Context r8 = r8.getContext()
                com.startapp.sdk.components.a r8 = com.startapp.sdk.components.a.a(r8)
                com.startapp.t4<com.startapp.u5> r8 = r8.Q
                java.lang.Object r8 = r8.a()
                com.startapp.u5 r8 = (com.startapp.u5) r8
                android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse     // Catch: java.io.FileNotFoundException -> L7c
                java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7c
                java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> L7c
                java.io.File r5 = r8.f23440b     // Catch: java.io.FileNotFoundException -> L7c
                java.lang.String r6 = "24e22423049bbf51"
                r4.<init>(r5, r6)     // Catch: java.io.FileNotFoundException -> L7c
                r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> L7c
                r9.<init>(r1, r0, r3)     // Catch: java.io.FileNotFoundException -> L7c
                goto Lad
            L7c:
                r9 = move-exception
                r3 = 2
                com.startapp.j2<com.startapp.sdk.adsbase.remoteconfig.MraidMetadata> r8 = r8.f23441c
                java.lang.Object r8 = r8.call()
                com.startapp.sdk.adsbase.remoteconfig.MraidMetadata r8 = (com.startapp.sdk.adsbase.remoteconfig.MraidMetadata) r8
                if (r8 == 0) goto L8d
                com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig r8 = r8.b()
                goto L8e
            L8d:
                r8 = 0
            L8e:
                if (r8 == 0) goto L98
                long r3 = (long) r3
                boolean r8 = r8.a(r3)
                if (r8 == 0) goto L98
                r2 = 1
            L98:
                if (r2 == 0) goto L9d
                com.startapp.l3.a(r9)
            L9d:
                android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse
                java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream
                java.lang.String r2 = "!function(){console.log(\"MRAID object loading...\");var e=window.top.mraid&&\"object\"==typeof window.top.mraid?window.top.mraid:null;if(e){window.mraid=e,console.log(\"MRAID object already exists\");return}var t={DEBUG:0,INFO:1,WARNING:2,ERROR:3,NONE:4},i=t.DEBUG,r={};r.d=function(e){i<=t.DEBUG&&console.log(\"(D-mraid.js) \"+e)},r.i=function(e){i<=t.INFO&&console.log(\"(I-mraid.js) \"+e)},r.w=function(e){i<=t.WARNING&&console.log(\"(W-mraid.js) \"+e)},r.e=function(e){i<=t.ERROR&&console.log(\"(E-mraid.js) \"+e)};var n={};window.mraid=n,window.top.mraid=n,n._sioVersion=\"0.1\";var o=n.STATES={LOADING:\"loading\",DEFAULT:\"default\",EXPANDED:\"expanded\",RESIZED:\"resized\",HIDDEN:\"hidden\"},s=n.PLACEMENT_TYPES={INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},a=n.RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION={TOP_LEFT:\"top-left\",TOP_CENTER:\"top-center\",TOP_RIGHT:\"top-right\",CENTER:\"center\",BOTTOM_LEFT:\"bottom-left\",BOTTOM_CENTER:\"bottom-center\",BOTTOM_RIGHT:\"bottom-right\"},f=n.ORIENTATION_PROPERTIES_FORCE_ORIENTATION={PORTRAIT:\"portrait\",LANDSCAPE:\"landscape\",NONE:\"none\"},d=n.EVENTS={ERROR:\"error\",READY:\"ready\",SIZECHANGE:\"sizeChange\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\"};n.SUPPORTED_FEATURES={SMS:\"sms\",TEL:\"tel\",CALENDAR:\"calendar\",STOREPICTURE:\"storePicture\",INLINEVIDEO:\"inlineVideo\"};var h=o.LOADING,u=s.INLINE,l={},E=!1,c=!1,g=!1,m={width:0,height:0,useCustomClose:!1,isModal:!0},p={allowOrientationChange:!0,forceOrientation:f.NONE},O={width:0,height:0,customClosePosition:a.TOP_RIGHT,offsetX:0,offsetY:0,allowOffscreen:!0},v={x:0,y:0,width:0,height:0},C={x:0,y:0,width:0,height:0},P={width:0,height:0},w={width:0,height:0},R={};function y(e){var t=document.createElement(\"IFRAME\");t.setAttribute(\"src\",\"mraid://\"+e),document.documentElement.appendChild(t),t.parentNode.removeChild(t),t=null}function T(e){var t=Array.prototype.slice.call(arguments);t.shift(),r.i(\"fireEvent \"+e+\" [\"+t.toString()+\"]\");var i=R[e];if(i){var n=(i=i.slice()).length;r.i(n+\" listener(s) found\");for(var o=0;o<n;o++)i[o].apply(null,t)}else r.i(\"no listeners found\")}function x(e,t){for(var i in t)if(t[i]===e)return!0;return!1}function N(e,t){var i=!0,r=S[t];for(var o in e){var s=r[o],a=e[o];s&&!s(a)&&(n.fireErrorEvent(\"Value of property \"+o+\" (\"+a+\") is invalid\",\"mraid.\"+t),i=!1)}return i}n.addEventListener=function(e,t){if(r.i(\"mraid.addEventListener \"+e+\": \"+String(t)),!e||!t){n.fireErrorEvent(\"Both event and listener are required.\",\"addEventListener\");return}if(!x(e,d)){n.fireErrorEvent(\"Unknown MRAID event: \"+e,\"addEventListener\");return}for(var i=R[e]=R[e]||[],o=0;o<i.length;o++){var s=String(t),a=String(i[o]);if(t===i[o]||s===a){r.i(\"listener \"+s+\" is already registered for event \"+e);return}}i.push(t)},n.createCalendarEvent=function(e){r.i(\"mraid.createCalendarEvent with \"+e),l[n.SUPPORTED_FEATURES.CALENDAR]?y(\"createCalendarEvent?eventJSON=\"+JSON.stringify(e)):r.e(\"createCalendarEvent is not supported\")},n.close=function(){r.i(\"mraid.close\"),h!==o.LOADING&&(h!==o.DEFAULT||u!==s.INLINE)&&h!==o.HIDDEN&&y(\"close\")},n.expand=function(e){void 0===e?r.i(\"mraid.expand (1-part)\"):r.i(\"mraid.expand \"+e),u===s.INLINE&&(h===o.DEFAULT||h===o.RESIZED)&&(void 0===e?y(\"expand\"):y(\"expand?url=\"+encodeURIComponent(e)))},n.getCurrentPosition=function(){return r.i(\"mraid.getCurrentPosition\"),v},n.getDefaultPosition=function(){return r.i(\"mraid.getDefaultPosition\"),C},n.getExpandProperties=function(){return r.i(\"mraid.getExpandProperties\"),m},n.getMaxSize=function(){return r.i(\"mraid.getMaxSize\"),P},n.getOrientationProperties=function(){return r.i(\"mraid.getOrientationProperties\"),p},n.getPlacementType=function(){return r.i(\"mraid.getPlacementType\"),u},n.getResizeProperties=function(){return r.i(\"mraid.getResizeProperties\"),O},n.getScreenSize=function(){return r.i(\"mraid.getScreenSize\"),w},n.getState=function(){return r.i(\"mraid.getState\"),h},n.getVersion=function(){return r.i(\"mraid.getVersion\"),\"2.0\"},n.isViewable=function(){return r.i(\"mraid.isViewable\"),E},n.open=function(e){r.i(\"mraid.open \"+e),y(\"open?url=\"+encodeURIComponent(e))},n.playVideo=function(e){r.i(\"mraid.playVideo \"+e),y(\"playVideo?url=\"+encodeURIComponent(e))},n.removeEventListener=function(e,t){if(r.i(\"mraid.removeEventListener \"+e+\" : \"+String(t)),!e){n.fireErrorEvent(\"Event is required.\",\"removeEventListener\");return}if(!x(e,d)){n.fireErrorEvent(\"Unknown MRAID event: \"+e,\"removeEventListener\");return}if(R.hasOwnProperty(e)){if(t){for(var i=R[e],o=i.length,s=0;s<o;s++){var a=i[s],f=String(t),h=String(a);if(t===a||f===h){i.splice(s,1);break}}s===o&&r.i(\"listener \"+f+\" not found for event \"+e),0===i.length&&delete R[e]}else delete R[e]}else r.i(\"no listeners registered for event \"+e)},n.resize=function(){if(r.i(\"mraid.resize\"),u!==s.INTERSTITIAL&&h!==o.LOADING&&h!==o.HIDDEN){if(h===o.EXPANDED){n.fireErrorEvent(\"mraid.resize called when ad is in expanded state\",\"mraid.resize\");return}if(!g){n.fireErrorEvent(\"mraid.resize is not ready to be called\",\"mraid.resize\");return}y(\"resize\")}},n.setExpandProperties=function(e){if(r.i(\"mraid.setExpandProperties\"),!N(e,\"setExpandProperties\")){r.e(\"failed validation\");return}for(var t=m.useCustomClose,i=[\"width\",\"height\",\"useCustomClose\"],n=0;n<i.length;n++){var o=i[n];e.hasOwnProperty(o)&&(m[o]=e[o])}m.useCustomClose!==t&&y(\"useCustomClose?useCustomClose=\"+m.useCustomClose),c=!0},n.setOrientationProperties=function(e){if(r.i(\"mraid.setOrientationProperties\"),!N(e,\"setOrientationProperties\")){r.e(\"failed validation\");return}var t={};t.allowOrientationChange=p.allowOrientationChange,t.forceOrientation=p.forceOrientation;for(var i=[\"allowOrientationChange\",\"forceOrientation\"],o=0;o<i.length;o++){var s=i[o];e.hasOwnProperty(s)&&(t[s]=e[s])}if(t.allowOrientationChange&&t.forceOrientation!==n.ORIENTATION_PROPERTIES_FORCE_ORIENTATION.NONE){n.fireErrorEvent(\"allowOrientationChange is true but forceOrientation is \"+t.forceOrientation,\"setOrientationProperties\");return}p.allowOrientationChange=t.allowOrientationChange,p.forceOrientation=t.forceOrientation,y(\"setOrientationProperties?\"+(\"allowOrientationChange=\"+p.allowOrientationChange+\"&forceOrientation=\")+p.forceOrientation)},n.setResizeProperties=function(e){r.i(\"mraid.setResizeProperties\"),g=!1;for(var t,i,o,s,a,f,d,h,u,l=[\"width\",\"height\",\"offsetX\",\"offsetY\"],E=0;E<l.length;E++){var c=l[E];if(!e.hasOwnProperty(c)){n.fireErrorEvent(\"required property \"+c+\" is missing\",\"mraid.setResizeProperties\");return}}if(!N(e,\"setResizeProperties\")){n.fireErrorEvent(\"failed validation\",\"mraid.setResizeProperties\");return}var m={x:0,y:0};if(e.hasOwnProperty(\"allowOffscreen\")?e.allowOffscreen:O.allowOffscreen){if(t=e,r.d(\"isCloseRegionOnScreen\"),r.d(\"defaultPosition \"+C.x+\" \"+C.y),r.d(\"offset \"+t.offsetX+\" \"+t.offsetY),i={},i.x=C.x+t.offsetX,i.y=C.y+t.offsetY,i.width=t.width,i.height=t.height,$(\"resizeRect\",i),o=t.hasOwnProperty(\"customClosePosition\")?t.customClosePosition:O.customClosePosition,r.d(\"customClosePosition \"+o),s={width:50,height:50},-1!==o.search(\"left\")?s.x=i.x:-1!==o.search(\"center\")?s.x=i.x+i.width/2-25:-1!==o.search(\"right\")&&(s.x=i.x+i.width-50),-1!==o.search(\"top\")?s.y=i.y:\"center\"===o?s.y=i.y+i.height/2-25:-1!==o.search(\"bottom\")&&(s.y=i.y+i.height-50),a={x:0,y:0},a.width=P.width,a.height=P.height,!I(a,s)){n.fireErrorEvent(\"close event region will not appear entirely onscreen\",\"mraid.setResizeProperties\");return}}else{if(e.width>P.width||e.height>P.height){n.fireErrorEvent(\"resize width or height is greater than the maxSize width or height\",\"mraid.setResizeProperties\");return}m=(f=e,r.d(\"fitResizeViewOnScreen\"),r.d(\"defaultPosition \"+C.x+\" \"+C.y),r.d(\"offset \"+f.offsetX+\" \"+f.offsetY),d={},d.x=C.x+f.offsetX,d.y=C.y+f.offsetY,d.width=f.width,d.height=f.height,$(\"resizeRect\",d),h={x:0,y:0},h.width=P.width,h.height=P.height,u={x:0,y:0},I(h,d)?(r.d(\"no adjustment necessary\"),u):(d.x<h.x?u.x=h.x-d.x:d.x+d.width>h.x+h.width&&(u.x=h.x+h.width-(d.x+d.width)),r.d(\"adjustments.x \"+u.x),d.y<h.y?u.y=h.y-d.y:d.y+d.height>h.y+h.height&&(u.y=h.y+h.height-(d.y+d.height)),r.d(\"adjustments.y \"+u.y),d.x=C.x+f.offsetX+u.x,d.y=C.y+f.offsetY+u.y,$(\"adjusted resizeRect\",d),u))}for(var p=[\"width\",\"height\",\"offsetX\",\"offsetY\",\"customClosePosition\",\"allowOffscreen\"],E=0;E<p.length;E++){var c=p[E];e.hasOwnProperty(c)&&(O[c]=e[c])}y(\"setResizeProperties?\"+(\"width=\"+O.width+\"&height=\"+O.height+\"&offsetX=\"+(O.offsetX+m.x)+\"&offsetY=\"+(O.offsetY+m.y)+\"&customClosePosition=\"+O.customClosePosition+\"&allowOffscreen=\")+O.allowOffscreen),g=!0},n.storePicture=function(e){r.i(\"mraid.storePicture \"+e),l[n.SUPPORTED_FEATURES.STOREPICTURE]?y(\"storePicture?url=\"+encodeURIComponent(e)):r.e(\"storePicture is not supported\")},n.supports=function(e){r.i(\"mraid.supports \"+e+\" \"+l[e]);var t=l[e];return void 0===t&&(t=!1),t},n.useCustomClose=function(e){r.i(\"mraid.useCustomClose \"+e),m.useCustomClose!==e&&(m.useCustomClose=e,y(\"useCustomClose?useCustomClose=\"+m.useCustomClose))},n.setCurrentPosition=function(e,t,i,o){r.i(\"mraid.setCurrentPosition \"+e+\",\"+t+\",\"+i+\",\"+o);var s={};s.width=v.width,s.height=v.height,r.i(\"previousSize \"+s.width+\",\"+s.height),v.x=e,v.y=t,v.width=i,v.height=o,(i!==s.width||o!==s.height)&&n.fireSizeChangeEvent(i,o)},n.setDefaultPosition=function(e,t,i,n){r.i(\"mraid.setDefaultPosition \"+e+\",\"+t+\",\"+i+\",\"+n),C.x=e,C.y=t,C.width=i,C.height=n},n.setExpandSize=function(e,t){r.i(\"mraid.setExpandSize \"+e+\"x\"+t),m.width=e,m.height=t},n.setMaxSize=function(e,t){r.i(\"mraid.setMaxSize \"+e+\"x\"+t),P.width=e,P.height=t},n.setPlacementType=function(e){r.i(\"mraid.setPlacementType \"+e),u=e},n.setScreenSize=function(e,t){r.i(\"mraid.setScreenSize \"+e+\"x\"+t),w.width=e,w.height=t,c||(m.width=e,m.height=t)},n.setSupports=function(e,t){r.i(\"mraid.setSupports \"+e+\" \"+t),l[e]=t},n.fireErrorEvent=function(e,t){r.i(\"mraid.fireErrorEvent \"+e+\" \"+t),T(n.EVENTS.ERROR,e,t)},n.fireReadyEvent=function(){r.i(\"mraid.fireReadyEvent\"),T(n.EVENTS.READY)},n.fireSizeChangeEvent=function(e,t){r.i(\"mraid.fireSizeChangeEvent \"+e+\"x\"+t),h!==n.STATES.LOADING&&T(n.EVENTS.SIZECHANGE,e,t)},n.fireStateChangeEvent=function(e){r.i(\"mraid.fireStateChangeEvent \"+e),h!==e&&(h=e,T(n.EVENTS.STATECHANGE,h))},n.fireViewableChangeEvent=function(e){r.i(\"mraid.fireViewableChangeEvent \"+e),E!==e&&(E=e,T(n.EVENTS.VIEWABLECHANGE,E))};var S={setExpandProperties:{width:function(e){return!isNaN(e)},height:function(e){return!isNaN(e)},useCustomClose:function(e){return\"boolean\"==typeof e}},setOrientationProperties:{allowOrientationChange:function(e){return\"boolean\"==typeof e},forceOrientation:function(e){return\"string\"==typeof e&&-1!==[\"portrait\",\"landscape\",\"none\"].indexOf(e)}},setResizeProperties:{width:function(e){return!isNaN(e)&&50<=e},height:function(e){return!isNaN(e)&&50<=e},offsetX:function(e){return!isNaN(e)},offsetY:function(e){return!isNaN(e)},customClosePosition:function(e){return\"string\"==typeof e&&-1!==[\"top-left\",\"top-center\",\"top-right\",\"center\",\"bottom-left\",\"bottom-center\",\"bottom-right\"].indexOf(e)},allowOffscreen:function(e){return\"boolean\"==typeof e}}};function I(e,t){return r.d(\"isRectContained\"),$(\"containingRect\",e),$(\"containedRect\",t),t.x>=e.x&&t.x+t.width<=e.x+e.width&&t.y>=e.y&&t.y+t.height<=e.y+e.height}function $(e,t){r.d(e+\" [\"+t.x+\",\"+t.y+\"],[\"+(t.x+t.width)+\",\"+(t.y+t.height)+\"] (\"+t.width+\"x\"+t.height+\")\")}n.dumpListeners=function(){var e=Object.keys(R).length;for(var t in r.i(\"dumping listeners (\"+e+\" events)\"),R){var i=R[t];r.i(\"  \"+t+\" contains \"+i.length+\" listeners\");for(var n=0;n<i.length;n++)r.i(\"    \"+i[n])}},console.log(\"MRAID object loaded\")}();"
                byte[] r2 = r2.getBytes()
                r8.<init>(r2)
                r9.<init>(r1, r0, r8)
            Lad:
                return r9
            Lae:
                android.webkit.WebResourceResponse r8 = super.shouldInterceptRequest(r8, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.h4.h.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (webView == null || str == null) {
                return true;
            }
            return h4.this.I.b(webView, str);
        }
    }

    @Override // com.startapp.l2
    public void a(Bundle bundle) {
        String str;
        c5.a(this.f22201b).a(this.f22203d, new IntentFilter("com.startapp.android.CloseAdActivity"));
        if (bundle != null) {
            if (bundle.containsKey("postrollHtml")) {
                String string = bundle.getString("postrollHtml");
                if (string != null && (str = this.f22216q) != null && str.length() > 0) {
                    this.f22212m = string.replaceAll("startapp_adtag_placeholder", this.f22216q);
                } else {
                    this.f22212m = string;
                }
            }
            this.D = bundle.getBoolean("videoCompletedBroadcastSent", false);
            this.E = bundle.getInt("replayNum");
        }
    }

    @Override // com.startapp.l2
    public final void b(Bundle bundle) {
        String str = this.f22212m;
        if (str != null) {
            bundle.putString("postrollHtml", str);
        }
        bundle.putBoolean("videoCompletedBroadcastSent", this.D);
        bundle.putInt("replayNum", this.E);
    }

    @Override // com.startapp.l2
    public final void c() {
        this.I.e();
    }

    @Override // com.startapp.l2
    public final void d() {
        super.d();
        j6 j6Var = this.H;
        if (j6Var != null) {
            AdSession adSession = j6Var.f22140a;
            if (adSession != null) {
                adSession.finish();
            }
            this.H = null;
        }
        WebView webView = this.f22015x;
        WeakHashMap weakHashMap = o9.f22359a;
        new Handler(Looper.getMainLooper()).postDelayed(new n9(webView), 1000L);
    }

    @Override // com.startapp.l2
    public void e() {
        this.J = false;
        this.K = true;
        this.I.f();
        s7 s7Var = this.B;
        if (s7Var != null) {
            s7Var.a();
        }
        WebView webView = this.f22015x;
        if (webView != null) {
            y.c(webView);
        }
    }

    @Override // com.startapp.l2
    public void f() {
        this.J = true;
        this.K = false;
        Ad ad = this.f22211l;
        if (ad instanceof InterstitialAd ? ((InterstitialAd) ad).c() : false) {
            a();
        } else {
            Object obj = StartAppSDKInternal.C;
            StartAppSDKInternal.c.f22944a.f22923o = true;
            WebView webView = this.f22015x;
            if (webView == null) {
                RelativeLayout relativeLayout = new RelativeLayout(this.f22201b);
                this.f22016y = relativeLayout;
                relativeLayout.setContentDescription("StartApp Ad");
                this.f22016y.setId(1475346432);
                this.f22201b.setContentView(this.f22016y);
                try {
                    this.f22015x = com.startapp.sdk.components.a.a(this.f22201b).f23225a.a().c();
                    this.A = SystemClock.uptimeMillis();
                    this.f22015x.setBackgroundColor(-16777216);
                    this.f22201b.getWindow().getDecorView().findViewById(16908290).setBackgroundColor(7829367);
                    this.f22015x.setVerticalScrollBarEnabled(false);
                    this.f22015x.setHorizontalScrollBarEnabled(false);
                    this.f22015x.getSettings().setJavaScriptEnabled(true);
                    y.a(this.f22015x);
                    if (this.f22222w) {
                        y.b(this.f22015x);
                    }
                    this.f22015x.setOnLongClickListener(new d());
                    this.f22015x.setLongClickable(false);
                    this.f22015x.addJavascriptInterface(l(), "startappwall");
                    a(this.f22015x);
                    this.f22015x.setWebViewClient(new h());
                    this.f22015x.setWebChromeClient(new i4());
                    WebView webView2 = this.f22015x;
                    String str = this.f22212m;
                    WeakHashMap weakHashMap = o9.f22359a;
                    webView2.loadDataWithBaseURL(MetaData.f23158k.q(), str, "text/html", cc.N, null);
                    this.F = com.ironsource.mediationsdk.metadata.a.f18924g.equals(o9.a(this.f22212m, "@jsTag@", "@jsTag@"));
                    this.f22016y.addView(this.f22015x, new RelativeLayout.LayoutParams(-1, -1));
                    RelativeLayout relativeLayout2 = this.f22016y;
                    AdInformationObject adInformationObject = new AdInformationObject(this.f22201b, AdInformationObject.Size.LARGE, this.f22213n, this.f22215p, this.f22211l.getConsentData(), this.f22211l.getRequestUrl(), this.f22211l.getDParam());
                    this.f22202c = adInformationObject;
                    adInformationObject.a(relativeLayout2);
                } catch (Throwable th) {
                    l3.a(th);
                    a();
                }
            } else {
                y.d(webView);
                s7 s7Var = this.B;
                if (s7Var != null) {
                    s7Var.c();
                }
            }
        }
        this.I.g();
    }

    public void i() {
        String str;
        String[] strArr = this.f22204e;
        if (strArr == null || strArr.length <= 0 || (str = strArr[0]) == null) {
            return;
        }
        com.startapp.sdk.adsbase.a.a(this.f22201b, str, new CloseTrackingParams(this.f22216q, k()));
    }

    public final void j() {
        try {
            RelativeLayout relativeLayout = new RelativeLayout(this.f22201b);
            ImageButton imageButton = new ImageButton(this.f22201b);
            this.f22017z = imageButton;
            imageButton.setBackgroundColor(0);
            this.f22017z.setOnClickListener(this);
            int a10 = j9.a(this.f22201b, 50);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams.addRule(13);
            relativeLayout.addView(this.f22017z, layoutParams);
            this.I.a(relativeLayout);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a10, a10);
            layoutParams2.addRule(10);
            layoutParams2.addRule(11);
            this.f22016y.addView(relativeLayout, layoutParams2);
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    public long k() {
        return (SystemClock.uptimeMillis() - this.A) / 1000;
    }

    public p4 l() {
        Activity activity = this.f22201b;
        a aVar = this.M;
        b bVar = this.N;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f22216q, k());
        boolean[] zArr = this.f22206g;
        return new p4(activity, aVar, aVar, bVar, closeTrackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    public long m() {
        Long l10 = this.f22217r;
        if (l10 != null) {
            return TimeUnit.SECONDS.toMillis(l10.longValue());
        }
        return TimeUnit.SECONDS.toMillis(MetaData.f23158k.s());
    }

    public TrackingParams n() {
        TrackingParams trackingParams = new TrackingParams(this.f22216q);
        g0 g0Var = this.I;
        g0Var.getClass();
        trackingParams.a(g0Var instanceof com.startapp.sdk.ads.fullpagemodes.b);
        return trackingParams;
    }

    public boolean o() {
        return this.I.b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.I.d();
    }

    public void p() {
        s7 s7Var = this.B;
        if (s7Var != null) {
            s7Var.c();
        }
    }

    public void q() {
        a(this.f22017z);
        this.G = SystemClock.uptimeMillis();
    }

    public void r() {
    }

    public final void s() {
        String str;
        String[] strArr;
        if (o() && !this.D && this.E == 0) {
            this.D = true;
            Intent intent = new Intent("com.startapp.android.OnVideoCompleted");
            try {
                strArr = this.f22208i;
            } catch (Throwable th) {
                l3.a(th);
            }
            if (strArr != null && strArr.length > 0) {
                str = com.startapp.sdk.adsbase.a.a(strArr[0], (String) null);
                intent.putExtra("dParam", str);
                c5.a(this.f22201b).a(intent);
                r();
            }
            str = "";
            intent.putExtra("dParam", str);
            c5.a(this.f22201b).a(intent);
            r();
        }
    }

    public final void t() {
        try {
            if (this.f22017z != null) {
                this.f22017z.setImageDrawable(c1.a(this.f22201b.getResources()));
                this.f22017z.setScaleType(ImageView.ScaleType.FIT_CENTER);
                this.f22017z.setVisibility(0);
            }
        } catch (Throwable th) {
            l3.a(th);
        }
    }

    /* compiled from: Sta */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    public class i extends g0 {
        public i() {
        }

        @Override // com.startapp.g0
        public final boolean a(String str) {
            return !h4.this.F && str.contains("index=");
        }

        @Override // com.startapp.g0
        public final boolean b(WebView webView, String str) {
            String str2;
            String[] strArr;
            h4 h4Var = h4.this;
            h4Var.getClass();
            if (o9.c(webView.getContext(), str)) {
                return true;
            }
            if (!h4Var.C) {
                l3 l3Var = new l3(m3.f22275e);
                l3Var.f22228d = "fake_click";
                try {
                    strArr = h4Var.f22208i;
                } catch (Throwable th) {
                    l3.a(th);
                }
                if (strArr != null && strArr.length > 0) {
                    str2 = com.startapp.sdk.adsbase.a.a(strArr[0], (String) null);
                    l3Var.f22231g = str2;
                    l3Var.f22229e = "jsTag=" + h4Var.F;
                    l3Var.a();
                }
                str2 = "";
                l3Var.f22231g = str2;
                l3Var.f22229e = "jsTag=" + h4Var.F;
                l3Var.a();
            }
            if (!h4Var.F || h4Var.C) {
                return h4Var.a(str, false);
            }
            return false;
        }

        @Override // com.startapp.g0
        public final void a(WebView webView, String str) {
            h4 h4Var = h4.this;
            h4Var.a("gClientInterface.setMode", h4Var.f22207h);
            h4Var.a("enableScheme", "externalLinks");
            h4Var.q();
        }
    }

    @Override // com.startapp.l2
    public boolean b() {
        if (this.I.c()) {
            return true;
        }
        if (this.f22221v == null || SystemClock.uptimeMillis() - this.G >= this.f22221v.longValue()) {
            i();
            Object obj = StartAppSDKInternal.C;
            StartAppSDKInternal.c.f22944a.f22923o = false;
            s7 s7Var = this.B;
            if (s7Var != null) {
                s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
            }
            return false;
        }
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void a(WebView webView) {
        this.C = false;
        webView.setOnTouchListener(new e());
        webView.setBackgroundColor(0);
    }

    public final void a(String str, Object... objArr) {
        o9.a(this.f22015x, true, str, objArr);
    }

    public final void b(String str, int i10, boolean z10) {
        boolean m7 = MetaData.f23158k.m();
        Activity activity = this.f22201b;
        String[] strArr = this.f22209j;
        String[] strArr2 = i10 < strArr.length ? new String[]{strArr[i10]} : null;
        String[] strArr3 = this.f22210k;
        String str2 = i10 < strArr3.length ? strArr3[i10] : null;
        CloseTrackingParams closeTrackingParams = new CloseTrackingParams(this.f22216q, k());
        long z11 = AdsCommonMetaData.f22889h.z();
        long y10 = AdsCommonMetaData.f22889h.y();
        boolean[] zArr = this.f22206g;
        boolean z12 = (zArr == null || i10 < 0 || i10 >= zArr.length) ? true : zArr[i10];
        Boolean[] boolArr = this.f22218s;
        com.startapp.sdk.adsbase.a.a(activity, str, strArr2, str2, closeTrackingParams, z11, y10, z12, (boolArr == null || i10 < 0 || i10 >= boolArr.length) ? null : boolArr[i10], z10, m7 ? new f() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0035 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            com.startapp.g0 r0 = r5.I
            r0.a()
            com.startapp.s7 r0 = r5.B
            if (r0 == 0) goto Ld
            r1 = 0
            r0.a(r1, r1)
        Ld:
            com.startapp.sdk.adsbase.Ad r0 = r5.f22211l
            android.app.Activity r1 = r5.f22201b
            android.content.Context r1 = com.startapp.f0.a(r1)
            if (r1 == 0) goto L18
            goto L1a
        L18:
            android.app.Activity r1 = r5.f22201b
        L1a:
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r2 = r5.f22213n
            boolean r1 = com.startapp.sdk.adsbase.a.a(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            java.util.WeakHashMap r1 = com.startapp.o9.f22359a
            boolean r0 = r0 instanceof com.startapp.sdk.ads.splash.SplashAd
            if (r0 != 0) goto L2c
            r0 = r2
            goto L2d
        L2c:
            r0 = r3
        L2d:
            com.startapp.g0 r1 = r5.I
            boolean r1 = r1.a(r6)
            if (r1 == 0) goto L60
            java.lang.String r1 = "&"
            java.lang.String[] r1 = r6.split(r1)     // Catch: java.lang.Throwable -> L5b
            int r4 = r1.length     // Catch: java.lang.Throwable -> L5b
            int r4 = r4 - r2
            r1 = r1[r4]     // Catch: java.lang.Throwable -> L5b
            java.lang.String r4 = "="
            java.lang.String[] r1 = r1.split(r4)     // Catch: java.lang.Throwable -> L5b
            r1 = r1[r2]     // Catch: java.lang.Throwable -> L5b
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L5b
            boolean[] r4 = r5.f22205f     // Catch: java.lang.Throwable -> L5b
            boolean r4 = r4[r1]     // Catch: java.lang.Throwable -> L5b
            if (r4 == 0) goto L57
            if (r0 != 0) goto L57
            r5.b(r6, r1, r7)     // Catch: java.lang.Throwable -> L5b
            goto L6f
        L57:
            r5.a(r6, r1, r7)     // Catch: java.lang.Throwable -> L5b
            goto L6f
        L5b:
            r6 = move-exception
            com.startapp.l3.a(r6)
            return r3
        L60:
            boolean[] r1 = r5.f22205f
            boolean r1 = r1[r3]
            if (r1 == 0) goto L6c
            if (r0 != 0) goto L6c
            r5.b(r6, r3, r7)
            goto L6f
        L6c:
            r5.a(r6, r3, r7)
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h4.a(java.lang.String, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r10, int r11, boolean r12) {
        /*
            r9 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.startapp.android.OnClickCallback"
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            java.lang.String[] r3 = r9.f22208i     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L1b
            int r4 = r3.length     // Catch: java.lang.Throwable -> L17
            if (r4 <= 0) goto L1b
            r3 = r3[r2]     // Catch: java.lang.Throwable -> L17
            java.lang.String r3 = com.startapp.sdk.adsbase.a.a(r3, r1)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L17:
            r3 = move-exception
            com.startapp.l3.a(r3)
        L1b:
            java.lang.String r3 = ""
        L1d:
            java.lang.String r4 = "dParam"
            r0.putExtra(r4, r3)
            android.app.Activity r3 = r9.f22201b
            com.startapp.c5 r3 = com.startapp.c5.a(r3)
            r3.a(r0)
            android.app.Activity r0 = r9.f22201b
            android.content.Context r0 = com.startapp.f0.a(r0)
            if (r0 == 0) goto L34
            goto L36
        L34:
            android.app.Activity r0 = r9.f22201b
        L36:
            com.startapp.sdk.adsbase.model.AdPreferences$Placement r3 = r9.f22213n
            boolean r0 = com.startapp.sdk.adsbase.a.a(r0, r3)
            android.app.Activity r3 = r9.f22201b
            java.lang.String[] r4 = r9.f22209j
            int r5 = r4.length
            r6 = 1
            if (r11 >= r5) goto L4a
            java.lang.String[] r1 = new java.lang.String[r6]
            r4 = r4[r11]
            r1[r2] = r4
        L4a:
            r5 = r1
            com.startapp.sdk.adsbase.commontracking.CloseTrackingParams r1 = new com.startapp.sdk.adsbase.commontracking.CloseTrackingParams
            long r7 = r9.k()
            java.lang.String r4 = r9.f22216q
            r1.<init>(r4, r7)
            boolean[] r4 = r9.f22206g
            if (r4 == 0) goto L62
            if (r11 < 0) goto L62
            int r7 = r4.length
            if (r11 >= r7) goto L62
            boolean r11 = r4[r11]
            goto L63
        L62:
            r11 = r6
        L63:
            if (r11 == 0) goto L69
            if (r0 != 0) goto L69
            r7 = r6
            goto L6a
        L69:
            r7 = r2
        L6a:
            r4 = r10
            r6 = r1
            r8 = r12
            com.startapp.sdk.adsbase.a.a(r3, r4, r5, r6, r7, r8)
            com.startapp.sdk.adsbase.remoteconfig.MetaData r10 = com.startapp.sdk.adsbase.remoteconfig.MetaData.f23158k
            boolean r10 = r10.m()
            if (r10 == 0) goto L7b
            r9.a()
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.h4.a(java.lang.String, int, boolean):void");
    }

    @Override // com.startapp.l2
    public void a() {
        super.a();
        Object obj = StartAppSDKInternal.C;
        StartAppSDKInternal.c.f22944a.f22923o = false;
        s7 s7Var = this.B;
        if (s7Var != null) {
            s7Var.a("AD_CLOSED_TOO_QUICKLY", null);
        }
        this.f22201b.runOnUiThread(new g());
    }

    public void a(ImageButton imageButton) {
        AdInformationView adInformationView;
        if (MetaData.f23158k.X()) {
            j6 j6Var = new j6(this.f22015x);
            this.H = j6Var;
            if (j6Var.f22140a != null) {
                try {
                    AdInformationObject adInformationObject = this.f22202c;
                    if (adInformationObject != null && (adInformationView = adInformationObject.f22957b) != null) {
                        j6Var.a(adInformationView, FriendlyObstructionPurpose.OTHER);
                    }
                    if (imageButton != null) {
                        this.H.a(imageButton, FriendlyObstructionPurpose.CLOSE_AD);
                    }
                } catch (RuntimeException unused) {
                }
                j6 j6Var2 = this.H;
                WebView webView = this.f22015x;
                AdSession adSession = j6Var2.f22140a;
                if (adSession != null) {
                    adSession.registerAdView(webView);
                }
                AdSession adSession2 = this.H.f22140a;
                if (adSession2 != null) {
                    adSession2.start();
                }
                j6 j6Var3 = this.H;
                if (j6Var3.f22141b != null && j6Var3.f22144e.compareAndSet(false, true)) {
                    j6Var3.f22141b.loaded();
                }
                j6 j6Var4 = this.H;
                if (j6Var4.f22141b == null || !j6Var4.f22143d.compareAndSet(false, true)) {
                    return;
                }
                j6Var4.f22141b.impressionOccurred();
            }
        }
    }
}

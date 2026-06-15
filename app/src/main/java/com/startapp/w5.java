package com.startapp;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.sdk.controller.f;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class w5 extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public final l5 f23507a;

    /* renamed from: b  reason: collision with root package name */
    public final m5 f23508b;

    public w5(l5 l5Var, m5 m5Var) {
        this.f23507a = l5Var;
        this.f23508b = m5Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        m5 m5Var;
        if (webView == null || str == null || (m5Var = this.f23508b) == null) {
            return;
        }
        m5Var.onPageFinished(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
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
            if (r3 == 0) goto L7c
            com.startapp.m5 r9 = r7.f23508b
            if (r9 == 0) goto L26
            r9.onMraidDetected()
        L26:
            android.content.Context r8 = r8.getContext()
            com.startapp.sdk.components.a r8 = com.startapp.sdk.components.a.a(r8)
            com.startapp.t4<com.startapp.u5> r8 = r8.Q
            java.lang.Object r8 = r8.a()
            com.startapp.u5 r8 = (com.startapp.u5) r8
            android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse     // Catch: java.io.FileNotFoundException -> L4a
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L4a
            java.io.File r4 = new java.io.File     // Catch: java.io.FileNotFoundException -> L4a
            java.io.File r5 = r8.f23440b     // Catch: java.io.FileNotFoundException -> L4a
            java.lang.String r6 = "24e22423049bbf51"
            r4.<init>(r5, r6)     // Catch: java.io.FileNotFoundException -> L4a
            r3.<init>(r4)     // Catch: java.io.FileNotFoundException -> L4a
            r9.<init>(r1, r0, r3)     // Catch: java.io.FileNotFoundException -> L4a
            goto L7b
        L4a:
            r9 = move-exception
            r3 = 2
            com.startapp.j2<com.startapp.sdk.adsbase.remoteconfig.MraidMetadata> r8 = r8.f23441c
            java.lang.Object r8 = r8.call()
            com.startapp.sdk.adsbase.remoteconfig.MraidMetadata r8 = (com.startapp.sdk.adsbase.remoteconfig.MraidMetadata) r8
            if (r8 == 0) goto L5b
            com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig r8 = r8.b()
            goto L5c
        L5b:
            r8 = 0
        L5c:
            if (r8 == 0) goto L66
            long r3 = (long) r3
            boolean r8 = r8.a(r3)
            if (r8 == 0) goto L66
            r2 = 1
        L66:
            if (r2 == 0) goto L6b
            com.startapp.l3.a(r9)
        L6b:
            android.webkit.WebResourceResponse r9 = new android.webkit.WebResourceResponse
            java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream
            java.lang.String r2 = "!function(){console.log(\"MRAID object loading...\");var e=window.top.mraid&&\"object\"==typeof window.top.mraid?window.top.mraid:null;if(e){window.mraid=e,console.log(\"MRAID object already exists\");return}var t={DEBUG:0,INFO:1,WARNING:2,ERROR:3,NONE:4},i=t.DEBUG,r={};r.d=function(e){i<=t.DEBUG&&console.log(\"(D-mraid.js) \"+e)},r.i=function(e){i<=t.INFO&&console.log(\"(I-mraid.js) \"+e)},r.w=function(e){i<=t.WARNING&&console.log(\"(W-mraid.js) \"+e)},r.e=function(e){i<=t.ERROR&&console.log(\"(E-mraid.js) \"+e)};var n={};window.mraid=n,window.top.mraid=n,n._sioVersion=\"0.1\";var o=n.STATES={LOADING:\"loading\",DEFAULT:\"default\",EXPANDED:\"expanded\",RESIZED:\"resized\",HIDDEN:\"hidden\"},s=n.PLACEMENT_TYPES={INLINE:\"inline\",INTERSTITIAL:\"interstitial\"},a=n.RESIZE_PROPERTIES_CUSTOM_CLOSE_POSITION={TOP_LEFT:\"top-left\",TOP_CENTER:\"top-center\",TOP_RIGHT:\"top-right\",CENTER:\"center\",BOTTOM_LEFT:\"bottom-left\",BOTTOM_CENTER:\"bottom-center\",BOTTOM_RIGHT:\"bottom-right\"},f=n.ORIENTATION_PROPERTIES_FORCE_ORIENTATION={PORTRAIT:\"portrait\",LANDSCAPE:\"landscape\",NONE:\"none\"},d=n.EVENTS={ERROR:\"error\",READY:\"ready\",SIZECHANGE:\"sizeChange\",STATECHANGE:\"stateChange\",VIEWABLECHANGE:\"viewableChange\"};n.SUPPORTED_FEATURES={SMS:\"sms\",TEL:\"tel\",CALENDAR:\"calendar\",STOREPICTURE:\"storePicture\",INLINEVIDEO:\"inlineVideo\"};var h=o.LOADING,u=s.INLINE,l={},E=!1,c=!1,g=!1,m={width:0,height:0,useCustomClose:!1,isModal:!0},p={allowOrientationChange:!0,forceOrientation:f.NONE},O={width:0,height:0,customClosePosition:a.TOP_RIGHT,offsetX:0,offsetY:0,allowOffscreen:!0},v={x:0,y:0,width:0,height:0},C={x:0,y:0,width:0,height:0},P={width:0,height:0},w={width:0,height:0},R={};function y(e){var t=document.createElement(\"IFRAME\");t.setAttribute(\"src\",\"mraid://\"+e),document.documentElement.appendChild(t),t.parentNode.removeChild(t),t=null}function T(e){var t=Array.prototype.slice.call(arguments);t.shift(),r.i(\"fireEvent \"+e+\" [\"+t.toString()+\"]\");var i=R[e];if(i){var n=(i=i.slice()).length;r.i(n+\" listener(s) found\");for(var o=0;o<n;o++)i[o].apply(null,t)}else r.i(\"no listeners found\")}function x(e,t){for(var i in t)if(t[i]===e)return!0;return!1}function N(e,t){var i=!0,r=S[t];for(var o in e){var s=r[o],a=e[o];s&&!s(a)&&(n.fireErrorEvent(\"Value of property \"+o+\" (\"+a+\") is invalid\",\"mraid.\"+t),i=!1)}return i}n.addEventListener=function(e,t){if(r.i(\"mraid.addEventListener \"+e+\": \"+String(t)),!e||!t){n.fireErrorEvent(\"Both event and listener are required.\",\"addEventListener\");return}if(!x(e,d)){n.fireErrorEvent(\"Unknown MRAID event: \"+e,\"addEventListener\");return}for(var i=R[e]=R[e]||[],o=0;o<i.length;o++){var s=String(t),a=String(i[o]);if(t===i[o]||s===a){r.i(\"listener \"+s+\" is already registered for event \"+e);return}}i.push(t)},n.createCalendarEvent=function(e){r.i(\"mraid.createCalendarEvent with \"+e),l[n.SUPPORTED_FEATURES.CALENDAR]?y(\"createCalendarEvent?eventJSON=\"+JSON.stringify(e)):r.e(\"createCalendarEvent is not supported\")},n.close=function(){r.i(\"mraid.close\"),h!==o.LOADING&&(h!==o.DEFAULT||u!==s.INLINE)&&h!==o.HIDDEN&&y(\"close\")},n.expand=function(e){void 0===e?r.i(\"mraid.expand (1-part)\"):r.i(\"mraid.expand \"+e),u===s.INLINE&&(h===o.DEFAULT||h===o.RESIZED)&&(void 0===e?y(\"expand\"):y(\"expand?url=\"+encodeURIComponent(e)))},n.getCurrentPosition=function(){return r.i(\"mraid.getCurrentPosition\"),v},n.getDefaultPosition=function(){return r.i(\"mraid.getDefaultPosition\"),C},n.getExpandProperties=function(){return r.i(\"mraid.getExpandProperties\"),m},n.getMaxSize=function(){return r.i(\"mraid.getMaxSize\"),P},n.getOrientationProperties=function(){return r.i(\"mraid.getOrientationProperties\"),p},n.getPlacementType=function(){return r.i(\"mraid.getPlacementType\"),u},n.getResizeProperties=function(){return r.i(\"mraid.getResizeProperties\"),O},n.getScreenSize=function(){return r.i(\"mraid.getScreenSize\"),w},n.getState=function(){return r.i(\"mraid.getState\"),h},n.getVersion=function(){return r.i(\"mraid.getVersion\"),\"2.0\"},n.isViewable=function(){return r.i(\"mraid.isViewable\"),E},n.open=function(e){r.i(\"mraid.open \"+e),y(\"open?url=\"+encodeURIComponent(e))},n.playVideo=function(e){r.i(\"mraid.playVideo \"+e),y(\"playVideo?url=\"+encodeURIComponent(e))},n.removeEventListener=function(e,t){if(r.i(\"mraid.removeEventListener \"+e+\" : \"+String(t)),!e){n.fireErrorEvent(\"Event is required.\",\"removeEventListener\");return}if(!x(e,d)){n.fireErrorEvent(\"Unknown MRAID event: \"+e,\"removeEventListener\");return}if(R.hasOwnProperty(e)){if(t){for(var i=R[e],o=i.length,s=0;s<o;s++){var a=i[s],f=String(t),h=String(a);if(t===a||f===h){i.splice(s,1);break}}s===o&&r.i(\"listener \"+f+\" not found for event \"+e),0===i.length&&delete R[e]}else delete R[e]}else r.i(\"no listeners registered for event \"+e)},n.resize=function(){if(r.i(\"mraid.resize\"),u!==s.INTERSTITIAL&&h!==o.LOADING&&h!==o.HIDDEN){if(h===o.EXPANDED){n.fireErrorEvent(\"mraid.resize called when ad is in expanded state\",\"mraid.resize\");return}if(!g){n.fireErrorEvent(\"mraid.resize is not ready to be called\",\"mraid.resize\");return}y(\"resize\")}},n.setExpandProperties=function(e){if(r.i(\"mraid.setExpandProperties\"),!N(e,\"setExpandProperties\")){r.e(\"failed validation\");return}for(var t=m.useCustomClose,i=[\"width\",\"height\",\"useCustomClose\"],n=0;n<i.length;n++){var o=i[n];e.hasOwnProperty(o)&&(m[o]=e[o])}m.useCustomClose!==t&&y(\"useCustomClose?useCustomClose=\"+m.useCustomClose),c=!0},n.setOrientationProperties=function(e){if(r.i(\"mraid.setOrientationProperties\"),!N(e,\"setOrientationProperties\")){r.e(\"failed validation\");return}var t={};t.allowOrientationChange=p.allowOrientationChange,t.forceOrientation=p.forceOrientation;for(var i=[\"allowOrientationChange\",\"forceOrientation\"],o=0;o<i.length;o++){var s=i[o];e.hasOwnProperty(s)&&(t[s]=e[s])}if(t.allowOrientationChange&&t.forceOrientation!==n.ORIENTATION_PROPERTIES_FORCE_ORIENTATION.NONE){n.fireErrorEvent(\"allowOrientationChange is true but forceOrientation is \"+t.forceOrientation,\"setOrientationProperties\");return}p.allowOrientationChange=t.allowOrientationChange,p.forceOrientation=t.forceOrientation,y(\"setOrientationProperties?\"+(\"allowOrientationChange=\"+p.allowOrientationChange+\"&forceOrientation=\")+p.forceOrientation)},n.setResizeProperties=function(e){r.i(\"mraid.setResizeProperties\"),g=!1;for(var t,i,o,s,a,f,d,h,u,l=[\"width\",\"height\",\"offsetX\",\"offsetY\"],E=0;E<l.length;E++){var c=l[E];if(!e.hasOwnProperty(c)){n.fireErrorEvent(\"required property \"+c+\" is missing\",\"mraid.setResizeProperties\");return}}if(!N(e,\"setResizeProperties\")){n.fireErrorEvent(\"failed validation\",\"mraid.setResizeProperties\");return}var m={x:0,y:0};if(e.hasOwnProperty(\"allowOffscreen\")?e.allowOffscreen:O.allowOffscreen){if(t=e,r.d(\"isCloseRegionOnScreen\"),r.d(\"defaultPosition \"+C.x+\" \"+C.y),r.d(\"offset \"+t.offsetX+\" \"+t.offsetY),i={},i.x=C.x+t.offsetX,i.y=C.y+t.offsetY,i.width=t.width,i.height=t.height,$(\"resizeRect\",i),o=t.hasOwnProperty(\"customClosePosition\")?t.customClosePosition:O.customClosePosition,r.d(\"customClosePosition \"+o),s={width:50,height:50},-1!==o.search(\"left\")?s.x=i.x:-1!==o.search(\"center\")?s.x=i.x+i.width/2-25:-1!==o.search(\"right\")&&(s.x=i.x+i.width-50),-1!==o.search(\"top\")?s.y=i.y:\"center\"===o?s.y=i.y+i.height/2-25:-1!==o.search(\"bottom\")&&(s.y=i.y+i.height-50),a={x:0,y:0},a.width=P.width,a.height=P.height,!I(a,s)){n.fireErrorEvent(\"close event region will not appear entirely onscreen\",\"mraid.setResizeProperties\");return}}else{if(e.width>P.width||e.height>P.height){n.fireErrorEvent(\"resize width or height is greater than the maxSize width or height\",\"mraid.setResizeProperties\");return}m=(f=e,r.d(\"fitResizeViewOnScreen\"),r.d(\"defaultPosition \"+C.x+\" \"+C.y),r.d(\"offset \"+f.offsetX+\" \"+f.offsetY),d={},d.x=C.x+f.offsetX,d.y=C.y+f.offsetY,d.width=f.width,d.height=f.height,$(\"resizeRect\",d),h={x:0,y:0},h.width=P.width,h.height=P.height,u={x:0,y:0},I(h,d)?(r.d(\"no adjustment necessary\"),u):(d.x<h.x?u.x=h.x-d.x:d.x+d.width>h.x+h.width&&(u.x=h.x+h.width-(d.x+d.width)),r.d(\"adjustments.x \"+u.x),d.y<h.y?u.y=h.y-d.y:d.y+d.height>h.y+h.height&&(u.y=h.y+h.height-(d.y+d.height)),r.d(\"adjustments.y \"+u.y),d.x=C.x+f.offsetX+u.x,d.y=C.y+f.offsetY+u.y,$(\"adjusted resizeRect\",d),u))}for(var p=[\"width\",\"height\",\"offsetX\",\"offsetY\",\"customClosePosition\",\"allowOffscreen\"],E=0;E<p.length;E++){var c=p[E];e.hasOwnProperty(c)&&(O[c]=e[c])}y(\"setResizeProperties?\"+(\"width=\"+O.width+\"&height=\"+O.height+\"&offsetX=\"+(O.offsetX+m.x)+\"&offsetY=\"+(O.offsetY+m.y)+\"&customClosePosition=\"+O.customClosePosition+\"&allowOffscreen=\")+O.allowOffscreen),g=!0},n.storePicture=function(e){r.i(\"mraid.storePicture \"+e),l[n.SUPPORTED_FEATURES.STOREPICTURE]?y(\"storePicture?url=\"+encodeURIComponent(e)):r.e(\"storePicture is not supported\")},n.supports=function(e){r.i(\"mraid.supports \"+e+\" \"+l[e]);var t=l[e];return void 0===t&&(t=!1),t},n.useCustomClose=function(e){r.i(\"mraid.useCustomClose \"+e),m.useCustomClose!==e&&(m.useCustomClose=e,y(\"useCustomClose?useCustomClose=\"+m.useCustomClose))},n.setCurrentPosition=function(e,t,i,o){r.i(\"mraid.setCurrentPosition \"+e+\",\"+t+\",\"+i+\",\"+o);var s={};s.width=v.width,s.height=v.height,r.i(\"previousSize \"+s.width+\",\"+s.height),v.x=e,v.y=t,v.width=i,v.height=o,(i!==s.width||o!==s.height)&&n.fireSizeChangeEvent(i,o)},n.setDefaultPosition=function(e,t,i,n){r.i(\"mraid.setDefaultPosition \"+e+\",\"+t+\",\"+i+\",\"+n),C.x=e,C.y=t,C.width=i,C.height=n},n.setExpandSize=function(e,t){r.i(\"mraid.setExpandSize \"+e+\"x\"+t),m.width=e,m.height=t},n.setMaxSize=function(e,t){r.i(\"mraid.setMaxSize \"+e+\"x\"+t),P.width=e,P.height=t},n.setPlacementType=function(e){r.i(\"mraid.setPlacementType \"+e),u=e},n.setScreenSize=function(e,t){r.i(\"mraid.setScreenSize \"+e+\"x\"+t),w.width=e,w.height=t,c||(m.width=e,m.height=t)},n.setSupports=function(e,t){r.i(\"mraid.setSupports \"+e+\" \"+t),l[e]=t},n.fireErrorEvent=function(e,t){r.i(\"mraid.fireErrorEvent \"+e+\" \"+t),T(n.EVENTS.ERROR,e,t)},n.fireReadyEvent=function(){r.i(\"mraid.fireReadyEvent\"),T(n.EVENTS.READY)},n.fireSizeChangeEvent=function(e,t){r.i(\"mraid.fireSizeChangeEvent \"+e+\"x\"+t),h!==n.STATES.LOADING&&T(n.EVENTS.SIZECHANGE,e,t)},n.fireStateChangeEvent=function(e){r.i(\"mraid.fireStateChangeEvent \"+e),h!==e&&(h=e,T(n.EVENTS.STATECHANGE,h))},n.fireViewableChangeEvent=function(e){r.i(\"mraid.fireViewableChangeEvent \"+e),E!==e&&(E=e,T(n.EVENTS.VIEWABLECHANGE,E))};var S={setExpandProperties:{width:function(e){return!isNaN(e)},height:function(e){return!isNaN(e)},useCustomClose:function(e){return\"boolean\"==typeof e}},setOrientationProperties:{allowOrientationChange:function(e){return\"boolean\"==typeof e},forceOrientation:function(e){return\"string\"==typeof e&&-1!==[\"portrait\",\"landscape\",\"none\"].indexOf(e)}},setResizeProperties:{width:function(e){return!isNaN(e)&&50<=e},height:function(e){return!isNaN(e)&&50<=e},offsetX:function(e){return!isNaN(e)},offsetY:function(e){return!isNaN(e)},customClosePosition:function(e){return\"string\"==typeof e&&-1!==[\"top-left\",\"top-center\",\"top-right\",\"center\",\"bottom-left\",\"bottom-center\",\"bottom-right\"].indexOf(e)},allowOffscreen:function(e){return\"boolean\"==typeof e}}};function I(e,t){return r.d(\"isRectContained\"),$(\"containingRect\",e),$(\"containedRect\",t),t.x>=e.x&&t.x+t.width<=e.x+e.width&&t.y>=e.y&&t.y+t.height<=e.y+e.height}function $(e,t){r.d(e+\" [\"+t.x+\",\"+t.y+\"],[\"+(t.x+t.width)+\",\"+(t.y+t.height)+\"] (\"+t.width+\"x\"+t.height+\")\")}n.dumpListeners=function(){var e=Object.keys(R).length;for(var t in r.i(\"dumping listeners (\"+e+\" events)\"),R){var i=R[t];r.i(\"  \"+t+\" contains \"+i.length+\" listeners\");for(var n=0;n<i.length;n++)r.i(\"    \"+i[n])}},console.log(\"MRAID object loaded\")}();"
            byte[] r2 = r2.getBytes()
            r8.<init>(r2)
            r9.<init>(r1, r0, r8)
        L7b:
            return r9
        L7c:
            android.webkit.WebResourceResponse r8 = super.shouldInterceptRequest(r8, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.w5.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        if (webView == null || str == null || o9.c(webView.getContext(), str)) {
            return true;
        }
        if (str.startsWith("mraid://")) {
            String[] strArr = {"close", "resize"};
            String[] strArr2 = {"createCalendarEvent", "expand", "open", "playVideo", "storePicture", "useCustomClose"};
            String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
            try {
                HashMap a10 = s5.a(str);
                if (a10 != null && (str2 = (String) a10.get(f.b.f20343g)) != null) {
                    if (Arrays.asList(strArr).contains(str2)) {
                        l5.class.getDeclaredMethod(str2, new Class[0]).invoke(this.f23507a, new Object[0]);
                        return true;
                    } else if (Arrays.asList(strArr2).contains(str2)) {
                        Method declaredMethod = l5.class.getDeclaredMethod(str2, String.class);
                        char c10 = 65535;
                        int hashCode = str2.hashCode();
                        String str3 = "useCustomClose";
                        if (hashCode != -733616544) {
                            if (hashCode == 1614272768 && str2.equals("useCustomClose")) {
                                c10 = 1;
                            }
                        } else if (str2.equals("createCalendarEvent")) {
                            c10 = 0;
                        }
                        if (c10 == 0) {
                            str3 = "eventJSON";
                        } else if (c10 != 1) {
                            str3 = "url";
                        }
                        declaredMethod.invoke(this.f23507a, (String) a10.get(str3));
                        return true;
                    } else if (Arrays.asList(strArr3).contains(str2)) {
                        l5.class.getDeclaredMethod(str2, Map.class).invoke(this.f23507a, a10);
                        return true;
                    } else {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
        return this.f23507a.open(str);
    }
}

package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.b8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.h7;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.o9;
import com.ironsource.oj;
import com.ironsource.zb;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class l {

    /* renamed from: a  reason: collision with root package name */
    public static final String f18870a = "BANNER";

    /* renamed from: b  reason: collision with root package name */
    public static final String f18871b = "LARGE";

    /* renamed from: c  reason: collision with root package name */
    public static final String f18872c = "RECTANGLE";

    /* renamed from: d  reason: collision with root package name */
    public static final String f18873d = "LEADERBOARD";

    /* renamed from: e  reason: collision with root package name */
    public static final String f18874e = "SMART";

    /* renamed from: f  reason: collision with root package name */
    public static final String f18875f = "CUSTOM";

    /* renamed from: g  reason: collision with root package name */
    public static final String f18876g = "MEDIUM_RECTANGLE";

    /* renamed from: h  reason: collision with root package name */
    public static final String f18877h = "bannerAdSize";

    /* renamed from: i  reason: collision with root package name */
    public static final int f18878i = 0;

    /* renamed from: j  reason: collision with root package name */
    public static final int f18879j = 1;

    /* renamed from: k  reason: collision with root package name */
    public static final int f18880k = 2;

    /* renamed from: l  reason: collision with root package name */
    public static final int f18881l = 3;

    /* renamed from: m  reason: collision with root package name */
    public static final int f18882m = 4;

    /* renamed from: n  reason: collision with root package name */
    public static final int f18883n = 5;

    /* renamed from: o  reason: collision with root package name */
    public static final int f18884o = 6;

    /* renamed from: p  reason: collision with root package name */
    public static final int f18885p = -1;

    /* renamed from: q  reason: collision with root package name */
    public static final String f18886q = "Adaptive=true";

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    interface b {
        void a();

        void a(String str);
    }

    public static int a(int i10) {
        int i11 = -1;
        for (AbstractAdapter abstractAdapter : c.b().a().values()) {
            try {
                int adaptiveHeight = abstractAdapter.getAdaptiveHeight(i10);
                if (adaptiveHeight > i11) {
                    i11 = adaptiveHeight;
                }
            } catch (Throwable th) {
                o9.d().a(th);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("exception while calling getAdaptiveHeight for adapter - " + abstractAdapter.getProviderName());
            }
        }
        a(i10, i11);
        IronLog ironLog2 = IronLog.API;
        ironLog2.verbose("maximal height - " + i11 + " for width - " + i10);
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j10, long j11) {
        return j11 - (new Date().getTime() - j10);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(f18873d, 728, 90);
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.containerParams.getWidth() + "x" + iSBannerSize.containerParams.getHeight() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    private static void a(int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i11 == -1) {
                jSONObject.put(IronSourceConstants.EVENTS_ERROR_CODE, 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i10 + ",h:" + i11);
            }
            oj.i().a(new zb(IronSourceConstants.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog.INTERNAL.error(e8.toString());
        }
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout != null) {
            ironSourceBannerLayout.a();
        }
    }

    private static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, Context context, ISBannerSize iSBannerSize) {
        int dpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getWidth());
        int dpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.containerParams.getHeight());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(dpToPixels, dpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ironSourceBannerLayout.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(dpToPixels, dpToPixels2);
        }
        layoutParams2.height = dpToPixels2;
        layoutParams2.width = dpToPixels;
        layoutParams2.gravity = 17;
        ironSourceBannerLayout.setLayoutParams(layoutParams2);
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("containerParams height - " + iSBannerSize.containerParams.getHeight() + " width - " + iSBannerSize.containerParams.getWidth());
        ironSourceBannerLayout.addView(relativeLayout, 0, layoutParams2);
    }

    public static void a(IronSourceBannerLayout ironSourceBannerLayout, View view, FrameLayout.LayoutParams layoutParams) {
        a(ironSourceBannerLayout, view, layoutParams, (b8) null);
    }

    public static void a(final IronSourceBannerLayout ironSourceBannerLayout, final View view, final FrameLayout.LayoutParams layoutParams, final b8 b8Var) {
        if (ironSourceBannerLayout == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = ironSourceBannerLayout.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.a0
            @Override // java.lang.Runnable
            public final void run() {
                l.a(IronSourceBannerLayout.this, view, size, applicationContext, layoutParams, b8Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(IronSourceBannerLayout ironSourceBannerLayout, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, b8 b8Var) {
        try {
            ironSourceBannerLayout.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(ironSourceBannerLayout, view, context, iSBannerSize);
                } else {
                    ironSourceBannerLayout.addView(view, 0, layoutParams);
                }
            }
            if (b8Var != null) {
                b8Var.a();
            }
        } catch (Exception e8) {
            o9.d().a(e8);
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("Error while binding a banner - " + Log.getStackTraceString(e8));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(IronSourceBannerLayout ironSourceBannerLayout, h7 h7Var, b bVar) {
        String str;
        if (c(ironSourceBannerLayout)) {
            str = null;
        } else {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        }
        if (h7Var == null || TextUtils.isEmpty(h7Var.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = h7Var == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
            return;
        }
        IronLog.INTERNAL.error(str);
        bVar.a(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(IronSourceBannerLayout ironSourceBannerLayout, b bVar) {
        if (ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed()) {
            bVar.a();
            return;
        }
        Object[] objArr = new Object[1];
        objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        bVar.a(String.format("can't destroy banner - %s", objArr));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a9 A[Catch: Exception -> 0x00d3, TryCatch #0 {Exception -> 0x00d3, blocks: (B:4:0x0004, B:5:0x0012, B:34:0x0061, B:35:0x0086, B:41:0x00a3, B:43:0x00a9, B:45:0x00b3, B:46:0x00cf, B:36:0x008a, B:37:0x008f, B:38:0x0094, B:39:0x0099, B:40:0x009e, B:7:0x0016, B:10:0x0020, B:13:0x002a, B:16:0x0034, B:19:0x003e, B:22:0x0048), top: B:51:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.util.Map<java.lang.String, java.lang.Object> r9, com.ironsource.mediationsdk.ISBannerSize r10) {
        /*
            java.lang.String r0 = "ext1"
            if (r10 == 0) goto Le4
            java.lang.String r1 = r10.getDescription()     // Catch: java.lang.Exception -> Ld3
            r2 = -1
            int r3 = r1.hashCode()     // Catch: java.lang.Exception -> Ld3
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            switch(r3) {
                case -387072689: goto L48;
                case 72205083: goto L3e;
                case 79011241: goto L34;
                case 446888797: goto L2a;
                case 1951953708: goto L20;
                case 1999208305: goto L16;
                default: goto L15;
            }     // Catch: java.lang.Exception -> Ld3
        L15:
            goto L51
        L16:
            java.lang.String r3 = "CUSTOM"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto L51
            r2 = r4
            goto L51
        L20:
            java.lang.String r3 = "BANNER"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto L51
            r2 = 0
            goto L51
        L2a:
            java.lang.String r3 = "LEADERBOARD"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto L51
            r2 = r6
            goto L51
        L34:
            java.lang.String r3 = "SMART"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto L51
            r2 = r5
            goto L51
        L3e:
            java.lang.String r3 = "LARGE"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto L51
            r2 = r8
            goto L51
        L48:
            java.lang.String r3 = "RECTANGLE"
            boolean r1 = r1.equals(r3)     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto L51
            r2 = r7
        L51:
            java.lang.String r1 = "bannerAdSize"
            if (r2 == 0) goto L9e
            if (r2 == r8) goto L99
            if (r2 == r7) goto L94
            if (r2 == r6) goto L8f
            if (r2 == r5) goto L8a
            if (r2 == r4) goto L60
            goto La3
        L60:
            r2 = 6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Ld3
            r9.put(r1, r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = "custom_banner_size"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r2.<init>()     // Catch: java.lang.Exception -> Ld3
            int r3 = r10.getWidth()     // Catch: java.lang.Exception -> Ld3
            r2.append(r3)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r3 = "x"
            r2.append(r3)     // Catch: java.lang.Exception -> Ld3
            int r3 = r10.getHeight()     // Catch: java.lang.Exception -> Ld3
            r2.append(r3)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> Ld3
        L86:
            r9.put(r1, r2)     // Catch: java.lang.Exception -> Ld3
            goto La3
        L8a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Exception -> Ld3
            goto L86
        L8f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Exception -> Ld3
            goto L86
        L94:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Exception -> Ld3
            goto L86
        L99:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Ld3
            goto L86
        L9e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Ld3
            goto L86
        La3:
            boolean r1 = r10.isAdaptive()     // Catch: java.lang.Exception -> Ld3
            if (r1 == 0) goto Le4
            java.lang.String r1 = a(r10)     // Catch: java.lang.Exception -> Ld3
            boolean r2 = r9.containsKey(r0)     // Catch: java.lang.Exception -> Ld3
            if (r2 == 0) goto Lcf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ld3
            r1.<init>()     // Catch: java.lang.Exception -> Ld3
            java.lang.Object r2 = r9.get(r0)     // Catch: java.lang.Exception -> Ld3
            r1.append(r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r2 = " , "
            r1.append(r2)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r10 = a(r10)     // Catch: java.lang.Exception -> Ld3
            r1.append(r10)     // Catch: java.lang.Exception -> Ld3
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Ld3
        Lcf:
            r9.put(r0, r1)     // Catch: java.lang.Exception -> Ld3
            goto Le4
        Ld3:
            r9 = move-exception
            com.ironsource.o9 r10 = com.ironsource.o9.d()
            r10.a(r9)
            com.ironsource.mediationsdk.logger.IronLog r10 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            r10.error(r9)
        Le4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.l.a(java.util.Map, com.ironsource.mediationsdk.ISBannerSize):void");
    }

    public static boolean a(ISContainerParams iSContainerParams, int i10, int i11) {
        if (iSContainerParams == null || iSContainerParams.getWidth() <= 0 || iSContainerParams.getHeight() <= 0) {
            IronLog.API.warning("Container size is invalid: Default banner size will be used.");
            return false;
        } else if (iSContainerParams.getWidth() < i10 || iSContainerParams.getHeight() < i11) {
            IronLog.API.warning("Container size too small: Banner may not display correctly.");
            return true;
        } else {
            return true;
        }
    }

    public static int b(int i10) {
        if (p.m().O()) {
            return a(i10);
        }
        IronLog.API.error("The mediation must be successfully initiated before calling this API");
        return -1;
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f18874e, 728, 90);
        }
        return a(f18874e, 320, 50);
    }

    public static void b(IronSourceBannerLayout ironSourceBannerLayout) {
        ISBannerSize size;
        if (ironSourceBannerLayout == null || (size = ironSourceBannerLayout.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize b10 = b();
        b10.setContainerParams(size.containerParams);
        b10.setAdaptive(size.isAdaptive());
        ironSourceBannerLayout.setBannerSize(b10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean c(IronSourceBannerLayout ironSourceBannerLayout) {
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }
}

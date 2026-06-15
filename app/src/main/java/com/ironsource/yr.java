package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.yr;
import java.util.Arrays;
import java.util.List;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public final class yr implements eo {

    /* renamed from: a  reason: collision with root package name */
    public static final yr f21582a = new yr();

    /* renamed from: b  reason: collision with root package name */
    private static final bs f21583b = new bs();

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public static final class a implements qr {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ qr f21584a;

        a(qr qrVar) {
            this.f21584a = qrVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(kr sdkConfig, qr listener) {
            kotlin.jvm.internal.n.f(sdkConfig, "$sdkConfig");
            kotlin.jvm.internal.n.f(listener, "$listener");
            yr.f21582a.a(sdkConfig, listener);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(qr listener, mr error) {
            kotlin.jvm.internal.n.f(listener, "$listener");
            kotlin.jvm.internal.n.f(error, "$error");
            listener.a(error);
        }

        @Override // com.ironsource.qr
        public void a(final kr sdkConfig) {
            kotlin.jvm.internal.n.f(sdkConfig, "sdkConfig");
            bs bsVar = yr.f21583b;
            final qr qrVar = this.f21584a;
            bsVar.a(new Runnable() { // from class: com.ironsource.n30
                @Override // java.lang.Runnable
                public final void run() {
                    yr.a.a(kr.this, qrVar);
                }
            });
        }

        @Override // com.ironsource.qr
        public void a(final mr error) {
            kotlin.jvm.internal.n.f(error, "error");
            bs bsVar = yr.f21583b;
            final qr qrVar = this.f21584a;
            bsVar.d(new Runnable() { // from class: com.ironsource.o30
                @Override // java.lang.Runnable
                public final void run() {
                    yr.a.a(qr.this, error);
                }
            });
        }
    }

    private yr() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0011, code lost:
        if ((r0.length() > 0) == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(android.content.Context r11, com.ironsource.rr r12, final com.ironsource.qr r13, boolean r14) {
        /*
            r10 = this;
            java.lang.String r0 = r12.f()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            int r0 = r0.length()
            if (r0 <= 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            if (r0 != r1) goto L14
            goto L15
        L14:
            r1 = r2
        L15:
            if (r1 == 0) goto L23
            com.ironsource.mediationsdk.p r0 = com.ironsource.mediationsdk.p.m()
            java.lang.String r1 = r12.f()
            r0.t(r1)
            goto L3d
        L23:
            com.ironsource.rr r0 = new com.ironsource.rr
            java.lang.String r1 = r12.d()
            com.ironsource.mediationsdk.p r3 = com.ironsource.mediationsdk.p.m()
            java.lang.String r3 = r3.o()
            java.util.List r12 = r12.e()
            java.util.List r12 = j8.o.O(r12)
            r0.<init>(r1, r3, r12)
            r12 = r0
        L3d:
            com.ironsource.mediationsdk.p r3 = com.ironsource.mediationsdk.p.m()
            java.lang.String r5 = r12.d()
            java.util.List r0 = r12.e()
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r1 = new com.ironsource.mediationsdk.IronSource.AD_UNIT[r2]
            java.lang.Object[] r0 = r0.toArray(r1)
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r0 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r0
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            r9 = r0
            com.ironsource.mediationsdk.IronSource$AD_UNIT[] r9 = (com.ironsource.mediationsdk.IronSource.AD_UNIT[]) r9
            r7 = 0
            r4 = r11
            r6 = r14
            r8 = r10
            com.ironsource.mediationsdk.logger.IronSourceError r14 = r3.a(r4, r5, r6, r7, r8, r9)
            if (r14 == 0) goto La5
            int r0 = r14.getErrorCode()
            r1 = 2020(0x7e4, float:2.83E-42)
            if (r0 != r1) goto L6c
            goto La5
        L6c:
            int r11 = r14.getErrorCode()
            r12 = 2040(0x7f8, float:2.859E-42)
            if (r11 != r12) goto L8c
            com.ironsource.mediationsdk.p r11 = com.ironsource.mediationsdk.p.m()
            com.ironsource.ls r11 = r11.h()
            if (r11 == 0) goto L9a
            com.ironsource.kr r12 = new com.ironsource.kr
            com.ironsource.sr r14 = new com.ironsource.sr
            r14.<init>(r11)
            r12.<init>(r14)
            r10.a(r12, r13)
            return
        L8c:
            int r11 = r14.getErrorCode()
            r12 = 2030(0x7ee, float:2.845E-42)
            if (r11 != r12) goto L9a
            com.ironsource.xr r11 = com.ironsource.xr.f21433a
            r11.e()
            return
        L9a:
            com.ironsource.bs r11 = com.ironsource.yr.f21583b
            com.ironsource.m30 r12 = new com.ironsource.m30
            r12.<init>()
            r11.d(r12)
            return
        La5:
            com.ironsource.xr r14 = com.ironsource.xr.f21433a
            com.ironsource.yr$a r0 = new com.ironsource.yr$a
            r0.<init>(r13)
            r14.a(r11, r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.yr.a(android.content.Context, com.ironsource.rr, com.ironsource.qr, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a(final kr krVar, final qr qrVar) {
        if (com.ironsource.mediationsdk.p.m().a(false, krVar.d())) {
            f21583b.d(new Runnable() { // from class: com.ironsource.l30
                @Override // java.lang.Runnable
                public final void run() {
                    yr.a(qr.this, krVar);
                }
            });
        } else {
            f21583b.d(new Runnable() { // from class: com.ironsource.k30
                @Override // java.lang.Runnable
                public final void run() {
                    yr.a(qr.this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "$error");
        xr.f21433a.b(new mr(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qr listener) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        listener.a(new mr(IronSourceError.ERROR_LEGACY_INIT_POST_FAILED, "An unknown error has occurred"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qr listener, kr sdkInitResponse) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.f(sdkInitResponse, "$sdkInitResponse");
        listener.a(sdkInitResponse);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(qr listener, IronSourceError error) {
        kotlin.jvm.internal.n.f(listener, "$listener");
        kotlin.jvm.internal.n.e(error, "error");
        listener.a(new mr(error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Context context, rr initRequest, qr listener) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        kotlin.jvm.internal.n.f(listener, "$listener");
        f21582a.a(context, initRequest, listener, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(ls serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "$serverResponse");
        xr.f21433a.a(new sr(serverResponse));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(Context context, rr initRequest, qr listener) {
        kotlin.jvm.internal.n.f(context, "$context");
        kotlin.jvm.internal.n.f(initRequest, "$initRequest");
        kotlin.jvm.internal.n.f(listener, "$listener");
        com.ironsource.mediationsdk.p m7 = com.ironsource.mediationsdk.p.m();
        String d10 = initRequest.d();
        IronSource.AD_UNIT[] ad_unitArr = (IronSource.AD_UNIT[]) initRequest.e().toArray(new IronSource.AD_UNIT[0]);
        List<IronSource.AD_UNIT> validAdUnitsList = m7.a(context, d10, false, (IronSource.AD_UNIT[]) Arrays.copyOf(ad_unitArr, ad_unitArr.length));
        kotlin.jvm.internal.n.e(validAdUnitsList, "validAdUnitsList");
        initRequest.a(validAdUnitsList);
        f21582a.a(context, initRequest, listener, true);
    }

    public final void a(final Context context, final rr initRequest, final qr listener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(listener, "listener");
        f21583b.c(new Runnable() { // from class: com.ironsource.g30
            @Override // java.lang.Runnable
            public final void run() {
                yr.b(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.eo
    public void a(final ls serverResponse) {
        kotlin.jvm.internal.n.f(serverResponse, "serverResponse");
        f21583b.a(new Runnable() { // from class: com.ironsource.i30
            @Override // java.lang.Runnable
            public final void run() {
                yr.b(ls.this);
            }
        });
    }

    public final void c(final Context context, final rr initRequest, final qr listener) {
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(initRequest, "initRequest");
        kotlin.jvm.internal.n.f(listener, "listener");
        f21583b.c(new Runnable() { // from class: com.ironsource.h30
            @Override // java.lang.Runnable
            public final void run() {
                yr.d(context, initRequest, listener);
            }
        });
    }

    @Override // com.ironsource.eo
    public void onInitFailed(final IronSourceError error) {
        kotlin.jvm.internal.n.f(error, "error");
        f21583b.a(new Runnable() { // from class: com.ironsource.j30
            @Override // java.lang.Runnable
            public final void run() {
                yr.a(IronSourceError.this);
            }
        });
    }
}

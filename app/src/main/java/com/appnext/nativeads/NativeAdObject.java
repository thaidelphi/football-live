package com.appnext.nativeads;

import android.content.Context;
import com.appnext.core.Ad;
import com.appnext.core.callbacks.OnECPMLoaded;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class NativeAdObject extends Ad {
    public static final String AUID = "550";
    protected static final String TID = "301";
    protected static final String VID = "2.7.6.473";

    public NativeAdObject(Context context, String str) {
        super(context, str);
    }

    @Override // com.appnext.core.Ad
    public String getAUID() {
        return AUID;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public com.appnext.core.c getAdRequest() {
        return super.getAdRequest();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public Context getContext() {
        return this.context;
    }

    @Override // com.appnext.core.Ad
    public void getECPM(OnECPMLoaded onECPMLoaded) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public String getSessionId() {
        return super.getSessionId();
    }

    @Override // com.appnext.core.Ad
    public String getTID() {
        return TID;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
        if (r8.equals("a") != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r8.equals("a") != false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getTemId(com.appnext.nativeads.NativeAdData r8) {
        /*
            r7 = this;
            java.lang.String r8 = r8.getRevenueType()     // Catch: java.lang.Throwable -> L93
            java.lang.String r0 = "cpi"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L93
            r0 = 0
            java.lang.String r1 = "b"
            java.lang.String r2 = "a"
            r3 = -1
            r4 = 1
            if (r8 == 0) goto L60
            com.appnext.nativeads.a r8 = com.appnext.nativeads.a.aG()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "cpiActiveFlow"
            java.lang.String r8 = r8.t(r5)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = r8.toLowerCase()     // Catch: java.lang.Throwable -> L93
            int r5 = r8.hashCode()     // Catch: java.lang.Throwable -> L93
            r6 = 2
            switch(r5) {
                case 97: goto L46;
                case 98: goto L3e;
                case 99: goto L34;
                case 100: goto L2a;
                default: goto L29;
            }     // Catch: java.lang.Throwable -> L93
        L29:
            goto L4d
        L2a:
            java.lang.String r0 = "d"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L4d
            r0 = 3
            goto L4e
        L34:
            java.lang.String r0 = "c"
            boolean r8 = r8.equals(r0)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L4d
            r0 = r6
            goto L4e
        L3e:
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L4d
            r0 = r4
            goto L4e
        L46:
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r3
        L4e:
            if (r0 == 0) goto L5d
            if (r0 == r4) goto L5a
            if (r0 == r6) goto L57
            java.lang.String r8 = "503"
            return r8
        L57:
            java.lang.String r8 = "502"
            return r8
        L5a:
            java.lang.String r8 = "501"
            return r8
        L5d:
            java.lang.String r8 = "500"
            return r8
        L60:
            com.appnext.nativeads.a r8 = com.appnext.nativeads.a.aG()     // Catch: java.lang.Throwable -> L93
            java.lang.String r5 = "cpcActiveFlow"
            java.lang.String r8 = r8.t(r5)     // Catch: java.lang.Throwable -> L93
            java.lang.String r8 = r8.toLowerCase()     // Catch: java.lang.Throwable -> L93
            int r5 = r8.hashCode()     // Catch: java.lang.Throwable -> L93
            r6 = 97
            if (r5 == r6) goto L83
            r0 = 98
            if (r5 == r0) goto L7b
            goto L8a
        L7b:
            boolean r8 = r8.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L8a
            r0 = r4
            goto L8b
        L83:
            boolean r8 = r8.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L8a
            goto L8b
        L8a:
            r0 = r3
        L8b:
            if (r0 == 0) goto L90
            java.lang.String r8 = "505"
            return r8
        L90:
            java.lang.String r8 = "504"
            return r8
        L93:
            r8 = move-exception
            java.lang.String r0 = "NativeAdObject$getTemId"
            com.appnext.base.a.a(r0, r8)
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.nativeads.NativeAdObject.getTemId(com.appnext.nativeads.NativeAdData):java.lang.String");
    }

    @Override // com.appnext.core.Ad
    public String getVID() {
        return VID;
    }

    @Override // com.appnext.core.Ad
    public boolean isAdLoaded() {
        return b.aI().a(this);
    }

    @Override // com.appnext.core.Ad
    public void loadAd() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public void setAdRequest(com.appnext.core.c cVar) {
        super.setAdRequest(cVar);
    }

    @Override // com.appnext.core.Ad
    public void showAd() {
    }

    protected NativeAdObject(Ad ad) {
        super(ad);
    }
}

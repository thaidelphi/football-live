package com.appnext.banners;

import android.content.Context;
import com.appnext.core.Ad;
import com.appnext.core.callbacks.OnECPMLoaded;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class BannerAd extends Ad {
    protected static final String TID = "301";
    protected static final String VID = "2.7.6.473";

    /* JADX INFO: Access modifiers changed from: protected */
    public BannerAd(Ad ad) {
        super(ad);
    }

    @Override // com.appnext.core.Ad
    public String getAUID() {
        return "1000";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.appnext.core.Ad
    public com.appnext.core.c getAdRequest() {
        return super.getAdRequest();
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r9.equals("a") != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0087, code lost:
        if (r9.equals("a") != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String getTemId(com.appnext.banners.BannerAdData r9) {
        /*
            r8 = this;
            java.lang.String r0 = "109"
            java.lang.String r9 = r9.getRevenueType()     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "cpi"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L93
            r1 = 0
            java.lang.String r2 = "b"
            java.lang.String r3 = "a"
            r4 = -1
            r5 = 1
            if (r9 == 0) goto L60
            com.appnext.banners.d r9 = com.appnext.banners.d.K()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "BANNER_cpiActiveFlow"
            java.lang.String r9 = r9.t(r6)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L93
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> L93
            r7 = 2
            switch(r6) {
                case 97: goto L48;
                case 98: goto L40;
                case 99: goto L36;
                case 100: goto L2c;
                default: goto L2b;
            }     // Catch: java.lang.Throwable -> L93
        L2b:
            goto L4f
        L2c:
            java.lang.String r1 = "d"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L4f
            r1 = 3
            goto L50
        L36:
            java.lang.String r1 = "c"
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L4f
            r1 = r7
            goto L50
        L40:
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L4f
            r1 = r5
            goto L50
        L48:
            boolean r9 = r9.equals(r3)     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L4f
            goto L50
        L4f:
            r1 = r4
        L50:
            if (r1 == 0) goto L5d
            if (r1 == r5) goto L5a
            if (r1 == r7) goto L57
            return r0
        L57:
            java.lang.String r9 = "106"
            return r9
        L5a:
            java.lang.String r9 = "103"
            return r9
        L5d:
            java.lang.String r9 = "100"
            return r9
        L60:
            com.appnext.banners.d r9 = com.appnext.banners.d.K()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = "BANNER_cpcActiveFlow"
            java.lang.String r9 = r9.t(r6)     // Catch: java.lang.Throwable -> L93
            java.lang.String r9 = r9.toLowerCase()     // Catch: java.lang.Throwable -> L93
            int r6 = r9.hashCode()     // Catch: java.lang.Throwable -> L93
            r7 = 97
            if (r6 == r7) goto L83
            r1 = 98
            if (r6 == r1) goto L7b
            goto L8a
        L7b:
            boolean r9 = r9.equals(r2)     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L8a
            r1 = r5
            goto L8b
        L83:
            boolean r9 = r9.equals(r3)     // Catch: java.lang.Throwable -> L93
            if (r9 == 0) goto L8a
            goto L8b
        L8a:
            r1 = r4
        L8b:
            if (r1 == 0) goto L90
            java.lang.String r9 = "203"
            return r9
        L90:
            java.lang.String r9 = "200"
            return r9
        L93:
            r9 = move-exception
            java.lang.String r1 = "BannerAd$getTemId"
            com.appnext.base.a.a(r1, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.banners.BannerAd.getTemId(com.appnext.banners.BannerAdData):java.lang.String");
    }

    @Override // com.appnext.core.Ad
    public String getVID() {
        return VID;
    }

    @Override // com.appnext.core.Ad
    public boolean isAdLoaded() {
        return false;
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

    public BannerAd(Context context, String str) {
        super(context, str);
    }
}

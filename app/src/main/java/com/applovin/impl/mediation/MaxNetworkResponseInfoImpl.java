package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxNetworkResponseInfo;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class MaxNetworkResponseInfoImpl implements MaxNetworkResponseInfo {

    /* renamed from: a  reason: collision with root package name */
    private final MaxNetworkResponseInfo.AdLoadState f7552a;

    /* renamed from: b  reason: collision with root package name */
    private final MaxMediatedNetworkInfo f7553b;

    /* renamed from: c  reason: collision with root package name */
    private final Bundle f7554c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f7555d;

    /* renamed from: e  reason: collision with root package name */
    private final long f7556e;

    /* renamed from: f  reason: collision with root package name */
    private final String f7557f;

    /* renamed from: g  reason: collision with root package name */
    private final MaxError f7558g;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f7559a;

        static {
            int[] iArr = new int[MaxNetworkResponseInfo.AdLoadState.values().length];
            f7559a = iArr;
            try {
                iArr[MaxNetworkResponseInfo.AdLoadState.FAILED_TO_LOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7559a[MaxNetworkResponseInfo.AdLoadState.AD_LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MaxNetworkResponseInfoImpl(MaxNetworkResponseInfo.AdLoadState adLoadState, MaxMediatedNetworkInfo maxMediatedNetworkInfo, Bundle bundle, boolean z10, long j10, String str, MaxError maxError) {
        this.f7552a = adLoadState;
        this.f7553b = maxMediatedNetworkInfo;
        this.f7554c = bundle;
        this.f7555d = z10;
        this.f7556e = j10;
        this.f7557f = str;
        this.f7558g = maxError;
    }

    protected boolean canEqual(Object obj) {
        return obj instanceof MaxNetworkResponseInfoImpl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof MaxNetworkResponseInfoImpl) {
            MaxNetworkResponseInfoImpl maxNetworkResponseInfoImpl = (MaxNetworkResponseInfoImpl) obj;
            if (maxNetworkResponseInfoImpl.canEqual(this) && isBidding() == maxNetworkResponseInfoImpl.isBidding() && getLatencyMillis() == maxNetworkResponseInfoImpl.getLatencyMillis()) {
                MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
                MaxNetworkResponseInfo.AdLoadState adLoadState2 = maxNetworkResponseInfoImpl.getAdLoadState();
                if (adLoadState != null ? adLoadState.equals(adLoadState2) : adLoadState2 == null) {
                    MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
                    MaxMediatedNetworkInfo mediatedNetwork2 = maxNetworkResponseInfoImpl.getMediatedNetwork();
                    if (mediatedNetwork != null ? mediatedNetwork.equals(mediatedNetwork2) : mediatedNetwork2 == null) {
                        Bundle credentials = getCredentials();
                        Bundle credentials2 = maxNetworkResponseInfoImpl.getCredentials();
                        if (credentials != null ? credentials.equals(credentials2) : credentials2 == null) {
                            String bCode = getBCode();
                            String bCode2 = maxNetworkResponseInfoImpl.getBCode();
                            if (bCode != null ? bCode.equals(bCode2) : bCode2 == null) {
                                MaxError error = getError();
                                MaxError error2 = maxNetworkResponseInfoImpl.getError();
                                return error != null ? error.equals(error2) : error2 == null;
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxNetworkResponseInfo.AdLoadState getAdLoadState() {
        return this.f7552a;
    }

    public String getBCode() {
        return this.f7557f;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public Bundle getCredentials() {
        return this.f7554c;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxError getError() {
        return this.f7558g;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public long getLatencyMillis() {
        return this.f7556e;
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public MaxMediatedNetworkInfo getMediatedNetwork() {
        return this.f7553b;
    }

    public int hashCode() {
        int i10 = isBidding() ? 79 : 97;
        long latencyMillis = getLatencyMillis();
        int i11 = ((i10 + 59) * 59) + ((int) (latencyMillis ^ (latencyMillis >>> 32)));
        MaxNetworkResponseInfo.AdLoadState adLoadState = getAdLoadState();
        int hashCode = (i11 * 59) + (adLoadState == null ? 43 : adLoadState.hashCode());
        MaxMediatedNetworkInfo mediatedNetwork = getMediatedNetwork();
        int hashCode2 = (hashCode * 59) + (mediatedNetwork == null ? 43 : mediatedNetwork.hashCode());
        Bundle credentials = getCredentials();
        int hashCode3 = (hashCode2 * 59) + (credentials == null ? 43 : credentials.hashCode());
        String bCode = getBCode();
        int hashCode4 = (hashCode3 * 59) + (bCode == null ? 43 : bCode.hashCode());
        MaxError error = getError();
        return (hashCode4 * 59) + (error != null ? error.hashCode() : 43);
    }

    @Override // com.applovin.mediation.MaxNetworkResponseInfo
    public boolean isBidding() {
        return this.f7555d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0044, code lost:
        if (r1 != 2) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "MaxResponseInfo{adLoadState="
            r1.append(r2)
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f7552a
            r1.append(r2)
            java.lang.String r2 = ", mediatedNetwork="
            r1.append(r2)
            com.applovin.mediation.MaxMediatedNetworkInfo r2 = r3.f7553b
            r1.append(r2)
            java.lang.String r2 = ", credentials="
            r1.append(r2)
            android.os.Bundle r2 = r3.f7554c
            r1.append(r2)
            java.lang.String r2 = ", isBidding="
            r1.append(r2)
            boolean r2 = r3.f7555d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            int[] r1 = com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.a.f7559a
            com.applovin.mediation.MaxNetworkResponseInfo$AdLoadState r2 = r3.f7552a
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto L47
            r2 = 2
            if (r1 == r2) goto L51
            goto L5b
        L47:
            java.lang.String r1 = ", error="
            r0.append(r1)
            com.applovin.mediation.MaxError r1 = r3.f7558g
            r0.append(r1)
        L51:
            java.lang.String r1 = ", latencyMillis="
            r0.append(r1)
            long r1 = r3.f7556e
            r0.append(r1)
        L5b:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.mediation.MaxNetworkResponseInfoImpl.toString():java.lang.String");
    }
}

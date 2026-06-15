package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.facebook.ads.redexgen.X.kC  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class C1911kC implements C7N {
    public static byte[] A03;
    public static String[] A04 = {"1hpByTARN6eOnQ", "46DvCO0dFj9d90pc7Bl3Va1pW3afVu0G", "LtfSHnVMNf9jD1VPw2QJdb6akNXb3KRw", "UXeRQ2HNaneiXsHAoGvRBzblNiVPPyfq", "WcHPi3i27m6LdaHLnkH9ENRpFxyJu3g8", "FTcDokCppzFM6olvGfJVNXVubstDZ8VZ", "v3Z7C81p3UBYKX6nY0MAEeka3DNz7RKw", "vwYfKziuTy1RLYscQHjTEDI4uYjWuvBq"};
    public final InterfaceC0887Jq A01;
    public Set<C7Q> A00 = new HashSet();
    public final List<C7P> A02 = new ArrayList();

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{75, 75, 78, 24, 81, 75, 78, 24, 39, 53, 53, 35, 50, 53};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public synchronized void A03() {
        if (!this.A01.AAT()) {
            BuildConfigApi.isDebug();
            return;
        }
        Set<C7Q> A01 = A01(this.A01.A7Y());
        if (!this.A00.equals(A01) && A01 != null) {
            this.A00 = A01;
            for (C7P c7p : this.A02) {
                c7p.A49();
            }
        }
        if (BuildConfigApi.isDebug()) {
            for (C7Q c7q : this.A00) {
                String.format(Locale.US, A00(0, 8, 58), c7q.A9E(), c7q.getUrl());
            }
        }
    }

    static {
        A02();
    }

    public C1911kC(InterfaceC1308aF interfaceC1308aF) {
        this.A01 = interfaceC1308aF.A5K(EnumC0888Jr.A0B);
        this.A01.A3r(new C1912kD(this));
        A03();
    }

    public static Set<C7Q> A01(JSONObject jSONObject) {
        C1910kB A00;
        HashSet hashSet = new HashSet();
        JSONArray optJSONArray = jSONObject.optJSONArray(A00(8, 6, 23));
        if (optJSONArray == null) {
            return null;
        }
        int i10 = 0;
        while (true) {
            int i11 = optJSONArray.length();
            if (A04[2].charAt(7) != 'M') {
                throw new RuntimeException();
            }
            A04[0] = "HjevAVNXdTQxpc55Yqf8Zim5Y";
            if (i10 < i11) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i10);
                if (optJSONObject == null || (A00 = C1910kB.A00(optJSONObject)) == null) {
                    return null;
                }
                hashSet.add(A00);
                i10++;
            } else {
                return hashSet;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C7N
    public final void A3q(C7P c7p) {
        this.A02.add(c7p);
    }

    @Override // com.facebook.ads.redexgen.X.C7N
    public final synchronized Set<C7Q> A6n() {
        return new HashSet(this.A00);
    }
}

package com.facebook.ads.redexgen.X;

import java.util.Arrays;
/* renamed from: com.facebook.ads.redexgen.X.hO  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1743hO implements CG {
    public static byte[] A01;
    public static String[] A02 = {"RKj", "", "UN15gotjq8", "ajoBiEUEQKFJNLqm", "ifgUnXqkKiJSPGKzKRtyUVwCV1ynqJ", "MgNPOwYKG3krpOkrgoqalUsb7GIlLECG", "4d5pH5OlBXd1RidH0kkNXmSukCNaNWUQ", "ZdfTYbLhRFsUmKvgir0oysIbzYx0fUOP"};
    public final /* synthetic */ C1741hM A00;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 17);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-31, -7, -21, -23, -7, -29};
    }

    static {
        A01();
    }

    public C1743hO(C1741hM c1741hM) {
        this.A00 = c1741hM;
    }

    public /* synthetic */ C1743hO(C1741hM c1741hM, C1749hU c1749hU) {
        this(c1741hM);
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void ACi() {
        boolean z10;
        boolean A0V;
        this.A00.A0a.setToolbarActionMessage(A00(0, 0, 19));
        this.A00.A0I();
        z10 = this.A00.A0X;
        if (z10) {
            A0V = this.A00.A0V();
            String[] strArr = A02;
            if (strArr[5].charAt(0) == strArr[7].charAt(0)) {
                throw new RuntimeException();
            }
            A02[4] = "QDC88FCswtzFK8CArK72WEL9jXMBl5";
            if (A0V) {
                this.A00.A0a.setToolbarActionMode(1);
                return;
            }
        }
        this.A00.A0a.setToolbarActionMode(0);
    }

    @Override // com.facebook.ads.redexgen.X.CG
    public final void AEg(float f10) {
        boolean z10;
        C04672p c04672p;
        boolean z11;
        AbstractC2058md abstractC2058md;
        float A04;
        AbstractC2058md abstractC2058md2;
        AbstractC2058md abstractC2058md3;
        boolean z12;
        AbstractC2058md abstractC2058md4;
        boolean z13;
        AbstractC2058md abstractC2058md5;
        this.A00.A0O((int) f10);
        z10 = this.A00.A0Y;
        if (!z10) {
            c04672p = this.A00.A0J;
            this.A00.A0a.setProgress(100.0f * (1.0f - (f10 / c04672p.A07())));
            return;
        }
        z11 = this.A00.A0E;
        if (z11) {
            abstractC2058md4 = this.A00.A0I;
            if (A02[6].charAt(27) != 'a') {
                throw new RuntimeException();
            }
            A02[4] = "3MuDy2E798EtOoHK0e0a3SiH1QgAy5";
            A04 = 1.0f - (f10 / abstractC2058md4.A1b().A0F().A03());
            z13 = this.A00.A0H;
            if (z13 || A04 < 1.0f) {
                this.A00.A0H = false;
                abstractC2058md5 = this.A00.A0I;
                this.A00.A0a.setToolbarActionMessage(abstractC2058md5.A1f().A02().replace(A00(0, 6, 117), String.valueOf((int) f10)));
            } else {
                this.A00.A0H = true;
                DQ dq = this.A00.A0a;
                String A00 = A00(0, 0, 19);
                if (A02[3].length() != 16) {
                    dq.setToolbarActionMessage(A00);
                } else {
                    String[] strArr = A02;
                    strArr[5] = "wpbUz5ctYXHuYyRf6fVCU3uRzsMt7dE8";
                    strArr[7] = "BBfRd69Z77LUH69GeqVAIKhho7h2fuMA";
                    dq.setToolbarActionMessage(A00);
                }
            }
        } else {
            abstractC2058md = this.A00.A0I;
            A04 = 1.0f - (f10 / abstractC2058md.A1b().A0F().A04());
        }
        this.A00.A0a.setProgress(100.0f * A04);
        abstractC2058md2 = this.A00.A0I;
        abstractC2058md3 = this.A00.A0I;
        float percentageOfReward = abstractC2058md3.A1b().A0F().A04();
        boolean z14 = ((float) abstractC2058md2.A1b().A0F().A03()) - f10 >= percentageOfReward;
        z12 = this.A00.A0H;
        if (!z12 && z14) {
            this.A00.A0a.setToolbarActionMode(1);
        }
    }
}

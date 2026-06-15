package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdListener;
/* renamed from: com.facebook.ads.redexgen.X.ki  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1943ki extends BL {
    public static String[] A02 = {"aYZ348mE1NYrFcMBoebQMkiZFG78oX5w", "qZgy2fVZKkcRQxGeLIPji8yDZzfZsU0K", "FW", "4WpWxoGmbDHaVYPSEbV5W", "JuvmjYnKk99PR9XqbJ5bpADbGT7vNhdJ", "90qKQYWe37jbHMTFJzGbdEUnuOp61wed", "dYksIGNGyyMeZtC5mrM4so", "pL5NnltKvH9DFuMzl1s9TskXUqu4u7R4"};
    public final /* synthetic */ C1939ke A00;
    public final /* synthetic */ C0660Ag A01;

    public C1943ki(C1939ke c1939ke, C0660Ag c0660Ag) {
        this.A00 = c1939ke;
        this.A01 = c0660Ag;
    }

    @Override // com.facebook.ads.redexgen.X.BL
    public final void A01() {
        C05566d c05566d;
        C05566d c05566d2;
        C05566d c05566d3;
        c05566d = this.A00.A01;
        if (c05566d.A06() != null) {
            c05566d2 = this.A00.A01;
            AdListener A06 = c05566d2.A06();
            c05566d3 = this.A00.A01;
            if (A02[2].length() != 2) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[3] = "zGBwvDJj20KV94Zd2N0fZ";
            strArr[6] = "5j2wCmqr0QfuHbPw5sx74i";
            A06.onError(c05566d3.A07(), C8.A00(this.A01));
        }
    }
}

package com.facebook.ads.redexgen.X;
/* renamed from: com.facebook.ads.redexgen.X.bd  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class C1389bd extends BY {
    public static String[] A02 = {"8bjSuFnY7Px2kfd2c5FIfhC79mNHlBDm", "1JhoOK1lCeFzNpWXu7eAiStn9xCsTPmH", "7NMloe4KmVhX4mabvoc5ZBvAFXalYV3E", "rfM3ikXL5SaocWaOB9TmjD2vsiJkKlJd", "sACTLZEyycWa5kMyrq", "mxP57EI80C5Gyk8oclCuNkT0toI", "e5qOGa2bHvCngaVTbxNZ2TaAb3gIhyF7", "QbLt5R1wGXlKwPtnoTvKgxPj8Dj"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ C0847Ic A01;

    public C1389bd(C0847Ic c0847Ic, int i10) {
        this.A01 = c0847Ic;
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.X.BY
    public final void A05() {
        C1433cL videoView;
        C1433cL videoView2;
        videoView = this.A01.A00.A00.getVideoView();
        if (videoView != null && this.A00 <= 0) {
            C0847Ic c0847Ic = this.A01;
            String[] strArr = A02;
            if (strArr[6].charAt(3) == strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "CD7DGdNDLCY4UALZZjKA1HiDkec";
            strArr2[7] = "uQvfAiBAn4mqA7tCqZPrCPt4Ck3";
            videoView2 = c0847Ic.A00.A00.getVideoView();
            videoView2.A0k(false, 9);
        }
    }
}

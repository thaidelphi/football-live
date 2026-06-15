package com.facebook.ads.redexgen.X;

import android.view.View;
/* renamed from: com.facebook.ads.redexgen.X.Il  reason: case insensitive filesystem */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public class View$OnClickListenerC0856Il implements View.OnClickListener {
    public final /* synthetic */ IX A00;

    public View$OnClickListenerC0856Il(IX ix) {
        this.A00 = ix;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1433cL videoView;
        AF af;
        C1900k1 c1900k1;
        C1433cL videoView2;
        C1433cL videoView3;
        C1433cL videoView4;
        AF af2;
        if (BQ.A02(this)) {
            return;
        }
        try {
            videoView = this.A00.getVideoView();
            if (videoView != null) {
                af = this.A00.A02;
                if (af != null) {
                    af2 = this.A00.A02;
                    af2.A04(AE.A0x, null);
                }
                c1900k1 = this.A00.A01;
                c1900k1.A0F().A3W();
                int[] iArr = C0857Im.A00;
                videoView2 = this.A00.getVideoView();
                switch (iArr[videoView2.getState().ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        videoView3 = this.A00.getVideoView();
                        videoView3.A0g(IP.A04, 12);
                        return;
                    case 5:
                        videoView4 = this.A00.getVideoView();
                        videoView4.A0k(true, 8);
                        return;
                    default:
                        return;
                }
            }
        } catch (Throwable th) {
            BQ.A00(th, this);
        }
    }
}

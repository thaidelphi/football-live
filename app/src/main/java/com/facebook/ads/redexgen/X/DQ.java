package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public abstract class DQ extends LinearLayout {
    public static int A00 = (int) (CP.A02 * 56.0f);
    public static int A01 = (int) (CP.A02 * 56.0f);

    public abstract void A06();

    public abstract void A07();

    public abstract void A08();

    public abstract void A09(float f10, int i10);

    public abstract void A0A(C04542c c04542c, boolean z10);

    public abstract boolean A0B();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract DP getToolbarListener();

    public abstract void setAdReportingVisible(boolean z10);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(View$OnClickListenerC1689gW view$OnClickListenerC1689gW);

    public abstract void setFullscreen(boolean z10);

    public abstract void setPageDetails(C04652n c04652n, String str, int i10, C04712t c04712t);

    public abstract void setPageDetailsVisible(boolean z10);

    public abstract void setProgress(float f10);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(DB db);

    public abstract void setProgressImmediate(float f10);

    public abstract void setProgressSpinnerInvisible(boolean z10);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i10);

    public abstract void setToolbarListener(DP dp);

    public DQ(Context context) {
        super(context);
    }
}

package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class E2 extends LinearLayout {
    public static final int A08 = (int) (CP.A02 * 15.0f);
    public static final int A09 = (int) (CP.A02 * 10.0f);
    public static final int A0A = (int) (CP.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final C1900k1 A06;
    public final FS A07;

    public E2(C1900k1 c1900k1, int i10, boolean z10) {
        super(c1900k1);
        this.A01 = false;
        this.A06 = c1900k1;
        this.A02 = z10;
        this.A03 = new ImageView(c1900k1);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new FS(c1900k1, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new TextView(c1900k1);
        setOrientation(0);
        this.A04 = new LinearLayout(c1900k1);
        this.A00 = i10;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0A, A0A);
        D3.A0W(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i10;
        FS fs = this.A07;
        int i11 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i10 = this.A01 ? 4 : 0;
        } else {
            i10 = 8;
        }
        fs.setVisibility(i10);
        ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i11 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i11 = 0;
        }
        imageView.setVisibility(i11);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f10, int i10) {
        this.A07.A02(f10, i10);
    }

    public final void A04(C04542c c04542c, boolean z10, boolean z11) {
        int A05 = c04542c.A05(z10);
        FS fs = this.A07;
        int accentColor = AnonymousClass43.A02(A05, 77);
        fs.A03(accentColor, A05, 110);
        this.A03.setColorFilter(A05);
        if (z11) {
            TextView textView = this.A05;
            int accentColor2 = AnonymousClass43.A02(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A05.setTextColor(A05);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i10) {
        if (i10 > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f10) {
        this.A07.setProgressWithAnimation(f10);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(DB db) {
        this.A07.setImage(db);
    }

    public void setProgressImmediate(float f10) {
        this.A07.clearAnimation();
        this.A07.setProgress(f10);
    }

    public void setProgressSpinnerInvisible(boolean z10) {
        this.A01 = z10;
        A01();
    }

    public void setToolbarActionMode(int i10) {
        DB db;
        this.A06.A0F().AFJ(i10);
        this.A00 = i10;
        A01();
        setVisibility(0);
        this.A03.setImageAlpha(255);
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i10) {
            case 0:
                db = DB.CROSS;
                break;
            case 1:
                if (!this.A02) {
                    db = DB.SKIP_ARROW;
                    break;
                } else {
                    db = DB.REDESIGN_SKIP_ICON;
                    break;
                }
            case 2:
            default:
                db = DB.CROSS;
                break;
            case 3:
                db = DB.MINIMIZE_ARROW;
                break;
            case 4:
                db = DB.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                db = DB.CROSS;
                break;
            case 6:
                db = DB.CROSS;
                break;
            case 7:
                db = DB.CROSS;
                this.A03.setImageAlpha(110);
                this.A03.setPadding(A08, A08, A08, A08);
                break;
            case 8:
                db = DB.OTHER_SKIP;
                break;
        }
        this.A03.setImageBitmap(DC.A01(db));
        if (i10 == 1) {
            D3.A0E(1005, this.A03);
            setVisibility(0);
        } else if (i10 == 8) {
            D3.A0E(1009, this.A03);
            setVisibility(0);
        } else {
            D3.A0E(1002, this.A03);
        }
    }

    public void setToolbarMessage(String str) {
        this.A05.setText(str);
        this.A05.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z10) {
        this.A05.setVisibility(z10 ? 0 : 4);
    }
}

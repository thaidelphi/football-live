package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\assets\audience_network.dex */
public final class EZ extends LinearLayout {
    public static final int A03 = (int) (CP.A02 * 40.0f);
    public static final int A04 = (int) (CP.A02 * 20.0f);
    public static final int A05 = (int) (CP.A02 * 10.0f);
    public final C04883k A00;
    public final C1900k1 A01;
    public final EJ A02;

    public EZ(C1900k1 c1900k1, C04883k c04883k, EJ ej, DB db) {
        this(c1900k1, c04883k, ej, null, db);
    }

    public EZ(C1900k1 c1900k1, C04883k c04883k, EJ ej, String str, DB db) {
        super(c1900k1);
        this.A01 = c1900k1;
        this.A00 = c04883k;
        this.A02 = ej;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            D3.A0K(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(db, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        C0746Ef A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(DB db, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(DC.A01(db));
        TextView textView = new TextView(getContext());
        D3.A0W(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(DC.A01(DB.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new EX(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        D3.A0W(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C0746Ef A03() {
        C0746Ef c0746Ef = new C0746Ef(this.A01);
        for (C04883k c04883k : this.A00.A05()) {
            EL el = new EL(this.A01);
            el.setData(c04883k.A04(), null);
            el.setOnClickListener(new EY(this, el, c04883k));
            c0746Ef.addView(el);
        }
        return c0746Ef;
    }
}

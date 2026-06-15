package com.applovin.impl;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public class n extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    private ViewGroup f7986a;

    /* renamed from: b  reason: collision with root package name */
    private AppLovinSdkUtils.Size f7987b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f7988c;

    /* renamed from: d  reason: collision with root package name */
    private RelativeLayout f7989d;

    public n(ViewGroup viewGroup, AppLovinSdkUtils.Size size, Activity activity) {
        super(activity, 16973840);
        this.f7986a = viewGroup;
        this.f7987b = size;
        this.f7988c = activity;
        requestWindowFeature(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        dismiss();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        this.f7989d.removeView(this.f7986a);
        super.dismiss();
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this.f7988c, this.f7987b.getWidth()), AppLovinSdkUtils.dpToPx(this.f7988c, this.f7987b.getHeight()));
        layoutParams.addRule(13);
        this.f7986a.setLayoutParams(layoutParams);
        int dpToPx = AppLovinSdkUtils.dpToPx(this.f7988c, 60);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(dpToPx, dpToPx);
        layoutParams2.addRule(14);
        layoutParams2.addRule(12);
        ImageButton imageButton = new ImageButton(this.f7988c);
        imageButton.setLayoutParams(layoutParams2);
        imageButton.setImageDrawable(this.f7988c.getResources().getDrawable(R.drawable.applovin_ic_x_mark));
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setColorFilter(-1);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.bd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.this.a(view);
            }
        });
        RelativeLayout relativeLayout = new RelativeLayout(this.f7988c);
        this.f7989d = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f7989d.setBackgroundColor(RecyclerView.UNDEFINED_DURATION);
        this.f7989d.addView(imageButton);
        this.f7989d.addView(this.f7986a);
        this.f7989d.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.cd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                n.this.b(view);
            }
        });
        setContentView(this.f7989d);
    }
}

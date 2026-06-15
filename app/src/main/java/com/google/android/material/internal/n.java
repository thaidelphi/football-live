package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/* compiled from: ToolbarUtils.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<View> f14458a = new a();

    /* compiled from: ToolbarUtils.java */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements Comparator<View> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    private static ImageView a(Toolbar toolbar, Drawable drawable) {
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof ImageView) {
                ImageView imageView = (ImageView) childAt;
                if (drawable != null && imageView.getDrawable().getConstantState().equals(drawable.getConstantState())) {
                    return imageView;
                }
            }
        }
        return null;
    }

    public static ImageView b(Toolbar toolbar) {
        return a(toolbar, toolbar.getLogo());
    }

    public static TextView c(Toolbar toolbar) {
        List<TextView> d10 = d(toolbar, toolbar.getSubtitle());
        if (d10.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(d10, f14458a);
    }

    private static List<TextView> d(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < toolbar.getChildCount(); i10++) {
            View childAt = toolbar.getChildAt(i10);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView e(Toolbar toolbar) {
        List<TextView> d10 = d(toolbar, toolbar.getTitle());
        if (d10.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(d10, f14458a);
    }
}

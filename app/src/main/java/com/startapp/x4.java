package com.startapp;

import android.graphics.Rect;
import android.view.View;
import android.widget.AdapterView;
import com.startapp.sdk.ads.list3d.List3DView;
/* compiled from: Sta */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class x4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ List3DView f23537a;

    public x4(List3DView list3DView) {
        this.f23537a = list3DView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List3DView list3DView = this.f23537a;
        if (list3DView.f22639b == 1) {
            int i10 = list3DView.f22640c;
            int i11 = list3DView.f22641d;
            if (list3DView.f22653p == null) {
                list3DView.f22653p = new Rect();
            }
            int i12 = 0;
            while (true) {
                if (i12 >= list3DView.getChildCount()) {
                    i12 = -1;
                    break;
                }
                list3DView.getChildAt(i12).getHitRect(list3DView.f22653p);
                if (list3DView.f22653p.contains(i10, i11)) {
                    break;
                }
                i12++;
            }
            if (i12 != -1) {
                List3DView list3DView2 = this.f23537a;
                View childAt = list3DView2.getChildAt(i12);
                int i13 = list3DView2.f22646i + i12;
                long itemId = list3DView2.f22638a.getItemId(i13);
                AdapterView.OnItemLongClickListener onItemLongClickListener = list3DView2.getOnItemLongClickListener();
                if (onItemLongClickListener != null) {
                    onItemLongClickListener.onItemLongClick(list3DView2, childAt, i13, itemId);
                }
            }
        }
    }
}

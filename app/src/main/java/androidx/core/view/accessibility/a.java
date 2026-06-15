package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
/* compiled from: AccessibilityClickableSpanCompat.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a  reason: collision with root package name */
    private final int f2821a;

    /* renamed from: b  reason: collision with root package name */
    private final c f2822b;

    /* renamed from: c  reason: collision with root package name */
    private final int f2823c;

    public a(int i10, c cVar, int i11) {
        this.f2821a = i10;
        this.f2822b = cVar;
        this.f2823c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f2821a);
        this.f2822b.O(this.f2823c, bundle);
    }
}

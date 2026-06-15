package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n4.b;
/* compiled from: CanvasSubtitleOutput.java */
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes.dex */
final class a extends View implements SubtitleView.a {

    /* renamed from: a  reason: collision with root package name */
    private final List<g> f10958a;

    /* renamed from: b  reason: collision with root package name */
    private List<n4.b> f10959b;

    /* renamed from: c  reason: collision with root package name */
    private int f10960c;

    /* renamed from: d  reason: collision with root package name */
    private float f10961d;

    /* renamed from: e  reason: collision with root package name */
    private y4.b f10962e;

    /* renamed from: f  reason: collision with root package name */
    private float f10963f;

    public a(Context context) {
        this(context, null);
    }

    private static n4.b b(n4.b bVar) {
        b.C0322b p10 = bVar.b().k(-3.4028235E38f).l(RecyclerView.UNDEFINED_DURATION).p(null);
        if (bVar.f28602f == 0) {
            p10.h(1.0f - bVar.f28601e, 0);
        } else {
            p10.h((-bVar.f28601e) - 1.0f, 1);
        }
        int i10 = bVar.f28603g;
        if (i10 == 0) {
            p10.i(2);
        } else if (i10 == 2) {
            p10.i(0);
        }
        return p10.a();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.a
    public void a(List<n4.b> list, y4.b bVar, float f10, int i10, float f11) {
        this.f10959b = list;
        this.f10962e = bVar;
        this.f10961d = f10;
        this.f10960c = i10;
        this.f10963f = f11;
        while (this.f10958a.size() < list.size()) {
            this.f10958a.add(new g(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<n4.b> list = this.f10959b;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom <= paddingTop || width <= paddingLeft) {
            return;
        }
        int i10 = paddingBottom - paddingTop;
        float h10 = j.h(this.f10960c, this.f10961d, height, i10);
        if (h10 <= 0.0f) {
            return;
        }
        int size = list.size();
        int i11 = 0;
        while (i11 < size) {
            n4.b bVar = list.get(i11);
            if (bVar.f28612p != Integer.MIN_VALUE) {
                bVar = b(bVar);
            }
            n4.b bVar2 = bVar;
            int i12 = paddingBottom;
            this.f10958a.get(i11).b(bVar2, this.f10962e, h10, j.h(bVar2.f28610n, bVar2.f28611o, height, i10), this.f10963f, canvas, paddingLeft, paddingTop, width, i12);
            i11++;
            size = size;
            i10 = i10;
            paddingBottom = i12;
            width = width;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10958a = new ArrayList();
        this.f10959b = Collections.emptyList();
        this.f10960c = 0;
        this.f10961d = 0.0533f;
        this.f10962e = y4.b.f33059g;
        this.f10963f = 0.08f;
    }
}

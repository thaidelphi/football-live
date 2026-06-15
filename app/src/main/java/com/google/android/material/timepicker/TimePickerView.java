package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.a0;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import d5.h;
/* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
class TimePickerView extends ConstraintLayout {
    private final ClockFaceView A;
    private final MaterialButtonToggleGroup B;
    private final View.OnClickListener C;
    private f D;
    private g E;
    private e F;

    /* renamed from: x  reason: collision with root package name */
    private final Chip f14718x;

    /* renamed from: y  reason: collision with root package name */
    private final Chip f14719y;

    /* renamed from: z  reason: collision with root package name */
    private final ClockHandView f14720z;

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.E != null) {
                TimePickerView.this.E.a(((Integer) view.getTag(d5.f.G)).intValue());
            }
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    class b implements MaterialButtonToggleGroup.d {
        b() {
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11 = i10 == d5.f.f24045j ? 1 : 0;
            if (TimePickerView.this.D == null || !z10) {
                return;
            }
            TimePickerView.this.D.a(i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.F;
            if (eVar != null) {
                eVar.a();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    public class d implements View.OnTouchListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ GestureDetector f14724a;

        d(GestureDetector gestureDetector) {
            this.f14724a = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f14724a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface e {
        void a();
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface f {
        void a(int i10);
    }

    /* loaded from: C:\Users\tewan\Downloads\Football Live HD\.\classes2.dex */
    interface g {
        void a(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void x() {
        Chip chip = this.f14718x;
        int i10 = d5.f.G;
        chip.setTag(i10, 12);
        this.f14719y.setTag(i10, 10);
        this.f14718x.setOnClickListener(this.C);
        this.f14719y.setOnClickListener(this.C);
        this.f14718x.setAccessibilityClassName("android.view.View");
        this.f14719y.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void y() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f14718x.setOnTouchListener(dVar);
        this.f14719y.setOnTouchListener(dVar);
    }

    private void z() {
        if (this.B.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            dVar.e(d5.f.f24042g, a0.E(this) == 0 ? 2 : 1);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        z();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            z();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.C = new a();
        LayoutInflater.from(context).inflate(h.f24073i, this);
        this.A = (ClockFaceView) findViewById(d5.f.f24043h);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(d5.f.f24046k);
        this.B = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f14718x = (Chip) findViewById(d5.f.f24049n);
        this.f14719y = (Chip) findViewById(d5.f.f24047l);
        this.f14720z = (ClockHandView) findViewById(d5.f.f24044i);
        y();
        x();
    }
}
